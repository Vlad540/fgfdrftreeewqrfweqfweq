package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: kd4  reason: default package */
public final class kd4 implements usf, euf {
    public static final String B0 = a24.e0("DelayMetCommandHandler");
    public final nqd A0;
    public final ydc X;
    public final Object Y = new Object();
    public int Z = 0;
    public final Context a;
    public final int b;
    public final btf c;
    public final w7e o;
    public final qm w0;
    public final m30 x0;
    public PowerManager.WakeLock y0;
    public boolean z0 = false;

    public kd4(Context context, int i, w7e w7e, nqd nqd) {
        this.a = context;
        this.b = i;
        this.o = w7e;
        this.c = nqd.a;
        this.A0 = nqd;
        j8e j8e = w7e.X.j;
        duf duf = (duf) w7e.b;
        this.w0 = (qm) duf.a;
        this.x0 = (m30) duf.c;
        this.X = new ydc(j8e, this);
    }

    public static void b(kd4 kd4) {
        btf btf = kd4.c;
        String str = btf.a;
        int i = kd4.Z;
        String str2 = B0;
        if (i < 2) {
            kd4.Z = 2;
            a24 B = a24.B();
            B.t(str2, "Stopping work for WorkSpec " + str);
            Context context = kd4.a;
            Class<SystemAlarmService> cls = SystemAlarmService.class;
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_STOP_WORK");
            u33.d(intent, btf);
            w7e w7e = kd4.o;
            int i2 = kd4.b;
            fo foVar = new fo((Object) w7e, (Object) intent, i2, 4);
            m30 m30 = kd4.x0;
            m30.execute(foVar);
            if (w7e.o.d(btf.a)) {
                a24 B2 = a24.B();
                B2.t(str2, "WorkSpec " + str + " needs to be rescheduled");
                Intent intent2 = new Intent(context, cls);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                u33.d(intent2, btf);
                m30.execute(new fo((Object) w7e, (Object) intent2, i2, 4));
                return;
            }
            a24 B3 = a24.B();
            B3.t(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        a24 B4 = a24.B();
        B4.t(str2, "Already stopped work for " + str);
    }

    public final void a(List list) {
        this.w0.execute(new jd4(this, 0));
    }

    public final void c() {
        synchronized (this.Y) {
            try {
                this.X.H();
                this.o.c.a(this.c);
                PowerManager.WakeLock wakeLock = this.y0;
                if (wakeLock != null && wakeLock.isHeld()) {
                    a24 B = a24.B();
                    String str = B0;
                    B.t(str, "Releasing wakelock " + this.y0 + "for WorkSpec " + this.c);
                    this.y0.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str = this.c.a;
        this.y0 = lef.a(this.a, wn6.j(me4.n(str, " ("), this.b, ")"));
        String str2 = B0;
        a24.B().t(str2, "Acquiring wakelock " + this.y0 + "for WorkSpec " + str);
        this.y0.acquire();
        ztf l = this.o.X.c.y().l(str);
        if (l == null) {
            this.w0.execute(new jd4(this, 0));
            return;
        }
        boolean c2 = l.c();
        this.z0 = c2;
        if (!c2) {
            a24.B().t(str2, "No constraints for " + str);
            f(Collections.singletonList(l));
            return;
        }
        this.X.G(Collections.singletonList(l));
    }

    public final void e(boolean z) {
        a24 B = a24.B();
        StringBuilder sb = new StringBuilder("onExecuted ");
        btf btf = this.c;
        sb.append(btf);
        sb.append(", ");
        sb.append(z);
        B.t(B0, sb.toString());
        c();
        Class<SystemAlarmService> cls = SystemAlarmService.class;
        int i = this.b;
        w7e w7e = this.o;
        m30 m30 = this.x0;
        Context context = this.a;
        if (z) {
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_SCHEDULE_WORK");
            u33.d(intent, btf);
            m30.execute(new fo((Object) w7e, (Object) intent, i, 4));
        }
        if (this.z0) {
            Intent intent2 = new Intent(context, cls);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            m30.execute(new fo((Object) w7e, (Object) intent2, i, 4));
        }
    }

    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (vx3.o((ztf) it.next()).equals(this.c)) {
                this.w0.execute(new jd4(this, 1));
                return;
            }
        }
    }
}
