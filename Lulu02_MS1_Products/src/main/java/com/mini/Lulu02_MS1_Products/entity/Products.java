package com.mini.Lulu02_MS1_Products.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "product")
public class Products {
	@Id //Primary Key
	int id;
	String name;
	float cost;
	String descp;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int id, String name, float cost, String descp) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.descp = descp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", cost=" + cost + ", descp=" + descp + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, descp, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost) && Objects.equals(descp, other.descp)
				&& id == other.id && Objects.equals(name, other.name);
	}
	

}
