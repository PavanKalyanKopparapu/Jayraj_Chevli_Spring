package com.example.SpringBootExample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CalculatorController {

    @RequestMapping("/calculate")
    public String calculate(@RequestParam(defaultValue = "1") int opr, @RequestParam(defaultValue = "1") int num1, @RequestParam(defaultValue = "1") int num2) {
        HashMap<Integer, Integer> calculateMap = new HashMap<>();
        calculateMap.put(1,num1+num2);
        calculateMap.put(2,num1-num2);
        calculateMap.put(3,num1*num2);
        calculateMap.put(4,num1/num2);
        if(!calculateMap.containsKey(opr))
            return "Invalid Operation";
        else
            return "Output of numbers "+"\""+num1+"\""+" and "+"\""+num2+"\""+" for operation - " + "\"" + opr + "\"" + "  is: " + calculateMap.get(opr);
    }
    @RequestMapping("/addition")
    public String addition(@RequestParam(defaultValue = "0") int num1, @RequestParam(defaultValue = "0") int num2){
        return "Addition of "+num1+" and "+num2+" is "+(num1+num2);
    }

    @RequestMapping("/subtraction")
    public String subtraction(@RequestParam(defaultValue = "0") int num1, @RequestParam(defaultValue = "0") int num2){
        return "Subtraction of "+num1+" and "+num2+" is "+(num1-num2);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam(defaultValue = "0") int num1, @RequestParam(defaultValue = "0") int num2){
        return "Multiplication of "+num1+" and "+num2+" is "+(num1*num2);
    }

    @RequestMapping("/division")
    public String  division(@RequestParam(defaultValue = "1") int num1, @RequestParam(defaultValue = "1") int num2){
        return "Division of "+num1+" and "+num2+" is "+(num1/num2);
    }

}
