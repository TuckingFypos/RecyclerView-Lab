package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {

    RecyclerView mRecyclerView2;
    List<CustomClassTwo> mListTwo;
    RecyclerView.Adapter mAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mListTwo = new ArrayList<CustomClassTwo>();
        mListTwo.add(new CustomClassTwo("title","desc","red"));
        mListTwo.add(new CustomClassTwo("title","desc","red"));
        mListTwo.add(new CustomClassTwo("title","desc","red"));
        mListTwo.add(new CustomClassTwo("title","desc","red"));
        mListTwo.add(new CustomClassTwo("title","desc","red"));

        mRecyclerView2 = (RecyclerView) findViewById(R.id.view2);

        mAdapter2 = new CustomRecyclerViewAdapterTwo(mListTwo);
    }
}
