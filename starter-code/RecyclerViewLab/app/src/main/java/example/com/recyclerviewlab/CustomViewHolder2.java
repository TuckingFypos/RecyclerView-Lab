package example.com.recyclerviewlab;

import android.widget.*;
import android.view.*;
import android.support.v7.widget.RecyclerView;
/**
 * Created by TuckingFypos on 7/5/16.
 */
public class CustomViewHolder2 extends RecyclerView.ViewHolder {

    TextView mTextView1;
    TextView mTextView2;
    ImageView mImageView;
    CheckBox mCheckBox;

    public CustomViewHolder2(View itemView) {
        super(itemView);

        mTextView1 = (TextView) itemView.findViewById(R.id.textView2_1);
        mTextView2 = (TextView) itemView.findViewById(R.id.textView2_2);
        mImageView = (ImageView) itemView.findViewById(R.id.imageView2);
        mCheckBox = (CheckBox) itemView.findViewById(R.id.checkbox);

    }
}
