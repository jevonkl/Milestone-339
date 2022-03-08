package com.gcu.model;

public class ProductModel {
	private Long id;
	private String gameNo;
	private String gameName;
	private Float price;
	private int quantity;

	public ProductModel(Long id, String gameNo, String gameName, Float price, int quantity) {
		super();
		this.id = id;
		this.gameNo = gameNo;
		this.gameName = gameName;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the gameNo
	 */
	public String getGameNo() {
		return gameNo;
	}

	/**
	 * @param gameNo the gameNo to set
	 */
	public void setGameNo(String gameNo) {
		this.gameNo = gameNo;
	}

	/**
	 * @return the gameName
	 */
	public String getGameName() {
		return gameName;
	}

	/**
	 * @param gameName the gameName to set
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
