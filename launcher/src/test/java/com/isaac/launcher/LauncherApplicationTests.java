package com.isaac.launcher;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LauncherApplicationTests extends TestCase {
  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public LauncherApplicationTests( String testName ) throws Exception
  {
    super( testName );
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite()
  {
    return new TestSuite( LauncherApplicationTests.class );
  }

  /**
   * Rigourous Test :-)
   */
  public void testApp()
  {
    assertTrue( true );
  }
}


