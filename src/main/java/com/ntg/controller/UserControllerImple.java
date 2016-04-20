package com.ntg.controller;


import java.util.Collection;
import com.ntg.model.UserDAOInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author AndDeve
 */
@Component("userControllerImple")
public class UserControllerImple implements UserControllerInter{

    @Autowired
    private UserDAOInter userDAOInter;
    
    public UserDAOInter getUserDAOInter() {
        return userDAOInter;
    }

    public void setUserDAOInter(UserDAOInter userDAOInter) {
        System.out.println("UserControllerImple : "+ userDAOInter);
        this.userDAOInter = userDAOInter;
    }
    
    
    @Override
    public Object insertUser(Object obj) {
        System.out.println(" insertUser UserControllerImple : "+ userDAOInter);
        return userDAOInter.insertUser(obj);
    }

    @Override
    public boolean deleteUser(Object obj) {
        return userDAOInter.deleteUser(obj);
    }

    @Override
    public Object selectUser(Object obj) {
        return userDAOInter.selectUser(obj);
    }

    @Override
    public Collection selectAllUser() {
        System.out.println("selectAllUser UserControllerImple : "+ userDAOInter);
        return userDAOInter.selectAllUser();
    }

    @Override
    public boolean updateUser(Object obj) {
        return userDAOInter.updateUser(obj);
    }

    
}
