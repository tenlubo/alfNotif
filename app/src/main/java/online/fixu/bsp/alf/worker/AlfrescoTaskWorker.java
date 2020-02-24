package online.fixu.bsp.alf.worker;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.WorkManager;

public class AlfrescoTaskWorker {

    private static final String TAG = AlfrescoTaskWorker.class.getSimpleName();

    private WorkManager mWorkManager;

    private NotificationManagerCompat mNotificationManagerCompat;


    public static AlfrescoTaskWorker getInstance(@NonNull Application application) {
        return new AlfrescoTaskWorker(application);
    }

    private AlfrescoTaskWorker(@NonNull Application application) {
        mWorkManager = WorkManager.getInstance(application);
        mNotificationManagerCompat = NotificationManagerCompat.from(
                application.getApplicationContext());

    }

    public void getTaskData() {



    }
}
