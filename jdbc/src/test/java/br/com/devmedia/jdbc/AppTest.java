package br.com.devmedia.jdbc;

import java.net.InetAddress;
import java.net.UnknownHostException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
	
	
	public void nameHost(){
		try {
			System.out.println(InetAddress.getLocalHost().getHostName());
			System.out.println(InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		}
		
		
	}
}
