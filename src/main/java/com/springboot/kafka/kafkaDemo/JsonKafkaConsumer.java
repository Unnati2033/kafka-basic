/**
 * 
 */
package com.springboot.kafka.kafkaDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springboot.kafka.payload.User;

/**
 * @auther Unnati
 */
@Service
public class JsonKafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics="demoTopic_json", groupId = "myGroup")
	public void consume(User user) {
		LOGGER.info(String.format("Json Message recived -> %s", user.toString()));
	}


}
