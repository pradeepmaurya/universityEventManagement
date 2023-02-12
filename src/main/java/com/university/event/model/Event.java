package com.university.event.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Event {

	private int eventId;
	private String eventName;
	private String locationOfEvent;
	private String date;
	private String startTime;
	private String endTime;
	private String imageUrl;
	
}
