package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView mRecyclerView2;
    List<CustomClassOne> mListOne;
    List<CustomClassTwo> mListTwo;
    RecyclerView.Adapter mAdapter;
    RecyclerView.Adapter mAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListOne = new ArrayList<CustomClassOne>();
        mListOne.add(new CustomClassOne("title","desc","blue"));
        mListOne.add(new CustomClassOne("title","desc","blue"));
        mListOne.add(new CustomClassOne("title","desc","blue"));
        mListOne.add(new CustomClassOne("title","desc","blue"));
        mListOne.add(new CustomClassOne("title","desc","blue"));

        mRecyclerView = (RecyclerView) findViewById(R.id.view1);

        mAdapter = new CustomRecyclerViewAdapter(mListOne);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        mRecyclerView.setAdapter(mAdapter);

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
