package com.claim.controller;

import com.claim.entity.Purchase;
import com.claim.entity.User;
import com.claim.entity.Vehicle;
import com.claim.repository.PurchaseRepository;
import com.claim.repository.UserRepository;
import com.claim.service.PurchaseService;
import com.claim.service.UserService;
import com.claim.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DealershipController {

    @Autowired
    public UserService userService;

    @Autowired
    public VehicleService vehicleService;

    @Autowired
    public PurchaseService purchaseService;

//Home Page
    @GetMapping("/")
    public String welcome(Model model) {
        return "index";
    }
//    EndHomePage


//    Start User SighnUP and Login

    @GetMapping("/sign-up")
        public ModelAndView signUp(Model model)  {
           return new ModelAndView("sign-up", "user", new User());
        }


    @PostMapping("/sign-up")
    public String handleSignUp(Model model, @ModelAttribute("user") User user, HttpSession session) {
        userService.saveUser(user);
        model.addAttribute("newUser", user);
        return "thank-you";

    }
//    End of User sign up and login

//list of cars

    @GetMapping("/carsForSale")
    public String listAllVehicles(Model model) {
        List<Vehicle> allVehicles = vehicleService.listVehicles();
        model.addAttribute("listOfVehicles", allVehicles);
        return "carsForSale";
    }

//    End of list of all cars

//    user login logic

    @GetMapping("/userLogin")
    public ModelAndView login(Model model) {
        return new ModelAndView("userLogin", "user", new User());
    }


    @PostMapping("/userLogin")
    public String handleLogin(Model model, @ModelAttribute("user") User user) {
        User loginUser = userService.loginUser(user);
        model.addAttribute("loggedInUser", loginUser);
        return "login-thank-you";
    }

    @GetMapping("/addVehicle")
    public ModelAndView addVehicle(Model model) {
        return new ModelAndView("addVehicle", "vehicle", new Vehicle());
    }

    @PostMapping("/addVehicle")
    public String handleaddVehicle(Model model, @ModelAttribute("vehicle") Vehicle vehicle, HttpSession session) {
        vehicleService.saveVehicle(vehicle);
        model.addAttribute("newVehicle", vehicle);
        return "new-Vehicle-added";
    }


// Specific car details page
//shows individual car information

    @GetMapping("/carDetails")
    public String carDetails(@RequestParam int vehicleID, Model model, HttpSession session) {

    model.addAttribute("listOfVehicles", vehicleService.detailVehicle(vehicleID));
        return "carDetails";
    }


//search page

    @GetMapping("/search")
    public String search(Model model, HttpSession session) {
        return "search";
    }

    @PostMapping("/search")
    public String handleSearch(@RequestParam String keyword, Model model, HttpSession session) {
        List<Vehicle> matche = vehicleService.search(keyword);
        model.addAttribute("matches", matche);
        model.addAttribute("msg", "Sorry, no results found. Please try again");
        return "results";
    }
//search results
    @GetMapping("/results")
    public String results(Model model, HttpSession session) {
        return "results";
    }

// display purchased vehicles

//    @GetMapping("/purchasedVehicles")
//    public String purchased(Model model, HttpSession session) {
//        return "purchasedVehicles";
//    }

//    To do modify this outline to have purchse service and list the purchased vehicles.
    @GetMapping("/purchasedVehicles")
    public String listAllPurchasedVehicles(Model model, HttpSession session) {
        List<Purchase> allPurchasedVehicles = purchaseService.listPurchasedVehicles();
        model.addAttribute("listOfPurchasedVehicles", allPurchasedVehicles);

        return "purchasedVehicles";
    }





}
