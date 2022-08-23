package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService;
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "")
    public String carPage(@RequestParam(value = "count",required = false) Integer count, ModelMap model) {
        if (count != null) {
            model.addAttribute("Cars", carService.getCars(count));
        } else {
            model.addAttribute("Cars", carService.getCars(5));
        };
        return "carIndex";
    }
}
