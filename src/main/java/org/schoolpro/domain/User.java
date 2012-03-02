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
@Entity
@Table(name = "USER")
public class User extends BaseEntity<Long> {

    private String userId;
    private String password;
    private Role role;

    @Column(name = "PASSWORD", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToOne
    @JoinColumn(name = "ROLE_ID", nullable = false)
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Column(name = "USER_ID", nullable = false)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Override
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return this.id;
    }
}
