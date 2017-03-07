package model;

/**
 * Created by JoseMari on 12/06/2016.
 */
public class Estate {
    private String mCadastralReference;
    private String mDescription;
    private String mInternalCode;
    private Float mCadastralValue;
    private Float mConstructionValue;

    public Estate() {
    }

    public String getCadastralReference() {
        return mCadastralReference;
    }

    public void setCadastralReference(String cadastralReference) {
        mCadastralReference = cadastralReference;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getInternalCode() {
        return mInternalCode;
    }

    public void setInternalCode(String internalCode) {
        this.mInternalCode = internalCode;
    }

    public Float getCadastralValue() {
        return mCadastralValue;
    }

    public void setCadastralValue(Float cadastralValue) {
        mCadastralValue = cadastralValue;
    }

    public Float getConstructionValue() {
        return mConstructionValue;
    }

    public void setConstructionValue(Float constructionValue) {
        mConstructionValue = constructionValue;
    }
}
