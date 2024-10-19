package com.example.challenges;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengesApplication {

	public static void main(String[] args) {

		MyBigNumber myBigNumber = new MyBigNumber();
		System.out.println(myBigNumber.sum("9999","9999"));;


	}

}
