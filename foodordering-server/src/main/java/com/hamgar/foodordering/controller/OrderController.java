package com.hamgar.foodordering.controller;

import com.hamgar.foodordering.model.User;
import com.hamgar.foodordering.service.OrderService;
import com.hamgar.foodordering.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;
    
}
