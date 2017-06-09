package model.saviings;

import java.util.List;

import controller.savings.SavingsListPersistanceController;

/**
 * Created by John on 09/06/2017.
 *
 * The model for the savings page - Holds onto the list for life of the tool and manupulatees it as needed
 */
public class SavingsModel
{
    private List<SavingsHelperObject> _savingsHelperList;

    public SavingsModel()
    {
        init();
    }

    /**
     * Initialise the list from the persistence controller.
     */
    private void init()
    {
        _savingsHelperList = SavingsListPersistanceController.loadListFromDeviceStorage();
    }

    /**
     * Get the list of savings helper objects
     */
    public List<SavingsHelperObject> getSavingsList()
    {
        return _savingsHelperList;
    }

    public void setList(List<SavingsHelperObject> savingsList)
    {
        _savingsHelperList = savingsList;
    }
}
