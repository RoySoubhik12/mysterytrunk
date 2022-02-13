package com.mystrytrunk.mystrytrunkapi.utilities;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class utility {
	
	
	public Date getSqlDate(String date) {
		
		DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date resultDate;
		java.sql.Date sqlDate = null;
		try {
			resultDate = formatter.parse(date);
			sqlDate = new java.sql.Date(resultDate.getTime());
			
		} catch (ParseException e) {
			
			System.out.println(e.getMessage());
		}
		
		return sqlDate;
	}

}
