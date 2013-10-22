package com.mycompany.cu.dto;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class UpArchivo {

	private CommonsMultipartFile fileData;

	public CommonsMultipartFile getFileData() {
		return fileData;
	}

	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}
	
	
	
}
