package bodytest;

import errorsandexceptions.PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds;
import junit.framework.Assert;
import junit.framework.TestCase;
import map.Map;
import player.Body;

//The center of the body in a 5x3 is the 2, 1 (position) (god bless starting to count at 0)

public class bodyTest extends TestCase {

    public void test00BodyGetsCreatedAndItsReferenceIsNotNull() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map aMap = new Map(200,200);
        Body myBody = new Body(aMap,2,1);

        Assert.assertNotNull(myBody);
    }

    public void test01BodyChecksIfSurroundingsAreValidAndIfNotThrowsException(){

        Map aMap = new Map(40,40);
        Boolean pass = false;

        try{
            Body myBody = new Body (aMap, 1, 1);
        } catch (PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds positionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds) {
            pass = true;
        }

        Assert.assertTrue(pass);
    }

    public void test02BodyMethodForCheckingSurroundingsThrowsTheException() throws PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map aMap = new Map ();
        Boolean pass = false;
        Body myBody = new Body(aMap, 2,1);

        try{
            myBody.checkIfSurroundingsAreValid(aMap,0,0);
        } catch (PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds positionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds) {
            pass = true;
        }

        Assert.assertTrue(pass);

    }

}
