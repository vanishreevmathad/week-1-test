package com.deloitte;

interface Operation{
	double operate(double a, double b);
	
}
class Calculation{
	double calculate (double i, double j, Operation op) {
		return op.operate(i, j);
	}
}
 public class operation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal=new Calculation();
		double a=5.6, b=3.8;
		double sum=cal.calculate(a,b,(x,y)->x+y);
		double mul=cal.calculate(a,b,(x,y)->x*y);
		System.out.println(sum);
		System.out.println(mul);
		

		

	}

}
