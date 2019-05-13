/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springsecuritylogin.services;
import com.mycompany.springsecuritylogin.register.User;

/**
 *
 * @author root
 */
public interface UserService {
    
    void save(User user);
    
    User findByUsername(String username);
}
