package demo.java.generic;

/**
 * @author Sven
 * @date 创建时间：2017年3月19日 下午2:27:12
 * @version 1.0
 */
public class ArrayAlg {

	public static <T extends Comparable<T>> Pair<T> minmax(T[] words) {
		if (words == null || words.length == 0) {
			return null;
		}
		T min = words[0];
		T max = words[0];
		for (int i = 0; i < words.length; i++) {
			if (min.compareTo(words[i]) > 0)
				min = words[i];
			if (max.compareTo(words[i]) < 0)
				max = words[i];
		}
		return new Pair<T>(min, max);
	}

	public static <T> T getMiddle(T[] words) {
		return words[words.length / 2];
	}

}
