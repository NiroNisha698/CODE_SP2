package com_akshi;

public class method {


	int WmrtP;
	int WmrtC;
	int WmrtV;
	int Wpdtp;
	int Wcdtp;
	
	
	String code;
	String keywrd[] = { "int" , "byte" , "short" , "long" , "float"  };
	public void setCode(String code) {
		this.code = code;
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

	public void weights(int WmrtP, int WmrtC, int WmrtV, int Wpdtp, int Wcdtp) {
		// TODO Auto-generated method stub
		this.WmrtP = WmrtP;
		this.WmrtC = WmrtC;
		this.WmrtV = WmrtV;
		this.Wpdtp = Wpdtp;
		this.Wcdtp = Wcdtp;
			
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
	
	
	public String primitive(String statement) {
		String newStr = statement;
		String type = null;
		String[] words = newStr.split(" ");
		
		if(statement.contains("int") ||statement.contains("char") || statement.contains("String") || statement.contains("boolean")) 
		{
			for(String word :words) {
				if(word.contains("("))
				{
					type = word.substring(0, word.indexOf("(") +1);
					break;
				}
			}
			
		}
		return type;
	}
	
	public int[] ismethod(){
		String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];
		int s =0;
		for(String line : lines) {
			String tline = line.trim();
			if(getMethod(tline) != null){
				score[s] = 1;
				s++;
			}
			else
			{
				score[s] = 0;
				s++;
			}
			
		
		}
		return score;
		
		
	}
	public int[] isPrimitive(){
		String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];
		int s =0;
		for(String line : lines) {
			String tline = line.trim();
			if(primitive(tline) != null){
				score[s] = 1;
				s++;
			}
			else
			{
				score[s] = 0;
				s++;
			}
			
		
		}
		return score;
		
		
	}
	
	public int[] getKeyWrds() {
		//String newStr = statement;
		// String method = null;
		
		String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];
		int j = 0;
		score[j]=0;

		for (String line : lines) {

			if (line.contains("int") 
					|| line.contains("byte") 
					||line.contains("short")
					|| line.contains("long")
					|| line.contains("float")) {
				
				String[] words = line.split(" ");

				for (String word : words) {
					for (int i = 0; i < keywrd.length; i++) {
						if (keywrd[i] .equals(word))  {
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
		int[] Ncdtp = ismethod();
		int[] Wmrt = getKeyWrds();
		int[] Npdtp = isPrimitive();
		//int[] primit = isPrimitive();
		String output = "";
		
		output =  "<table border=\"1\">"
				+ "<tr><th> Code Lines </th>"
				+"<th>Wmrt</th>"
				+ "<th>Npdtp</th>"
				+"<th>Ncdtp</th>"
				+"<th>Cm</th></tr>";
		int i = 0;
		int j = lines.length;
		int blank = 0;
		while(j >0) {
			output += "<tr><td>" +lines[i]+"</td>";
			output +="<td>" +Wmrt[i]+ "</td>"; 
			output +="<td>" +blank+ "</td>"; 
			output += "<td>"+Ncdtp[i]+"</td>";
			output += "<td>" + (+ (2*Ncdtp[i]) )+ "</td></tr>";
	
			i++;
			j--;
		}
		output +="</table>";
		
		return output;
		
	}
	public int[] getMethodValue() {
		// TODO Auto-generated method stub
		String[] lines = displayCode();
		int[] method = new int [lines.length];	
		int[] Ncdtp = ismethod();
		int[] Wmrt = getKeyWrds();
		int[] Npdtp = isPrimitive();
		
		
		int i = 0;
		int j = lines.length;
		
		while(j > 0) {
			method[i] = Wmrt[i]+ 1*Npdtp[i] + 2*Ncdtp[i] ;
			
			i++;
			j--;
		}
		
		
		return method;
	}
}
