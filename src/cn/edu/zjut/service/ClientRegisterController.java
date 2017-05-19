package cn.edu.zjut.service;
import java.io.*;
import java.util.Calendar;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.zjut.po.Client;
import cn.edu.zjut.dao.IClientDAO;

public class ClientRegisterController implements IClientRegisterController {
	private IClientDAO clientDAO = null;

	public ClientRegisterController(){
	}
	public void setClientDAO(IClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}
	public boolean register(Client client) {  
		ActionContext ctx= ActionContext.getContext();
		Map<String, Object> session = (Map) ctx.getSession();
        Map<String, Object> request = (Map) ctx.get("request");
		 if (clientDAO.find(client.getID()) != null) {
	            request.put("tip", "账号已存在");
	            return false;
	        } else {
	    	    session.put("client", client);
	            request.put("tip", "娉ㄥ唽鎴愬姛");
	            return clientDAO.save(client);
	        }
		
	}

	/*public boolean update(Restaurant restaurant){
		if(restaurantDAO.update(restaurant))
			return true;
		else return false;
	}*/
}


