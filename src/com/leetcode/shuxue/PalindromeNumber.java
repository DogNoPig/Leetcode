package com.leetcode.shuxue;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		if (s.length() % 2 == 0) {
			int a = s.length() / 2;
			String shang = s.substring(0, a);
			String xia = s.substring(s.length() / 2, s.length());
			StringBuffer ss = new StringBuffer(xia);
			ss.reverse();
			if (shang.equals(ss.toString())) {
				return true;
			} else {
				return false;
			}
		} else {
			if (s.length() == 1) {
				return true;
			}
			String shang = s.substring(0, (int) (Math.ceil(s.length() / 2)));
			String xia = s.substring((int) (Math.ceil(s.length() / 2) + 1), s.length());
			StringBuffer ss = new StringBuffer(xia);
			if (shang.equals(ss.reverse().toString())) {
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * 官方标准答案
	 * @param x
	 * @return
	 */
	public static boolean IsPalindrome(int x) {
		// 特殊情况：
		// 如上所述，当 x < 0 时，x 不是回文数。
		// 同样地，如果数字的最后一位是 0，为了使该数字为回文，
		// 则其第一位数字也应该是 0
		// 只有 0 满足这一属性
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}

		// 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
		// 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
		// 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
		return x == revertedNumber || x == revertedNumber / 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 1210;
		System.out.println(IsPalindrome(test));
	}

}
