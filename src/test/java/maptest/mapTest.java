package maptest;

import junit.framework.TestCase;
import map.Map;
import org.junit.Assert;

public class mapTest extends TestCase {

    public void test00MapGetsCreatedAndItsReferenceItsNotNull(){

        Map myMap = new Map();

        Assert.assertNotNull(myMap);

    }

}
