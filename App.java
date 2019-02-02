package com.git.assignment.capita_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 * 
 */
public class App {
List<Character> ip = new ArrayList<Character>();

	public static void main(String[] args) {
		App app = new App();
		app.add("7+(6*5^2+3-4/2)");
		app.cal();
	}

public void add(String exp){
	char[] charArray = exp.toCharArray();
	for (char c : charArray) {
		ip.add(c);
	}
}

public void cal(){
	String var =null;
	int temp=0;
	List<String> operators = new ArrayList<String>();
	operators.add("+");
	operators.add("-");
	operators.add("*");
	operators.add("/");
	operators.add("^");
	operators.add("(");
	operators.add(")");
		for (int i = ip.size() - 1; i >= 0; i--) {
			if (operators.contains(ip.get(i).toString()) || ip.get(0) == ')') {
				var = "Invalid Expression";
				break;

			} else if (operators.contains(ip.get(i).toString())
					|| ip.get(ip.size() - 1) == '(') {
				var = "Invalid Expression";
				break;
			}
			try {
				temp = Integer.parseInt(ip.get(i).toString());
			} catch (NumberFormatException e) {
				temp += ip.get(i);
			}
		}
		
	System.out.println(var!=null?var:temp);	
	}

}
