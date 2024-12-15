package com.springsearch.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.naming.ContextAccessController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class UploadFileController {

	@Autowired
	ServletContext context;

	@RequestMapping("/showform")
	public String showform() {
		return "uploadform";
	}

	@RequestMapping(path = "/successform", method = RequestMethod.POST)
	public String uploadfile(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) {

		System.out.println("uploadfile execute");
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getStorageDescription());
		try {
			System.out.println(file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte[] data = file.getBytes();

//        method1 
		/*
		 * System.out.println(s.getServletContext().getRealPath("/"));
		 * 
		 * String path =
		 * s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+
		 * File.separator+"img"+File.separator+file.getOriginalFilename(); try {
		 * FileOutputStream fos = new FileOutputStream(path); fos.write(data);
		 * fos.close(); System.out.println("image uploaded"); } catch (Exception e) { //
		 * TODO Auto-generated catch block e.printStackTrace();
		 * m.addAttribute("msg","something gone wrong"); }
		 */

//		 method2

		System.out.println(context.getRealPath("/"));
		Path path1 = Paths.get(context.getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
				+ "img" + File.separator + file.getOriginalFilename());
		try {
			Files.write(path1, data);
			System.out.println("image uploaded");
		} catch (IOException e) { // TODO Auto-generated catch block e.printStackTrace();
			m.addAttribute("msg", "something gone wrong");
		}

		m.addAttribute("filename", file.getOriginalFilename());
		m.addAttribute("msg", "img successfully uploaded");

		return "successform";
	}

}
