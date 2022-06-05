package com.mindgate.main.pojo;

import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component
public class DocumentDetails
{
      private int documentId;
      private String documentType;
      private byte[] file;
      
      public DocumentDetails() {

      }

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "DocumentDetails [documentId=" + documentId + ", documentType=" + documentType + ", file="
				+ Arrays.toString(file) + "]";
	}
      
      
}
