package cn.edu.zjut.dao;
import cn.edu.zjut.po.Client;

public interface IClientDAO {
	boolean login(Client client);
	//boolean findByIDNum(Merchant merchant);
	//boolean register(Restaurant restaurant);
	boolean update(Client client);
	boolean save(Client client);
	public Client find(String ID) ;
}
