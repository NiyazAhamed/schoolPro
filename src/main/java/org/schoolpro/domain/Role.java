/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schoolpro.domain;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author training
 */
@Entity
@Table(name = "USER_ROLE")
public class Role extends BaseEntity<Long> {

    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @Override
    public Long getId() {
        return this.id;
    }
    private List<User> users;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "role")
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
