//package com.visa.practice;
//
//import org.json.simple.JSONObject;
//
//public class JSONfetchlastValue {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public static String recurse(JSONObject jObj, String skey) {
//
//		String finalValue = "";
//		if (jObj == null) {
//			return "";
//		}
//		String[] karr = jObj.getall(); // method to fetch key level 1
//		for (String key : karr) {
//			Object value = jObj.get(key); // method fetch value passing key(String)
//			if (value instanceof JSONObject) {
//				finalValue = recurse((JSONObject) value, skey);
//				if (finalValue.equals("") == false)
//					return finalValue;
//			} else if (skey.equals(key)) {
//				return key;
//			}
//		}
//		// key is not found
//		return finalValue;
//	}
//
//}
