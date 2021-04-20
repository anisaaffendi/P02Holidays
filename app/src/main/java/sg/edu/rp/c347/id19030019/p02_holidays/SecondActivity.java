package sg.edu.rp.c347.id19030019.p02_holidays;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvHols;

    ArrayList<Holiday> holidayArray;
    HolidayAdapter holidayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = findViewById(R.id.lvName);
        tvHols = findViewById(R.id.tvHolidayName);

        holidayArray = new ArrayList<>();
        holidayAdapter = new HolidayAdapter(this, R.layout.row2, holidayArray);
        lv.setAdapter(holidayAdapter);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        tvHols.setText(name);

        holidayArray.clear();
        if (name.equals("Secular")){
            holidayArray.add(new Holiday("New Year's Day", "1 Jan 2017", R.drawable.day1));
            holidayArray.add(new Holiday("Labour Day", "1 May 2017", R.drawable.day2));
        }

        holidayAdapter.notifyDataSetChanged();

    }
}
