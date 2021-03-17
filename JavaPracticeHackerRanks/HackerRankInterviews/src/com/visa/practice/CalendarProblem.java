package com.visa.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CalendarProblem {

	public static void main(String[] args) {
		//Slots Busy of both employees
		//Employee1 = [ [9:00, 11:30], [12:00, 13:30], [14:00, 15:00]]

		// Employee2: = [[10:00, 11:00], [13:00, 14:00]]
		List<String[]> emp1Times = new ArrayList<String[]>();
		List<String[]> emp2Times = new ArrayList<String[]>();
		String[] slot1 = { "9:00", "11:30" };
		emp1Times.add(slot1);
		String[] slot2 = { "12:00", "13:30" };
		emp1Times.add(slot2);
		String[] slot3 = { "14:00", "15:00" };
		emp1Times.add(slot3);
		String[] slot4 = { "10:00", "11:00" };
		emp2Times.add(slot4);
		String[] slot5 = { "13:00", "14:00" };
		emp2Times.add(slot5);
		CalendarProblem obj = new CalendarProblem();
		
		System.out.println("Available time slot starts at:" + obj.findTime(emp1Times, emp2Times));

	}

	public String findTime(List<String[]> emp1Times, List<String[]> emp2Times) {
		Set<Integer> emp1BusySlots = new HashSet<Integer>();
		Set<Integer> emp2BusySlots = new HashSet<Integer>();
		for (String[] busySlot : emp1Times) {
			String startTime = busySlot[0];
			String endTime = busySlot[1];
			int startSlot = getIndexOfSlot(startTime);
			int endSlot = getIndexOfSlot(endTime);
			for (int i = startSlot; i < endSlot; i++) {
				emp1BusySlots.add(i);
			}
		}

		for (String[] busySlot : emp2Times) {
			String startTime = busySlot[0];
			String endTime = busySlot[1];
			int startSlot = getIndexOfSlot(startTime);
			int endSlot = getIndexOfSlot(endTime);
			for (int i = startSlot; i < endSlot; i++) {
				emp2BusySlots.add(i);
			}
		}

		// find free slots for both

		for (int i = 0; i <= 18; i++) {
			if (!emp1BusySlots.contains(i) && !emp2BusySlots.contains(i)) {
				return getSlotOfIndex(i);
			}
		}
		return getSlotOfIndex(-1);
	}

	public static int getIndexOfSlot(String slot) {
		if (slot.equals("9:00")) {
			return 0;
		} else if (slot.equals("9:30")) {
			return 1;
		}
		if (slot.equals("10:00")) {
			return 2;
		}
		if (slot.equals("10:30")) {
			return 3;
		}
		if (slot.equals("11:00")) {
			return 4;
		}
		if (slot.equals("11:30")) {
			return 5;
		}
		if (slot.equals("12:00")) {
			return 6;
		}
		if (slot.equals("12:30")) {
			return 7;
		}
		if (slot.equals("13:00")) {
			return 8;
		}
		if (slot.equals("13:30")) {
			return 9;
		}
		if (slot.equals("14:00")) {
			return 10;
		}
		if (slot.equals("14:30")) {
			return 11;
		}
		if (slot.equals("15:00")) {
			return 12;
		}
		if (slot.equals("15:30")) {
			return 13;
		}
		if (slot.equals("16:00")) {
			return 14;
		}
		if (slot.equals("16:30")) {
			return 15;
		}
		if (slot.equals("17:00")) {
			return 16;
		}
		if (slot.equals("17:30")) {
			return 17;
		}
		if (slot.equals("18:00")) {
			return 18;
		} else
			return -1;
	}

	public static String getSlotOfIndex(int index) {
		if (index == 0) {
			return "9:00";
		} else if (index == 1) {
			return "9:30";
		} else if (index == 2) {
			return "10:00";
		} else if (index == 3) {
			return "10:30";
		} else if (index == 4) {
			return "11:00";
		} else if (index == 5) {
			return "11:30";
		} else if (index == 6) {
			return "12:00";
		} else if (index == 7) {
			return "12:30";
		} else if (index == 8) {
			return "13:00";
		} else if (index == 9) {
			return "13:30";
		} else if (index == 10) {
			return "14:00";
		} else if (index == 11) {
			return "14:30";
		} else if (index == 12) {
			return "15:00";
		} else if (index == 13) {
			return "15:30";
		} else if (index == 14) {
			return "16:00";
		} else if (index == 15) {
			return "16:30";
		} else if (index == 16) {
			return "17:00";
		} else if (index == 17) {	
			return "17:30";
		} else if (index == 18) {
			return "18:00";
		} else {
			return "None";
		}

	}

}
