package com.car;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CAR.Table;

/**
 * Servlet implementation class TableStatus
 */
@WebServlet("/TableStatus")
public class TableStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final int WRONG_TID = -2;
	public static final int TABLE_EMPTY = 1;
	public static final int TABLE_NOT_EMPTY = -1;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TableStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tableStatus = 0;

		// request table status

		Table table = ServletHelper.getTableFromStore(request);
		
		if(table != null) {
			
			if(table.requestTableStatus())
				tableStatus = TABLE_NOT_EMPTY;
			else
				tableStatus = TABLE_EMPTY;
			
		} else {
			tableStatus = WRONG_TID;
		}
		
		request.setAttribute("tableStatus", tableStatus);
		request.setAttribute("tid", Integer.parseInt(request.getParameter("tid")));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/TableStatus.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
