package example.com.recyclerviewlab;

import android.widget.*;
import android.view.*;
import android.support.v7.widget.RecyclerView;
/**
 * Created by TuckingFypos on 7/5/16.
 */
public class CustomViewHolderOne extends RecyclerView.ViewHolder {

    TextView mTextView1;
    TextView mTextView2;
    ImageView mImageView;
    //add CheckBox for view2

    public CustomViewHolderOne(View itemView) {
        super(itemView);

        mTextView1 = (TextView) itemView.findViewById(R.id.textView1_1);
        mTextView2 = (TextView) itemView.findViewById(R.id.textView1_2);
        mImageView = (ImageView) itemView.findViewById(R.id.imageView1);
        //add CheckBox for view2

    }

    public TextView getmTextView1() {return mTextView1;}

    public void setmTextView1(String textView1) {
        mTextView1 = (TextView) itemView.findViewById(R.id.textView1_1);
        mTextView1.setText(textView1);
    }

    public TextView getmTextView2() {
        return mTextView2;
    }

    public void setmTextView2(String textView2) {
        mTextView1 = (TextView) itemView.findViewById(R.id.textView1_2);
        mTextView1.setText(textView2);
    }

    public ImageView getmImageView() {
        return mImageView;
    }

    public void setmImageView(ImageView mImageView) {
        this.mImageView = mImageView;
    }
}
