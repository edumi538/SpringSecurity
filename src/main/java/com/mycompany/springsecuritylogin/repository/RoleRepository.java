/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springsecuritylogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mycompany.springsecuritylogin.register.Role;
/**
 *
 * @author root
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
}
