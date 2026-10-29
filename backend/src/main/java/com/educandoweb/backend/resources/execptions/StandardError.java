package com.educandoweb.backend.resources.execptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

import tools.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	
	
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant timestamp;
	private Integer statusInteger;
	private String error;
	private String message;
	private String path;
	
	public StandardError() {
		
	}

	public StandardError(Instant timestamp, Integer statusInteger, String error, String message, String path) {
		this.timestamp = timestamp;
		this.statusInteger = statusInteger;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatusInteger() {
		return statusInteger;
	}

	public void setStatusInteger(Integer statusInteger) {
		this.statusInteger = statusInteger;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
