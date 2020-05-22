package AllCom;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AllcodeServlet
 */
@WebServlet("/AllcodeServlet")
public class AllcodeServlet extends HttpServlet {
	static String code;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllcodeServlet() {
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

		code =request.getParameter("code");
		
		String button = request.getParameter("button");
		if(button.equals("All Factor")) {
			
			
			
			request.getRequestDispatcher("AllFactors.jsp").forward(request, response);
		}
		
		
		
		doGet(request, response);
	}
	public String returnCode() {
		//System.out.println(code);
		return code;
	}
}
