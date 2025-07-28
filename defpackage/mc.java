package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: mc  reason: default package */
public abstract class mc {
    public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }
}
