package NiroCom;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class WeightInheritanceServlet
 */
@WebServlet("/WeightInheritanceServlet")
public class WeightInheritanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WeightInheritanceServlet() {
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


		
String button = request.getParameter("submit");
		
		
		String Ndi =  request.getParameter("Ndi");
		
		String Nidi =  request.getParameter("Nidi");
		
		
		
		if(button.equals("save")) {
		Inheritance s = new Inheritance();
		s.weights(Integer.parseInt(Ndi), Integer.parseInt(Nidi));
		NirocodeServlet cs = new NirocodeServlet();
		String code = cs.returnCode();
		
		s.setCode(code);
		String tb =	s.getTable();
		request.setAttribute("tb", tb);
		request.getRequestDispatcher("inheritanceTable.jsp").forward(request, response);
		}
		
		doGet(request, response);
	}
		

}
