package hust.soict.hedspi.garbage;

import java.util.Random;

public class ConcatenationInLoops {

	public static void main(String[] args) {
		// Su dung toan tu "+"
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s += r.nextInt(2);
		}
		System.out.println("String: " + (System.currentTimeMillis() - start) + "ms");
		
		// Su dung StringBuilder
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append(r.nextInt(2));
		}
		s = sb.toString();
		System.out.println("StringBuilder: " + (System.currentTimeMillis() - start)+ "ms");
		
		// Su dung StringBuffer
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuffer sbuff = new StringBuffer();
		for (int i = 0; i < 100000; i++) {
			sbuff.append(r.nextInt(2));
		}
		s = sbuff.toString();
		System.out.println("StringBuffer: " + (System.currentTimeMillis() - start)+ "ms");
		
	}

}
