package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: w7e  reason: default package */
public final class w7e implements p15 {
    public static final String y0 = a24.e0("SystemAlarmDispatcher");
    public final itf X;
    public final u33 Y;
    public final ArrayList Z = new ArrayList();
    public final Context a;
    public final bee b;
    public final guf c;
    public final t4b o;
    public Intent w0 = null;
    public v7e x0;

    public w7e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.Y = new u33(applicationContext, new f2b(8));
        itf d = itf.d(context);
        this.X = d;
        this.c = new guf(d.b.e);
        t4b t4b = d.f;
        this.o = t4b;
        this.b = d.d;
        t4b.a(this);
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i) {
        a24 B = a24.B();
        String str = y0;
        B.t(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            a24.B().k0(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.Z) {
                try {
                    Iterator it = this.Z.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.Z) {
            try {
                boolean z = !this.Z.isEmpty();
                this.Z.add(intent);
                if (!z) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(btf btf, boolean z) {
        String str = u33.X;
        Intent intent = new Intent(this.a, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        u33.d(intent, btf);
        ((m30) ((duf) this.b).c).execute(new fo((Object) this, (Object) intent, 0, 4));
    }

    public final void d() {
        c();
        PowerManager.WakeLock a2 = lef.a(this.a, "ProcessCommand");
        try {
            a2.acquire();
            this.X.d.c(new u7e(this, 0));
        } finally {
            a2.release();
        }
    }
}
