package model.saviings;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import model.TimePeriodAmountEnum;

/**
 * Created by John on 09/06/2017.
 *
 * Object for storing information relating to a savings goal
 */
public class SavingsHelperObject
{
    private TimePeriodAmountEnum    _timePeriodAmount;
    private BigDecimal              _savingsTarget;
    private BigDecimal              _startingAmount;
    private Date                    _targetDate;



    public SavingsHelperObject(BigDecimal savingsTarget, BigDecimal startingAmount, Date targetDate, TimePeriodAmountEnum timePeriodAmountEnum)
    {
        _savingsTarget      = savingsTarget;
        _startingAmount     = startingAmount;
        _targetDate         = targetDate;
        _timePeriodAmount   = timePeriodAmountEnum;
    }

    /**
     * Setr the length of time between savings amount, may not be needed in the end depending on how we do this
     * @param timePeriodAmount
     *      the period of time between being able to add to savings.
     */
    public void setTimePeriodAmount(TimePeriodAmountEnum timePeriodAmount)
    {
        _timePeriodAmount = timePeriodAmount;
    }

    /**
     * Set the savings target
     *
     * @param savingsTarget
     *      The amount the user wishes to save
     */
    public void setSavingsTarget(BigDecimal savingsTarget)
    {
        _savingsTarget = savingsTarget;
    }

    /**
     * Does the user have any cash starting out?
     *
     * @param startingAmount
     *      The starting amount of cash the user has
     */
    public void setStartingAmount(BigDecimal startingAmount)
    {
        _startingAmount = startingAmount;
    }

    /**
     * The target date the user wants their savings by
     * @param targetDate
     *      The date corresponding to the desired date
     */
    public void setTargetDate(Date targetDate)
    {
        _targetDate = targetDate;
    }

    /**
     * Get the amount of time between what the user can save
     *
     * @return
     * Big int value representing
     */
    public TimePeriodAmountEnum getTimePeriodAmount()
    {
        return _timePeriodAmount;
    }

    /**
     * Get the savings target amount
     *
     * @return
     *      A big int value representing the savings target
     */
    public BigDecimal getSavingsTarget()
    {
        return _savingsTarget;
    }

    /**
     * Get the starting amount the user has before starting to save
     *
     * @return
     *      A big int representing the the starting amount of cash the user has
     */
    public BigDecimal getStartingAmount() {
        return _startingAmount;
    }

    /**
     * Get the target date the user wants there money to bae save by
     *
     * @return
     *      A date object representing the target date the user wants their money by
     */
    public Date getTargetDate()
    {
        return _targetDate;
    }
}
