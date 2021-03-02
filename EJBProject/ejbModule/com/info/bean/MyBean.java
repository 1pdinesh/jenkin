package com.info.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MyBean
 */
@Stateless(mappedName="ejb/myBean")
@LocalBean
public class MyBean implements MyBeanRemote, MyBeanLocal {

    /**
     * Default constructor. 
     */
    public MyBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String welcome(String name) {
		// TODO Auto-generated method stub
		return " hello and good evening  "+name;
	}

}
