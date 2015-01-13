package com.ltc.pojo;

public class Product {
	
	private String productid;
	private String name; 
	private String description;
	private String basePrice;
	private String categoryid;
	private String category;
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	private String author; 
	private String publish ;
	private String pages ;
	private String images;
	private String amount;
	private String totalPrice;
	
	public void setTotalPrice(){
		if(amount!=null && basePrice!=null){
			totalPrice=(Double.parseDouble(basePrice)*Double.parseDouble(amount))+"";
		}
	}
	
	
	public String getTotalPrice() {
		return totalPrice;
	}

	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(String basePrice) {
		this.basePrice = basePrice;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}
