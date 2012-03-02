/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schoolpro.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author training
 */
@MappedSuperclass
public abstract class BaseEntity<ID extends Serializable>  implements Serializable{

    protected ID id;
    private String createUser;
    private Date createDate;
    private String lastModifiedUser;
    private Date lastModifiedDate;
    private Long version;
    private Date deleteDate;

    @Transient
    public abstract ID getId();

    public void setId(ID id) {
        this.id = id;
    }

    @Column(name = "CRTE_BY_USR_ID", nullable = false, length = 100)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Column(name = "CRTE_DTTM", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "LST_UPDT_USR_ID", nullable = false, length = 100)
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    @Column(name = "LST_UPDT_DTTM", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Version
    @Column(name = "VER_NUM", nullable = false)
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Column(name = "DEL_DT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }
}
