package com.eular;

public class SumOfEvenFibonacci {

	public static void main(String args[]) {
		int hisgestTem = 4000000;
		/*
		 * int prev = 0; int next = 0; int res = 0; // int finalRes = 0; for
		 * (int i = 0; i < hisgestTem; i++) { if (i == 1) { //
		 * System.out.print(i+" "); next = i; prev = i; } else if (i == 2) {
		 * System.out.print(i + " "); next = i; } prev = next; if (((prev % 2 ==
		 * 0) && (next % 2 == 0)) || ((prev % 2 != 0) && (next % 2 != 0))) { res
		 * = prev + next; }else{ next = prev + next; } if (i == 2) { next = res;
		 * } System.out.print(res + " "); }
		 */
		
		long prev = 1, next = 2;
		long sum = prev + next;
		long flag = 1;
		long res = 2;
		long fib = 0;
		while(next < hisgestTem)
		{
			fib = next;
			next = next + prev;
			prev = fib;
			if(flag % 3 == 0 && flag != 0)
			{
				res = res + next;
				System.out.print(res + " ");
			}
			flag++;
			//1 2 3 5 8 13 21 34 55 89 144 233 377
			
			
		}
		
		
	}
}
