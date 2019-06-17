package com.biz.inout.model;

public class InoutDTO {
	
	private String day;
	private String goods;
	private int price;
	
	private String inout;
	private int amount;
	
	private int inTotal;
	private int outTotal;
	public InoutDTO(String day, String goods, int price, String inout, int amount, int inTotal, int outTotal) {
		super();
		this.day = day;
		this.goods = goods;
		this.price = price;
		this.inout = inout;
		this.amount = amount;
		this.inTotal = inTotal;
		this.outTotal = outTotal;
	}
	public InoutDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInout() {
		return inout;
	}
	public void setInout(String inout) {
		this.inout = inout;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getInTotal() {
		return inTotal;
	}
	public void setInTotal(int inTotal) {
		this.inTotal = inTotal;
	}
	public int getOutTotal() {
		return outTotal;
	}
	public void setOutTotal(int outTotal) {
		this.outTotal = outTotal;
	}
	@Override
	public String toString() {
		return "InoutDTO [day=" + day + ", goods=" + goods + ", price=" + price + ", inout=" + inout + ", amount="
				+ amount + ", inTotal=" + inTotal + ", outTotal=" + outTotal + "]";
	}
	
	
	
}
