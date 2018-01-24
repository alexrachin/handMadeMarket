package com.toronaga.hand_made_market.controllers;

import com.toronaga.hand_made_market.model.Product;
import com.toronaga.hand_made_market.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private ProductService service;

    @Autowired
    public void setBookService(ProductService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String getMainPage() {
        return "index";
    }

    @RequestMapping("product/{id}")
    public String getProduct(@PathVariable("id") int id, Model model){
        model.addAttribute("product", this.service.getProductById(id));
        return "index";
    }

    @RequestMapping("product/add")
    public String addProduct(@ModelAttribute("product")Product product){
        this.service.addProduct(product);
        return "index";
    }
}
