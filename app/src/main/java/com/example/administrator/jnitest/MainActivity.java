package com.example.administrator.jnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup group;
    private int[] checkId = new int[]{
            R.id.rb_4800, R.id.rb_9600, R.id.rb_19200
    };
    private static final String NAME = "position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_showInfo = (TextView) findViewById(R.id.tv_showinfo);
        Jni jni = new Jni();
        tv_showInfo.setText(jni.getString());
        System.out.println(jni.getString());
        group = (RadioGroup) findViewById(R.id.rg);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
                radioButton.setChecked(true);
                Utils.putString(MainActivity.this, NAME, checkedId + "");
            }
        });
        int checkId = Integer.parseInt(Utils.getString(MainActivity.this, NAME, "1"));
        group.check(checkId);
    }
}
