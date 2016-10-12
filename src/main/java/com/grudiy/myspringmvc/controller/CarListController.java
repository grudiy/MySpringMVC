package com.grudiy.myspringmvc.controller;

import com.grudiy.myspringmvc.service.CarManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class CarListController {

    @RequestMapping("/mycarlist")  //annotation for the method

    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        CarManager carManager = new CarManager();

        ModelAndView modelAndView = new ModelAndView("carList");
        modelAndView.addObject("carList", carManager.getCarList());

        return modelAndView;
    }
}