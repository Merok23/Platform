package celltest;

import cell.Cell;
import junit.framework.TestCase;
import org.junit.Assert;

public class cellTest extends TestCase {

    public void test00CellGetsCreatedAndItsReferenceIsNotNull(){

        Cell myCell = new Cell(0,0);

        Assert.assertNotNull(myCell);

    }

    /*

    public void test01CellPositionIsCorrect(){



    }
*/
}
