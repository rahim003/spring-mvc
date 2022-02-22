package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarService;

@Controller
@RequestMapping("/cars")
public class CarCantroller {
    private final CarService carDao;
@Autowired
    public CarCantroller(CarService carDao) {
        this.carDao = carDao;
    }
@GetMapping("")
    public  String getAllCars(Model model){
    model.addAttribute("car1",carDao.getAllCars());
    return "/getAllCars";
    }
    @GetMapping("/")
    public String getCar(@RequestParam("count")int count,Model model) {
        model.addAttribute("cars1", carDao.getCar(count));
        System.out.println(carDao.getCar(count));
        return "/car";
    }
    }