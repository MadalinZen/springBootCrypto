package com.sda.springbootexample;

import com.sda.springbootexample.Components.AtmService;
import com.sda.springbootexample.Exception.UnknownRateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootExampleApplication implements CommandLineRunner {

	@Autowired
	AtmService atmService ;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}



	@Override
	public void run(String...args) throws Exception {

	    if (args.length < 2){

      System.out.println("Please provide coinType and amount : ");
      return ;
        }


		try {


      System.out.println("You provided the following arguments : "+Arrays.toString(args));

			double amount = Double.valueOf(args[1]);

			String coinType = args[0];

			double exchangeAmount = atmService.exchangeCoin(coinType,amount);

			System.out.println("Amount of $ you need to pay : "  + amount + " " + coinType +" : " + exchangeAmount);

		} catch (UnknownRateException e) {

			System.out.println(e.getMessage());
		}
	}
}
