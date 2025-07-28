package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Debug;
import java.lang.Thread;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: au6  reason: default package */
public final class au6 implements Thread.UncaughtExceptionHandler {
    public final bf5 a;
    public final u16 b;
    public final SharedPreferences c;
    public final Thread.UncaughtExceptionHandler d = Thread.getDefaultUncaughtExceptionHandler();
    public final AtomicBoolean e = new AtomicBoolean();

    public au6(Context context, bf5 bf5, qq9 qq9) {
        this.a = bf5;
        this.b = qq9;
        this.c = context.getSharedPreferences("app_crash_prefs", 0);
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        mg5 mg5;
        this.c.edit().putLong("pref_last_crash_time", System.currentTimeMillis()).apply();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        u16 u16 = this.b;
        if (u16 != null && ((Boolean) u16.invoke(th)).booleanValue() && this.e.compareAndSet(false, true) && (mg5 = this.a) != null) {
            Debug.dumpHprofData(mg5.i(us8.j(new Date().getTime(), "oneme_heap_dump_-", ".hprof")).getAbsolutePath());
        }
    }
}
