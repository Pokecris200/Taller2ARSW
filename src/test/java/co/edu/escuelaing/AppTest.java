package co.edu.escuelaing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import co.edu.escuelaing.LinkedList.MyLList;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        MyLList ll = new MyLList();
        ll.add(3);
        ll.add(5);
        assertEquals(2, ll.size());
        int cont = 0;
        /*for(Object i : ll){
            cont++;
        }
        assertEquals(2, cont);*/
    }
}
