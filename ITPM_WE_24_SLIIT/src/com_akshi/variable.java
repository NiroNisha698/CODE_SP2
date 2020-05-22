package com_akshi;

import java.util.ArrayList;

public class variable {
	
	int WvsG;
	int WvsL;
	int Wpdtv;
	int Wcdtv;
	
	String code;
	String operator[] = { "int" , "byte" , "short" , "long" , "float"  };
	public void setCode(String code) {
		this.code = code;
		}

	public void weights(int WvsG, int WvsL, int Wpdtv, int Wcdtv) {
		// TODO Auto-generated method stub
		this.WvsG = WvsG;
		this.WvsL = WvsL;
		this.Wpdtv = Wpdtv;
		this.Wcdtv = Wcdtv;
		
	}

	public String getCode() {
		return code;
	}

	public String[] displayCode() {
		String[] lines = getCode().split("\\r?\\n");
		for(String line : lines) {
			String tLine = line.trim();
			
			
		}
		return lines;
	}

	public String getMethod(String statement) {
		String newStr = statement;
		String method = null;
		String[] words = newStr.split(" ");
		
		if(statement.contains("public") ||statement.contains("private") || statement.contains("void")) 
		{
			for(String word :words) {
				if(word.contains("("))
				{
					method = word.substring(0, word.indexOf("(") +1);
					break;
				}
			}
			
		}
		return method;
		
	}
	
	public boolean isGlobleVariable(String statment) {
		
		String myStatement = statment;
		 boolean variable = false;
		 
		 String[] lines = code.split("\\r?\\n");
		 
		 ArrayList<String> variableArray = new ArrayList<String>();
		 
		 
		 for(String line : lines) {
			 String tline = line.trim();
			 
			 if(getMethod(tline)!= null) { }
			 else if((tline.contains("private") || tline.contains("public")) && (tline.contains("int") || tline.contains("String") 
					 || tline.contains("char") || tline.contains("double") || tline.contains("Dimension")||tline.contains("double"))) {
				 	
				 if(tline.contains("=")) {
					 String[] vars = tline.split("=");
					 for(String var : vars) {
						 String[] myvar = var.split(" ");
						 variableArray.add(myvar[2]);
						 break;
					 }
				 }
				 else if(tline.contains(",")) {
					 String[] vars = tline.split(",");
					 for(String var : vars) {
						 String tvar = var.trim();
						 if(tvar.contains("private") || tvar.contains("public")) {
							 String[] myvar = tvar.split(" ");
							 variableArray.add(myvar[2]);
							 
						 }
						 else if(tline.contains(";")) {
							 String[] myvar = tvar.split(";");
							 variableArray.add(myvar[0]);
							 break;
						 }
						 else {
							 variableArray.add(tvar);
						 }
					 }

				 }
				 else {
				
					 String[] vars = tline.split(";");
					 for(String var : vars) {
						 String[] myvar = var.split(" ");
						 variableArray.add(myvar[2]);
					
						 break;
						 
					 }
				 }
			 }
		 }

		 for(int i =0 ; i < variableArray.size(); i++) {
		 if(myStatement.contains(variableArray.get(i))) {
		 
			
			 
				 variable = true;
				 continue;
				 
			 
		 }
		
		 }
		 return variable;
		 
		 
		 
	}
	
	public int[] checkGloblevariable() {
		
		
		String[] lines = code.split("\\r?\\n");
		 
		 ArrayList<String> variableArray = new ArrayList<String>();
		 
		 
		 for(String line : lines) {
			 String tline = line.trim();
			 
			 if(getMethod(tline)!= null) {
				 
			 }
			 else if((tline.contains("private") || tline.contains("public")) && (tline.contains("int") || tline.contains("String") 
					 || tline.contains("char") || tline.contains("double") || tline.contains("Dimension"))) {
				 	
				 if(tline.contains("=")) {
					 String[] vars = tline.split("=");
					 for(String var : vars) {
						 String[] myvar = var.split(" ");
						 variableArray.add(myvar[2]);
						 break;
					 }
				 }
				 else if(tline.contains(",")) {
					 String[] vars = tline.split(",");
					 for(String var : vars) {
						 String tvar = var.trim();
						 if(tvar.contains("private") || tvar.contains("public")) {
							 String[] myvar = tvar.split(" ");
							 variableArray.add(myvar[2]);
							 
						 }
						 else if(tline.contains(";")) {
							 String[] myvar = tvar.split(";");
							 variableArray.add(myvar[0]);
							 break;
						 }
						 else {
							 variableArray.add(tvar);
						 }
					 }
					
				 }
				 else {
					
					 String[] vars = tline.split(";");
					 for(String var : vars) {
						 String[] myvar = var.split(" ");
						 variableArray.add(myvar[2]);
						;
						 break;
						 
					 }
				 }
			 }
		 }

		int[] score = new int[lines.length];
		int s = 0;
		score[s] = 0;
		
		for(String line : lines) {
			String tline = line.trim();
			
			if(isGlobleVariable(tline)) {
				if(tline.contains("public") || tline.contains("private")) {
					score[s] = 2;
					s++;
				}
				else {
					score[s] = 0;
					s++;
				}
				
			
			}
			else if(checkLocalVariable(line)) {
				if(tline.contains("class")) {
					
				}
				else {
				score[s] = 1;
				s++;
				}
			}
			else {
				score[s] = 0;
				s++;
			}
		}
		return score;
		
		
	}
	
	public boolean checkLocalVariable(String statement) {
		String myStatement = statement;
		boolean variable = false;
		String[] lines = code.split("\\r?\\n");
		ArrayList<String> localVariable = new ArrayList<>();
		
		for(String line : lines) {
			String tline = line.trim();
			if(getMethod(tline) != null) {
				
			}
			if(isGlobleVariable(tline)) {
				
			}
			else if(line.contains("int") || line.contains("char") || line.contains("String") || line.contains("Dimension")|| line.contains("double")) {
				if(line.contains(";")) {
					if(tline.contains("=")) {
						 String[] vars = tline.split("=");
						 for(String var : vars) {
							 String[] myvar = var.split(" ");
							 localVariable.add(myvar[1]);
							 break;
						 }
					 }
					 else if(tline.contains(",")) {
						 String[] vars = tline.split(",");
						 for(String var : vars) {
							 String tvar = var.trim();
							 if(tvar.contains("private") || tvar.contains("public")) {
								 String[] myvar = tvar.split(" ");
								 localVariable.add(myvar[2]);
								 
							 }
							 else if(tline.contains(";")) {
								 String[] myvar = tvar.split(";");
								 localVariable.add(myvar[0]);
								 break;
							 }
							 else {
								 localVariable.add(tvar);
							 }
						 }
						
					 }
				
							
							 
						 }
					 
					 else {
						
						 
					 }
				 }
			 
		}
					 			 

			//localVariable.add("sds");		
			
			
//		for(int i = 0; i <localVariable.size(); i++) {
//			System.out.println(localVariable.get(i));
//		}
		
		//System.out.println(">>>>>>>>>>>>>>>>>>>");
		 for(int i =0 ; i < localVariable.size(); i++) {
			 if(myStatement.contains(localVariable.get(i))) {
			 
				
				 
					 variable = true;
					 continue;
					 
				 
			 }
			
			 }
		 return variable;
	}
	
	
	public String getPrimirive(String statement) {
		String newStr = statement;
		String method = null;
		String[] words = newStr.split(" ");
		
		if(statement.contains("public") ||statement.contains("private") || statement.contains("void")) 
		{
			for(String word :words) {
				if(word.contains("("))
				{
					method = word.substring(0, word.indexOf("(") +1);
					break;
				}
			}
			
		}
		return method;
		
	}
	
	//get operators
		public int[] getoperators() {
			//String newStr = statement;
			// String method = null;
			
			String[] lines = code.split("\\r?\\n");
			int[] score = new int[lines.length];
			int j = 0;
			score[j]=0;

			for (String line : lines) {

				if (line.contains("=") 
						|| line.contains("int") 
						||line.contains("byte")
						|| line.contains("short")
						|| line.contains("long") 
						|| line.contains("float")) {
					
					String[] words = line.split(" ");

					for (String word : words) {
						for (int i = 0; i < operator.length; i++) {
							if (operator[i] .equals(word))  {
								//System.out.println(word);
								score[j] = score[j] + 1;
								break;
							} 

						}
					
					}
					j++;

				} else {
					score[j] = 0;
					j++;
				}
			}

			 return score;

		}
		public int[] getcomoperators() {
			//String newStr = statement;
			// String method = null;
			
			String[] lines = code.split("\\r?\\n");
			int[] score = new int[lines.length];
			int j = 0;
			score[j]=0;

			for (String line : lines) {

				if (line.contains("=") 
						|| line.contains("array") 
						||line.contains("object")
						|| line.contains("interface")
						|| line.contains("list")) {
					
					String[] words = line.split(" ");

					for (String word : words) {
						for (int i = 0; i < operator.length; i++) {
							if (operator[i] .equals(word))  {
								//System.out.println(word);
								score[j] = score[j] + 1;
								break;
							} 

						}
					
					}
					j++;

				} else {
					score[j] = 0;
					j++;
				}
			}

			 return score;

		}
	
	
	public String getTable() {
		String[] lines = displayCode();
		int[] Wvs = checkGloblevariable();
		int[] Npdtv = getoperators();
		int[] Ncdtv = getcomoperators();
		String output = "";
		
		output =  "<table border=\"1\">"
				+ "<tr><th> Code Lines </th>"
				+"<th>Wvs</th>"
				+ "<th>Npdtv</th>"
				+"<th>Ncdtv</th>"
				+"<th>Cv</th></tr>";
		int i = 0;
		int j = lines.length;
		int blank = 0;
		while(j >0) {
			output += "<tr><td>" +lines[i]+"</td>";
			output += "<td>" +Wvs[i]+"</td>";
			output += "<td>" +Npdtv[i]+"</td>";
			output += "<td>" +Ncdtv[i]+"</td>";
			output += "<td>" +(Wvs[i]*(1*Npdtv[i] + 0*Ncdtv[i]))+"</td></tr>";
			i++;
			j--;
		}
		output +="</table>";
		
		return output;
		
	}
}
