package homework.shanbay.levelreading.ui.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import homework.shanbay.levelreading.R;
import homework.shanbay.levelreading.ui.main.MainActivity;

/**
 * 欢迎页面
 */
public class SplashActivity extends Activity {

    private TextView tvName;
    private MyRunnable runnable;

    private final static long DELAYED_TIME = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //部分版本的android手机，release版本存在问题
        if (!this.isTaskRoot()) {
            Intent mainIntent = getIntent();
            String action = mainIntent.getAction();
            if (mainIntent.hasCategory(Intent.CATEGORY_LAUNCHER)
                    && action.equals(Intent.ACTION_MAIN)) {
                finish();
                return;
            }
        }

        setContentView(R.layout.activity_splash);

        runnable = new MyRunnable();
        tvName = (TextView) findViewById(R.id.tv_splash_app_name);
        tvName.postDelayed(runnable, DELAYED_TIME);
    }

    private class MyRunnable implements Runnable {
        @Override
        public void run() {
            action2NextActivity();
        }
    }

    private void action2NextActivity() {
        if (!isCanNext) return;
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private boolean isCanNext = true;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        isCanNext = false;
    }
}
