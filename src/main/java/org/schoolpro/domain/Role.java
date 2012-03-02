/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schoolpro.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

/**
 *
 * @author training
 */
public class Role extends BaseEntity<Long> {

    private String description;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @Override
    public Long getId() {
        return this.id;
    }
    @OneToMany(mappedBy = "role")
    private List<User> users;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
