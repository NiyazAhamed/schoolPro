/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schoolpro.domain;

import javax.persistence.*;

/**
 *
 * @author training
 */
public class User extends BaseEntity<Long> {

    @Column(name="USER_ID",nullable=false)
    private String userId;
    @Column(name="PASSWORD",nullable=false)
    private String password;
    
    @ManyToOne
    @JoinColumn(name = "ROLE_ID", nullable = false)
    private Role role;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    @Column(name = "ID",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return this.id;
    }
}
