package com.inventario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LINEITEM")
public class LineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ITEMID")
	private int itemid;
	
	@ManyToOne
	@JoinColumn(name="ORDERID", referencedColumnName = "ORDERID")
	private CustomerOrder orderid;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "VENDORPARTNUMBER", referencedColumnName = "VENDORPARTNUMBER")
	private VendorPart vendorpartnumber;
	
	public LineItem() {}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public CustomerOrder getOrderid() {
		return orderid;
	}

	public void setOrderid(CustomerOrder orderid) {
		this.orderid = orderid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public VendorPart getVendorpartnumber() {
		return vendorpartnumber;
	}

	public void setVendorpartnumber(VendorPart vendorpartnumber) {
		this.vendorpartnumber = vendorpartnumber;
	}
	
	
}
