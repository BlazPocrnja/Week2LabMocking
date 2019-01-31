package cmput402.mocking;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import service.City;
import stub.CityStub;
import stub.SalaryStub;

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

    public void testCapitalizeName() {  	
    	assert("Abram Hindle".equals(Main.capitalizeName("abram hindle")));
    }
    
    public void testFilterEdmonton(){
    	Util util = new Util();
    	CityStub stub = new CityStub();
    	assert(3 == util.filterEdmonton(stub));
    }
    
    public void testFilterEdmontonMockito() {
    	Util util = new Util();
    	City mockCity = mock(City.class);
    	
    	List<String> listCities = new ArrayList<String>();
    	listCities.add("Edmonton");
    	listCities.add("Calgary");
    	listCities.add("Edmonton");
    	listCities.add("Calgary");
    	
    	List<String> listCities2 = new ArrayList<String>();
    	listCities2.add("Edmonton");
    	listCities2.add("Calgary");
    	listCities2.add("Calgary");
    	
    	when(mockCity.listCities()).thenReturn(listCities).thenReturn(listCities2);
    	
    	assert(2 == util.filterEdmonton(mockCity));
    	assert(1 == util.filterEdmonton(mockCity));
    	
    	verify(mockCity, times(2)).listCities();
    }
    
    public void testFilterSalaries(){
    	Util util = new Util();
    	SalaryStub stub = new SalaryStub();
    	assert(1 == util.filterSalaries(stub));
    }
}
