package NiroCom;

public class Inheritance {
	
	
	int Ndi;
	
	int Nidi;
	
	
	
	//indirect inheritance
	  	int inheritNon = 0;
	    int inheritOne = 1;
	    int inheritTwo = 2;
	    int inheritThree = 3;
	    int inheritMore = 4;
	
	
	
	String keywrd[] = { "public","private","void",  "printf", "println", "cout", "cin", "if", "for",
			"while", "do", "switch", "case", "extends" };
	

	
	String indirectKeyWrd[] = {"\\w*\\sextends\\s\\w*"};
	
	private String code;
	public void setCode(String code) {
		this.code = code;
		System.out.println(code);
	}

	public String getCode() {
		return code;
	}

	public String[] displayCode() {
		String[] lines = getCode().split("\\r?\\n");
		for (String line : lines) {
			String tLine = line.trim();

		}
		return lines;
	}

	public void weights(int Ndi, int Nidi) {
		// TODO Auto-generated method stub
		this.Ndi = Ndi;
		
		this.Nidi = Nidi;
	
		
	}

	
	public int[] getKeyWrds() {
		//String newStr = statement;
		// String method = null;
		
		String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];
		int j = 0;
		score[j]=0;

		for (String line : lines) {

			if (line.contains("extends")) {
				
				String[] words = line.split(" ");

				for (String word : words) {
					for (int i = 0; i < keywrd.length; i++) {
						if (keywrd[i] .equals(word))  {
							//System.out.println(word);
							score[j] = score[j] + 1 * Ndi;
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
	

	
	
	//indirect inheritance
	public int[] getIndirectInheritance() {
		String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];
		int j = 0;
	score[j]=0;
		
		for (String line : lines) {
		if(line.contains("extends")) {
			
			
			String[] words = line.split(" ");

			for (String word : words) {
				for (int i = 0; i < indirectKeyWrd.length; i++) {
					if (indirectKeyWrd[i] .equals(word))  {
						//System.out.println(word);
						score[j] = score[j] + 1 * Nidi;
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
		

	
	
	
	
	
	
	
	
//Final Table
	
	
	
	
	public String getTable() {
		String test="";
		
		String[] lines = displayCode();
		int[] keywrd = getKeyWrds();
		
		
		int[] Nnv = getIndirectInheritance();
		
		int totalNdi =0;
		int totalNidi =0;
		int totalInheritance=0;
		int ti=0;
		int ci=0;
		int totalCi=0;
		
		String output = "";

		output = "<table border=\"1\" style=\" font-family: century gothic; background-color: #3BB9FF\" cellpadding=\"10px\" cellspacing=\"0px\" align=\"center\" border=\"3\">" + "<tr><th> Code Lines </th>" + "<th >No.of Direct Inheritance</th>" +"<th>No.of Indirect Iheritance</th>"+ "<th>Total Inheritance</th>" + "<th>Ci</th></tr>";
		int i = 0;
		int j = lines.length;
		int blank = 0;
		while (j > 0) {
			
			totalNdi = totalNdi + keywrd[i];
			totalNidi= totalNidi + Nnv[i];
			
			ti = keywrd[i] + Nnv[i];
			ci= ti;
			
			totalInheritance= totalInheritance +ti;
			totalCi = totalCi + ci;
			
			/* if total inheritance (Ti) value is less than to three, then Ci= Ti, However , if the Ti value is greater than three , 
			* Then Ci=4 !!!!!
			*/
			
            if (ti > 3) {
            	ci= 4;
            	totalCi=4;
            }
			
			
			output += "<tr><td>" + lines[i] + "</td>";
			
			output += "<td >" + keywrd[i] + "</td>";
			output += "<td>" + Nnv[i] + "</td>";
		
			output += "<td>" + ti+ "</td>";
			
			output += "<td>" + ci+ "</td> </tr>";
			i++;
			j--;
		}
		
		output += "<tr><th bgcolor= '#FDEDEC '>" +"TOTAL"+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +totalNdi+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +totalNidi+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +totalInheritance+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +totalCi+"</th></tr>";
		
		output += "</table>";

		return output;

	}

	

	//Graph
	public int[] getChart() {
		int[] tot = new int[4];
		String[] lines = displayCode();
		int[] keywrd = getKeyWrds();
		int[] Nnv = getIndirectInheritance();
		
		int totalNdi =0;
		int totalNidi =0;
		int totalInheritance=0;
		int ti=0;
		int ci=0;
		int totalCi=0;
		
		
		
		int i = 0;
		int j = lines.length;
		
		while (j > 0) {
			totalNdi = totalNdi + keywrd[i];
			totalNidi= totalNidi + Nnv[i];
			
			ti = keywrd[i] + Nnv[i];
			ci= ti;
			
			totalInheritance= totalInheritance +ti;
			totalCi = totalCi + ci;
			
			/* if total inheritance (Ti) value is less than to three, then Ci= Ti, However , if the Ti value is greater than three , 
			* Then Ci=4 !!!!!
			*/
			
            if (ti > 3) {
            	ci= 4;
            	totalCi=4;
            }
			
			
			i++;
			j--;
			
		}
		tot[0] = totalNdi;
		tot[1] = totalNidi;
		tot[2] = totalInheritance;
		tot[3] = totalCi;
		
		
		return tot;
	}
	
	
	
	//all factor table get ci method
	public int[] getciValue() {
		String[] lines = displayCode();
		int[] Ci = new int [lines.length];	
		int[] keywrd = getKeyWrds();
		int[] Nnv = getIndirectInheritance();
		
		int i = 0;
		int j = lines.length;
		
		while(j > 0) {
			Ci[i] = keywrd[i] + Nnv[i];
			
			i++;
			j--;
		}
		
		
		return Ci;
	}
	
	
	
}
