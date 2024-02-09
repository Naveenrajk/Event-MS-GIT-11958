package com.ems.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;

import com.ems.bean.Event;
import com.ems.service.EventService;


public class EventServiceTest {

	@Autowired
	EventService service;
	String insert;
	String update;
	String delete;
	boolean result;
	List<Event> list = new ArrayList<>();
	List<Event> list1 = new ArrayList<>();
	Event event = new Event(201, "Jenish Conference", "Business", "25.02.2024", "10.00 AM","Chennai","jenish@gmail.com");
	Event event1 = new Event(202, "Sandy Birthday", "General", "26.02.2024", "06.00 PM","Banglore","sandy@gmail.com");
	
	
	@Test
	@Order(1)
	public void testPerformEventInsert() {
		insert = "Inserted";
		result = service.insertEvent(event);
		assertEquals(insert, result);
	}

	@Test
	@Order(2)
	public void testPerformEventUpdate() {
		update = "Updated";
		result = service.insertEvent(event1);
		assertEquals(update, result);
	}

}
