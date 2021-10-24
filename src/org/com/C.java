package org.com;

public class C extends A {
	
	public void name() {
System.out.println("mani");
}	
	
	public static void main(String[] args) {
		C c = (C) new A();
	   c.name();
	    Sample s=new A();
		s.name();
	}

}
