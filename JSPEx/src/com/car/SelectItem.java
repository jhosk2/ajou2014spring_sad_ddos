package com.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CAR.Table;

/**
 * Servlet implementation class SelectItem
 */
@WebServlet("/SelectItem")
public class SelectItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Table t = ServletHelper.getTableFromStore(request);
		
		if ( t == null )
		{
			return;
		}
		
		int itemId;
		int quantity;
		
		try{
			 itemId = Integer.parseInt(request.getParameter("iid"));
			 quantity = Integer.parseInt(request.getParameter("quantity"));
		}
		catch( NumberFormatException e )
		{
			PrintWriter pw = response.getWriter();
			pw.write("fail");
			return;
		}
		
		t.selectItem(itemId, quantity);
		
		PrintWriter pw = response.getWriter();
		pw.write("ok");
		pw.flush();
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
