package example.com.recyclerviewlab;

import android.widget.*;
import android.view.*;
import android.support.v7.widget.RecyclerView;
/**
 * Created by TuckingFypos on 7/5/16.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView mTextView1;
    TextView mTextView2;
    ImageView mImageView;
    //add CheckBox for view2

    public CustomViewHolder(View itemView) {
        super(itemView);

         mTextView1 = (TextView) itemView.findViewById(R.id.textView1_1);
        mTextView2 = (TextView) itemView.findViewById(R.id.textView1_2);
        mImageView = (ImageView) itemView.findViewById(R.id.imageView1);
        //add CheckBox for view2

    }
}
