package com.api.redbusclone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.redbusclone.model.Bus;
import com.api.redbusclone.repository.BusRepository;

@RestController
public class BusController {
	
	private final BusRepository repository;

	BusController(BusRepository repository) {
	    this.repository = repository;
	  }
	
	@PostMapping("/buses/add")
	Bus newBus(@RequestBody Bus newBus) {
	    return repository.save(newBus);
	  }

}
