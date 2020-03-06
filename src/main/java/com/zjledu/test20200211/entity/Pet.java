package com.zjledu.test20200211.entity;

public class Pet {
	
	private Integer id;
	private String name;
	private Integer health;
	private Integer love;
	private String strain;
	private Integer masterId;
	
	public Pet(){}

	public Pet(String name, Integer health, Integer love, String strain) {
		this.name = name;
		this.health = health;
		this.love = love;
		this.strain = strain;
	}

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

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getLove() {
		return love;
	}

	public void setLove(Integer love) {
		this.love = love;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public Integer getMasterId() {
		return masterId;
	}

	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}

	@Override
	public String toString() {
		return "Pet{" +
				"id=" + id +
				", name='" + name + '\'' +
				", health=" + health +
				", love=" + love +
				", strain='" + strain + '\'' +
				", masterId=" + masterId +
				'}';
	}
}
