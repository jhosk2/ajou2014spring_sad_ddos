package com.jspex;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import CAR.Store;
import CAR.Table;

public class ServletHelper {

	public static Table getTableFromStore( HttpServletRequest request )
	{
		int tid = 0;
		
		try
		{
			tid = Integer.parseInt(request.getParameter("tid"));
		}
		catch( NumberFormatException e )
		{
			return null;
		}
		
		return Store.getinstance().getTable(tid);
	}
}
