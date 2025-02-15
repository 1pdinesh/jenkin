package com.info.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.info.bean.MyBeanRemote;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties properties = new Properties();
		properties.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		properties.put(Context.PROVIDER_URL, "t3://localhost:7001");
		properties.put(Context.SECURITY_PRINCIPAL, "weblogic"); // 
		properties.put(Context.SECURITY_CREDENTIALS, "weblogic1"); 
		try {
			InitialContext ctx = new InitialContext(properties);
			Object object = ctx.lookup("ejb/myBean#com.info.bean.MyBeanRemote");
			MyBeanRemote MyBeanRemote =(MyBeanRemote)object;
			String result = MyBeanRemote.welcome(" Dinesh");
			System.out.println(result);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}