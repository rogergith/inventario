package com.inventario.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CURTOMERORDER")
public class CustomerOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORDERID")
	private int orderid;
	
	@Column(name="DISCOUNT")
	private int discount;
	
	@Column(name="LASTUPDATE")
	private Date lastupdate;
	
	@Column(name="SHIPMENTINFO")
	private String shipmentinfo;
	
	@Column(name="STATUS")
	private String status;
	
	public CustomerOrder() {}

	public CustomerOrder(int orderid, int discount, Date lastupdate, String shipmentinfo, String status) {
		super();
		this.orderid = orderid;
		this.discount = discount;
		this.lastupdate = lastupdate;
		this.shipmentinfo = shipmentinfo;
		this.status = status;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Date getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}

	public String getShipmentinfo() {
		return shipmentinfo;
	}

	public void setShipmentinfo(String shipmentinfo) {
		this.shipmentinfo = shipmentinfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
