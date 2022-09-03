package com.interbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	//create constructor of this class
	public ReadConfig() {
		File src = new File("./configurations\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch(Exception e) {
			System.out.println("Exception is: "+	e.getMessage());
		}
	}
	
	public String getApplicationURL(){
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String username=prop.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password=prop.getProperty("password");
		return password;
	}
	
	public String getchromepath() {
		String chrompath=prop.getProperty("chromepath");
		return chrompath;
	}
	public String getiepath() {
		String iepath=prop.getProperty("iepath");
		return iepath;
	}
	public String getfirefoxpath() {
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
	}

}
