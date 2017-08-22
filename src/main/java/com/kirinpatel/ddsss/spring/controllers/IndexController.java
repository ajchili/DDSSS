package com.kirinpatel.ddsss.spring.controllers;

import com.kirinpatel.ddsss.utils.PostContainer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(path= "/")
    public String loadIndex(ModelMap map) {
        map.addAttribute("postContainer", new PostContainer());
        return "index";
    }
}
