package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GarbageCreator {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		File f = new File("text.txt");
		FileWriter fw = new FileWriter(f);
		FileReader fr = new FileReader(f);
		String str = "";
		try {
			// Tao file de test
			  System.out.print("Dang tao file text ...\t");
			  for (int i = 0; i < 100000000; i++) {
					fw.write("java\n");
				}
			  System.out.println("====> OK");
			  //Doc file du lieu thanh 1 string su dung toan tu "+" ===> Chuong trinh chay lau va khong thay dung lai khi doc file rat dai
			  System.out.print("Dang doc du lieu thanh 1 chuoi su dung toan tu \"+\" ...\t");
			  BufferedReader br = new BufferedReader(fr);
			  String line;
			  while ((line = br.readLine()) != null){
				  str += line;
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
