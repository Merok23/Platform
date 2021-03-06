package maptest;

import errorsandexceptions.PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds;
import errorsandexceptions.PositionIsOutOfBounds;
import junit.framework.Assert;
import junit.framework.TestCase;
import map.Map;
import position.Position;

public class mapTest extends TestCase {

    public void test00MapGetsCreatedAndItsReferenceItsNotNull(){

        Map myMap = new Map();

        Assert.assertNotNull(myMap);

    }

    public void test01MapCanBeCreatedWithDifferentSizes(){

        Map myMap = new Map(20,20);
        Map myOtherMap = new Map(200,200);
        Map myOtherOtherMap = new Map(70,20);


        Assert.assertNotNull(myMap);
        Assert.assertNotNull(myOtherMap);
        Assert.assertNotNull(myOtherOtherMap);

    }
//should use mockito :(
    public void test02YouCanChangeTheStateOfACellInTheMap() throws PositionIsOutOfBounds {

        Map myMap = new Map();

        myMap.setCellSolidAt(2,2);

        Assert.assertTrue(myMap.cellIsSolid(2,2));


    }

    public void test03TheMapGetsCreatedWithASolidGround() throws PositionIsOutOfBounds {

        Map myMap = new Map(10, 10);

        for(int groundPosition = 0; groundPosition < 10; groundPosition++){
            Assert.assertTrue(myMap.cellIsSolid(groundPosition, 0));
        }

    }

    public void test04YouSelectACellOutOfBoundsAndGetTheException(){

        boolean pass = false;
        Map myMap = new Map(10,10);

        try{
            myMap.setCellSolidAt(10,10);
        }catch (PositionIsOutOfBounds positionOutOfBounds){
            pass = true;
        }

        Assert.assertTrue(pass);

    }

    public void test05YouCanSetThePlayerInTheMap() throws PositionIsOutOfBounds, PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map myMap = new Map(10, 10);
        Position aPosition = new Position(2,1);

        myMap.setPlayerAt(2, 1);

        Assert.assertEquals(aPosition,myMap.getPlayerPosition());

    }

    public void test06ExceptionForInvalidPositionForPlayerIsThrown() throws PositionIsOutOfBounds {

        Map myMap = new Map(10, 10);
        Boolean pass = false;

        try {
            myMap.setPlayerAt(0, 0);
        } catch (PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds positionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds) {
            pass = true;
        }

        Assert.assertTrue(pass);

    }

    public void test07PlayerCanBeIssuedToMoveRight() throws PositionIsOutOfBounds, PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map myMap = new Map (10, 10);
        Position aPosition = new Position(6,1);

        myMap.setPlayerAt(5, 1);
        myMap.movePlayerToTheRight();

        Assert.assertEquals(aPosition,myMap.getPlayerPosition());

    }

    public void test08PlayerCanBeIssuedToMoveLeft() throws PositionIsOutOfBounds, PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds {

        Map myMap = new Map (10, 10);
        Position aPosition = new Position(4,1);

        myMap.setPlayerAt(5, 1);
        myMap.movePlayerToTheLeft();

        Assert.assertEquals(aPosition, myMap.getPlayerPosition());

    }

    public void test08IfPlayerMovesToAWallTheExceptionForInvalidPositionIsThrown() throws PositionIsOutOfBounds {
        Map myMap = new Map (10, 10);
        boolean pass = false;

        try {
            myMap.setPlayerAt(8, 1);
        } catch (PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds positionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds) {
            pass = false;
        }

        try {
            myMap.movePlayerToTheRight();
        } catch (PositionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds positionIsInvalidForPlayerAPartOfTheBodyIsOutOfBounds) {
            pass = true;
        }

        Assert.assertTrue(pass);
    }

}
