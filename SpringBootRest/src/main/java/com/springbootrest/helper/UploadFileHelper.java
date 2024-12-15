package com.springbootrest.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletContext;

@Component
public class UploadFileHelper {

	private final String uploaddir = new ClassPathResource("static/images/").getFile().getAbsolutePath();


    
	public UploadFileHelper() throws IOException {

	}

	public boolean uploadfile(MultipartFile mpfile) {
		boolean f = false;
		try {

			/*
			 * // read InputStream is = mpfile.getInputStream(); byte[] data = new
			 * byte[is.available()]; is.read(data);
			 * 
			 * // write FileOutputStream fos = new FileOutputStream(uploaddir +
			 * File.separator + mpfile.getOriginalFilename()); fos.write(data); fos.flush();
			 * fos.close();
			 */

			Files.copy(mpfile.getInputStream(), Paths.get(uploaddir+File.separator+mpfile.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
}
