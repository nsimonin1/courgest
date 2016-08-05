package org.courrier.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by simon on 05/08/2016.
 */
@Controller
@RequestMapping("/index.jsf")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
