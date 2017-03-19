package demo.java.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Sven
 * @date 创建时间：2017年3月19日 上午3:36:49
 * @version 1.0
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();

		treeMap.put("a", "a");
		treeMap.put("b", "b");
		treeMap.put("c", "c");
		treeMap.put("1", "1");
		treeMap.put("2", "2");
		treeMap.put("3", "3");

		System.out.println(treeMap);

		Map<String, String> hashMap = new HashMap<String, String>();

		hashMap.put("a", "a");
		hashMap.put("b", "b");
		hashMap.put("c", "c");
		hashMap.put("1", "1");
		hashMap.put("2", "2");
		hashMap.put("3", "3");

		System.out.println(hashMap);
	}
}
