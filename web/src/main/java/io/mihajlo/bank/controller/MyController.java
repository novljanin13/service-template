package io.mihajlo.bank.controller;

import io.mihajlo.bank.dao.CustomerDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mihajlo on 11/19/16.
 */
@Controller
public class MyController {

    @Autowired
    private CustomerDaoImpl customer;

    @RequestMapping("/go")
    @ResponseBody
    String home() {
        return customer.getCustomer(1);
    }

}
