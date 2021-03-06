package example.com.recyclerviewlab;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.widget.Toast;

import java.util.*;
/**
 * Created by TuckingFypos on 7/5/16.
 */
public class CustomRecyclerViewAdapterTwo extends RecyclerView.Adapter<CustomViewHolderTwo> {

    List<CustomClassTwo> mCustomObjectsList;

    public CustomRecyclerViewAdapterTwo(final List<CustomClassTwo> customObjectList){
        mCustomObjectsList = customObjectList;
    }


    @Override
    public CustomViewHolderTwo onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.second_layout, parent, false);
        CustomViewHolderTwo viewHolder = new CustomViewHolderTwo(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolderTwo holder, final int position) {

        CustomClassTwo customObject = mCustomObjectsList.get(position);
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