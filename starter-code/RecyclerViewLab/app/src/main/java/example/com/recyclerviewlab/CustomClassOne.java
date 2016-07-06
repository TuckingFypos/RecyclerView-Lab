package example.com.recyclerviewlab;

/**
 * Created by TuckingFypos on 7/5/16.
 */
public class CustomClassOne {
    String mTitle;
    String mDescription;
    String color;

    public CustomClassOne(String mTitle, String mDescription, String color) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
