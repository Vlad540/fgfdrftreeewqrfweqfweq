package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: u33  reason: default package */
public final class u33 implements p15 {
    public static final String X = a24.e0("CommandHandler");
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final f2b o;

    public u33(Context context, f2b f2b) {
        this.a = context;
        this.o = f2b;
    }

    public static btf c(Intent intent) {
        return new btf(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, btf btf) {
        intent.putExtra("KEY_WORKSPEC_ID", btf.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", btf.b);
    }

    public final void a(Intent intent, int i, w7e w7e) {
        List<nqd> list;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            a24.B().t(X, "Handling constraints changed " + intent);
            kf3 kf3 = new kf3(this.a, i, w7e);
            ArrayList i2 = w7e.X.c.y().i();
            String str = te3.a;
            Iterator it = i2.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                if3 if3 = ((ztf) it.next()).j;
                z |= if3.d;
                z2 |= if3.b;
                z3 |= if3.e;
                z4 |= if3.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = kf3.a;
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ydc ydc = kf3.c;
            ydc.G(i2);
            ArrayList arrayList = new ArrayList(i2.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = i2.iterator();
            while (it2.hasNext()) {
                ztf ztf = (ztf) it2.next();
                String str3 = ztf.a;
                if (currentTimeMillis >= ztf.a() && (!ztf.c() || ydc.q(str3))) {
                    arrayList.add(ztf);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ztf ztf2 = (ztf) it3.next();
                String str4 = ztf2.a;
                btf o2 = vx3.o(ztf2);
                Intent intent3 = new Intent(context, SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, o2);
                a24.B().t(kf3.d, wn6.i("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((m30) ((duf) w7e.b).c).execute(new fo((Object) w7e, (Object) intent3, kf3.b, 4));
            }
            ydc.H();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            a24.B().t(X, "Handling reschedule " + intent + ", " + i);
            w7e.X.g();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                a24.B().x(X, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                btf c2 = c(intent);
                String str5 = X;
                a24.B().t(str5, "Handling schedule work for " + c2);
                WorkDatabase workDatabase = w7e.X.c;
                workDatabase.c();
                try {
                    ztf l = workDatabase.y().l(c2.a);
                    if (l == null) {
                        a24.B().k0(str5, "Skipping scheduling " + c2 + " because it's no longer in the DB");
                    } else if (l.b.a()) {
                        a24.B().k0(str5, "Skipping scheduling " + c2 + "because it is finished.");
                    } else {
                        long a2 = l.a();
                        boolean c3 = l.c();
                        Context context2 = this.a;
                        if (!c3) {
                            a24.B().t(str5, "Setting up Alarms for " + c2 + "at " + a2);
                            nc.b(context2, workDatabase, c2, a2);
                        } else {
                            a24.B().t(str5, "Opportunistically setting an alarm for " + c2 + "at " + a2);
                            nc.b(context2, workDatabase, c2, a2);
                            Intent intent4 = new Intent(context2, SystemAlarmService.class);
                            intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                            ((m30) ((duf) w7e.b).c).execute(new fo((Object) w7e, (Object) intent4, i, 4));
                        }
                        workDatabase.r();
                    }
                } finally {
                    workDatabase.l();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.c) {
                    try {
                        btf c4 = c(intent);
                        a24 B = a24.B();
                        String str6 = X;
                        B.t(str6, "Handing delay met for " + c4);
                        if (!this.b.containsKey(c4)) {
                            kd4 kd4 = new kd4(this.a, i, w7e, this.o.m(c4));
                            this.b.put(c4, kd4);
                            kd4.d();
                        } else {
                            a24.B().t(str6, "WorkSpec " + c4 + " is is already being handled for ACTION_DELAY_MET");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
                f2b f2b = this.o;
                if (containsKey) {
                    int i3 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    ArrayList arrayList2 = new ArrayList(1);
                    nqd k = f2b.k(new btf(string, i3));
                    list = arrayList2;
                    if (k != null) {
                        arrayList2.add(k);
                        list = arrayList2;
                    }
                } else {
                    list = f2b.l(string);
                }
                for (nqd nqd : list) {
                    a24.B().t(X, rf0.h("Handing stopWork work for ", string));
                    itf itf = w7e.X;
                    itf.d.c(new uyd(itf, nqd, false));
                    WorkDatabase workDatabase2 = w7e.X.c;
                    btf btf = nqd.a;
                    String str7 = nc.a;
                    j8e v = workDatabase2.v();
                    i8e r = v.r(btf);
                    if (r != null) {
                        nc.a(this.a, btf, r.c);
                        a24.B().t(nc.a, "Removing SystemIdInfo for workSpecId (" + btf + ")");
                        aec aec = (aec) v.a;
                        aec.b();
                        tdc tdc = (tdc) v.c;
                        yz5 f = tdc.f();
                        String str8 = btf.a;
                        if (str8 == null) {
                            f.W(1);
                        } else {
                            f.f(1, str8);
                        }
                        f.j(2, (long) btf.b);
                        aec.c();
                        try {
                            f.n();
                            aec.r();
                        } finally {
                            aec.l();
                            tdc.u(f);
                        }
                    }
                    w7e.b(nqd.a, false);
                }
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                btf c5 = c(intent);
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                a24.B().t(X, "Handling onExecutionCompleted " + intent + ", " + i);
                b(c5, z5);
            } else {
                a24.B().k0(X, "Ignoring intent " + intent);
            }
        }
    }

    public final void b(btf btf, boolean z) {
        synchronized (this.c) {
            try {
                kd4 kd4 = (kd4) this.b.remove(btf);
                this.o.k(btf);
                if (kd4 != null) {
                    kd4.e(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
