package com.leetcode.shuxue;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	/**
	 * mmp，不会做 ，
	 * @param s
	 * @return
	 */
	public static int romanToInt(String s) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C",100);
		map.put("D", 500);
		map.put("M", 1000);
		
		StringBuffer ss = new StringBuffer(s);
		
		int a = s.length();
		char[] tem = new char[a];
		
		for(int i = 0;i<a;i++) {
			tem[i] = ss.charAt(i);
			System.out.println(tem[i]);
		}
		System.out.println(tem[0]+tem[1]);
		return 0;
	}
	
	/**
	 * csdn上的答案
	 * 分析：
	 * 判定非空 
	 *	設定鍵值 
	 *	循環遍歷 
	 *	判断加减
	 * @param s
	 * @return
	 */
	 public static int romanToInt1(String s) {
	        if (s == null || s.length() == 0)    return -1;
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D', 500);
	        map.put('M', 1000);
	        int len = s.length(), result = map.get(s.charAt(len - 1));
	        for (int i = len - 2; i >= 0; i--) {
	            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
	                result += map.get(s.charAt(i));
	            else
	                result -= map.get(s.charAt(i));
	        }
	        return result;
	        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shuru = "IX";
		int answer = romanToInt1(shuru);
		System.out.println(answer);
	}

}
