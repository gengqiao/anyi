package com.gq.beans;

import java.util.Date;

public class SsoUser {
    private Integer id;

    private String loginid;

    private String password;

    private Integer loginnum;

    private Date lastlogindate;

    private Integer fkSiteId;

    private Integer isvalide;
    
    private String userName;
    
    private String mobilePhone;
    
    private String email;

    private PeRole peRole; 
    
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLoginnum() {
        return loginnum;
    }

    public void setLoginnum(Integer loginnum) {
        this.loginnum = loginnum;
    }

    public Date getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public Integer getFkSiteId() {
        return fkSiteId;
    }

    public void setFkSiteId(Integer fkSiteId) {
        this.fkSiteId = fkSiteId;
    }

    public Integer getIsvalide() {
        return isvalide;
    }

    public void setIsvalide(Integer isvalide) {
        this.isvalide = isvalide;
    }

	public PeRole getPeRole() {
		return peRole;
	}

	public void setPeRole(PeRole peRole) {
		this.peRole = peRole;
	}
}