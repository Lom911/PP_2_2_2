package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarDAO.CarDAO;

@Controller
//@RequestMapping("/cars")
public class CarController {
    private final CarDAO carDAO;


    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

//    @GetMapping()
//    public String index(Model model) {
//        model.addAttribute("car", carDAO.index());
//        return "index";
//    }


//        @GetMapping("/cars")
//        public String Car(@RequestParam(defaultValue = "5", value = "id", required = false) int id, Model model) {
//        model.addAttribute("id", carDAO.showCarTable(id));
//        return "cars";
//        }


        @GetMapping("/cars")
        public String Car(@RequestParam(defaultValue = "0", value = "id", required = false) int id, Model model) {
        if (id > carDAO.showFullTable().size() || id < 1) {
            id = carDAO.showFullTable().size();
        }
            model.addAttribute("id", carDAO.showCarTable(id));
        return "cars";
        }
    }
