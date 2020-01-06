package com.example.kafka.kafkademo.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "kafkatest-topic1", groupId = "group_id")
	public void consume(String message) throws IOException {
		System.out.println(String.format("#### -> Consumed message -> %s", message));
	}
}
