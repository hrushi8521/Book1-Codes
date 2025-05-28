package q2;

import java.io.IOException;

class A {
	void check() throws IOException {
		IOException i = new IOException();
		throw i;
	}
}

class B{
	A a = new A();
	void check2() throws IOException {
		a.check();
	}
}

public class MMain2 {
public static void main(String[] args) {
	B b = new B();
	try {
		b.check2();

	} catch (Exception e) {
System.out.println(e);	}
}
}
