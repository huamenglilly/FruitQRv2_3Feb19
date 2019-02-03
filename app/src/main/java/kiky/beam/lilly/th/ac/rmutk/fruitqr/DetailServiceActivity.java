package kiky.beam.lilly.th.ac.rmutk.fruitqr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_service);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contentDetailServiceFragment, new DetailServiceFragment())
                .commit();

    }
}
