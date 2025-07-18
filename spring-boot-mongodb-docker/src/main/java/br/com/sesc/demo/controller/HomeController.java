package br.com.sesc.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("senac/api")
    public class HomeController {
        @RequestMapping("/")
        public String home() {
            return "API está rodando!";
        }
    }

