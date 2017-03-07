package model;

import java.util.Date;

/**
 * Created by JoseMari on 12/06/2016.
 */
public class Lessor {
    private String mNif;
    private String mName;
    private String mLastName;
    private String mPhone;
    private String mEmail;
    private Date mBirthDate;
    private String mBankAccount;

    public Lessor() {
    }

    public String getNif() {
        return mNif;
    }

    public void setNif(String nif) {
        mNif = nif;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public Date getBirthDate() {
        return mBirthDate;
    }

    public void setBirthDate(Date birthDate) {
        mBirthDate = birthDate;
    }

    public String getBankAccount() {
        return mBankAccount;
    }

    public void setBankAccount(String bankAccount) {
        mBankAccount = bankAccount;
    }
}
