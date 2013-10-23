package com.mycompany.cu.dto;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class UpArchivo {

	private String nombre;
	private CommonsMultipartFile fileData;
	private byte[] file;
	
	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CommonsMultipartFile getFileData() {
		return fileData;
	}

	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}
	
	
	
}
