package homework.shanbay.levelreading;

import android.app.Application;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * Created by ran on 2016/10/26.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //debugger版本full log
        Logger.init().logLevel(LogLevel.FULL);
    }
}
