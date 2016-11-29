package com.gq.beans;

public class PeRole {
    private Integer id;
    private String name;
    private Integer isvalide;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIsvalide() {
		return isvalide;
	}
	public void setIsvalide(Integer isvalide) {
		this.isvalide = isvalide;
	}
	@Override
	public String toString() {
		return "PeRole [id=" + id + ", name=" + name + ", isvalide=" + isvalide
				+ "]";
	}
	

}