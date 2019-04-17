package sdu.cs.wittawat.universityinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class info1 extends AppCompatActivity {

    //explicit ตัวแปร
    String txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info1);

        //ผูกตัวแปร java-xml
        ImageView logoImageView = findViewById(R.id.imgInfo);
        TextView detailTextView = findViewById(R.id.textInfo);
        ImageButton button = findViewById(R.id.infoBt);

        //รับ intent มาแสดง
        logoImageView.setImageResource(getIntent().getIntExtra("Logo", R.drawable.logo1));
        detailTextView.setText(getIntent().getStringExtra("Detail"));

        //รับค่าจาก intent มาแปลงเป็น string เพื่อเอสไปแสดง
        txt1 = getIntent().getStringExtra("Approach1");
        txt2 = getIntent().getStringExtra("Approach2");
        txt3 = getIntent().getStringExtra("Approach3");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ส่งข้อมูลไปหน้าต่อไป
                Intent detailIntent = new Intent(info1.this, info2.class);
                //ส่งข้อมูล
                detailIntent.putExtra("Appro1", txt1);
                detailIntent.putExtra("Appro2", txt2);
                detailIntent.putExtra("Appro3", txt3);
                //เริ่มส่ง
                startActivity(detailIntent);

            } //onClick
        });


    } //onCreate

    public void backButton(View view) {
        finish();
    }
} //class
