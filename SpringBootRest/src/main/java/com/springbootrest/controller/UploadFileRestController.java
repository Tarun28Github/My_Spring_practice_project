package com.springbootrest.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springbootrest.helper.UploadFileHelper;

@RestController
public class UploadFileRestController {

	@Autowired
	private UploadFileHelper uploadHelper;

	/*
	 * public UploadFileRestController(UploadFileHelper uploadHelper) { super();
	 * this.uploadHelper = uploadHelper; }
	 */




	@PostMapping(value="/uploadfile")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		
		
		try {
			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");
			}

			
			  if (!file.getContentType().equals("image/png")) {
			  
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
			  body("Only png type are allowed");
			  
			  }
			 
			boolean f = this.uploadHelper.uploadfile(file);

			if (f) {
				//return ResponseEntity.ok("file successfully uploaded"); 
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Something went wrong try again");
	}
}
