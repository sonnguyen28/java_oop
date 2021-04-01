package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NoGarbage {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		File f = new File("text.txt");
		FileWriter fw = new FileWriter(f);
		FileReader fr = new FileReader(f);
		StringBuffer strBuffer = new StringBuffer();
		try {
			//tao file de test
			System.out.print("Dang tao file text ...\t");
			  for (int i = 0; i < 100000000; i++) {
					fw.write("java\n");
				}
			  System.out.println("====> OK");
			  //Doc file du lieu thanh 1 string su dung StringBuffer => Chuong trinh chay nhanh hon khi dung toan tu "+" va van chay duoc khi doc file rat dai
			  System.out.print("Dang doc du lieu thanh 1 chuoi \"CO\" su dung StringBuffer ...\t");
			  BufferedReader br = new BufferedReader(fr);
			  String line;
			  while ((line = br.readLine()) != null){
				  strBuffer.append(line);
			  }
			  System.out.println("====> OK");
			  fw.close();
			  fr.close();
			  System.out.println("Thoi gian chay chuong trinh la: " + (System.currentTimeMillis() - start));
		} catch (IOException ex) {
		    System.out.println("Loi ghi file: " + ex);
		}
	}

}
