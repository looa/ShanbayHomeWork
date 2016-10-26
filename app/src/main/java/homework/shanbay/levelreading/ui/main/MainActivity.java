package homework.shanbay.levelreading.ui.main;

import android.app.Activity;
import android.os.Bundle;

import com.orhanobut.logger.Logger;

import homework.shanbay.levelreading.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.i(getClass().getSimpleName() + " is onCreate().");

    }
}
