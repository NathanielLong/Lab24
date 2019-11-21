package co.grandcircus.Lab24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Lab24.Products;
import co.grandcircus.Lab24.UsersInfo;
import co.grandcircus.Lab24.UsersProducts;
import co.grandcircus.Lab24.dao.CoffeeShopDao;

@Controller
public class HomeController {
	
	@Autowired
	CoffeeShopDao dao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		//System.out.println(dao.findAllProducts());
		return new ModelAndView("index", "productList", dao.findAllProducts());
		}
	
	@RequestMapping("register")
	public ModelAndView registerForm() {
		//dao.addUsers(u.getFirstname(), u.getLastname(), u.getPhone(), u.getPassword(), u.getMail());
		return new ModelAndView("register");
		}
	
	@PostMapping("add-person")
	public ModelAndView register(UsersInfo u) {
		dao.addUsers(u.getFirstname(), u.getLastname(), u.getPhone(), u.getPassword(), u.getMail());
		return new ModelAndView("completed");
		}
	
	@RequestMapping("shoppingcart")
	public ModelAndView shoppingCart() {
		return new ModelAndView("shoppingcart");
	}
	
	@RequestMapping("registeredusers")
	public ModelAndView regUsers() {
		return new ModelAndView("registeredusers", "userList", dao.findAllUsers());
	}
	
	@RequestMapping("update-cart")
	public ModelAndView addToSCart(Products ps) {

		return new ModelAndView("redirect:/", "userProductList", dao.addToCart(ps.getName(), ps.getDescription(), ps.getQuantity(), ps.getPrice()));
	}
	
	}
