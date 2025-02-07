package com.example.pipeline.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PipelineServiceImpl implements PipelineService{
	
		public ResponseEntity<String> getdemo() {
			return new ResponseEntity<>("This is a Docker demo API", HttpStatus.OK);
		}
}
