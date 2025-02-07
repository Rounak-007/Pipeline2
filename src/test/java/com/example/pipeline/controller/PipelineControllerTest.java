package com.example.pipeline.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.pipeline.service.PipelineServiceImpl;

@ExtendWith(MockitoExtension.class)
public class PipelineControllerTest {

	@InjectMocks
	PipelineController pipelineController;
 
	@Mock
	PipelineServiceImpl pipelineServiceImpl;
 
	@Test
	void getApiTest() {
		ResponseEntity<String> obj = new ResponseEntity<String>("this is a demo API", HttpStatus.OK);
		when(pipelineServiceImpl.getdemo()).thenReturn(obj);
		ResponseEntity<String> response = pipelineController.getDemo();
		assertEquals(obj, response);
	}
}
