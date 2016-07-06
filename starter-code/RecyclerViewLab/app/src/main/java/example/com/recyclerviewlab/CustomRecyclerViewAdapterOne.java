package example.com.recyclerviewlab;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.widget.Toast;

import java.util.*;
/**
 * Created by TuckingFypos on 7/5/16.
 */
public class CustomRecyclerViewAdapterOne extends RecyclerView.Adapter<CustomViewHolderOne> {

    List<CustomClassOne> mCustomObjectsList;

    public CustomRecyclerViewAdapterOne(final List<CustomClassOne> customObjectList){
        mCustomObjectsList = customObjectList;
    }


    @Override
    public CustomViewHolderOne onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.first_layout, parent, false);
        CustomViewHolderOne viewHolder = new CustomViewHolderOne(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderOne holder, final int position) {

        CustomClassOne customObject = mCustomObjectsList.get(position);
        final String title = customObject.getmTitle();
        final String content = customObject.getmDescription();

        holder.setmTextView1(title);
        holder.setmTextView2(content);
        //holder.setColor(customObject.getColor());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Selected: " + title,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mCustomObjectsList.size();
    }


}