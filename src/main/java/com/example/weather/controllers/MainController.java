package com.example.weather.controllers;


import com.example.weather.models.WeatherModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

      @GetMapping("/")
        public String index (Model model) {
        //String link = "http://api.openweathermap.org/data/2.5/weather?q=Gdansk&appid=63e151fd69dd72c3844cffd144d59342";
        //RestTemplate restTemplate = new RestTemplate ();
        //WeatherModel weatherModel = restTemplate.getForObject(link, WeatherModel.class);
        //model.addAttribute("temp", weatherModel.getMain().getTemp() );
        return "index";
      }

      @PostMapping("/")
    public String index(@RequestParam("city") String city, Model model) {
          String link = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=63e151fd69dd72c3844cffd144d59342";

          RestTemplate restTemplate = new RestTemplate ();
          WeatherModel weatherModel = restTemplate.getForObject(link, WeatherModel.class);

          model.addAttribute("temp", weatherModel.getMain().getTemp() + " " + weatherModel.getClouds().getAll());
          return "index";

      }
}
