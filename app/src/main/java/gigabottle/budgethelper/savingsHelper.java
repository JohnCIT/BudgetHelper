package gigabottle.budgethelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class savingsHelper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings_helper);

        // TODO decide on - Two options here, can assign in the xml or use this approach? Whats better
        final Button button = (Button) findViewById(R.id.applyButton);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                /*
                 * TODO At this point we will want to just save the data to the model]
                 * So we will need a savings budget object in order to fill out with these details
                 */

                // debug message to how it works
                displayToastMessage("Applying settings", Toast.LENGTH_LONG);
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
