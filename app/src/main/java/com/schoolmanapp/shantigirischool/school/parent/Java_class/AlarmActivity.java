package com.schoolmanapp.shantigirischool.school.parent.Java_class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.schoolmanapp.shantigirischool.school.R;

public class AlarmActivity extends AppCompatActivity {

//    AlarmManager alarmManager;
//    private PendingIntent pendingIntent;
//    private TimePicker alarmTimePicker;
//    private static AlarmActivity inst;
//    private TextView alarmTextView;
//    Calendar calendar = null;
//
//    public static AlarmActivity instance() {
//        return inst;
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        inst = this;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
//        alarmTimePicker = (TimePicker) findViewById(R.id.alarmTimePicker);
//        alarmTextView = (TextView) findViewById(R.id.alarmText);

//    }
//
//    @TargetApi(Build.VERSION_CODES.M)
//    public void onToggleClicked(View view) {
//        if (((ToggleButton) view).isChecked()) {
//            Log.d("MainActivity", "Alarm On");
//
//            Intent myIntent = new Intent(AlarmActivity.this, AlarmReceiver.class);
//            pendingIntent = PendingIntent.getBroadcast(getBaseContext(), 0, myIntent, 0);
//
//            calendar = Calendar.getInstance();
//
//
//            calendar.set(Calendar.HOUR_OF_DAY, alarmTimePicker.getHour());
//            calendar.set(Calendar.MINUTE, alarmTimePicker.getMinute());
//
//
//            alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
//            alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
//                    AlarmManager.INTERVAL_DAY, pendingIntent);
//
//        } else {
//            alarmManager.cancel(pendingIntent);
//            setAlarmText("");
//            Log.d("MainActivity", "Alarm Off");
//        }
//    }
//
//    public void setAlarmText(String alarmText) {
//        alarmTextView.setText(alarmText);
//    }

    }
}