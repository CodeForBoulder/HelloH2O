package boulder.code.waterblog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

import java.util.Random;

/**
 * Created by triterium on 11/20/2017.
 */
public class WaterUsageGraph extends WaterBlogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.water_usage_graph, container, false);

        ((Button)view.findViewById(R.id.day)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set to single day
            }
        });

        ((Button)view.findViewById(R.id.week)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set to week
            }
        });

        ((Button)view.findViewById(R.id.month)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set to month
            }
        });

        final int cnt = 7;
        Random rand = new Random();
        DataPoint[] dps = new DataPoint[cnt];
        for(int i = 0; i < 7; ++i) {
            dps[i] = new DataPoint(i, rand.nextInt(500) + 500);
        }
        GraphView graph = (GraphView) view.findViewById(R.id.graph);
        BarGraphSeries<DataPoint> series = new BarGraphSeries<DataPoint>(dps);
        graph.addSeries(series);
        graph.getViewport().setMinY(0);
        graph.getViewport().setScrollable(true);
        graph.getViewport().setYAxisBoundsManual(true);

        return view;
    }

    @Override
    public String title() {
        return "Water Usage";
    }
}
