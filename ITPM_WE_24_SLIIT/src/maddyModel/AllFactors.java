package maddyModel;

public class AllFactors {
	CodeServlet cs = new CodeServlet();
	private String code = cs.returnCode();
	int[] ccpValue ;
	
	public void getCCPValue() {
		Coupling c = new Coupling();
		c.setCode(code);
		ccpValue = c.getccpValue();
//		for(int i = 0; i < c.getccpValue().length; i++) {
//			
//			System.out.println(c.getccpValue()[i]);
//		}
//		System.out.println(ccpValue.length);
	}
	
	
	public String gettable() {
		getCCPValue();
		String output = "";
		String test = "";
		String[] lines = code.split("\\r?\\n");
		
		output = "<table class= 'table table-hover' border='1'>"
				+ "<tr><th bgcolor= '#839192 '>Code Lines</th><th bgcolor= '#839192' >Cs</th><th bgcolor= '#839192'  >Cv</th><th bgcolor= '#839192' >Cm</th>"
				+"<th bgcolor= '#839192 '>Ci</th>><th bgcolor= '#839192 '>Ccp</th> <th bgcolor= '#839192 '>Ccs</th> <th bgcolor= '#839192 '>TCPS</th></tr>";
		int i = 0;
		int j = lines.length;
		while(j > 0) {
			
			
			output += "<tr><td>" + lines[i] + "</td>";
			output += "<td>" + test + "</td>";
			output += "<td>" + test + "</td>";
			output += "<td>" + test + "</td>";
			output += "<td>" + test + "</td>";
			output += "<td>" + ccpValue[i] + "</td>";
			output += "<td>" + test + "</td>";
			output += "<td>" + test + "</td></tr>";
			i++;
			j--;
		}
		output += "</table>"; 
		return output;
	}
}
