package phone.nikolas.com.castflow.activity.addexpense;

import android.util.Log;

/**
 * Created by Pleret on 7/19/2017.
 */

public class AddExpenseHandler {
    private AddExpensePresenter presenter;

    public AddExpensePresenter getPresenter() {
        return presenter;
    }

    public void setPresenter(AddExpensePresenter presenter) {
        this.presenter = presenter;
    }

    public void onClickButtonNumber(int input){
        Log.d("Click Button",""+input);
        presenter.countingProcess(input);
    }

    public void onClickButtonOperation(int operation){
        Log.d("Click Operation",""+operation);
        presenter.operasionalProcess(operation);
    }

}
