package com.batata.online.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {

	@Scheduled(fixedDelay = 5000)
	public void test() {
		System.err.println("Executing----");
	}
}
