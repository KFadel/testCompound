/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntg.view;

import com.ntg.controller.UserControllerInter;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ntg.pojo.User;

/**
 *
 * @author AndDeve
 */
public class UserViewImple {
	
	static final Logger logger = LogManager.getLogger(UserViewImple.class
			.getName());

//    public static void main(String[] args) {
//
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ntg/view/beans.xml");
//        
//        UserControllerInter userControllerInter = (UserControllerInter) context.getBean("userControllerImple");
//        User user = new User();
//        user.setUsername("karim");
//        user.setAddress("Alexandria");
//        user.setFname("karim");
//        user.setLname("karim");
//
//        userControllerInter.insertUser(user);
//        
//        
////        ArrayList<User> users = (ArrayList<User>) userControllerInter.selectAllUser();
////        for(User u : users){
////            System.out.println("first name : "+u.getFname());
////            System.out.println("address : "+u.getAddress());
////            System.out.println("user name : "+u.getUsername());
////        }
//        //System.out.println("Person::" + user);
//        //close resources
//        
//        logger.info("Person :: " + user);
//		logger.trace("UserViewImple Example.");
//    }
}
