package cn.edu.zjut.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.zjut.po.Restaurant;
import cn.edu.zjut.service.IRestaurantRegisterController;

public class RestaurantRegisterAction extends ActionSupport {



	/**
	 * 
	 */
	private static final long serialVersionUID = -729306249571434041L;

	private Restaurant restaurant;

	private IRestaurantRegisterController restaurantRegisterController = null;

	public IRestaurantRegisterController getRestaurantRegisterController() {
		return restaurantRegisterController;
	}

	public void setRestaurantRegisterController(IRestaurantRegisterController restaurantRegisterController) {
		this.restaurantRegisterController = restaurantRegisterController;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public String register() {
		System.out.println("haha");
		if (restaurantRegisterController.register(restaurant)) {
			return "regSUCCESS";
		}
		return "regFAILED";
	}
}