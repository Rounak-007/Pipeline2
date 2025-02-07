package com.example.pipeline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pipeline.service.PipelineService;

@RestController
@RequestMapping("/pipeline")
public class PipelineController {

	@Autowired
	private PipelineService pipelineService;
	
	@GetMapping("/get")
	public ResponseEntity<String> getDemo() {
		return pipelineService.getdemo();
	}
}
