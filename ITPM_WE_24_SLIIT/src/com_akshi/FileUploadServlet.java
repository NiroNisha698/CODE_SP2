package com_akshi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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


/**
 * Servlet implementation class FileUploadServlet
 */
@WebServlet("/FileUploadServlet")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static ArrayList<String> filePaths = new ArrayList<String>();
	static ArrayList<String> fileNameArray = new ArrayList<String>();
	static String derectory = "uploadFile\\"; 
	File DestinatioDerc  = new File("uploadFile");
   
    public FileUploadServlet() {
        super(); // TODO Auto-generated constructor stub
        
    }
    public void createDerectory() {
    	if (!DestinatioDerc.exists()) {
            if (DestinatioDerc.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		createDerectory();
		try {
			ServletFileUpload sf  = new ServletFileUpload(new DiskFileItemFactory());
			List <FileItem> files = sf.parseRequest(request);
			for(FileItem file : files) {

				if(file.getName().endsWith(".zip")) {
					
					System.out.println("this is a zip file");
					String path = (derectory + file.getName());
					String destDir = derectory + file.getName();					
					file.write(new File(derectory + file.getName()));
					
					unzip(path, destDir);	      	      
					}
					else {
						System.out.println("this is a normal file");
						if(!filePaths.contains((derectory + file.getName()))) {
							
							filePaths.add(derectory + file.getName());
						}
						if(!fileNameArray.contains(file.getName())) {
							
							fileNameArray.add(file.getName());
						}
						file.write(new File(derectory + file.getName()));
					}
			}
				
			
			}catch(Exception e) {
				System.out.println(e);
			}
	
		
		
		for(int i = 0 ; i < filePaths.size(); i++) {
			
		}

		request.getRequestDispatcher("ViewUpload.jsp").forward(request, response);
		doGet(request, response);
	}
	
	 private static void unzip(String zipFilePath, String destDir) {
		 	
		 			 	
		 	String newDestDir = destDir.replace(".zip", "");
	        File dir = new File(newDestDir);
	        // create output directory if it doesn't exist
	        if(!dir.exists()) {
	        	dir.mkdirs();
	        }
	        
	       
	        FileInputStream fis;
	        //buffer for read and write data to file
	        byte[] buffer = new byte[1024];
	        try {
	            fis = new FileInputStream(zipFilePath);
	            ZipInputStream zis = new ZipInputStream(fis);
	            ZipEntry ze = zis.getNextEntry();
	            while(ze != null){
	            	
	            	String fileName = ze.getName();
	            	                
	                if(!fileNameArray.contains(fileName)) {
	                fileNameArray.add(fileName);
	                }
	              
	                File newFile = new File(newDestDir +File.separator +ze.getName());

	                if(!filePaths.contains(newFile.getAbsolutePath())) {
	                filePaths.add(newFile.getAbsolutePath());
	                }
	                //create directories for sub directories in zip
	                new File(newFile.getParent()).mkdirs();

	                FileOutputStream fos = new FileOutputStream(newFile);
                	int len;
                	while ((len = zis.read(buffer)) > 0) {
                		
                		fos.write(buffer, 0, len);
                		
                	}
                	fos.close();

	                //close this ZipEntry
	                zis.closeEntry();
	                ze = zis.getNextEntry();
	            
	            }  
	            //close last ZipEntry
	            zis.closeEntry();
	            zis.close();
	            fis.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        checkFolder();
	        
	 }
	 public String returnCode(String path) {
		 File file = new File(path);
		 String testCode = "";
			if(file.exists()) {
				try {
					FileReader fr = new FileReader(file);
					
					try {
						BufferedReader br = new BufferedReader(fr);
						String line;
						
						while((line = br.readLine()) != null) {
							testCode = testCode + line + "\n"; 						
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return testCode;
		}
	public ArrayList<String> FilePAth(){
		return filePaths;
	}
	public ArrayList<String> FileName(){
		
		return fileNameArray;
	}
	
	public static void checkFolder() {
		for(int i = 0; i < filePaths.size(); i++) {
			if(!filePaths.get(i).contains(".")) {
				
				Path path = Paths.get(derectory);
				try {
					Stream<Path> subPath = Files.walk(path);
					//subPath.forEach(System.out::println);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	 
}
	