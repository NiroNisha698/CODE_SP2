package CSCom.java;

import java.io.Console;
import java.util.ArrayList;
import java.util.Stack;

public class CS {
	
	// TODO Auto-generated method stub

			private String code ;		
		    		 
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
			
			public static boolean hasaBracket(String line,String text,int size, int gap){
		        boolean val = false;
		        if(line.length()>(line.indexOf(text)+size+gap)){
		            if(line.charAt(line.indexOf(text)+size+gap)=='('){
		                val = true;  
		            }    
		            else if(line.charAt(line.indexOf(text)+size+gap)==' '){
		                gap = gap + 1;
		                return hasaBracket(line,text, size, gap);     
		            }
		            else{
		                val = false;  
		            }
		        }
		        return val;
		    }
			
			public static boolean hasaSpace(String line,String text,int size, int gap){
		        boolean val = false;
		        if(line.length()>(line.indexOf(text)+size+gap)){
		            if(line.charAt(line.indexOf(text)+size+gap)==' '){
		                val = true;  
		            }    
		            else if(line.charAt(line.indexOf(text)+size+gap)==' '){
		                gap = gap + 1;
		                return hasaBracket(line,text, size, gap);     
		            }
		            else{
		                val = false;  
		            }
		        }
		        return val;
		    }
			
			public static boolean forDoMEthod(String line,String text,int size, int gap){
		        boolean val = true;
		        if(line.length()>(line.indexOf(text)+size+gap)){
		            if(line.charAt(line.indexOf(text)+size+gap)==' '){
		                val = true;  
		                gap = gap + 1;
		                return forDoMEthod(line,text, size, gap);     
		            }
		            else{
		                val = false;  
		            }
		        }
		        return val;
		    }
			
			public static boolean hasaColon(String line,String text,int size, int gap){
		        boolean val = false;
		        if(line.length()>(line.indexOf(text)+size+gap)){
		            if(line.charAt(line.indexOf(text)+size+gap)==':'){
		                val = true;  
		            }    
		            else if(line.charAt(line.indexOf(text)+size+gap)==' '){
		                gap = gap + 1;
		                return hasaBracket(line,text, size, gap);     
		            }
		            else{
		                val = false;  
		            }
		        }
		        return val;
		    }
			
			
			public int[] getWeight() {
				
				String[] lines = code.split("\\r?\\n");
				
				int[] weight = new int[lines.length];
				int w = 0;
				weight[w] = 0;
				
				for(String line : lines) {
					
					String tline = line;
					
					
						if(tline.contains("if") && (hasaBracket(tline,"if",2,0)) || tline.contains("else if") && (hasaBracket(tline,"else if",7,0)) || tline.contains("switch") && (hasaBracket(tline,"switch",6,0)) ) {						
							weight[w] = 2;
							w++;
							
						}
						
						else if(tline.contains("do") && (forDoMEthod(tline,"do",2,0)) || tline.contains("while") && (hasaBracket(tline,"while",5,0)) ||  tline.contains("for") && (hasaBracket(tline,"for",3,0))) {					
							weight[w] = 3;
							w++;
							
						}
						
						else if(tline.contains("case") && (hasaColon(tline,"case",4,0))) {
							weight[w] = 1;
							w++;
							
						}
						
						else {
							weight[w] = 0;
							w++;
						}
					}
					
					return weight;
					
				}



		
		public int[] countCon() {
			
			char opArray[] ={'<','>','=','!'};
			
		String[] lines = code.split("\\r?\\n");
			
			int[] score = new int[lines.length];
			int nc=0;
			int s = 0;
			score[s] = 0;
			String seq = new String (opArray);
			
			for(String line : lines) {
				
				String tline = line;
				int count = 0;
				
					if((tline.contains("if") && hasaBracket(tline,"if",2,0)) || (tline.contains("else if") && hasaBracket(tline,"else if",7,0))||
							(tline.contains("while") && hasaBracket(tline,"while",5,0)) || (tline.contains("for") && hasaBracket(tline,"for",3,0)) || (tline.contains("switch") && hasaBracket(tline,"switch",4,0)) || 
							(tline.contains("case ") && hasaColon(tline,"case",4,0))){

								
						 
					       for(int y = 0;y<tline.length()-1;y++){
					           
					           if(tline.charAt(y)=='&'){
					               count++;
					               if(tline.charAt(y+1)=='&')
					                   count--;
					           }
					       }
					       for(int z = 0;z<tline.length()-1;z++){
					           
					           if(tline.charAt(z)=='|'){
					               count++;
					               if(tline.charAt(z+1)=='|')
					                   count--;
					           }
					           				          
					       }
					       
					        nc = count+1;
					        
					        score[s] = nc;
					        s++;
					       
					       
							
		}
					else {
						 score[s] = 0;
					        s++;
					}
					
					
			}
			
			
			return score;
			
	}
		


		 
	public int getCcspps() {
		int ccpps = 0;
		int ccs = ccpps;
		
		
		return ccpps;
	}
			 
			
		   public String getTable() {
			   
			   String[] lines = displayCode();
//				
				int[] weight = getWeight();
				int[] count = countCon();
//				int w = 0;
//				weight[w] = 0;
//				
			  
			   
			  
//				 int[] recursiveScores = checkRecursive(code);
				// int[] weight = getWeight();
//				 int[] count = new int[]{4,1,1,1,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0};
//				 int[] ccs = new int[]{8,10,12,13,0,0,13,0,0,13,0,0,13,0,0,0,0,12,0,0,0,0};
//				 int[] ccspps = new int[]{0,8,10,12,0,0,12,0,0,12,0,0,12,0,0,0,0,10,0,0,0,0};
				 
				 
				 
				 
				String output = "";
				output = "<table border=\"1\">"
						+ "<tr><th>Code Lines</th><th>Wtcs</th><th>NC</th><th>Ccspps</th><th>Ccs</th>";
						
				int i = 0;
				int j = lines.length;
				while(j > 0) {
					
					output += "<tr><td>" + lines[i] + "</td>";
					output += "<td>" + weight[i] + "</td>";
					output += "<td>" + count[i] + "</td></tr>";
//					output += "<td>" +ccspps[i]+ "</td>";
//					output += "<td>" + ccs[i]+ "</td></tr>";
					
					
				i++;
				j--;
			}
//				
				output += "</table>"; 
				
				return output;
				
				
			}
		   
		  

	

}
