package model;

/**
 * Created by JoseMari on 12/06/2016.
 */
public class Provider {
    private String mNif;
    private String mName;

    public Provider() {
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
}
