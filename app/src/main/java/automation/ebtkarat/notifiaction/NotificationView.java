package automation.ebtkarat.notifiaction;

import android.app.NotificationManager;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NotificationView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_view);
        NotificationManager nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.cancel(getIntent().getExtras().getInt("Notification"));
        if(getResources().getConfiguration().getLayoutDirection()== Configuration.ORIENTATION_LANDSCAPE){
           setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else{
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
            }
    }
}
