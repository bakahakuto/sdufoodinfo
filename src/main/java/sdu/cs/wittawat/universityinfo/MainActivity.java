package sdu.cs.wittawat.universityinfo;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //explicit
    ListView listView;
    int[] ints = new int[]
            {
                    R.drawable.logo1, R.drawable.logo2, R.drawable.logo3,
                    R.drawable.logo4, R.drawable.logo5, R.drawable.logo6,
                    R.drawable.logo7, R.drawable.logo8, R.drawable.logo9,       };
    String[] detailString, approach1, approach2, approach3, driveString, responsibleString;
    Image aboutApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        // listview java to xml
        listView = findViewById(R.id.listview);

        //ดึงค่าจากmy contentมาลงxml
        detailString = getResources().getStringArray(R.array.detail);
        /* approach1 = getResources().getStringArray(R.array.approach1);
        approach2 = getResources().getStringArray(R.array.approach2);
        approach3 = getResources().getStringArray(R.array.approach3);
        driveString = getResources().getStringArray(R.array.drive);
        responsibleString = getResources().getStringArray(R.array.responsible); */

        //create listview
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                //ส่งข้อมูลไปหน้าinfo1
                Intent infoIntent = new Intent(MainActivity.this, info1.class);
                //ส่งdata
                infoIntent.putExtra("Logo", ints[i]);
                infoIntent.putExtra("Detail", detailString[i]);
                /* infoIntent.putExtra("Approach1", approach1[i]);
                infoIntent.putExtra("Approach2", approach2[i]);
                infoIntent.putExtra("Approach3", approach3[i]); */
                //เริ่มส่ง
                startActivity(infoIntent);
            }
        });



    } //end onCreate
} //end class
