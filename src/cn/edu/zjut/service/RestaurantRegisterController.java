package cn.edu.zjut.service;
import java.io.*;
import java.util.Calendar;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.zjut.po.Restaurant;
import cn.edu.zjut.dao.IRestaurantDAO;

public class RestaurantRegisterController implements IRestaurantRegisterController {
	private IRestaurantDAO restaurantDAO = null;

	public RestaurantRegisterController(){
	}
	public void setRestaurantDAO(IRestaurantDAO restaurantDAO) {
		this.restaurantDAO = restaurantDAO;
	}
	public boolean register(Restaurant restaurant) {  
		ActionContext ctx= ActionContext.getContext();
		Map<String, Object> session = (Map) ctx.getSession();
        Map<String, Object> request = (Map) ctx.get("request");
		 if (restaurantDAO.find(restaurant.getID()) != null) {
	            request.put("tip", "账号已存在");
	            return false;
	        } else {
	    	    session.put("restaurant", restaurant);
	            request.put("tip", "娉ㄥ唽鎴愬姛");
	            return restaurantDAO.save(restaurant);
	        }
		
	}

	/*public boolean update(Restaurant restaurant){
		if(restaurantDAO.update(restaurant))
			return true;
		else return false;
	}*/
}


