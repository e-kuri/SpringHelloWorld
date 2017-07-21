/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.honeywell.spring.controller;

import com.honeywell.spring.service.MainService;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author e-kur
 */
@Controller
@RequestMapping("/")
public class MainController {
    
    @Autowired
    private MainService mainService;
    
    @RequestMapping({"/","/helloWorld.do"})
    protected String showHellowWorld(ModelMap model){
        model.addAttribute("greeting", mainService.getHelloWorld());
        return "helloWorld";
    }
    
    @RequestMapping("/list")
    protected List<String> getList(){
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        return list;
    }
    
}
