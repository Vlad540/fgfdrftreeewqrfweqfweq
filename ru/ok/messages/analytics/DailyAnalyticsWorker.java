package ru.ok.messages.analytics;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.PowerManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ok/messages/analytics/DailyAnalyticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lbd;", "analytics", "Lfp;", "appNotifications", "Led3;", "connectionInfo", "Ltf4;", "deviceInfo", "Lezd;", "storeServicesInfo", "Lmna;", "permissionStats", "Lt97;", "Lhz3;", "dataManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lbd;Lfp;Led3;Ltf4;Lezd;Lmna;Lt97;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class DailyAnalyticsWorker extends Worker {
    public static final p7c x0 = new p7c("\\s+");
    public final tf4 X;
    public final ezd Y;
    public final mna Z;
    public final bd b;
    public final fp c;
    public final ed3 o;
    public final t97 w0;

    public DailyAnalyticsWorker(Context context, WorkerParameters workerParameters, bd bdVar, fp fpVar, ed3 ed3, tf4 tf4, ezd ezd, mna mna, t97 t97) {
        super(context, workerParameters);
        this.b = bdVar;
        this.c = fpVar;
        this.o = ed3;
        this.X = tf4;
        this.Y = ezd;
        this.Z = mna;
        this.w0 = t97;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v12, types: [a07, java.lang.Object] */
    public final gh7 b() {
        UUID id = getId();
        udd.q("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + id + " started");
        mna mna = this.Z;
        mna.getClass();
        ht7 ht7 = new ht7();
        lg7 c2 = hwf.c();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            ht7 ht72 = new ht7();
            ht72.put("pType", "push");
            ht72.put("pStatus", mna.c(mna.d));
            c2.add(ht72.b());
        }
        ht7 ht73 = new ht7();
        ht73.put("pType", "contacts");
        ht73.put("pStatus", mna.c(mna.e));
        c2.add(ht73.b());
        ht7 ht74 = new ht7();
        ht74.put("pType", "gallery");
        pna pna = mna.f;
        ht74.put("pStatus", i < 34 ? mna.c(pna) : pna.h() ? "allowed" : mna.g.h() ? "partial" : "denied");
        c2.add(ht74.b());
        ht7 ht75 = new ht7();
        ht75.put("pType", "camera");
        ht75.put("pStatus", mna.c(mna.h));
        c2.add(ht75.b());
        ht7 ht76 = new ht7();
        ht76.put("pType", "microphone");
        ht76.put("pStatus", mna.c(mna.i));
        c2.add(ht76.b());
        ht7 ht77 = new ht7();
        ht77.put("pType", "geo");
        ht77.put("pStatus", mna.c(mna.j));
        c2.add(ht77.b());
        ht7.put("permissions", hwf.a(c2));
        mna.d("permission_status", ht7.b());
        String str = "0";
        String str2 = cp9.a(this.c.a().j(false).b) ? "1" : str;
        bd bdVar = this.b;
        bdVar.g("ACTION_ARE_NOTIFICATIONS_ENABLED", str2);
        yp2 c3 = ((hz3) this.w0.getValue()).b.c();
        c3.getClass();
        pec a = pec.a(0, "SELECT COUNT(*) FROM chats");
        aec aec = c3.a;
        aec.b();
        Cursor o2 = aec.o(a, (CancellationSignal) null);
        try {
            long j = o2.moveToFirst() ? o2.getLong(0) : 0;
            o2.close();
            a.m();
            String str3 = this.o.a() ? "1" : str;
            String valueOf = String.valueOf(j);
            if (!bdVar.a().c()) {
                ? obj = new Object();
                obj.c = "ACTION";
                obj.o = "ACTION_IS_BACKGROUND_DATA_ENABLED";
                obj.b(str3, "value");
                obj.b(valueOf, "param1");
                bdVar.j(obj.d());
            }
            tf4 tf4 = this.X;
            Context context = tf4.a;
            if (tf4.d == null) {
                tf4.d = (PowerManager) context.getSystemService("power");
            }
            boolean isIgnoringBatteryOptimizations = tf4.d.isIgnoringBatteryOptimizations(context.getPackageName());
            udd.q("rf4", "isIgnoringBatteryOptimizations: " + isIgnoringBatteryOptimizations);
            bdVar.g("ACTION_IS_IGNORING_BATTERY_OPTIMIZATIONS", isIgnoringBatteryOptimizations ? "1" : str);
            fb6 fb6 = (fb6) this.Y;
            String str4 = fb6.f;
            if (fb6.a()) {
                str = "1";
            }
            bdVar.g("ARE_SERVICES_AVAILABLE", x0.b("_", me4.i(str4, "-", str).toLowerCase(Locale.ENGLISH)));
            UUID id2 = getId();
            udd.q("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + id2 + " finished");
            return gh7.b();
        } catch (Throwable th) {
            o2.close();
            a.m();
            throw th;
        }
    }
}
