package com.javaex.ex02;

public abstract class Bird {
	// 필드
		protected String name;
		
		public Bird() {
			name = "이름없음";
		}
		
		// 생성자
		public Bird(String name) {
			this.name = name;
			
		}
		
		// 메서드
		public abstract void sing();

		
		public abstract void fly();	
		
		
		public abstract void showName(); 			
			
		public  void setName(String name) {
			this.name = name;
			
		}
		



}
