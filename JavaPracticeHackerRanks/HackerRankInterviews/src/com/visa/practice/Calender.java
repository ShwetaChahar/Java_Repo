package com.visa.practice;

import java.util.Arrays;
import java.util.List;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calender obj = new Calender();
		obj.testCalender();

	}

	public Integer slots(String t1, String t2) {
		String[] t1arr = t1.split(":");
		String[] t2arr = t2.split(":");
		Integer hrdiff = Integer.parseInt(t2arr[0]) - Integer.parseInt(t1arr[0]);
		Integer mindiff = Integer.parseInt(t2arr[1]) - Integer.parseInt(t1arr[1]);
		return hrdiff * 4 + mindiff / 15;
	}

	// fill list from startIdx to startIdx+len
	public void fillSlots(Integer[] sarr, Integer startIdx, Integer len) {
		//System.out.printf("sidx: %d, len: %d\n", startIdx, len);
		for (int i = 0; i < len; ++i)
			sarr[startIdx + i] = 1;
	}

	public void findFreeSlot(List<List<String>> e1, List<List<String>> e2, Integer slots) {

		Integer numSlots = slots("09:00", "18:00");
		//System.out.println(numSlots);
		Integer[] slotArr = new Integer[numSlots];
		for (int i = 0; i < slotArr.length; ++i)
			slotArr[i] = 0;

		for (List<String> t : e1) {
			Integer startIdx = slots("09:00", t.get(0));
			Integer len = slots(t.get(0), t.get(1));
			fillSlots(slotArr, startIdx, len);
		}

		for (List<String> t : e2) {
			Integer startIdx = slots("09:00", t.get(0));
			Integer len = slots(t.get(0), t.get(1));
			fillSlots(slotArr, startIdx, len);
		}

		// for(int i=0; i<slotArr.length; ++i)
		// System.out.printf("sarr[i]:%d ", slotArr[i]);

		Integer startIdx = 0;
		Integer remSlots = slots;
		for (int i = 0; i < slotArr.length; ++i) {
			// System.out.printf("i:%d\n", i);
			if (slotArr[i] == 0)
				remSlots--;
			else
				remSlots = slots;
			if (remSlots == 0) {
				startIdx = i - slots + 1;
				Integer hr = startIdx / 4;
				Integer min = (startIdx % 4) * 15;
				String time = Integer.toString(hr + 9) + ":" + Integer.toString(min);
				System.out.printf("Slot available at %s\n", time);
			}
		}
	}

	public void testCalender() {
		List<List<String>> e1 = Arrays.asList(Arrays.asList("09:00", "09:30"), Arrays.asList("10:30", "11:30"),
				Arrays.asList("12:30", "13:30"), Arrays.asList("14:00", "15:00"));
		List<List<String>> e2 = Arrays.asList(Arrays.asList("10:00", "10:30"), Arrays.asList("11:30", "12:30"),
				Arrays.asList("14:30", "15:00"));
		findFreeSlot(e1, e2, 2);
	}

}
