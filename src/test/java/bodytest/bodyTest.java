package bodytest;

import errorsandexceptions.PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds;
import junit.framework.Assert;
import junit.framework.TestCase;
import map.Map;
import player.Body;

//The center of the body in a 5x3 is the 2, 1

public class bodyTest extends TestCase {

    public void test00BodyGetsCreatedAndItsReferenceIsNotNull() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map aMap = new Map(200,200);
        Body myBody = new Body(aMap,2,1);

        Assert.assertNotNull(myBody);
    }

}
