package com.addition;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddition {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
@Test
public void testaddNumber() {
	System.out.println("Numbers addition unit test");
	MathsAddition m=new MathsAddition();
	int n1=10,n2=18;
	int actualresult=m.addNumber(n1, n2);
	int expectedresult=28;
assertEquals(expectedresult,actualresult);
}
@Test
public void testaddNumberNegative() {
	System.out.println("Numbers addition unit test");
	MathsAddition m=new MathsAddition();
	int n1=10,n2=18;
	int actualresult=m.addNumber(n1, n2);
	int expectedresult=28;
assertEquals(expectedresult,actualresult);
}
@Test(timeout=1)
public void testGenerateRandom() {
	double rn[]=new double[100000];
	for(int i=0;i<100000;i++)
	{
		rn[i]=Math.random()+1;
	}
}
}
