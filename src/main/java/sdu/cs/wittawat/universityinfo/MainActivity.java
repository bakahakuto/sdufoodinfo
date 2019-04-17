package sdu.cs.wittawat.universityinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //explicit
    ListView listView;
    int[] ints = new int[]
            {
                    R.drawable.badge, R.drawable.connection, R.drawable.dots,
                    R.drawable.leader, R.drawable.like, R.drawable.graph,
                    R.drawable.michelin_star, R.drawable.setting, R.drawable.target, R.drawable.threeman
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        // listview java to xml
        listView = findViewById(R.id.listview);

        //create listview



    } //end onCreate
} //end class
