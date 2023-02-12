package com.university.event.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.university.event.model.Event;

@Component
public class EventServices {

	public static List<Event> list = new ArrayList<>();
	static {
		list.add(new Event(1, "Fresher Party", "Campus", "12 Feb 2023", "16:00", "23:00", " https://via.placeholder.com/600/92c952"));
		list.add(new Event(1, "Annual Function", "Campus", "01 Dec 2023", "12:00", "23:00", " https://via.placeholder.com/600/92c952"));
		list.add(new Event(1, "Teachers Day", "Campus", "05 Nov 2023", "07:00", "23:00", " https://via.placeholder.com/600/92c952"));
		list.add(new Event(1, "Job Fair", "Campus", "03 Apr 2023", "09:00", "23:00", " https://via.placeholder.com/600/92c952"));
		list.add(new Event(1, "Fair Well Party", "Campus", "10 May 2023", "10:00", "23:00", " https://via.placeholder.com/600/92c952"));
	}
	
	
	//Adding Event
	public String addEvent(Event data) {
		list.add(data);
		return "Added Succesfully";
	}
	
	//Updating Events
	public String updateEvent(Event data, int id) {
		for(Event event:list) {
			if(event.getEventId() == id) {
				event.setEventId(data.getEventId());
				event.setEventName(data.getEventName());
				event.setLocationOfEvent(data.getLocationOfEvent());
				event.setDate(data.getDate());
				event.setStartTime(data.getStartTime());
				event.setEndTime(data.getEndTime());
				event.setImageUrl(data.getImageUrl());
				
				return "Succesfully Updated";
			}
		}
		return "Failled Due to some Reason";
	}
	
	//Delete Event
	public String deleteEvent(int id) {
		for(Event data:list) {
			if(data.getEventId() == id) {
				list.remove(data);
				return "Succesfully Removed";
			}
		}
		return "Failled Due to some Reason";
	}
	
	//Get All Event by Date
	public List<Event> getAllEventByDate(String date){
		List<Event> events = new ArrayList<>();
		
		for(Event event:list) {
			if(event.getDate().equals(date)) {
				events.add(event);
			}
		}
		return events;
	}
}
