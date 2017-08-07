package phone.nikolas.com.castflow.activity.addexpense;

import phone.nikolas.com.castflow.base.BasePresenter;
import phone.nikolas.com.castflow.define.Define;

/**
 * Created by Pleret on 7/19/2017.
 */

public class AddExpensePresenter extends BasePresenter<AddExpenseView, AddExpenseViewModel> {
    String outputText = "";

    public void countingProcess(int input) {
        outputText = outputText + "" + input;
        viewModel.setExpensesOperationText(outputText);
    }

    public void operasionalProcess(int operational) {
        switch (operational) {
            case Define.OPERATION_ADD:
                appendProcess("+");
                break;
            case Define.OPERATION_DEVIDE:
                appendProcess("/");
                break;
            case Define.OPERATION_DOT:
                appendProcess(".");
                break;
            case Define.OPERATION_EQUALS:
                operasionalMath();
                break;
            case Define.OPERATION_MIN:
                appendProcess("-");
                break;
            case Define.OPERATION_MULTIPLE:
                appendProcess("x");
                break;
        }
    }

    private final static String allOpp = "x/+-";

    public void appendProcess(String input) {
        if (outputText.length() == 0 && allOpp.indexOf(input) > -1)
            return;

        if (!outputText.matches(".*" + input)) {
            outputText = outputText + input;
            viewModel.setExpensesOperationText(outputText);
        }
    }

    public int execOperation(int bil1, int bil2, char operation) {
        if (operation == '+') {
            return (bil1 + bil2);
        } else if (operation == '-') {
            return (bil1 - bil2);
        } else if (operation == 'x') {
            return (bil1 * bil2);
        } else if (operation == '/') {
            return (bil1 / bil2);
        }

        return bil1;
    }

    public void operasionalMath() {
//        outputText = "2x8-10";
        int i = 0;
        int bil1 = 0;
        int prev = 0;
        int j = 0;
        boolean hasBeTotal = false;
        while (i < outputText.length()) {
            char aa = outputText.charAt(i);
            int idxAwal = allOpp.indexOf(aa);
            if (idxAwal > -1) {
                j = i + 1;
                if (!hasBeTotal)
                    bil1 = Integer.parseInt(outputText.substring(prev, i));
//                System.out.println("idx awal : " + prev + "  next  " + i + " bil " + bil1);
                prev = j;
                while (j < outputText.length()) {
                    char bb = outputText.charAt(j);
                    int idx = allOpp.indexOf(bb);
                    if (idx > -1) {
                        int bil2 = Integer.parseInt(outputText.substring(prev, j));
//                        System.out.print("  " + bil1 + "  ");
                        bil1 = execOperation(bil1, bil2, outputText.charAt(i));
                        hasBeTotal = true;
//                        System.out.println(outputText.charAt(i) + "   " + bil2 + " = " + bil1);
                        break;
                    } else if (j == outputText.length() - 1) {
                        int bil2 = Integer.parseInt(outputText.substring(prev, outputText.length()));
//                        System.out.println("akhir  " + prev + " j " + j);
//                        System.out.println("  " + bil1 + "  " + outputText.charAt(i) + "  " + bil2);
                        bil1 = execOperation(bil1, bil2, outputText.charAt(i));
                        break;
                    }
                    j++;
                }
            }
            i++;
        }
        viewModel.setExpensesOperationText(""+bil1);
//        System.out.println("value  " + bil1);
    }

}
