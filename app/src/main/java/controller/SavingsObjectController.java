package controller;

import java.util.List;

import model.saviings.SavingsHelperObject;
import model.saviings.SavingsModel;

/**
 * Created by John on 05/06/2017.
 *
 * Here we will get the instance of the button from layout and add action handlers to them. I imagine
 * the actions wil go to the logic layers and get info back. But we will see....
 */
public class SavingsObjectController
{
    private SavingsModel _savingsModel;

    public SavingsObjectController()
    {
        _savingsModel = new SavingsModel();
    }

    public void addSavingsObjectToList(SavingsHelperObject savingsObject)
    {
        _savingsModel.getSavingsList().add(savingsObject);
    }

    public List<SavingsHelperObject> getSavingsListFromModel()
    {
        return _savingsModel.getSavingsList();
    }

    public void saveListToModel(List<SavingsHelperObject> savingsList)
    {
        _savingsModel.setList(savingsList);
    }
}
