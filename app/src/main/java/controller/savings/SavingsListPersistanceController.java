package controller.savings;

import java.util.ArrayList;
import java.util.List;

import model.saviings.SavingsHelperObject;

/**
 * Created by John on 09/06/2017.
 *
 * This class is responsible for saving and loading the list
 */
public class SavingsListPersistanceController
{
    /**
     * Save the list to the device storage so it will last longer than the app lifecycle
     */
    public static void saveListPermanently()
    {
        // TODO save the list to teh phones storage
    }

    /**
     * Load the array list from the device storage
     *
     * @return
     *      The array that was in the devices storage
     */
    public static List<SavingsHelperObject> loadListFromDeviceStorage()
    {
        // TODO load from the device storage
        return new ArrayList<SavingsHelperObject>();
    }
}
