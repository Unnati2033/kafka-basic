/**
 * 
 */
package com.springboot.kafka.kafkaDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @auther Unnati
 */
@Service
public class KafkaProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
	
	private KafkaTemplate<String,String> kafkaTemplate;

	/**
	 * @param kafkaTemplate
	 */
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	

	public void sendMessage(String message) {
		LOGGER.info(String.format("Message sent %s", message));
		
		kafkaTemplate.send("demoTopic", message);
	}
}
