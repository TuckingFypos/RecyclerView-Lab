package example.com.recyclerviewlab;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import java.util.*;
/**
 * Created by TuckingFypos on 7/5/16.
 */
public class CustomRecyclerViewAdapterTwo extends RecyclerView.Adapter<CustomViewHolder> {

    List<CustomClassTwo> mCustomObjectsList;

    public CustomRecyclerViewAdapterTwo(final List<CustomClassTwo> customObjectList){
        mCustomObjectsList = customObjectList;
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.second_layout, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {

        holder.mTextView1.setText("A Text");
        holder.mTextView2.setText("Another Text");

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //onClick
            }
        };


    }

    @Override
    public int getItemCount() {
        return mCustomObjectsList.size();
    }
}