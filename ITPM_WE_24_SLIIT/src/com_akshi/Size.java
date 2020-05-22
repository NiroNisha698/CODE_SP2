package com_akshi;

import java.util.ArrayList;

import javax.sound.sampled.Line;

public class Size {

	int Wkw;
	int Wid;
	int Wop;
	int Wnv;
	int Wsl;

	String code;

	String keywrd[] = { "class", "public", "private", "void", "print", "println", "System", "out", "true", "else",
			"default", "return", "null", "break", "this","static" };

	String indentifiers[] = { "(", ";","{",")" };

	String operator[] = { "+", "-", "*", "/", "%", "++", "--", "==", "!=", ">", "<", ">=", "<=", "&&", "||", "!", "|",
			"^", "~", "<<", ">>", "<<<", ">>>", "|", "^", "~", "<<", ">>", "<<<", ">>>", ",", "->", ".", "::", "+=",
			"-=", "*=", "/=", "=", ">>>=", "|=", "&=", "%=", "<<=", ">>=", "^=" };

	String numb[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	public void setCode(String code) {
		this.code = code;
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

	public void weights(int Wkw, int Wid, int Wop, int Wnv, int Wsl) {
		// TODO Auto-generated method stub
		this.Wkw = Wkw;
		this.Wid = Wid;
		this.Wop = Wop;
		this.Wnv = Wnv;
		this.Wsl = Wsl;

	}

	public int[] getKeyWrds() {
		// String newStr = statement;
		// String method = null;

		String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];
		int j = 0;
		score[j] = 0;

		for (String line : lines) {

			if (line.contains("class") || line.contains("public") || line.contains("private") || line.contains("void")
					|| line.contains("print") || line.contains("println") || line.contains("System")
					|| line.contains("out") || line.contains("true") || line.contains("else")
					|| line.contains("default") || line.contains("return") || line.contains("null")
					|| line.contains("break") || line.contains("this")|| line.contains("static")) {

				String[] words = line.split(" ");

				for (String word : words) {
					for (int i = 0; i < keywrd.length; i++) {
						if (keywrd[i].equals(word)) {
							// System.out.println(word);
							score[j] = score[j] + 1 * Wkw;
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

	// get identifiers of code
	public int[] getIdentifiers() {

		String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];

		int j = 0;
		score[j] = 0;

		for (String line : lines) {

			if (line.contains("(") || line.contains(";") || line.contains("{") || line.contains(")")) {

				String[] words = line.split(" ");

				for (String word : words) {
					for (int i = 0; i < indentifiers.length; i++) {
						if (indentifiers[i].equals(word)) {
							System.out.println(word);
							score[j] = score[j] + 1 * Wid;
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

	public String getMethod(String statement) {
		String newStr = statement;
		String method = null;
		String[] words = newStr.split(" ");

		if (statement.contains("public") || statement.contains("private") || statement.contains("void")) {
			for (String word : words) {
				if (word.contains("(")) {
					method = word.substring(0, word.indexOf("(") + 1);
					break;
				}
			}

		}
		return method;

	}

	public int[] ismethod() {
		String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];
		int s = 0;
		for (String line : lines) {
			String tline = line.trim();
			if (getMethod(tline) != null) {
				score[s] = 1 * Wid;
				s++;
			} else {
				score[s] = 0;
				s++;
			}

		}
		return score;
	}

	// get operators
	public int[] getoperators() {
    	String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];
		int j = 0;
		score[j] = 0;

		for (String line : lines) {

			if (line.contains("=") || line.contains("+") || line.contains("-") || line.contains("/")
					|| line.contains("*") || line.contains("%") || line.contains("++") || line.contains("--")
					|| line.contains("==") || line.contains("!>") || line.contains("<") || line.contains(">")
					|| line.contains("<=") || line.contains(">=") || line.contains("&&") || line.contains("||")
					|| line.contains(",") || line.contains(".")|| line.contains("!") || line.contains("->")
					|| line.contains("::") || line.contains("|")|| line.contains("^") || line.contains("~")
					|| line.contains("<<") || line.contains(">>")|| line.contains(">>>") || line.contains("<<<")
					|| line.contains("+=") || line.contains("-=")|| line.contains("*=") || line.contains("/=")
					|| line.contains("=") || line.contains(">>>=")|| line.contains("|=") || line.contains("&=")
					|| line.contains("%=") || line.contains("<<=")|| line.contains(">>=") || line.contains("^=") ) {

				String[] words = line.split(" ");

				for (String word : words) {
					for (int i = 0; i < operator.length; i++) {
						if (operator[i].equals(word)) {
							// System.out.println(word);
							score[j] = score[j] + 1 * Wop;
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

	public String getstring(String statement) {
		String newStr = statement;
		String method = null;
		String[] words = newStr.split(" ");

		if (statement.contains("\" ")) {
			for (String word : words) {
				if (word.contains("\"")) {
					method = word.substring(0, word.indexOf("\"") + 1);
					break;
				}
			}

		}
		return method;

	}

	public int[] isstring() {
		String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];
		int s = 0;
		for (String line : lines) {
			String tline = line.trim();
			if (getstring(tline) != null) {
				score[s] = 1 * Wsl;
				s++;
			} else {
				score[s] = 0;
				s++;
			}

		}
		return score;

	}

	public int[] getNumber() {
		// String newStr = statement;
		// String method = null;

		String[] lines = code.split("\\r?\\n");
		int[] score = new int[lines.length];
		int j = 0;
		score[j] = 0;

		for (String line : lines) {

			if (line.contains("0") || line.contains("1") || line.contains("2") || line.contains("3")
					|| line.contains("4") || line.contains("5") || line.contains("6") || line.contains("7")
					|| line.contains("8") || line.contains("9")) {

				String[] words = line.split(" ");

				for (String word : words) {
					for (int i = 0; i < numb.length; i++) {
						if (numb[i].equals(word)) {
							// System.out.println(word);
							score[j] = score[j] + 1 * Wnv;
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
		String test="";
		String[] lines = displayCode();
		int[] keywrd = getKeyWrds();
		int[] inden = getIdentifiers();
		int[] method = ismethod();
		int[] operator = getoperators();
		int[] nsl = isstring();
		int[] Nnv = getNumber();
		
		
		int totalSize=0;
		; // int[] globleVariable = checkGloblevariable();
		String output = "";

		output = "<table border=\"1\">" + "<tr><th> Code Lines </th>" + "<th>Nkw</th>" + "<th>Nid</th>" + "<th>Nop</th>"
				+ "<th>Nnv</th>" + "<th>Nsl</th>" + "<th>Cs</th></tr>";
		int i = 0;
		int j = lines.length;
		int blank = 0;
		while (j > 0) {
			
			
			totalSize=totalSize + (keywrd[i] + Nnv[i] + inden[i] + method[i]+operator[i] + Nnv[i] + nsl[i]);
			
			output += "<tr><td>" + lines[i] + "</td>";
			output += "<td>" + keywrd[i] + "</td>";
			output += "<td>" +( inden[i] + method[i])+"</td>";
			output += "<td>" + operator[i] + "</td>";
			output += "<td>" + Nnv[i] + "</td>";
			output += "<td>" + nsl[i] + "</td>";
			output += "<td>" + (keywrd[i] + Nnv[i] + inden[i] + method[i]+operator[i] + Nnv[i] + nsl[i]) + "</td> </tr>";
			i++;
			j--;
		}
		
		
		output += "<tr><th bgcolor= '#FDEDEC '>" +"TOTAL"+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +test+"</th>";
		output += "<th bgcolor= '#FDEDEC '>" +totalSize+"</th></tr>";
		
		
		output += "</table>";

		return output;

	}
	
	//all factor table get size method
		public int[] getSizeValue() {
			String[] lines = displayCode();
			int[] Size = new int [lines.length];	
			int[] keywrd = getKeyWrds();
			int[] inden = getIdentifiers();
			int[] method = ismethod();
			int[] operator = getoperators();
			int[] nsl = isstring();
			int[] Nnv = getNumber();
			
			int i = 0;
			int j = lines.length;
			
			while(j > 0) {
				Size[i] = keywrd[i] + inden[i]+ method[i] +operator[i]+ nsl[i]+ Nnv[i] ;
				
				i++;
				j--;
			}
			
			
			return Size;
		}

}
