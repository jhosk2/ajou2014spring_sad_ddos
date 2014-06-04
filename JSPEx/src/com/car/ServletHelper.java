package com.car;

import javax.servlet.http.HttpServletRequest;


import CAR.Store;
import CAR.Table;

/**
 * You can get Table object using this class method {@link #getTableFromStore(HttpServletRequest)}. 
 */
public class ServletHelper {

	/**
	 * get table object using table id.
	 * @param request HttpServletRequest
	 * @return Table object
	 */
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
