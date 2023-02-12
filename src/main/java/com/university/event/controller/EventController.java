package com.university.event.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.university.event.model.Event;
import com.university.event.services.EventServices;

@RestController
public class EventController {

	@Autowired
	public EventServices service;
	
	@GetMapping("/event/{date}")
	public List<Event> getEventByDate(@PathVariable("date") String date) {
//		List<Event> list = new ArrayList<>();
		return service.getAllEventByDate(date);
	}
	
	//Adding Events
	@PostMapping("/event")
	public String addEvent(@RequestBody Event data) {
		return service.addEvent(data);
	}
	
	@PutMapping("/event/{id}")
	public String updateEvent(@RequestBody Event data, int id) {
		return service.updateEvent(data, id);
	}
	
	@DeleteMapping("/event/{id}")
	public String deleteEvent(@PathVariable("id") int id) {
		return service.deleteEvent(id);
	}
}
