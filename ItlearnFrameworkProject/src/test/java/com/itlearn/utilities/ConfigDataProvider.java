package com.itlearn.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		File src = new File("C:\\Users\\rajes\\eclipse-workspace\\Itlearn360Frameworks\\configration\\config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getBrowser() {
		return pro.getProperty("browser");
	}

	public String getUrl() {
		return pro.getProperty("url");
	}

}
