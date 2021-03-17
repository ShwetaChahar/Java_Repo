package com.visa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class StockPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StockPairs obj = new StockPairs();
		List<Integer> stocksProfit = Arrays.asList(1, 3, 4, 5, 6, 7, 8 );

		long target = 15;
		System.out.println(obj.stockPairs(stocksProfit, target));

	}
	/*
	 * Complete the 'stockPairs' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY stocksProfit 2. LONG_INTEGER target
	 */

	public int stockPairs(List<Integer> stocksProfit, long target) {
		// Write your code here
		HashMap<Long, Long> res = new HashMap<Long, Long>();
		HashSet<Long> st = new HashSet<Long>();
		for (Integer j : stocksProfit) {
			Long i = Integer.toUnsignedLong(j);
			Long pair = target - i;
			if (st.contains(pair)) {
				if (i < pair)
					res.put(i, pair);
				else
					res.put(pair, i);
			} else
				st.add(i);
		}
		return res.size();

	}

}
