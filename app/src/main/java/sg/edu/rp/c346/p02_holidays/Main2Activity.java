package sg.edu.rp.c346.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView lvHoliday;
    TextView tvType;
    TextView tvDate;
    ArrayAdapter holidayAdapter;
    ArrayList<Holidays> holidayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tvType = (TextView) findViewById(R.id.tvType);
        tvDate = findViewById(R.id.tvDate);
        lvHoliday = this.findViewById(R.id.lvHoliday);

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tvType.setText(type);

        holidayList = new ArrayList<Holidays>();
        if(type == "Secular"){
            holidayList.add(new Holidays("New Year's Day",false,"1 Jan 2017"));
            holidayList.add(new Holidays("Labour Day",true,"1 May 2017"));
        }
        else {
            holidayList.add(new Holidays("Chinese New Year",false,"28 -29 Jan 2017"));
            holidayList.add(new Holidays("Good Friday",true,"14 April 2017"));
        }

        holidayAdapter = new HolidayAdapter(this,R.layout.activity_main2,holidayList);
        lvHoliday.setAdapter(holidayAdapter);

        lvHoliday.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holidays selectedDay = holidayList.get(position);

                Toast.makeText(Main2Activity.this, selectedDay.getHoliday()
                                + "   Date: " + selectedDay.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
