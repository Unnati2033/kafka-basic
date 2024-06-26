/**
 * 
 */
package com.springboot.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.kafka.kafkaDemo.JsonKafkaProducer;
import com.springboot.kafka.payload.User;

/**
 * @auther Unnati
 */
@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
	
	private JsonKafkaProducer kafkaProducer;

	/**
	 * @param kafkaProducer
	 */
	public JsonMessageController(JsonKafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}
	
	@PostMapping("publish")
	public ResponseEntity<String> publish(@RequestBody User user){
		kafkaProducer.sendMessage(user);
		
		return ResponseEntity.ok("Json Message sent to Kafka Topic");
		
	}

}
