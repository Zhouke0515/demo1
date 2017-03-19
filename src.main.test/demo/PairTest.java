package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import demo.java.generic.ArrayAlg;
import demo.java.generic.Pair;

/**
 * @author Sven
 * @date 创建时间：2017年3月19日 下午2:24:17
 * @version 1.0
 */
public class PairTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String[] words = { "Mary", "had", "1", "sdas","sd","asc" };
		Pair<String> pair = ArrayAlg.minmax(words);
		System.out.println("最小：" + pair.getFirst());
		System.out.println("最大：" + pair.getSecond());
		
		String middle = ArrayAlg.getMiddle(words);
		System.out.println("中间索引的值：" + middle);
	}
	
	
	@Test
	public void test2() {
		Integer[] words = { 1, 123, 1234, 56,563,453 };
		Pair<Integer> pair = ArrayAlg.minmax(words);
		System.out.println("最小：" + pair.getFirst());
		System.out.println("最大：" + pair.getSecond());
		
		Integer middle = ArrayAlg.getMiddle(words);
		System.out.println("中间索引的值：" + middle);
	}

}
