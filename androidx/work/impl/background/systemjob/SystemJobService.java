package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import java.util.HashMap;

public class SystemJobService extends JobService implements p15 {
    public static final String o = a24.e0("SystemJobService");
    public itf a;
    public final HashMap b = new HashMap();
    public final f2b c = new f2b(8);

    public static btf a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new btf(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final void b(btf btf, boolean z) {
        JobParameters jobParameters;
        a24 B = a24.B();
        String str = o;
        B.t(str, btf.a + " executed on JobScheduler");
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(btf);
        }
        this.c.k(btf);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public final void onCreate() {
        super.onCreate();
        try {
            itf d = itf.d(getApplicationContext());
            this.a = d;
            d.f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                a24.B().k0(o, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        itf itf = this.a;
        if (itf != null) {
            itf.f.e(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r0 = new defpackage.w4g(18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (defpackage.m8e.b(r8) == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r0.c = java.util.Arrays.asList(defpackage.m8e.b(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (defpackage.m8e.a(r8) == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        r0.b = java.util.Arrays.asList(defpackage.m8e.a(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        r0.o = defpackage.n8e.a(r8);
        r7.a.h(r7.c.m(r2), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStartJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            java.lang.String r0 = "onStartJob for "
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            itf r2 = r7.a
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0019
            a24 r0 = defpackage.a24.B()
            java.lang.String r1 = o
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            r0.t(r1, r2)
            r7.jobFinished(r8, r3)
            return r4
        L_0x0019:
            btf r2 = a(r8)
            if (r2 != 0) goto L_0x002b
            a24 r7 = defpackage.a24.B()
            java.lang.String r8 = o
            java.lang.String r0 = "WorkSpec id not found!"
            r7.x(r8, r0)
            return r4
        L_0x002b:
            java.util.HashMap r5 = r7.b
            monitor-enter(r5)
            java.util.HashMap r6 = r7.b     // Catch:{ all -> 0x004d }
            boolean r6 = r6.containsKey(r2)     // Catch:{ all -> 0x004d }
            if (r6 == 0) goto L_0x004f
            a24 r7 = defpackage.a24.B()     // Catch:{ all -> 0x004d }
            java.lang.String r8 = o     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r0.<init>(r1)     // Catch:{ all -> 0x004d }
            r0.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004d }
            r7.t(r8, r0)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            return r4
        L_0x004d:
            r7 = move-exception
            goto L_0x00a3
        L_0x004f:
            a24 r1 = defpackage.a24.B()     // Catch:{ all -> 0x004d }
            java.lang.String r4 = o     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r6.<init>(r0)     // Catch:{ all -> 0x004d }
            r6.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x004d }
            r1.t(r4, r0)     // Catch:{ all -> 0x004d }
            java.util.HashMap r0 = r7.b     // Catch:{ all -> 0x004d }
            r0.put(r2, r8)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            w4g r0 = new w4g
            r1 = 18
            r0.<init>((int) r1)
            android.net.Uri[] r1 = defpackage.m8e.b(r8)
            if (r1 == 0) goto L_0x0081
            android.net.Uri[] r1 = defpackage.m8e.b(r8)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.c = r1
        L_0x0081:
            java.lang.String[] r1 = defpackage.m8e.a(r8)
            if (r1 == 0) goto L_0x0091
            java.lang.String[] r1 = defpackage.m8e.a(r8)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.b = r1
        L_0x0091:
            android.net.Network r8 = defpackage.n8e.a(r8)
            r0.o = r8
            itf r8 = r7.a
            f2b r7 = r7.c
            nqd r7 = r7.m(r2)
            r8.h(r7, r0)
            return r3
        L_0x00a3:
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.a == null) {
            a24.B().t(o, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        btf a2 = a(jobParameters);
        if (a2 == null) {
            a24.B().x(o, "WorkSpec id not found!");
            return false;
        }
        a24 B = a24.B();
        String str = o;
        B.t(str, "onStopJob for " + a2);
        synchronized (this.b) {
            this.b.remove(a2);
        }
        nqd k = this.c.k(a2);
        if (k != null) {
            itf itf = this.a;
            itf.d.c(new uyd(itf, k, false));
        }
        t4b t4b = this.a.f;
        String str2 = a2.a;
        synchronized (t4b.A0) {
            contains = t4b.y0.contains(str2);
        }
        return !contains;
    }
}
