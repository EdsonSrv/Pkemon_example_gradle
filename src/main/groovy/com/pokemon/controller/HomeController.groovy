package com.pokemon.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping("/")
class HomeController {

  @GetMapping
  @ResponseBody
  ModelAndView home(){
    new ModelAndView("redirect:/index")
  }

}