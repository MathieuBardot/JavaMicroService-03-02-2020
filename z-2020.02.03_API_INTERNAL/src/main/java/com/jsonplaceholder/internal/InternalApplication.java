package com.jsonplaceholder.internal;

import javax.swing.JFrame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class InternalApplication {

	public static void main(String[] args) {
		
		// create JFrame to close API manualy
		JFrame frame = new JFrame("FrameDemo");
		frame.setTitle("Internal API");
		frame.setSize(500, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// run
		SpringApplication.run(InternalApplication.class, args);
	}

}
