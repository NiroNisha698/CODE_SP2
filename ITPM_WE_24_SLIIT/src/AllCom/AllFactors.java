package AllCom;

import NiroCom.Inheritance;




public class AllFactors {
	AllcodeServlet cs = new AllcodeServlet();
	private String code = cs.returnCode();
	int[] ciValue ;
	
	public void getCiValue() {
		Inheritance c = new Inheritance();
		c.setCode(code);
		ciValue = c.getciValue();

	}
	
	
	public String gettable() {
		getCiValue();
		
		String output = "";
		String test = "";
		String[] lines = code.split("\\r?\\n");
		//Table
		output = "<table class= border=\"1\" style=\" font-family: century gothic; background-color: #3BB9FF\" cellpadding=\"10px\" cellspacing=\"0px\" align=\"center\" border=\"3\">"
				+ "<tr><th bgcolor= '#839192 '>Code Lines</th><th bgcolor= '#839192' >Cs</th><th bgcolor= '#839192'  >Cv</th><th bgcolor= '#839192' >Cm</th>"
				+"<th bgcolor= '#839192 '>Ci</th><th bgcolor= '#839192 '>Ccp</th> <th bgcolor= '#839192 '>Ccs</th> <th bgcolor= '#839192 '>TCPS</th></tr>";
		int i = 0;
		int j = lines.length;
		while(j > 0) {
			
			
			output += "<tr><td>" + lines[i] + "</td>";
			output += "<td>" + test + "</td>";
			output += "<td>" + test + "</td>";
			output += "<td>" + test + "</td>";
			output += "<td>" + ciValue[i] + "</td>";
			output += "<td>" + test + "</td>";
			output += "<td>" + test + "</td>";
			output += "<td>" + test + "</td></tr>";
			i++;
			j--;
		}
		
		//Total row
		output += "<tr><th bgcolor= '#FDEDEC '>" +"TOTAL COMPLEXITY"+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th></tr>";
		
	
		
		
		
		output += "</table>"; 
		return output;
	}

}