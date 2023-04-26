package com.example.SpringBootExample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@SpringBootApplication
@RestController
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	@RequestMapping("/")
	public String instructions(){
		return "<b><u>Question-1</u></b><br>" +
				"This is the default home page.<br> The end point <b>/getString</b> will print simple Hello World<br>" +
				"Try <b>/getString?name={yourName}</b><br>" +
				"=====================================================================<br><br>" +
				"<b><u>Question-2</u></b><br>" +
				"To perform calculation do the following (Replace value1 and value2 with your choice of numbers):<br>" +
				"1. For addition modify URL to \"localhost:8080/<b>addition</b>?num1={value1}&num2={value2}\"<br>" +
				"2. For subtraction modify URL to \"localhost:8080/<b>subtraction</b>?num1={value1}&num2={value2}\"<br>" +
				"3. For multiply modify URL to \"localhost:8080/<b>multiply</b>?num1={value1}&num2={value2}\"<br>" +
				"4. For division modify URL to \"localhost:8080/<b>division</b>?num1={value1}&num2={value2}\"<br>" +
				"=====================================================================<br><br>" +
				"You can also perform calculation by modifying URL where <b>operation_no</b> can be from following choices:<br>" +
				"\"localhost:8080/calculate?opr=<b>{operation_no}</b>&num1={value1}&num2={value2}\"<br>" +
				"1. Addition<br>" +
				"2. Subtraction<br>" +
				"3. Multiplication<br>" +
				"4. Division";
	}

	@RequestMapping(value = "/getString",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String,String> getString(@RequestParam(defaultValue = "World!") String name){
		HashMap<String,String> map = new HashMap<>();
		map.put("Response",String.format("Hello %s",name));
		return map;
	}
}
