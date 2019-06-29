package com.schoolmanapp.shantigirischool.school.parent.Java_class;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.schoolmanapp.shantigirischool.school.R;

/**
 * Created by srishtiinnovative on 06/06/17.
 */

public class track_map extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_map);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(track_map.this, student_activity.class);
        startActivity(intent);
    }
}
