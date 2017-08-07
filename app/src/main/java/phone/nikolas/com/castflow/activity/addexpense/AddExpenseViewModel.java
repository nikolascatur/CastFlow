package phone.nikolas.com.castflow.activity.addexpense;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import phone.nikolas.com.castflow.BR;


/**
 * Created by Pleret on 7/19/2017.
 */

public class AddExpenseViewModel extends BaseObservable{

    private String expensesOperationText;

    private String buttonAddText;

    @Bindable
    public String getExpensesOperationText() {
        return expensesOperationText;
    }

    public void setExpensesOperationText(String expensesOperationText) {
        this.expensesOperationText = expensesOperationText;
        notifyPropertyChanged(BR.expensesOperationText);
    }

    @Bindable
    public String getButtonAddText() {
        return buttonAddText;
    }

    public void setButtonAddText(String buttonAddText) {
        this.buttonAddText = buttonAddText;
        notifyPropertyChanged(BR.buttonAddText);
    }
}
