package example.com.recyclerviewlab;

/**
 * Created by TuckingFypos on 7/5/16.
 */
public class CustomClassTwo {
    String mTitle;
    String mDescription;
    String mColor;
    boolean mCheck;


    public CustomClassTwo(String mTitle, String mDescription, String mColor) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mColor = mColor;
        this.mCheck = false;
    }

    public boolean ismCheck() {
        return mCheck;
    }

    public void setmCheck(boolean mCheck) {
        this.mCheck = mCheck;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }
}
