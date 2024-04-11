/**
 * 
 */
package com.springboot.kafka.kafkaDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @auther Unnati
 */
@Service
public class KafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = "demoTopic" , groupId = "myGroup")
	public void consume(String message) {
		LOGGER.info(String.format("Message Recieved ->  %s", message));
		
		
		
	}

}
