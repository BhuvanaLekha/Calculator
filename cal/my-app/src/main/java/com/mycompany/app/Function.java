package com.mycompany.app;

public class Function implements Add,Sub,Mul,Div {
	 public double add(double a,double b){
		return a+b;
		}
	public double sub(double a,double b){
		return a-b;
		}
	public double mul(double a,double b){
		return a*b;
		}
	public double div(double a,double b){
		//double c=0;
		if(b==0) {
			System.out.print("Can't divide by ");
			return 0;
		}
		else 
			//c=a/b;
		return a/b;
	}
}
