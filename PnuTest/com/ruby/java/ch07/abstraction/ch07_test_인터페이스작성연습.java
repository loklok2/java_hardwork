package com.ruby.java.ch07.abstraction;
/*
 * 7장 실습 코드로 구현한다 
 */

interface Shape {
	public double perimeter();
	public float area();
}

class Triangle implements Shape {
	private int x1,y1,x2,y2,x3,y3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;	
	}
	@Override
	public double perimeter() { 
		double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
	    double side3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		return side1 + side2 + side3;
	}
	@Override
	public float area() { //0/5 * |(x1y2+x2y3+x3y1)-(x2y1+x3y2+x1y3)|
		float ss1 = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	    float ss2 = (float) Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
	    float ss3 = (float) Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
	    float s = (ss1 + ss2 + ss3) / 2.0f;
	    float area = (float) Math.sqrt(s * (s - ss1) * (s - ss2) * (s - ss3));
	    return area;
	}    
	    //float은 4바이트, double은 8바이트 숫자의 범위차이 때문에 double이 더 정확할 거 같음

}
class Rectangle implements Shape {
	int x1,y1,x2,y2;
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
				
	}
	@Override
	public double perimeter() { // = 2*(길이+폭) 즉, 2*(|x2-x1|+|y2-y1|) 
		int length;
		if(x2-x1<0) {         //음수일떄 양수로
			length = (x1-x2); 
		} else {
			length = (x2-x1);
		}
		int width;
		if(y2-y1 < 0) {       //음수일떄 양수로
			width = (y1 - y2);
		} else {
			width = (y2-y1);
		}
		return 2 * (length + width);
	}

	@Override
	public float area() {
		int length;
		if(x2-x1<0) {         //음수일떄 양수로
			length = (x1-x2); 
		} else {
			length = (x2-x1);
		}
		int width;
		if(y2-y1 < 0) {       //음수일떄 양수로
			width = (y1 - y2);
		} else {
			width = (y2-y1);
		}
		return length * width;
	}
}
class Square extends Rectangle { // Square는 Rextangle의 클래스를 상속받음
//	int x1, y1;
//	int side;
	public Square (int x1, int y1, int side){
		super(x1, y1, x1 + side, y1 + side);
	}
}
public class ch07_test_인터페이스작성연습 {
	public static void main(String[] args) {
	Shape t = new Triangle(1,2,3,4,5,6);
	Shape r = new Rectangle(1,2,3,4);
	Shape s = new Square(1,2,3);
	
	System.out.println("삼각형 둘레 길이 = " + t.perimeter());
	System.out.println("삼각형 면적 = " + t.area());
	System.out.println("사각형 둘레 길이 = " + r.perimeter());
	System.out.println("사각형 면적 = " + r.area());
	}
}

