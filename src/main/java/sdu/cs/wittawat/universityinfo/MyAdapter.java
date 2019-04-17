package sdu.cs.wittawat.universityinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyAdapter extends BaseAdapter {

    //explicit
    Context context;
    int[] ints; //เก็บโลโก้


    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    } //นำข้อมูลที่ได้จาก method getCount ไปแสดงผลขนหน้าแอป

    LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //ดึงค่าจากxmlมาแสดง

    View view1 = layoutInflater.inflate(R.layout.inlist, viewGroup, false);

    //ผูกตัวแปรjavaกับxml
    ImageView iconImageView = view1.findViewById(R.id.imageView);

}
