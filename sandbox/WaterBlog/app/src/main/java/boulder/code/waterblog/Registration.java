package boulder.code.waterblog;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by triterium on 11/20/2017.
 */
public class Registration extends WaterBlogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.registration, container, false);

        final EditText first_name = (EditText) view.findViewById(R.id.tv_first_name);
        final EditText email      = (EditText) view.findViewById(R.id.tv_email);

        final Button submit = (Button) view.findViewById(R.id.but_create_account);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_name.getText().toString().isEmpty()) {
                    first_name.setBackgroundColor(Color.RED);
                    Toast.makeText(v.getContext(), "Missing first name", Toast.LENGTH_SHORT).show();
                } else if(email.getText().toString().isEmpty()) {
                    email.setBackgroundColor(Color.RED);
                    Toast.makeText(v.getContext(), "Missing email address", Toast.LENGTH_SHORT).show();
                } else {
                    first_name.setBackgroundColor(Color.WHITE);
                    email.setBackgroundColor(Color.WHITE);
                    Toast.makeText(v.getContext(), String.format("Registering %s using %s", first_name.getText(), email.getText()), Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }

    @Override
    public String title() {
        return "Registration";
    }
}
