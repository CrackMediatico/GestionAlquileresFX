package model;

import java.util.Date;

/**
 * Created by JoseMari on 12/06/2016.
 */
public class Expense {
    private float mAmount;
    private Date mDate;
    private String mDescription;
    private String mType;
    private Provider mProvider;

    public Expense() {
    }

    public float getAmount() {
        return mAmount;
    }

    public void setAmount(float amount) {
        mAmount = amount;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public Provider getProvider() {
        return mProvider;
    }

    public void setProvider(Provider provider) {
        mProvider = provider;
    }
}
