package com.ntg.controller;

import java.util.Collection;
import com.ntg.model.UserDAOInter;

/**
 *
 * @author AndDeve
 */
public interface UserControllerInter {
    
    public Object insertUser(Object obj);
    public boolean deleteUser(Object obj);
    public Object selectUser(Object obj);
    public Collection selectAllUser();
    public boolean updateUser(Object obj);
}
