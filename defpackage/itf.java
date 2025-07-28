package defpackage;

import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: itf  reason: default package */
public final class itf extends ftf {
    public static itf k = null;
    public static itf l = null;
    public static final Object m = new Object();
    public final Context a;
    public final sa3 b;
    public final WorkDatabase c;
    public final bee d;
    public final List e;
    public final t4b f;
    public final lv1 g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final j8e j;

    static {
        a24.e0("WorkManagerImpl");
    }

    /* JADX WARNING: type inference failed for: r5v17, types: [j8e, java.lang.Object] */
    public itf(Context context, sa3 sa3, duf duf) {
        zdc zdc;
        boolean z = context.getResources().getBoolean(amb.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        qm qmVar = (qm) duf.a;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            zdc = new zdc(applicationContext, (String) null, cls);
            zdc.j = true;
        } else {
            zdc = ez3.w(applicationContext, "androidx.work.workdb", cls);
            zdc.i = new ep(applicationContext);
        }
        zdc.g = qmVar;
        zdc.d.add(cz2.b);
        zdc.a(y39.g);
        zdc.a(new cbc(2, 3, applicationContext));
        zdc.a(y39.h);
        zdc.a(y39.i);
        zdc.a(new cbc(5, 6, applicationContext));
        zdc.a(y39.j);
        zdc.a(y39.k);
        zdc.a(y39.l);
        zdc.a(new cbc(applicationContext));
        zdc.a(new cbc(10, 11, applicationContext));
        zdc.a(y39.d);
        zdc.a(y39.e);
        zdc.a(y39.f);
        zdc.l = false;
        zdc.m = true;
        WorkDatabase workDatabase = (WorkDatabase) zdc.b();
        Context applicationContext2 = context.getApplicationContext();
        int i2 = sa3.f;
        do7 do7 = new do7(0, (byte) 0);
        synchronized (a24.c) {
            a24.d = do7;
        }
        ek0 ek0 = new ek0(applicationContext2.getApplicationContext(), duf, 0);
        ek0 ek02 = new ek0(applicationContext2.getApplicationContext(), duf, 1);
        Context applicationContext3 = applicationContext2.getApplicationContext();
        String str = wh9.a;
        vh9 vh9 = new vh9(applicationContext3, duf);
        ek0 ek03 = new ek0(applicationContext2.getApplicationContext(), duf, 2);
        ? obj = new Object();
        obj.a = ek0;
        obj.b = ek02;
        obj.c = vh9;
        obj.o = ek03;
        this.j = obj;
        String str2 = dnc.a;
        rmc l8e = new l8e(applicationContext2, this);
        iia.a(applicationContext2, SystemJobService.class, true);
        a24.B().t(dnc.a, "Created SystemJobScheduler and enabled SystemJobService");
        List asList = Arrays.asList(new rmc[]{l8e, new qb6(applicationContext2, sa3, obj, this)});
        t4b t4b = new t4b(context, sa3, duf, workDatabase, asList);
        Context applicationContext4 = context.getApplicationContext();
        this.a = applicationContext4;
        this.b = sa3;
        this.d = duf;
        this.c = workDatabase;
        this.e = asList;
        this.f = t4b;
        this.g = new lv1(26, workDatabase);
        this.h = false;
        if (!htf.a(applicationContext4)) {
            this.d.c(new du5(applicationContext4, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static defpackage.itf d(android.content.Context r2) {
        /*
            java.lang.Object r0 = m
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0028 }
            itf r1 = k     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            goto L_0x000f
        L_0x000a:
            r2 = move-exception
            goto L_0x0034
        L_0x000c:
            itf r1 = l     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
        L_0x000f:
            if (r1 != 0) goto L_0x0032
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0028 }
            boolean r1 = r2 instanceof defpackage.qa3     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x002a
            r1 = r2
            qa3 r1 = (defpackage.qa3) r1     // Catch:{ all -> 0x0028 }
            sa3 r1 = r1.a()     // Catch:{ all -> 0x0028 }
            e(r2, r1)     // Catch:{ all -> 0x0028 }
            itf r1 = d(r2)     // Catch:{ all -> 0x0028 }
            goto L_0x0032
        L_0x0028:
            r2 = move-exception
            goto L_0x0036
        L_0x002a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0028 }
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r1
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itf.d(android.content.Context):itf");
    }

    public static void e(Context context, sa3 sa3) {
        synchronized (m) {
            try {
                itf itf = k;
                if (itf != null) {
                    if (l != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                }
                if (itf == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = new itf(applicationContext, sa3, new duf(sa3.b));
                    }
                    k = l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final aga b(String str, int i2, yma yma) {
        if (i2 == 3) {
            otf otf = new otf(25);
            ((qm) ((duf) this.d).a).execute(new co1(this, str, otf, new muf(yma, this, str, otf), yma));
            return otf;
        }
        return new wsf(this, str, i2 == 2 ? a35.b : a35.a, Collections.singletonList(yma)).m();
    }

    public final PendingIntent c(UUID uuid) {
        Context context = this.a;
        String uuid2 = uuid.toString();
        String str = b8e.y0;
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + uuid2));
        intent.putExtra("KEY_WORKSPEC_ID", uuid2);
        return PendingIntent.getService(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public final void f() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void g() {
        ArrayList b2;
        WorkDatabase workDatabase = this.c;
        Context context = this.a;
        String str = l8e.X;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (b2 = l8e.b(context, jobScheduler)) == null || b2.isEmpty())) {
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                l8e.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        buf y = workDatabase.y();
        aec aec = (aec) y.a;
        aec.b();
        rtf rtf = (rtf) y.l;
        yz5 f2 = rtf.f();
        aec.c();
        try {
            f2.n();
            aec.r();
            aec.l();
            rtf.u(f2);
            dnc.a(this.b, workDatabase, this.e);
        } catch (Throwable th) {
            aec.l();
            rtf.u(f2);
            throw th;
        }
    }

    public final void h(nqd nqd, w4g w4g) {
        bee bee = this.d;
        ue3 ue3 = new ue3(7);
        ue3.b = this;
        ue3.c = nqd;
        ue3.o = w4g;
        bee.c(ue3);
    }
}
