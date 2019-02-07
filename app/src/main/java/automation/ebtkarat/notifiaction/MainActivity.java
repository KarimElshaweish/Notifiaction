package automation.ebtkarat.notifiaction;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompatBase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

     private static final int NOTIFICATION_ID = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void ShowNotification(){
        Intent intent=new Intent(this,NotificationView.class);
        intent.putExtra("Notification",NOTIFICATION_ID);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,0);
        NotificationManager nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        NotificationCompat.Builder notifBuilder;
        notifBuilder=new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
        .setContentTitle("Meeting Reminder")
        .setContentText("Reminder : the meeting starts in 5 minutes");
    nm.notify(NOTIFICATION_ID,notifBuilder.build());
    }
}
