package sg.edu.rp.c346.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holidays> {

    private ArrayList<Holidays> holidays;
    private Context context;
    private ImageView ivHoliday;
    private TextView tvHoliday;
    private TextView tvDate;




    public HolidayAdapter(Context context, int resource, ArrayList<Holidays> objects) {
        super(context, resource, objects);
        holidays = objects;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvHoliday = rowView.findViewById(R.id.tvHoliday);
        ivHoliday = (ImageView) rowView.findViewById(R.id.imageView);
        tvDate = rowView.findViewById(R.id.tvDate);


        Holidays currentModule = holidays.get(position);
        tvHoliday.setText(currentModule.getHoliday());

        if (currentModule.isStar()){
            ivHoliday.setImageResource(R.drawable.cel);
        }
        else {
            ivHoliday.setImageResource(R.drawable.images);
        }
        return rowView;





    }

}
