package maddyModel;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



@WebServlet("/CodeServlet")
public class CodeServlet extends HttpServlet {
	static String code;
	private static final long serialVersionUID = 1L;
       
	
	   
	  
	   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CodeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		try {
//			ServletFileUpload sf  = new ServletFileUpload(new DiskFileItemFactory());
//			List <FileItem> files = sf.parseRequest(request);
//			for(FileItem file : files) {
//				
//				System.out.println(file.getName());
//			}
//			}catch(Exception e) {
//				System.out.println(e);
//			}
		
//		String code =  request.getParameter("code");
//		String button = request.getParameter("button");
//		
//		if(button.equals("Size")) {
//			
//			
//			SizeVariable sizeVariable = new SizeVariable();
//			
//			
//			
//			request.getRequestDispatcher("size.jsp").forward(request, response);
//		}
//		if(button.equals("Method")) {
//			
//			SizeVariable sizeVariable = new SizeVariable();
//			
//			
//			
//			request.getRequestDispatcher("size_variable_method.jsp").forward(request, response);
//		}
//		if(button.equals("Variable")) {
//	
//			SizeVariable sizeVariable = new SizeVariable();
//	
//	
//	
//			request.getRequestDispatcher("variable.jsp").forward(request, response);
//		}
//		
//		if(button.equals("Inheritance")) {
//			
//			Inheritance inheritance = new Inheritance();
//			
//			
//			
//			request.getRequestDispatcher("inheritance.jsp").forward(request, response);
//		}
//		if(button.equals("ControlStructure")) {
//			
//			ControllStructure controllStructure = new ControllStructure();
//			
//			
//			
//			request.getRequestDispatcher("controll_structures.jsp").forward(request, response);
//		}
//		if(button.equals("Coupling")) {
//			
//			Coupling couling = new Coupling();
//			couling.setCode(code);
//		String tb =	couling.getTable();
////			String[] codeLines = couling.displayCode();
////			int[] score = couling.isRecursive(code);
////			request.setAttribute("codelines", codeLines);
////			request.setAttribute("score", score);
//		request.setAttribute("tb", tb);
//			
//			request.getRequestDispatcher("coupling.jsp").forward(request, response);
//		}
//		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 code =  request.getParameter("code");
		
		//System.out.println(code);
	
		String button = request.getParameter("button");
		//.out.println(code);
		/*
		if(button.equals("Size")) {
			

//			Size size = new Size();
//			size.setCode(code);
//			String tb = size.getTable();
//
//			
//			SizeVariable sizeVariable = new SizeVariable();
//			
//			
//
//			
//			request.setAttribute("size", tb);
			request.getRequestDispatcher("WeightSize.jsp").forward(request, response);
		}
		if(button.equals("Method")) {
			
//			SizeVariable sizeVariable = new SizeVariable();
//			sizeVariable.setCode(code);
//			String tb =	sizeVariable.getTable();
//
//			request.setAttribute("method", tb);
			request.getRequestDispatcher("WeightMethod.jsp").forward(request, response);
			}
			
		if(button.equals("Variable")) {
	
//			variable Variable = new variable();
//			Variable.setCode(code);
//			String tb = Variable.getTable();
//			
//			request.setAttribute("variable", tb);
			request.getRequestDispatcher("WeightVariable.jsp").forward(request, response);
		}
		
	if(button.equals("Inheritance")) {
			
			Inheritance inheritance = new Inheritance();
			inheritance.setCode(code);
			List<InheritanceModel> inheritanceList = inheritance.getComplexity();
			request.setAttribute("inheritanceList", inheritanceList);
			request.getRequestDispatcher("inheritance.jsp").forward(request, response);
		}
		if(button.equals("ControlStructure")) {
			
			ControllStructure controllStructure = new ControllStructure();
			controllStructure.setCode(code);
			
			String tb = controllStructure.getTable();
			
			request.setAttribute("tb", tb);
			
			request.getRequestDispatcher("controll_structures.jsp").forward(request, response);
		}
		
		*/
		
		if(button.equals("Coupling")) {
			
//			Coupling couling = new Coupling();
//			 couling.setCode(code);
			 
		//String tb =	couling.getTable();
		//System.out.println(tb);
//			String[] codeLines = couling.displayCode();
//			int[] score = couling.isRecursive(code);
//			request.setAttribute("codelines", codeLines);
//			request.setAttribute("score", score);
		//request.setAttribute("tb", tb);
//			
			request.getRequestDispatcher("changeWeightCoup.jsp").forward(request, response);
		
		//response.getWriter().write(code);
		}
		if(button.equals("All-Factors")) {
			
			request.getRequestDispatcher("AllFactors.jsp").forward(request, response);
		}
	     
		
		doGet(request, response);
	}
	public String returnCode() {
		//System.out.println(code);
		return code;
	}
}
