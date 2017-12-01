package boulder.code.waterblog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by triterium on 11/20/2017.
 */
public class WatershedMobile extends WaterBlogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.usgs_streamer, container, false);

        WebView wv = (WebView) view.findViewById(R.id.usgs_streamer_webview);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://www.bouldercounty.org/environment/water/watershed-health/");

        return view;
    }

    @Override
    public String title() {
        return "Watershed";
    }
}
