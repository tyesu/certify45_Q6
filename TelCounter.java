package dai45_Q6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class TelCounter {
	HashMap<String, Integer> telNoCountMap;
	TelCounter() {
		/* Q6クラスでTelCounterのインスタンスを生成
		 * →TelCounterの引数なしのコンストラクタを動かす
		 * →HashMapのインスタンスを生成
		 */
		telNoCountMap = new HashMap<String, Integer>();
	}

	// try〜catchをしていないため、FileNotFoundExceptionのスーパークラスのIOExceptoinを指定しておく。
	void count(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String telNo;
		while((telNo = reader.readLine()) != null) {
			if(!telNoCountMap.containsKey(telNo)) { // 引数で指定されたkey(電話番号)がマップとして存在しない場合にtrueを返す
				telNoCountMap.put(telNo, 1);  // 引数で指定されたkey(電話番号)と値（カウント）をマップに設定
				continue;
			}
			Integer count = telNoCountMap.get(telNo);
			telNoCountMap.put(telNo, count + 1);
		}
		reader.close();
	}
	void display() {
		for(Map.Entry<String, Integer> telNo : telNoCountMap.entrySet()) {
			System.out.println(telNo.getKey() + ":" + telNo.getValue()+ "回");
		}
	}
}