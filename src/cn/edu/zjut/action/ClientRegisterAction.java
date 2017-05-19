package cn.edu.zjut.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.zjut.po.Client;
import cn.edu.zjut.service.IClientRegisterController;

public class ClientRegisterAction extends ActionSupport {



	/**
	 * 
	 */
	private static final long serialVersionUID = -729306249571434041L;
	private Client client;
	private IClientRegisterController clientRegisterController = null;
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public IClientRegisterController getClientRegisterController() {
		return clientRegisterController;
	}
	public void setClientRegisterController(IClientRegisterController clientRegisterController) {
		this.clientRegisterController = clientRegisterController;
	}
	public String register() {
		System.out.println("haha");
		if (clientRegisterController.register(client)) {
			return "regSUCCESS";
		}
		return "regFAILED";
	}
}