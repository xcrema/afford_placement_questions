/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input
string is valid. An input string is valid if –
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
*/


package question_2;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Test cases: ");
		int n = Integer.parseInt(sc.next());
		while(n-->0) {
			System.out.println("Enter String of brackets: ");
			String []s = sc.next().split("");
			Stack<String> stack = new Stack<String>();
			boolean flag = true;
			for(int i=0; i<s.length; i++) {
				if(s[i].equals("(") || s[i].equals("{") || s[i].equals("[")) {
					stack.push(s[i]);
				}
				else{
					if(s[i].equals(")")) {
						if(stack.peek().equals("(")){
							stack.pop();
						}
						else {
							flag = false;
							break;
						}
					}
					else if(s[i].equals("}")) {
						if(stack.peek().equals("{")){
							stack.pop();
						}
						else {
							flag = false;
							break;
						}
					}
					else if(s[i].equals("]")) {
						if(stack.peek().equals("[")){
							stack.pop();
						}
						else {
							flag = false;
							break;
						}
					}	
				
				}
			}
			
			if(flag && stack.size() == 0)
				System.out.println("True");
			else 
				System.out.println("False");
		}
		sc.close();
	}
}
