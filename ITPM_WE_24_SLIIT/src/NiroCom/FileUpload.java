package NiroCom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class FileUpload {

	
	
	
	
	Inheritance_FileUploadServlet fus = new Inheritance_FileUploadServlet();
	ArrayList<String> filePaths = fus.FilePAth();
	ArrayList<String> fileName = fus.FileName();
	ArrayList<String> myfilePaths = new ArrayList<String>();
	ArrayList<String> myfileName = new ArrayList<String>();
	
	
	
	public String getFileList() {
		changeArray();
		String output = "";
		//output = "<form action= 'FileUploadServlet'>";
		output = "<table class = 'table' border=\"1\">"
				+ "<tr><th bgcolor= '#839192'>Select a File</th></tr>";
		for(int i =0; i < myfileName.size(); i++) {
			String name = myfileName.get(i).replace(" ", "");
			int j = i +1;
		output += "<tr><td> <input class= 'btn btn-link' type = 'submit' name = 'button' value = " +j +"."+name +  "></td> </tr>";
		
		}
		
		output += "</table>"; 
	
		return output;
	}
	public String getCode(String btn) {
		changeArray();
		String testCode = "";
		String button = btn;
		//System.out.println(button);
		String checkBtn[] = button.split("\\.");
		
		for(int i = 0 ; i < myfilePaths.size(); i++) {
			//System.out.println(myfilePaths.get(i));
			if(Integer.parseInt(checkBtn[0]) == i + 1) {					
			File file = new File(myfilePaths.get(i));
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
	
		}
	
		}
		//System.out.println(testCode);
		return testCode;
	}
	
	public void changeArray() {
		for(int i =0; i < filePaths.size(); i++) {
			if(filePaths.get(i).endsWith(".java")||filePaths.get(i).endsWith(".txt")) {
				myfilePaths.add(filePaths.get(i));
				//System.out.println(myfilePaths.get(i));
				//System.out.println(fileName.get(i));
			}
		}
		for(int i =0; i < fileName.size(); i++) {
			if(fileName.get(i).endsWith(".java")||fileName.get(i).endsWith(".txt")) {
				myfileName.add(fileName.get(i));
			}
		}
	}
	
	
	
	
	
}
