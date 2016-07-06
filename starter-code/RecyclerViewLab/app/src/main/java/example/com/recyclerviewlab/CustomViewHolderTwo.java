package example.com.recyclerviewlab;

import android.widget.*;
import android.view.*;
import android.support.v7.widget.RecyclerView;
/**
 * Created by TuckingFypos on 7/5/16.
 */
public class CustomViewHolderTwo extends RecyclerView.ViewHolder {

    TextView mTextView1;
    TextView mTextView2;
    ImageView mImageView;

    public TextView getmTextView1() {
        return mTextView1;
    }

    public void setmTextView1(String titleText) {
        mTextView1 = (TextView) itemView.findViewById(R.id.textView2_1);
        mTextView1.setText(titleText);
    }

    public TextView getmTextView2() {
        return mTextView2;
    }

    public void setmTextView2(String descText) {
        mTextView2 = (TextView) itemView.findViewById(R.id.textView2_2);
        mTextView2.setText(descText);
    }

    public ImageView getmImageView() {
        return mImageView;
    }

    public void setmImageView(ImageView mImageView) {
        this.mImageView = mImageView;
    }

    public CheckBox getmCheckBox() {
        return mCheckBox;
    }

    public void setmCheckBox(CheckBox mCheckBox) {
        this.mCheckBox = mCheckBox;
    }

    CheckBox mCheckBox;

    public CustomViewHolderTwo(View itemView) {
        super(itemView);

        mTextView1 = (TextView) itemView.findViewById(R.id.textView2_1);
        mTextView2 = (TextView) itemView.findViewById(R.id.textView2_2);
        mImageView = (ImageView) itemView.findViewById(R.id.imageView2);
        mCheckBox = (CheckBox) itemView.findViewById(R.id.checkbox);

    }
}
