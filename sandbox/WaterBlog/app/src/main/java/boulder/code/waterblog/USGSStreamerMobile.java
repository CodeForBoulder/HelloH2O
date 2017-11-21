package boulder.code.waterblog;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by triterium on 11/20/2017.
 */
public class USGSStreamerMobile extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.usgs_streamer_webview, container, false);
        WebView wv = (WebView) view.findViewById(R.id.usgs_streamer_webview);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://txpub.usgs.gov/DSS/streamer/web/mobile.html");

        return view;
    }

}
