package main;

import leetcode.Solutions;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solutions sol = new Solutions();
		
//		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
//		System.out.println(sol.numUniqueEmails(emails));
		
	//	System.out.println(sol.toLowerCase("SkakaodASX"));
//		int[] x = {1,2,3,3};
//		int[] y = {2,1,2,5,3,2};
//		int[] z = {5,1,5,2,5,3,5,4};
//		
//		System.out.println(sol.repeatedNTimes(x));
//		System.out.println(sol.repeatedNTimes(y));
//		System.out.println(sol.repeatedNTimes(z));
		List<Integer> prices = new ArrayList<Integer>();
		prices.add(5);
		prices.add(1);
		prices.add(3);
		prices.add(4);
		prices.add(6);
		prices.add(2);
		sol.finalPrice(prices);
	}

}
