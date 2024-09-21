package com.sbi;

public class ReturnStatement {
	
	byte add() {
		byte i=10, j=20;
		byte k = (byte) (i+j);
		return k;
	}
	
	short sub() {
		short i=15, j=20;
		short k = (short) (i-j);
		return k;
	}
	
	float decimal() {
		float i=2.5f, j=3.5f;
		float k = (float) (i+j);
		return k;
	}
	
	long longType() {
		long i=25555l, j=35777l;
		long k = (long) (i+j);
		return k;
	}
	
	boolean booleanType() {
		int i=10,j=20;
		if(i>j) {
			return true;
        }
		else {
			return false;	
		}
		
	}

	public static void main(String[] args) {
		ReturnStatement obj = new ReturnStatement();
        System.out.println("byte "+obj.add());
        System.out.println("short "+obj.sub());
        System.out.println("float "+obj.decimal());
        System.out.println("long "+obj.longType());
        System.out.println("boolean "+obj.booleanType());
	}

}
