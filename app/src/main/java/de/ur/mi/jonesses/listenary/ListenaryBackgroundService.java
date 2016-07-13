package de.ur.mi.jonesses.listenary;

import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;

/**
 * Created by Jonas on 01.07.2016.
 */
public class ListenaryBackgroundService extends NotificationListenerService {

    @Override
    public void onCreate() {
        super.onCreate();
        registerListeners();
        establishDatabaseConnection();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void establishDatabaseConnection() {

    }

    private void registerListeners() {

    }
}
