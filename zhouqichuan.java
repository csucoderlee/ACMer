package com.csu.zhouqichuan;

import java.util.Scanner;

/*
 * 
 * 样例输入    abcdabcdabcd
 * 
 * 样例输出    4
 * 
 */
public class Test {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String s = cin.nextLine();
		char[] a = s.toCharArray();//读入一行字符串，字符串拆解成字符数组
		int i;  
		boolean flag;
		for (i = 1; i < a.length; i++) {  //设周期为i,从1开始不断的去假设i值是多少，判断字符串是否满足这个周期
			if(a.length%i == 0){   //如果i是周期，那么字符串长度必定是i的整数倍，过滤一些没必要的i的穷举数值
				flag = true;
				for(int j=i;j<a.length;j++){
					if(a[j] != a[j%i]){   //判断第n个周期内的数是否与第一个周期内的数对应
						flag = false;
						break;  // 退出当前for循环
					}
				}
				if(flag){
					System.out.print(i); // 输出周期数值
					break;  //退出外围for循环
				}
				
			}

		}
	}

}
