package com.ims.Common.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateFormat {
	private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static String getFormatedDate(Date date) {
		return df.format(date);
	}
	public static Date getDate(String date) throws ParseException {
		return  df.parse(date);
	}
}