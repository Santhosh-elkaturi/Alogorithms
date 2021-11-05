package com.example.pcf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pcf.model.Item;

@RestController
public class ItemController {

	@GetMapping(value = "/getItem")
	public Item getItem() {
		Item item = new Item();
		item.setItemId(2);
		item.setItemName("Icecrem");
		item.setPrice(100);
		return item;
		
	}
}
