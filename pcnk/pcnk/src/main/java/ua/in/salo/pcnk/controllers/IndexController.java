package ua.in.salo.pcnk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/","index","index.html"})
    public String getIndexInfo(Model model){
        model.addAttribute("tit","The title as is ))");
        return "index";
    }
}
