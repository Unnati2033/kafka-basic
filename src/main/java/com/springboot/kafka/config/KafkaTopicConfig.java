/**
 * 
 */
package com.springboot.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @auther Unnati
 */
@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic demoTopic() {
		return TopicBuilder.name("demoTopic").build();
	}
	
	@Bean
	public NewTopic demoTopicJson() {
		return TopicBuilder.name("demoTopic_json").build();
	}

}
