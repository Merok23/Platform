package positiontest;

import cell.position.Position;
import junit.framework.Assert;
import junit.framework.TestCase;

public class positionTest extends TestCase {

    public void test00PositionGetsCreatedAndItsReferenceIsNotNull(){

        Position myPosition = new Position(0,0);

        Assert.assertNotNull(myPosition);

    }

}
