package com.abhi.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.print.attribute.standard.MediaSize.Engineering;

public class TestResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doWork(new SoftwareEngineer());
		
//		Stream.Builder<String> builder=Stream.builder();
//		builder.add("One").add("2").add("2");
//		Stream<String> builderStream=builder.build();
//		builder.add("One");
//		Stream<String> builderStreamOne=builder.build();
//		builderStreamOne.forEach(System.out::println);
//

		
     
		
		

	}
	
	public static void verify() throws IOException,RuntimeException{
		// TODO Auto-generated method stub
		System.out.println("i am shit");
		throw new RuntimeException("sine sgut");
	}

	private static void doWork(Object obj){
		Stream.of((Programmer & Tester) obj).peek(engineer -> {
			engineer.writeCode();
			engineer.testCode();
		});
		
	}

}

interface Programmer {
	
	default void writeCode() {
		System.out.println("I can write..");
	}
}

interface Tester {
	
	default void testCode() {
		System.out.println("I am test code..");
	}
}

class SoftwareEngineer implements Programmer,Tester{}

class AirPlane{
	
	
}