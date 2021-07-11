package Org.Testing.TestTriggers;

import java.io.IOException;

import org.testng.annotations.Test;

import Org.Testing.TestCases.TC1;
import Org.Testing.TestCases.TC2;
import Org.Testing.TestCases.TC3;
import Org.Testing.TestCases.TC4;

public class Trigger {

	/*
	 * public static void main(String[] args) throws IOException {
	 * 
	 * System.out.println("Executing test case 1 - get() request"); TC1 TC1Obj = new
	 * TC1(); TC1Obj.testcase1();
	 * 
	 * System.out.println("Executing test case 2 - post() request"); TC2 TC2Obj =
	 * new TC2(); TC2Obj.testcase2();
	 * 
	 * System.out.println("Executing test case 3 - delete() request"); TC3 TC3Obj =
	 * new TC3(); TC3Obj.testcase3(); }
	 */

	/*
	 * public static void main(String[] args) throws IOException {
	 * System.out.println("Executing test case 2 - post() request"); TC2 TC2Obj =
	 * new TC2(); TC2Obj.testcase2(); System.out.
	 * println("---------------End of  test case 2 - post() request---------------"
	 * ); System.out.println("\n");
	 * 
	 * System.out.println("Executing test case 1 - get() request"); TC1 TC1Obj = new
	 * TC1(); TC1Obj.testcase1(); System.out.
	 * println("---------------End of  test case 1 - get() request--------------");
	 * System.out.println("\n");
	 * 
	 * System.out.println("Executing test case 4 - put() request"); TC4 TC4Obj = new
	 * TC4(); TC4Obj.testcase4(); System.out.
	 * println("---------------End of  test case 4 - put() request--------------");
	 * System.out.println("\n");
	 * 
	 * System.out.println("Executing test case 3 - delete() request"); TC3 TC3Obj =
	 * new TC3(); TC3Obj.testcase3(); System.out.
	 * println("---------------End of  test case 4 - delete() request--------------"
	 * ); System.out.println("\n"); }
	 * 
	 */
	@Test(priority = 1)
	public void second() throws IOException {
		System.out.println("Executing test case 2 - post() request");
		TC2 TC2Obj = new TC2();
		TC2Obj.testcase2();
		System.out.println("---------------End of  test case 2 - post() request---------------");
		System.out.println("\n");

	}

	@Test(priority = 2)
	public void first() throws IOException {
		System.out.println("Executing test case 1 - get() request");
		TC1 TC1Obj = new TC1();
		TC1Obj.testcase1();
		System.out.println("---------------End of  test case 1 - get() request--------------");
		System.out.println("\n");

	}

	@Test(priority = 3)
	public void fourth() throws IOException {
		System.out.println("Executing test case 4 - put() request");
		TC4 TC4Obj = new TC4();
		TC4Obj.testcase4();
		System.out.println("---------------End of  test case 4 - put() request--------------");
		System.out.println("\n");
	}

	@Test(priority = 4)
	public void third() throws IOException {
		System.out.println("Executing test case 3 - delete() request");
		TC3 TC3Obj = new TC3();
		TC3Obj.testcase3();
		System.out.println("---------------End of  test case 4 - delete() request--------------");
		System.out.println("\n");

	}

}
