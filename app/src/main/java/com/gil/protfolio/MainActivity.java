package com.gil.protfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onViewClicked(v.getId());
            }
        };

        findViewById(R.id.btn_build_it_bigger).setOnClickListener(clickListener);
        findViewById(R.id.btn_library_app).setOnClickListener(clickListener);
        findViewById(R.id.btn_my_own_app).setOnClickListener(clickListener);
        findViewById(R.id.btn_scores_app).setOnClickListener(clickListener);
        findViewById(R.id.btn_spotofy).setOnClickListener(clickListener);
        findViewById(R.id.btn_xyz_reader).setOnClickListener(clickListener);
    }

    private void onViewClicked(int id) {

        final int stringResourceID;

        switch (id) {
            case R.id.btn_build_it_bigger:
                stringResourceID = R.string.btn_build_it_bigger_txt;
                break;
            case R.id.btn_library_app:
                stringResourceID = R.string.btn_library_app_txt;
                break;
            case R.id.btn_my_own_app:
                stringResourceID = R.string.btn_my_app_txt;
                break;
            case R.id.btn_scores_app:
                stringResourceID = R.string.btn_scores_app_txt;
                break;
            case R.id.btn_spotofy:
                stringResourceID = R.string.btn_spotify_txt;
                break;
            case R.id.btn_xyz_reader:
                stringResourceID = R.string.btn_xyz_reader_txt;
                break;
            default:
                stringResourceID = 0;
        }

        if (stringResourceID != 0) {
            Toast.makeText(this,getString(R.string.mainpage_toast_msg_txt,getString(stringResourceID)),Toast.LENGTH_SHORT).show();
        }
    }
}
