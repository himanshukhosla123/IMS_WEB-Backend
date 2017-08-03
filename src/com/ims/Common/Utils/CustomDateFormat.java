package com.ims.Common.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class CustomDateFormat {
	private static SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");

	public static String getString(Date date) {
		return df.format(date);
	}
	public static Date getDate(String date) throws ParseException {
		return  (Date) df.parse(date);
	}
}