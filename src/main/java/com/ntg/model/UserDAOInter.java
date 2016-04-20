package com.ntg.model;

import java.util.Collection;

public interface UserDAOInter {

    public Object insertUser(Object obj);
    public boolean deleteUser(Object obj);
    public Object selectUser(Object obj);
    public Collection selectAllUser();
    public boolean updateUser(Object obj);
}
