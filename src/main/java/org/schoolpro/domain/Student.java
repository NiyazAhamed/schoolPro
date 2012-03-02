/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schoolpro.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author training
 */
public class Student extends BaseEntity<Long> {

    private String firstName;
    private String lastName;
    private Date dob;

    @Id
    @Column(name="STUDENT_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Override
    public Long getId() {
        return this.id;
    }
    
    
    
}
