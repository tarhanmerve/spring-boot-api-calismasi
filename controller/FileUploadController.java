package com.example.demo.Controller;
import com.example.demo.Service.FileUploadService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class FileUploadController {
	
	private FileUploadService service;

	@Autowired
	public FileUploadController(FileUploadService service) {
		this.service = service;
	}
	
	@PostMapping("/upload")
	public ResponseEntity<?> uploadfile(@RequestParam("file")MultipartFile file) throws IOException{
		String uploadfile = service.uploadFile(file);
		return ResponseEntity.status(HttpStatus.OK).body(uploadfile);
	}

	
	@GetMapping("/{fileName}")
	public ResponseEntity<?> downloadfile(@PathVariable String fileName){
		byte[] file = service.downloadFile(fileName);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_PDF).body(file);
	}
}
