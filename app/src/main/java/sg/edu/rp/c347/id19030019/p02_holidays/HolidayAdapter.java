package sg.edu.rp.c347.id19030019.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private Context context;
    private TextView holidayName, holidayDate;
    private ArrayList<Holiday> alHols;
    private ImageView imageView;

    public HolidayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Holiday> objects){
        super(context, resource, objects);

        alHols = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row2, parent, false);

        Holiday currentHols = alHols.get(position);

        holidayName = rowView.findViewById(R.id.tvName);
        holidayDate = rowView.findViewById(R.id.tvDate);
        imageView = rowView.findViewById(R.id.ivHoliday);

        holidayName.setText(currentHols.getHolidayName());
        holidayDate.setText(currentHols.getHolidayDate());
        imageView.setImageResource(currentHols.getImageIcon());

        return rowView;
    }
}
