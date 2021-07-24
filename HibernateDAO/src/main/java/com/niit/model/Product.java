package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="products")

public class Product {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int prodId;

@Column(length = 100)
@NotEmpty(message="Product Name can't be Empty")
@Size(min = 4,max = 50)
private String prodName;

@DecimalMin("100")
@DecimalMax("10000")
private float prodPrice;

@NotEmpty(message="Please Provide link for Product Image")
private String imglink;

@NotEmpty(message="Link must be provided")
private String link;

@NotEmpty(message="Prodcut description must not be empty")
@Column(length = 2000000000)
private String prodDesc;



public Product() {
	super();
}

public Product(String prodName, float prodPrice, String imglink, String link, String prodDesc) {
	super();
	this.prodName = prodName;
	this.prodPrice = prodPrice;
	this.imglink = imglink;
	this.link = link;
	this.prodDesc = prodDesc;
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


public String getImglink() {
	return imglink;
}

public void setImglink(String imglink) {
	this.imglink = imglink;
}

public String getLink() {
	return link;
}





public void setLink(String link) {
	this.link = link;
}


}
