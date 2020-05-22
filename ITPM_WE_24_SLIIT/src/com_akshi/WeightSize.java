package com_akshi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com_akshi.Size;
import com_akshi.codeServlet;

/**
 * Servlet implementation class WeightSize
 */
@WebServlet("/WeightSize")
public class WeightSize extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WeightSize() {
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
		doGet(request, response);
		  String button = request.getParameter("submit");
			
			
			String Wkw =  request.getParameter("Wkw");
			String Wid =  request.getParameter("Wid");
			String Wop =  request.getParameter("Wop");
			String Wnv =  request.getParameter("Wnv");
			String Wsl =  request.getParameter("Wsl");
			
			
			if(button.equals("save")) {
			Size s = new Size();
			s.weights(Integer.parseInt(Wkw), Integer.parseInt(Wid), Integer.parseInt(Wop), Integer.parseInt(Wnv), Integer.parseInt(Wsl));
			codeServlet cs = new codeServlet();
			String code = cs.returnCode();
			
			s.setCode(code);
			String tb =	s.getTable();
			request.setAttribute("tb", tb);
			request.getRequestDispatcher("size.jsp").forward(request, response);
			}
			
			doGet(request, response);
		}


}
