package com.info.bean;

import javax.ejb.Remote;

@Remote
public interface MyBeanRemote {
	
	String welcome(String name);

}
