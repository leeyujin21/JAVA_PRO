package com.test03;

import java.util.StringTokenizer;

public class TestMain03 {
	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		int count = 0;
		double tot = 0;
		double avg = 0;
		// StringTokenizer 이용하여 List에 저장한다.
		// List에 저장된 데이터의 합과 평균을 구한다.
		StringTokenizer list = new StringTokenizer(str,",");
		while (list.hasMoreTokens()) {
			tot += Double.parseDouble(list.nextToken());
			count++;
		}
		avg = tot/count;
		System.out.println("합 계: "+tot);
		System.out.println("평 균: "+avg);
	}
}
