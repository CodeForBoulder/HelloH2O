package boulder.code.waterblog;

import android.support.v4.app.Fragment;

/**
 * Created by triterium on 11/20/2017.
 */
public abstract class WaterBlogFragment extends Fragment {
    public abstract String title();

    // Allows the sub-views to control navigation
    protected OnNavigateListener mCallback;
    public interface OnNavigateListener {
        public void navigateTo(String key);
    }

    public void setOnNavigateListener(OnNavigateListener mCallback) {
        this.mCallback = mCallback;
    }

}
