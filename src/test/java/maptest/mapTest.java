package maptest;

import junit.framework.Assert;
import junit.framework.TestCase;
import map.Map;

public class mapTest extends TestCase {

    public void test00MapGetsCreatedAndItsReferenceItsNotNull(){

        Map myMap = new Map();

        Assert.assertNotNull(myMap);

    }

}
