package gigabottle.budgethelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;

import controller.SavingsObjectController;
import model.saviings.SavingsHelperObject;
import model.TimePeriodAmountEnum;
import ui.helpers.UIHelper;

public class savingsHelperActivity extends AppCompatActivity {

    SavingsObjectController _savingsController;
    EditText    _savingsTarget;
    Button      _applyButton;
    EditText    _startingAmount;
    DatePicker  _saveByDatePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings_helper);

        // create the controller
        _savingsController = new SavingsObjectController();

        // Have UI references
        _savingsTarget    = (EditText) findViewById(R.id.saveAmountValue);
        _applyButton      = (Button) findViewById(R.id.applyButton);
        _startingAmount   = (EditText) findViewById(R.id.startingAmountValue);
        _saveByDatePicker = (DatePicker) findViewById(R.id.saveByDate);


       _applyButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Create a savings helper object
                SavingsHelperObject savingsHelperObject = new SavingsHelperObject(new BigDecimal(_savingsTarget.getText().toString()),
                        new BigDecimal(_startingAmount.getText().toString()), UIHelper.getDateFromDatePicker(_saveByDatePicker), TimePeriodAmountEnum.DAY);

                // Pass the new savings object to the back end
                _savingsController.addSavingsObjectToList(savingsHelperObject);

                // debug message to how it works
                displayToastMessage("New savings goal added", Toast.LENGTH_LONG);
            }
        });
    }

    /**
     * Shows a toast message , helpful for quick debugging. Might move this into a hlepr later if needed
     */
    private void displayToastMessage(String message, int toastLength)
    {
        Toast.makeText(getApplicationContext(), message, toastLength).show();
    }


}
