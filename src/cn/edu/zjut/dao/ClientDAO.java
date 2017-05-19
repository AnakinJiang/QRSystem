package cn.edu.zjut.dao;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.zjut.po.Client;

public class ClientDAO extends BaseHibernateDAO implements IClientDAO{
	private Map<String, Object> request, session;
	
    public boolean save(Client client) {
    	ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		Transaction tran = null;
		Session esession = null; 
        try {
            esession = getSession();
            tran = esession.beginTransaction();
            esession.save(client);
			tran.commit();
			session.put("client", client);
		} catch (RuntimeException re) {
			re.printStackTrace();

			if(tran != null) tran.rollback();
			return false;
		} finally {
			getSession().close();
		}
		return true;
    }
/*
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean findByIDNum(Merchant merchant){//��֤���֤���Ƿ�ʹ��
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		request=(Map) ctx.get("request");
		String merchantIDNum = merchant.getMerchantIDNum();
		String hql = "from Merchant as emp where merchantIDNum='" + merchantIDNum+ "'";
		try {
			String queryString = hql;
			Query queryObject = getSession().createQuery(queryString);
			List list=queryObject.list();
			if (!list.isEmpty()){
				request.put("tip", "ע��ʧ�ܣ������֤���ѱ�ʹ��");
				return false;
			}
		}catch (RuntimeException re) {
			System.out.println(re);
			request.put("tip", "ע��ʧ�ܣ������������쳣");
			return false;
		}
		getSession().close();
		return true;
	}
*/
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean update(Client client) {
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		request=(Map) ctx.get("request");
		Transaction tran = null;
		Session esession = null;
		try {
			esession = getSession();
			tran = esession.beginTransaction();
			esession.update(client);
			tran.commit();
			request.put("updateTip", "��Ϣ�޸ĳɹ���");
			session.put("merchant", client);
		} catch (RuntimeException re) {
			return false;
		} finally {
			getSession().close();
		}
		return true;
	}
	
	public Client find(String ID) {
        try {
            Session session=getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Client where ID = '"+ ID +"'");
            query.setMaxResults(1);
            Client client = (Client)query.uniqueResult();
            ts.commit();
            session.clear();
            return client;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

	public boolean login(Client client) {
		ActionContext ctx= ActionContext.getContext();
	
		session=(Map) ctx.getSession();
		request=(Map) ctx.get("request");
		String ID = client.getID();
		String password = client.getPassword();
		System.out.println(ID);
		System.out.println(password);
		String hql = "from Client as emp where ID='" + ID
				+ "' and password='" +password + "'";
		try {
			String queryString = hql;
			Query queryObject = getSession().createQuery(queryString);
			List list=queryObject.list();
			if (list.isEmpty()){
				request.put("tip", "�û��������������˶ԣ�");
				return false;
			}
/*			else */
			else{
				client=(Client)list.get(0);
				session.put("client", client);
				System.out.println( client.getID());
				System.out.println( client.getName());
				request.put("tip", "��¼�ɹ���");	
			}
		}catch (RuntimeException re) {
			System.out.println(re);
			return false;
		}
		getSession().close();
		return true;
	}

	/*@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean register(Restaurant restaurant) {//ע��
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		request=(Map) ctx.get("request");
		Transaction tran = null;
		Session esession = null; 
		try {
			esession = getSession();
			tran = esession.beginTransaction();
			esession.save(restaurant);
			tran.commit();
			session.put("restaurant", restaurant);
			request.put("tip", "ע��ɹ�");
		} catch (RuntimeException re) {
			re.printStackTrace();
			if(tran != null) tran.rollback();
			request.put("tip", "ע��ʧ�ܣ����ֻ����ѱ�ʹ��");
			return false;
		} finally {
			getSession().close();
		}
		return true;
	}*/
}
	

	



