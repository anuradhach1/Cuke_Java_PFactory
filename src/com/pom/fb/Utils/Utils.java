package com.pom.fb.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Utils {
	protected Properties CONFIG = null;
	protected Properties OR = null;
	
	public void configSetup(){
		
		// initialize the properties file
		CONFIG = new Properties();
		String configPath = System.getProperty("user.dir") + "/src/com/pom/fb/Utils/config.properties";
		try {
			System.out.println("Initiating the CONFIG");
			FileInputStream fsconfig = new FileInputStream(configPath);
			CONFIG.load(fsconfig);
			} catch(Exception e){
				System.out.println("Error loading the config.properties file");
				return;
			}
		

		// initialize the OR file
		OR = new Properties();
		String orPath = System.getProperty("user.dir") + "/src/com/pom/fb/Utils/OR.properties";
		try {
			System.out.println("Initiating the OR");
			FileInputStream fsor = new FileInputStream(orPath);
			OR.load(fsor);
			} catch(Exception e){
				System.out.println("Error loading the OR.properties file");
				return;
			}	
		
	}
	
	
}
