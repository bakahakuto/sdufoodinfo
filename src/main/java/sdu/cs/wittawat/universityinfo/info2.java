package sdu.cs.wittawat.universityinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class info2 extends AppCompatActivity {

    //explicit
    TextView data1,data2, data3;
    String dv1,dv2,dv3,dv4,rp1,rp2,rp3, rp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);

        //เชื่อมxml
        data1 = findViewById(R.id.data1txt);
        data2 = findViewById(R.id.data2txt);
        data3 = findViewById(R.id.data3txt);

        //รับค่าจากintentมาแสดง
        data1.setText(getIntent().getStringExtra("Appro1"));
        data2.setText(getIntent().getStringExtra("Appro2"));
        data3.setText(getIntent().getStringExtra("Appro3"));




    } //onCreate

    public void backButton(View view) {
        finish();
    } // backButton
} // class
