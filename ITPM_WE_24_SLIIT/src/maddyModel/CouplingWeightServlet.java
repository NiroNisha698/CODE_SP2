package maddyModel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CouplingWeightServlet")
public class CouplingWeightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CouplingWeightServlet() {
        super();
       
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.getRequestDispatcher("coupling.jsp").forward(request, response);
		
//		String button = request.getParameter("submit");
//		
//		
//		String wNr =  request.getParameter("wNr");
//		String wNmcms =  request.getParameter("wNmcms");
//		String wNmcmd =  request.getParameter("wNmcmd");
//		String wNmcrms =  request.getParameter("wNmcrms");
//		String wNmcrmd =  request.getParameter("wNmcrmd");
//		String wNrmcrms =  request.getParameter("wNrmcrms");
//		String wNrmcrmd =  request.getParameter("wNrmcrmd");		
//		String wNrmcms =  request.getParameter("wNrmcms");
//		String wNrmcmd =  request.getParameter("wNrmcmd");
//		String wNmrgvs =  request.getParameter("wNmrgvs");
//		String wNmrgvd =  request.getParameter("wNmrgvd");
//		String wNrmrgvs =  request.getParameter("wNrmrgvs");
//		String wNrmrgvd =  request.getParameter("wNrmrgvd");
//		
//		if(button.equals("save")) {
//		WeightsCoupling wc = new WeightsCoupling();
//		wc.setwNr(Integer.parseInt(wNr));
//		wc.setwNmcms(Integer.parseInt(wNmcms));
//		wc.setwNmcmd(Integer.parseInt(wNmcmd));
//		wc.setwNmcrms(Integer.parseInt(wNmcrms));
//		wc.setwNmcrmd(Integer.parseInt(wNmcrmd));
//		wc.setwNrmcrms(Integer.parseInt(wNrmcrms));
//		wc.setwNrmcrmd(Integer.parseInt(wNrmcrmd));
//		wc.setwNrmcms(Integer.parseInt(wNrmcms));
//		wc.setwNrmcmd(Integer.parseInt(wNrmcmd));
//		wc.setwNmrgvs(Integer.parseInt(wNmrgvs));
//		wc.setwNmrgvd(Integer.parseInt(wNmrgvd));
//		wc.setwNrmrgvs(Integer.parseInt(wNrmrgvs));
//		wc.setwNrmrgvd(Integer.parseInt(wNrmrgvd));
//		
//		//System.out.println(wNr);
//		response.sendRedirect(request.getHeader("Referer"));
		//request.getRequestDispatcher("coupling.jsp").forward(request, response);
//		}

			}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String button = request.getParameter("submit");
		
		
		String wNr =  request.getParameter("wNr");
		String wNmcms =  request.getParameter("wNmcms");
		String wNmcmd =  request.getParameter("wNmcmd");
		String wNmcrms =  request.getParameter("wNmcrms");
		String wNmcrmd =  request.getParameter("wNmcrmd");
		String wNrmcrms =  request.getParameter("wNrmcrms");
		String wNrmcrmd =  request.getParameter("wNrmcrmd");		
		String wNrmcms =  request.getParameter("wNrmcms");
		String wNrmcmd =  request.getParameter("wNrmcmd");
		String wNmrgvs =  request.getParameter("wNmrgvs");
		String wNmrgvd =  request.getParameter("wNmrgvd");
		String wNrmrgvs =  request.getParameter("wNrmrgvs");
		String wNrmrgvd =  request.getParameter("wNrmrgvd");
		
		if(button.equals("save")) {
		Coupling c = new Coupling();
		c.weights(Integer.parseInt(wNr), Integer.parseInt(wNmcms), Integer.parseInt(wNmcmd), Integer.parseInt(wNmcrms), Integer.parseInt(wNmcrmd), Integer.parseInt(wNrmcrms), Integer.parseInt(wNrmcrmd), Integer.parseInt(wNrmcms), Integer.parseInt(wNrmcmd), Integer.parseInt(wNmrgvs), Integer.parseInt(wNmrgvd), Integer.parseInt(wNrmrgvs), Integer.parseInt(wNrmrgvd));
//		wc.setwNr(Integer.parseInt(wNr));
//		wc.setwNmcms(Integer.parseInt(wNmcms));
//		wc.setwNmcmd(Integer.parseInt(wNmcmd));
//		wc.setwNmcrms(Integer.parseInt(wNmcrms));
//		wc.setwNmcrmd(Integer.parseInt(wNmcrmd));
//		wc.setwNrmcrms(Integer.parseInt(wNrmcrms));
//		wc.setwNrmcrmd(Integer.parseInt(wNrmcrmd));
//		wc.setwNrmcms(Integer.parseInt(wNrmcms));
//		wc.setwNrmcmd(Integer.parseInt(wNrmcmd));
//		wc.setwNmrgvs(Integer.parseInt(wNmrgvs));
//		wc.setwNmrgvd(Integer.parseInt(wNmrgvd));
//		wc.setwNrmrgvs(Integer.parseInt(wNrmrgvs));
//		wc.setwNrmrgvd(Integer.parseInt(wNrmrgvd));
		
		//response.getWriter().write();
		//System.out.println(wNr);
		//response.sendRedirect(request.getHeader("Referer"));
		CodeServlet cs = new CodeServlet();
		String code = cs.returnCode();
		//System.out.println(code);
		//Coupling couling = new Coupling();
		c.setCode(code);
		String tb =	c.getTable();
		request.setAttribute("tb", tb);
		request.getRequestDispatcher("CouplingNew.jsp").forward(request, response);
		
		
		}
		doGet(request, response);
	}

}
