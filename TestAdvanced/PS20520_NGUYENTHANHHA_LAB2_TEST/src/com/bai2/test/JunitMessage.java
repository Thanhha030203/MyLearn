package com.bai2.test;

public class JunitMessage {
		private String message;
		public JunitMessage(String message) {
			this.message = message;
			
		}
		public String printMessage(String message) { 
			System.out.println(message);
			return message;
			
		}
		public String printMessageNew(String message) { 
			message = "Hi" + message;
			System.out.println(message);
			return message;
			
		}
}
