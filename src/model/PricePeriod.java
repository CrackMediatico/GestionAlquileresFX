package model;

import java.util.Date;

/**
 * Created by JoseMari on 12/06/2016.
 */
public class PricePeriod {
    private Date mStartDate;
    private Date mFinishDate;
    private Float mAnualRate;

    public PricePeriod() {
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

    public Float getAnualRate() {
        return mAnualRate;
    }

    public void setAnualRate(Float anualRate) {
        mAnualRate = anualRate;
    }
}
