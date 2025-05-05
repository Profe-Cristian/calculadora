package com.example.calculadora.controller;
import com.example.calculadora.service.ClaculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculadoraController {

    @Autowired
    private ClaculadoraService ClaculadoraService;

    @GetMapping("/sum")
    public double sum(@RequestParam double a, @RequestParam double b) {
        return ClaculadoraService.sum(a, b);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return ClaculadoraService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return ClaculadoraService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return ClaculadoraService.divide(a, b);
    }
}