package king.com.my1service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import king.com.my1service.service.DaemonService;
import king.com.my1service.service.PlayerMusicService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startPlayMusicService();

        startDaemonService();

    }
    private void startPlayMusicService() {
        Intent intent = new Intent(MainActivity.this,PlayerMusicService.class);
        startService(intent);
    }

    private void startDaemonService() {
        Intent intent = new Intent(MainActivity.this, DaemonService.class);
        startService(intent);
    }


}
