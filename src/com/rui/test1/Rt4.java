package com.rui.test1;

public class Rt4 {

	public static void main(String[] args) {
		double tuikuanjine = 0.0;
//		tuikuanjine = new Double(1009)/new Double(10);
		tuikuanjine = PrecisionIsTheOnlyStandard.doubleCalculation(PrecisionIsTheOnlyStandard.doubleCalculation(new Double(1009), "/", new Double(10)), "*", 3);
		System.out.println(tuikuanjine);
	}

}
