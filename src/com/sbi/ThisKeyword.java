package com.sbi;

public class ThisKeyword {
int x,y;

//ThisKeyword(int x,int y){
//	this.x=x;
//	this.y=y;
//}

void setData(int x,int y) {
	this.x=x;
 	this.y=y;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

void display() {
	System.out.println(x);
	System.out.println(y);
}
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		obj.setData(50, 70);
		obj.display();
		obj.setX(5);
		System.out.println(obj.getX());
	}

}
