package com.test03;

public class MyFoodMgr {

	private Food favoriteFood;
	private Food unFavoriteFood;

	public MyFoodMgr() {
		favoriteFood = new Food();
	    favoriteFood.setName("딤섬");
	    favoriteFood.setPrice(150000);
		
		System.out.println("객체 생성");
	}

	public MyFoodMgr(Food favoriteFood, Food unFavoriteFood) {
		super();
		this.favoriteFood = favoriteFood;
		this.unFavoriteFood = unFavoriteFood;
	}

	public Food getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public Food getUnFavoriteFood() {
		return unFavoriteFood;
	}

	public void setUnFavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
	}

	@Override
	public String toString() {
		return "호 : " + favoriteFood + "\n불호 :" + unFavoriteFood;
	}

}
