package com.javainuse.controller;

import lombok.extern.java.Log;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

@Log
@RestController
@RequestMapping("/")
public class ApiController {

    @GetMapping("/api/**")
    public RedirectView redirectWithUsingForwardPrefixApiGet(HttpServletRequest request) {
        String myPath = request.getRequestURI();
        System.out.println("path: " + myPath);
        String redirectedUrl = "https://mobile-dev.smartparking.kz" + myPath;
        System.out.println("url" + redirectedUrl);
        try {
            URL url = new URL(redirectedUrl);
            Scanner sc = new Scanner(url.openStream());
            String inline = "";
            System.out.println("sc" + sc.hasNext());
            while (sc.hasNext()) {
                System.out.println("inline" + inline);
                inline += sc.nextLine();
            }
            System.out.println("\nJSON data in string format");
            System.out.println(inline);
        }catch (Exception e){
            System.out.println("error:"  + e.getMessage());
        }
        return new RedirectView(redirectedUrl);
    }
    @PostMapping ("/api/**")
    public RedirectView redirectWithUsingForwardPrefixApiPost(HttpServletRequest request){
        String myPath = request.getRequestURI();
        System.out.println("path: " + myPath);
        String redirectedUrl = "https://mobile-dev.smartparking.kz" + myPath;
        System.out.println("url: " +redirectedUrl);
        try {
            URL url = new URL(redirectedUrl);
            Scanner sc = new Scanner(url.openStream());
            String inline = "";
            System.out.println("sc" + sc.hasNext());
            while (sc.hasNext()) {
                System.out.println("inline" + inline);
                inline += sc.nextLine();
            }
            System.out.println("\nJSON data in string format");
            System.out.println(inline);
        }catch (Exception e){
            System.out.println("error:"  + e.getMessage());
        }
        return new RedirectView(redirectedUrl);
    }
    @GetMapping ("/payment/**")
    public RedirectView redirectWithUsingForwardPrefixPayment(HttpServletRequest request) {
        String myPath = request.getRequestURI();
        System.out.println("path: " + myPath);
        String redirectedUrl = "https://api.parqour.com" + myPath;
        System.out.println("url: " + redirectedUrl);
        return new RedirectView(redirectedUrl);
    }







    @GetMapping("/api/byclient")
    public RedirectView redirectWithUsingForwardPrefixApiByClient() {
        return new RedirectView("https://mobile-dev.smartparking.kz/api/public/parking/list/byClient/?clientId=2");
    }
}
