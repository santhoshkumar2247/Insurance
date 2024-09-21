package com.sbi;

public class String_concept {
	
	void stringBufferConcept() {
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println(sb2);
		System.out.println(System.identityHashCode(sb2));
		sb1= sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
	}
	
	void stringMethods() {
		String st = "Hello";
		String st2 = "hello";
		boolean bl = st.equalsIgnoreCase(st2);
		System.out.println("equalsIgnoreCase "+bl);
		String st3 = st.toLowerCase();
		System.out.println("LowerCase: "+st3);
		
		String st4 = st.substring(0, 3);
		System.out.println("substring: "+st4);
		System.out.println("=============");
		
		for(int i=0; i<st.length();i++) {
			System.out.println(st.charAt(i));
		}
		System.out.println("=============");
		
		String rvo="";
		for(int i=st.length()-1; i>=0;i--) {
			rvo += st.charAt(i);
		}
		System.out.println(rvo);
	}
	
	public static void main(String[] args) {
		String_concept sc= new String_concept();
		//sc.stringBufferConcept();
		sc.stringMethods();
	}

}
