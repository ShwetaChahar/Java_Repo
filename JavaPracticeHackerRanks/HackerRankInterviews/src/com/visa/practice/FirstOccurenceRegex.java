package com.visa.practice;

public class FirstOccurenceRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	    /*
	     * Complete the 'firstOccurrence' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. STRING s
	     *  2. STRING x
	     */

	    public static int firstOccurrence(String s, String x) {
	    // Write your code here//Karnataka   //*arn ,Kar*,na*ak, n*tak,nata(no *)
	        System.out.println(s + ","+x);
	        if (x.indexOf("*", 0) == -1)
	            return s.indexOf(x, 0);

	        String[] xarr = x.split("\\*");
	        for(String str:xarr)
	            System.out.println(str);
	        boolean first = false;
	        boolean last = false;
	        if (xarr.length == 1) {
	            if (x.charAt(0) == '*')
	                first = true;
	            else 
	                last = true;
	        }

	        if (first)
	            return s.indexOf(xarr[0], 0)-1;
	        else if (last) {
	            int pos = s.indexOf(xarr[0], 0); 
	            if (pos + xarr[0].length() <= s.length())
	                return pos;
	            else 
	                return -1;
	        }
	        //we r here means, * is in middle//x=rn*tak s=karnrulhj;ljlktaktaknataka
	        int fpos = s.indexOf(xarr[0], 0);
	        int spos = s.indexOf(xarr[1], fpos+xarr[0].length()+1);
	        System.out.println(fpos);  System.out.println(spos); 
	        if ((fpos + xarr[0].length()+1) == spos)
	            return fpos;
	        
	        return -1;
	    }

	}


