package dai45_Q6;

import java.io.IOException;

public class Q6 {
	public static void main(String[] args) {

	 try {
		 	TelCounter counter = new TelCounter();
			counter.count("/Users/hayashiyoshiteru/ファイル/contact-records.txt");
			counter.display();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}