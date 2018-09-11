package com.leetcode.zifuc;

/**
 * 最长公共前缀
 * 
 * @author xw
 */
public class LongestCommonPrefix {
	/**
	 * 我的答案-最长公共前缀 错误： 输入： ["caa","","a","acb"] 输出： "a" 预期： ""
	 * 
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix(String[] strs) {
		String answer = "";
		if (strs.length == 0 || strs[0].equals("")) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0].toString();
		}
		for (int i = 0; i < strs.length; i++) {
			for (int j = i + 1; j < strs.length; j++) {
				String str = strs[i];
				String str1 = strs[j];
				for (int k = 0; k <= str.length(); k++) {
					for (int y = 0; y <= str1.length(); y++) {
						if (str.substring(0, k).equals(str1.substring(0, y))) {
							answer = str.substring(0, y);
						}
					}
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "flower", "flow", "flight" };
		String[] st = { "caa", "", "a", "acb" };
		System.out.println(strs.length);
		System.out.println(longestCommonPrefix(strs));

	}

	/**
	 * 答案来自简书
	 */
	public static String longestCommonPrefix1(String[] strs) {
		int index = 0;
		if (strs.length == 0) {
			return "";
		}
		for (int i = 0; i < strs[0].length(); i++) {
			char str1 = strs[0].charAt(index);
			for (String str : strs) {
				if (str.length() == i || str1 != str.charAt(index)) {
					return str.substring(0, index);
				}
			}
			index++;
		}

		return strs[0].substring(0, index);
	}
}
