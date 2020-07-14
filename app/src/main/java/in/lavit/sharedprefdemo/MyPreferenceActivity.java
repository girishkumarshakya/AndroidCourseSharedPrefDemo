package in.lavit.sharedprefdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MyPreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_preference);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contianer, new MyPreferenceFragment())
                .commit();
    }
}
