package com.rui.test1;

import java.util.Collections;
import java.util.List;

public class Rt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date1 = "2016-05-05";
		String date2 = "2016-12-15";
		List<String> dateList = DateFormatUtil.getDateList(date1,date2, 15);
		List<String> listtime = DateFormatUtil.getHourList();
		Collections.sort(listtime);
		System.out.println(listtime);
	}

}
