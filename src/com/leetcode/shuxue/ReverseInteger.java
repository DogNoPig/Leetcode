package com.leetcode.shuxue;

import java.math.BigInteger;

/**
 * 反转整数-数学
 * @author xw
 * 2018\9\8
 */
public class ReverseInteger {
	/**
	 * 这个方法是错误的，没有验证溢出
	 * @param x
	 * @return
	 */
	public static int reverse(int x) {
		String sb = String.valueOf(x);
		StringBuffer reverse = null;
		//Long s;
		if(x < 2147483647 && x > -2147483648) {
			if(sb.indexOf("-") == 0) {
				sb.subSequence(1, sb.length());
				reverse = new StringBuffer(sb);
				String reverse1 = reverse.substring(0, (int) Math.ceil(sb.length()/2));
				String reverse2 = reverse.substring((int) Math.ceil(sb.length()/2), sb.length());
				StringBuffer r1 = new StringBuffer(reverse1);
				StringBuffer r2 = new StringBuffer(reverse2);
				r1.replace(0, 1, "");
				x = Integer.parseInt("-"+r2.reverse().toString()+r1.reverse());
			}else if(sb.indexOf("0") == sb.length()){
				sb.subSequence(0, sb.length()-1);
				reverse = new StringBuffer(sb);
				reverse.reverse();
				reverse.replace(0, 1, "");
				x = Integer.parseInt(reverse.toString());
			}else {
				reverse = new StringBuffer(sb);
				String reverse1 = reverse.substring(0, (int) Math.ceil(sb.length()/2));
				String reverse2 = reverse.substring((int) Math.ceil(sb.length()/2), sb.length());
				StringBuffer r1 = new StringBuffer(reverse1);
				StringBuffer r2 = new StringBuffer(reverse2);
				x = Integer.valueOf(r2.reverse().toString()+r1.reverse().toString());
		}
		}else {
			return 0;
		}
		return x;
	}
	
	public static void main(String[] a) {
			int s =-1534236461;
			
			s = reverse1(s);
			
			System.out.println(s);
		}
		
	/**
	 * 正确方法
	 * @param x
	 * @return
	 */
	    public static int reverse1(int x) {
	        int rev = 0;
	        while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	            rev = rev * 10 + pop;
	        }
	        return rev;
	    }
	
}
