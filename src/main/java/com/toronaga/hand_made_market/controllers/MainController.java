package com.toronaga.hand_made_market.controllers;

import com.toronaga.hand_made_market.model.Product;
import com.toronaga.hand_made_market.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    private ProductService service;

    @Autowired
    public void setBookService(ProductService service) {
        this.service = service;
    }

    @RequestMapping(value = "product", method = RequestMethod.GET)
    public String getMainPage(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("listProducts", service.getListProducts());
        return "products";
    }

    @RequestMapping(value = "product/{id}", method = RequestMethod.GET)
    public String getProduct(@PathVariable("id") int id, Model model){
        model.addAttribute("product", this.service.getProductById(id));
        return "products";
    }

    @RequestMapping("product/add")
    public String addProduct(@ModelAttribute("product")Product product){
        this.service.addProduct(product);
        return "index";
    }
}
