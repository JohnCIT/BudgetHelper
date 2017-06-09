package ui.helpers;

import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by John on 09/06/2017.
 *
 * Helpful UI methods should go here
 */
public class UIHelper {
    /**
     * Give a date picker and get the date from it
     *
     * @param datePicker
     *      The date picker to get the date from
     * @return a java.util.Date
     *      The date in java date form
     */
    public static Date getDateFromDatePicker(DatePicker datePicker){
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year =  datePicker.getYear();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        return calendar.getTime();
    }
}
