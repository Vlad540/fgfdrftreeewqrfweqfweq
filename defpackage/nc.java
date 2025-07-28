package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: nc  reason: default package */
public abstract class nc {
    public static final String a = a24.e0("Alarms");

    public static void a(Context context, btf btf, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = u33.X;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        u33.d(intent, btf);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service != null && alarmManager != null) {
            a24 B = a24.B();
            B.t(a, "Cancelling existing alarm with (workSpecId, systemId) (" + btf + ", " + i + ")");
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, WorkDatabase workDatabase, btf btf, long j) {
        j8e v = workDatabase.v();
        i8e r = v.r(btf);
        Class<SystemAlarmService> cls = SystemAlarmService.class;
        if (r != null) {
            int i = r.c;
            a(context, btf, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = u33.X;
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_DELAY_MET");
            u33.d(intent, btf);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                mc.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        int intValue = ((Number) workDatabase.p(new m5(6, new e3(workDatabase)))).intValue();
        v.s(new i8e(btf.a, btf.b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = u33.X;
        Intent intent2 = new Intent(context, cls);
        intent2.setAction("ACTION_DELAY_MET");
        u33.d(intent2, btf);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            mc.a(alarmManager2, 0, j, service2);
        }
    }
}
