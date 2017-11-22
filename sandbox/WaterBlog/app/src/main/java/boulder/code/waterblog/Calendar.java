package boulder.code.waterblog;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by triterium on 11/20/2017.
 */
public class Calendar extends WaterBlogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calendar, container, false);

        CalendarView cv = (CalendarView) view.findViewById(R.id.calendarView);

        return view;
    }

    @Override
    public String title() {
        return "Calendar";
    }
}
