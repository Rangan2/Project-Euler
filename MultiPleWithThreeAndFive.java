package com.eular;

public class MultiPleWithThreeAndFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = 0;
		for(int i = 1; i < 1000; i++)
		{
			if((i % 3 == 0) || (i % 5 == 0))
			{
				res = res + i;
			}
		}
		System.out.println(res);
	}

}
