package phone.nikolas.com.castflow;

/**
 * Created by Pleret on 8/7/2017.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import phone.nikolas.com.castflow.activity.addexpense.AddExpensePresenter;

public class AddExpenseUnitTest {

    private AddExpensePresenter expensePresenter;
    @Before
    public void setup(){
        expensePresenter = new AddExpensePresenter();
        System.out.println("Ready setup for testing");
    }

    @After
    public void cleanUp(){
        System.out.println("Clean Up ready");
    }


    @Test
    public void testOperationalMath(){
        expensePresenter =  new AddExpensePresenter();
        expensePresenter.operasionalMath();
    }

    @Test
    public void testAppendProcess(){
        expensePresenter = new AddExpensePresenter();
        expensePresenter.appendProcess("+");
    }

}
