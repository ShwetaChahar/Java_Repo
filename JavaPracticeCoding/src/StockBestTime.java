package com.apex.problems.practice;

public class StockBestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 2, 5, 3, 6, 4 ,9};
		System.out.println(maxProfit(a));

	}

	public static int maxProfit(int prices[]) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minprice)
				minprice = prices[i];
			else if (prices[i] - minprice > maxprofit)
				maxprofit = prices[i] - minprice;
		}
		System.out.print(minprice+",");
		System.out.println(maxprofit+minprice);
		return maxprofit;
		
	}
	
}
