package cn.edu.zjut.dao;
import cn.edu.zjut.po.Restaurant;

public interface IRestaurantDAO {
	boolean login(Restaurant restaurant);
	//boolean findByIDNum(Merchant merchant);
	//boolean register(Restaurant restaurant);
	boolean update(Restaurant restaurant);
	boolean save(Restaurant restaurant);
	public Restaurant find(String ID) ;
}
