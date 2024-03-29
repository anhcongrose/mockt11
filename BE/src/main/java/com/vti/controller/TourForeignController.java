package com.vti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vti.entity.TourForeign;
import com.vti.service.ITourForeignService;

@RestController
@RequestMapping(value = "api/v1/toursForeign")
@CrossOrigin("*")
public class TourForeignController {

	@Autowired
	private ITourForeignService service;
	
	@GetMapping()
	public ResponseEntity<?> getAllTours(
			Pageable pageable) {
		Page<TourForeign> entities = service.getAllToursForeign(pageable);
		return new ResponseEntity<>(entities, HttpStatus.OK);
	}

	
}
