package c2000;

public class Main {

	static void say() {
		System.out.println("main");
	}

	public static void main(String[] args) {
		say();
		Hello hello = new Hello();
		hello.say("hello world");
	}
}
