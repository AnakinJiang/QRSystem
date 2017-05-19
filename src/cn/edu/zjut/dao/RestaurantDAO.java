package cn.edu.zjut.dao;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.zjut.po.Restaurant;

public class RestaurantDAO extends BaseHibernateDAO implements IRestaurantDAO{
	private Map<String, Object> request, session;
	
    public boolean save(Restaurant restaurant) {
    	ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		Transaction tran = null;
		Session esession = null; 
        try {
            esession = getSession();
            tran = esession.beginTransaction();
            esession.save(restaurant);
			tran.commit();
			session.put("restaurant", restaurant);
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
	public boolean update(Restaurant restaurant) {
		ActionContext ctx= ActionContext.getContext();
		session=(Map) ctx.getSession();
		request=(Map) ctx.get("request");
		Transaction tran = null;
		Session esession = null;
		try {
			esession = getSession();
			tran = esession.beginTransaction();
			esession.update(restaurant);
			tran.commit();
			request.put("updateTip", "��Ϣ�޸ĳɹ���");
			session.put("merchant", restaurant);
		} catch (RuntimeException re) {
			return false;
		} finally {
			getSession().close();
		}
		return true;
	}
	
	public Restaurant find(String ID) {
        try {
            Session session=getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Restaurant where ID = '"+ ID +"'");
            query.setMaxResults(1);
            Restaurant restaurant = (Restaurant)query.uniqueResult();
            ts.commit();
            session.clear();
            return restaurant;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

	public boolean login(Restaurant restaurant) {
		ActionContext ctx= ActionContext.getContext();
	
		session=(Map) ctx.getSession();
		request=(Map) ctx.get("request");
		String ID = restaurant.getID();
		String password = restaurant.getPassword();
		System.out.println(ID);
		System.out.println(password);
		String hql = "from Restaurant as emp where ID='" + ID
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
				restaurant=(Restaurant)list.get(0);
				session.put("restaurant", restaurant);
				System.out.println( restaurant.getID());
				System.out.println( restaurant.getName());
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
	

	



