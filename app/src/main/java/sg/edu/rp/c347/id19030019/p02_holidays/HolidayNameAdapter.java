package sg.edu.rp.c347.id19030019.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class HolidayNameAdapter extends ArrayAdapter {

    private Context context;
    private TextView name;
    private ArrayList<String> alName;

    public HolidayNameAdapter(@NonNull Context context, int resource, @NonNull ArrayList<String> objects){
        super(context, resource, objects);

        alName = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        String currentHols = alName.get(position);

        name = rowView.findViewById(R.id.tvHoliday);

        name.setText(currentHols);

        return rowView;
    }
}
