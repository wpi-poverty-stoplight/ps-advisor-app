package org.fundacionparaguaya.adviserplatform.ui.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import com.instabug.library.InstabugTrackingDelegate;
import org.fundacionparaguaya.assistantadvisor.R;
import org.fundacionparaguaya.adviserplatform.util.Utilities;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        InstabugTrackingDelegate.notifyActivityGotTouchEvent(ev, this);
        return super.dispatchTouchEvent(ev);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //will show dialog prompting for update if not available
        Utilities.isGooglePlayServicesAvailable(this);
    }
}

