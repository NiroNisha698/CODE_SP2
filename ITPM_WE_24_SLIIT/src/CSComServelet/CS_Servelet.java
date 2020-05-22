package CSComServelet;

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

import CSCom.java.CS;

/**
 * Servlet implementation class CS_Servelet
 */
@WebServlet("/CS_Servelet")
public class CS_Servelet extends HttpServlet {
	static String code;
	private static final long serialVersionUID = 1L;
  

	 /**
     * @see HttpServlet#HttpServlet()
     */
public CS_Servelet(){
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
	 code =  request.getParameter("code");
	
	//System.out.println(code);

	String button = request.getParameter("button");
	//.out.println(code);

	if(button.equals("Control Structure")) {
		
		CS controllStructure = new CS();
		controllStructure.setCode(code);
		
		String tb = controllStructure.getTable();
		
		request.setAttribute("tb", tb);
		
		request.getRequestDispatcher("Main.jsp").forward(request, response);
		
	}
	}
	
public String returnCode() {
	//System.out.println(code);
	return code;
}
	
}
