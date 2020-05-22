package com_akshi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com_akshi.codeServlet;
import com_akshi.variable;

/**
 * Servlet implementation class WeightVariable
 */
@WebServlet("/WeightVariable")
public class WeightVariable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WeightVariable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        String button = request.getParameter("submit");
		
		
		String WvsG =  request.getParameter("WvsG");
		String WvsL =  request.getParameter("WvsL");
		String Wpdtv =  request.getParameter("Wpdtv");
		String Wcdtv =  request.getParameter("Wcdtv");
	
		
		
		if(button.equals("save")) {
		variable v = new variable();
		v.weights(Integer.parseInt(WvsG), Integer.parseInt(WvsL), Integer.parseInt(Wpdtv), Integer.parseInt(Wcdtv));
		codeServlet cs = new codeServlet();
		String code = cs.returnCode();
		
		v.setCode(code);
		String tb =	v.getTable();
		request.setAttribute("tb", tb);
		request.getRequestDispatcher("variable.jsp").forward(request, response);
		}
		doGet(request, response);
	}

}
