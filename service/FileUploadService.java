package com.example.demo.Service;
import com.example.demo.Entities.File;
import com.example.demo.repository.FileRepository;
import java.io.IOException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
	
	@Autowired
	private FileRepository fileRepository;
	
	public String uploadFile(MultipartFile file) throws IOException {
		File filedata = fileRepository.save(File.builder().name(file.getOriginalFilename()).type(file.getContentType()).filedata(file.getBytes()).build());
		
		if(filedata != null) {
			return "file uploaded successfully "+ "\n" +
					"file name: "+ file.getOriginalFilename()+"\n" +
					"file type: "+ file.getContentType()+	"\n" +
					"file size: "+ file.getBytes().length;
		}
		return null;
	}
	
	
	public byte[] downloadFile(String fileName) {
		Optional<File> dbFile = fileRepository.findByName(fileName);
		byte[] files = dbFile.get().getFiledata();
		return files;
	}

}
