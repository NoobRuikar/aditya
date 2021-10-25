package com.calculator.calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	    @GetMapping("calculator/sub")
	    	 public double sub(@RequestParam(defaultValue = "0") Integer i, @RequestParam(defaultValue = "0") Integer j){
	 	        return i - j;
	    	
	    }
	    @GetMapping("/calculator/add")
	    public double add(@RequestParam(defaultValue = "0") Integer i, @RequestParam(defaultValue = "0") Integer j){
	        return i + j;
	    }
	    
	    @GetMapping("/calculator/mul")
	    public double mul(@RequestParam(defaultValue = "0") Integer i, @RequestParam(defaultValue = "0") Integer j){
	        return i * j;
	    }
	    @GetMapping("/calculator/div")
	    public double div(@RequestParam(defaultValue = "0") Integer i, @RequestParam(defaultValue = "0") Integer j){
	        return i / j;
	    }
	    @GetMapping("/calculator/pow")
	    public double pow(@RequestParam(defaultValue = "0") Integer i, @RequestParam(defaultValue = "0") Integer j){
	        return Math.pow(i, j);
	    }
	    @GetMapping("/calculator/sqrt")
	    public double sqrt(@RequestParam(defaultValue = "0") Integer i){
	        return Math.sqrt(i);
	    }

}


