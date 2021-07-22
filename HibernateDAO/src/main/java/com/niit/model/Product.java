package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")

public class Product {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int prodId;
@Column
private String prodName;
private float prodPrice;
private String link;
@Column(length = 2000000000)
private String prodDesc;



public Product() {
	super();
}





public Product(String prodName, float prodPrice, String prodDesc, String link) {
	super();
	this.prodName = prodName;
	this.prodPrice = prodPrice;
	this.prodDesc = prodDesc;
	this.link = link;
}





public int getProdId() {
	return prodId;
}


public void setProdId(int prodId) {
	this.prodId = prodId;
}


public String getProdName() {
	return prodName;
}


public void setProdName(String prodName) {
	this.prodName = prodName;
}


public float getProdPrice() {
	return prodPrice;
}


public void setProdPrice(float prodPrice) {
	this.prodPrice = prodPrice;
}


public String getProdDesc() {
	return prodDesc;
}


public void setProdDesc(String prodDesc) {
	this.prodDesc = prodDesc;
}





public String getLink() {
	return link;
}





public void setLink(String link) {
	this.link = link;
}







}
