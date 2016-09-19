package cn.edu.bistu.cs.se.fragment12;

import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import cn.edu.bistu.cs.se.fragment12.words.wordsContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener,BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    @Override
    public void onListFragmentInteraction(wordsContent.WordItem item) {
        Bundle arguments =new Bundle();
        arguments.putString("id",item.id);
        arguments.putString("content",item.content);
        BlankFragment fragment=new BlankFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.worddetail,fragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri ) {


    }
}
