package com.design.patterns.java.example.singleton;

public class DbSingleton {
	public static volatile DbSingleton instance = null;
	
	private DbSingleton() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance() to create");
		}
	};
	
	public static DbSingleton getInstance() {
		if (instance == null) {
			synchronized(DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
}
