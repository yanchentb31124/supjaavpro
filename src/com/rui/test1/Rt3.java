package com.rui.test1;

public class Rt3 {

	public static void main(String[] args) {
		System.out.println(getResult(99999999999991.1));
	}
	
	public static String getResult(double d){
		java.text.NumberFormat nf = java.text.NumberFormat.getInstance();   
		nf.setGroupingUsed(false);
		nf.setMaximumFractionDigits(2);
//		java.text.DecimalFormat df = new java.text.DecimalFormat("#,##0.00");
//		df.format(d);
//		System.out.println(nf.format(d));
//		System.out.println("小数位数"+((""+d).length()-(""+d).indexOf(".")-1));
//		int xsws = (d+"").length()-(d+"").indexOf(".")-1;
//		String rtn = "";
//		if(xsws==1){
//			rtn = d+"0";
//		}else if(xsws==2){
//			rtn = String.valueOf(d);
//		}else{
//			rtn = String.valueOf(d).substring(0, String.valueOf(d).indexOf(".")+3);
//		}
		String rtn = "";
		int xsws = nf.format(d).length()-nf.format(d).indexOf(".")-1;
		if(xsws==1){
			rtn = nf.format(d)+"0";
		}else{
			rtn = nf.format(d);
		}
		return rtn;
	}

}
