package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<CustomClassOne> mListOne;
    RecyclerView.Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates and populates ArrayList of CustomClassOnes
        mListOne = new ArrayList<CustomClassOne>();
        mListOne.add(new CustomClassOne("title one-one","desc-1","blue"));
        mListOne.add(new CustomClassOne("title one-two","desc-2","blue"));
        mListOne.add(new CustomClassOne("title one-three","desc-3","blue"));
        mListOne.add(new CustomClassOne("title one-four","desc-4","blue"));
        mListOne.add(new CustomClassOne("title one-five","desc-5","blue"));


        //casts view1 as a RecyclerView mRecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.view1);

        //takes mListOne and puts
        mAdapter = new CustomRecyclerViewAdapterOne(mListOne);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        mRecyclerView.setAdapter(mAdapter);
    }
}
