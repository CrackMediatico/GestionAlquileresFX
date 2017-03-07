package model;

import java.util.Date;
import java.util.List;

/**
 * Created by JoseMari on 12/06/2016.
 */
public class Contract {
    private Lessor mLessor;
    private Date mStartDate;
    private Date mFinishDate;
    private List<PricePeriod> mPricePeriods;

    public Contract() {
    }

    public Lessor getLessor() {
        return mLessor;
    }

    public void setLessor(Lessor lessor) {
        mLessor = lessor;
    }

    public Date getStartDate() {
        return mStartDate;
    }

    public void setStartDate(Date startDate) {
        mStartDate = startDate;
    }

    public Date getFinishDate() {
        return mFinishDate;
    }

    public void setFinishDate(Date finishDate) {
        mFinishDate = finishDate;
    }

    public List<PricePeriod> getPricePeriods() {
        return mPricePeriods;
    }

    public void setPricePeriods(List<PricePeriod> pricePeriods) {
        mPricePeriods = pricePeriods;
    }
}
