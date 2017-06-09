package model;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by John on 09/06/2017.
 *
 * Object for storing information relating to a savings goal
 */
public class SavingsHelperObject
{
    private TimePeriodAmountEnum    _timePeriodAmount;
    private BigInteger              _savingsTarget;
    private BigInteger              _startingAmount;
    private Date                    _targetDate;

    public void SavingsHelperObject(BigInteger savingsTarget, BigInteger startingAmount, Date targetDate, TimePeriodAmountEnum timePeriodAmountEnum) {
        _savingsTarget      = savingsTarget;
        _startingAmount     = startingAmount;
        _targetDate         = targetDate;
        _timePeriodAmount   = timePeriodAmountEnum;
    }

    public void setTimePeriodAmount(TimePeriodAmountEnum _timePeriodAmount) {
        this._timePeriodAmount = _timePeriodAmount;
    }

    public void setSavingsTarget(BigInteger _savingsTarget) {
        this._savingsTarget = _savingsTarget;
    }

    public void setStartingAmount(BigInteger _startingAmount) {
        this._startingAmount = _startingAmount;
    }

    public void setTargetDate(Date _targetDate) {
        this._targetDate = _targetDate;
    }

    public TimePeriodAmountEnum getTimePeriodAmount()
    {
        return _timePeriodAmount;
    }

    public BigInteger getSavingsTarget()
    {
        return _savingsTarget;
    }

    public BigInteger getStartingAmount() {
        return _startingAmount;
    }

    public Date getTargetDate() {
        return _targetDate;
    }
}
