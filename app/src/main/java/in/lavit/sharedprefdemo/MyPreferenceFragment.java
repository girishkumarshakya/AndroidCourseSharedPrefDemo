package in.lavit.sharedprefdemo;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class MyPreferenceFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.my_pref,rootKey);
    }
}
