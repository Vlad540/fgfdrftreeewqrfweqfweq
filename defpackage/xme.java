package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: xme  reason: default package */
public final class xme {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final z29 b;
    public final mif c;
    public final FirebaseMessaging d;
    public final yr e = new kgd(0);
    public final ScheduledExecutorService f;
    public boolean g = false;
    public final vme h;

    /* JADX WARNING: type inference failed for: r0v0, types: [kgd, yr] */
    public xme(FirebaseMessaging firebaseMessaging, z29 z29, vme vme, mif mif, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = z29;
        this.h = vme;
        this.c = mif;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(n6g n6g) {
        try {
            gwf.b(n6g, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        }
    }

    public final void b(String str) {
        String a2 = this.d.a();
        mif mif = this.c;
        mif.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(mif.e(mif.n(a2, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a2 = this.d.a();
        mif mif = this.c;
        mif.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(mif.e(mif.n(a2, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3 = r0.b;
        r4 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r4 == 83) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r4 == 85) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (r3.equals("U") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        if (r3.equals("S") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0037, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        r4 = r0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        if (r3 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        if (r3 == 1) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        c(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0046, code lost:
        r1 = r6.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2 = r1.a;
        r3 = r0.c;
        r4 = (java.util.ArrayDeque) r2.X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0051, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005a, code lost:
        if (((java.util.ArrayDeque) r2.X).remove(r3) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005c, code lost:
        ((java.util.concurrent.Executor) r2.Y).execute(new pzb(12, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006c, code lost:
        r2 = r6.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0 = r0.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0077, code lost:
        if (r6.e.containsKey(r0) != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0079, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007d, code lost:
        r1 = (java.util.ArrayDeque) r6.e.get(r0);
        r3 = (defpackage.vde) r1.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008b, code lost:
        if (r3 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008d, code lost:
        r3.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (r1.isEmpty() == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0097, code lost:
        r6.e.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009c, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a0, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b1, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r6.getMessage()) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d0, code lost:
        if (r6.getMessage() != null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d3, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d4, code lost:
        r6.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d7, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r6 = this;
        L_0x0000:
            monitor-enter(r6)
            vme r0 = r6.h     // Catch:{ all -> 0x000c }
            ume r0 = r0.a()     // Catch:{ all -> 0x000c }
            r1 = 1
            if (r0 != 0) goto L_0x000f
            monitor-exit(r6)     // Catch:{ all -> 0x000c }
            return r1
        L_0x000c:
            r0 = move-exception
            goto L_0x00d8
        L_0x000f:
            monitor-exit(r6)     // Catch:{ all -> 0x000c }
            r2 = 0
            java.lang.String r3 = r0.b     // Catch:{ IOException -> 0x002a }
            int r4 = r3.hashCode()     // Catch:{ IOException -> 0x002a }
            r5 = 83
            if (r4 == r5) goto L_0x002d
            r5 = 85
            if (r4 == r5) goto L_0x0020
            goto L_0x0037
        L_0x0020:
            java.lang.String r4 = "U"
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x002a }
            if (r3 == 0) goto L_0x0037
            r3 = r1
            goto L_0x0038
        L_0x002a:
            r6 = move-exception
            goto L_0x00a7
        L_0x002d:
            java.lang.String r4 = "S"
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x002a }
            if (r3 == 0) goto L_0x0037
            r3 = r2
            goto L_0x0038
        L_0x0037:
            r3 = -1
        L_0x0038:
            java.lang.String r4 = r0.a
            if (r3 == 0) goto L_0x0043
            if (r3 == r1) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            r6.c(r4)     // Catch:{ IOException -> 0x002a }
            goto L_0x0046
        L_0x0043:
            r6.b(r4)     // Catch:{ IOException -> 0x002a }
        L_0x0046:
            vme r1 = r6.h
            monitor-enter(r1)
            bd4 r2 = r1.a     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = r0.c     // Catch:{ all -> 0x00a4 }
            java.lang.Object r4 = r2.X     // Catch:{ all -> 0x00a4 }
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch:{ all -> 0x00a4 }
            monitor-enter(r4)     // Catch:{ all -> 0x00a4 }
            java.lang.Object r5 = r2.X     // Catch:{ all -> 0x00a1 }
            java.util.ArrayDeque r5 = (java.util.ArrayDeque) r5     // Catch:{ all -> 0x00a1 }
            boolean r3 = r5.remove(r3)     // Catch:{ all -> 0x00a1 }
            if (r3 == 0) goto L_0x006a
            pzb r3 = new pzb     // Catch:{ all -> 0x00a1 }
            r5 = 12
            r3.<init>(r5, r2)     // Catch:{ all -> 0x00a1 }
            java.lang.Object r2 = r2.Y     // Catch:{ all -> 0x00a1 }
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch:{ all -> 0x00a1 }
            r2.execute(r3)     // Catch:{ all -> 0x00a1 }
        L_0x006a:
            monitor-exit(r4)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r1)
            yr r2 = r6.e
            monitor-enter(r2)
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x007b }
            yr r1 = r6.e     // Catch:{ all -> 0x007b }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x007b }
            if (r1 != 0) goto L_0x007d
            monitor-exit(r2)     // Catch:{ all -> 0x007b }
            goto L_0x0000
        L_0x007b:
            r6 = move-exception
            goto L_0x009f
        L_0x007d:
            yr r1 = r6.e     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x007b }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x007b }
            java.lang.Object r3 = r1.poll()     // Catch:{ all -> 0x007b }
            vde r3 = (defpackage.vde) r3     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x0091
            r4 = 0
            r3.b(r4)     // Catch:{ all -> 0x007b }
        L_0x0091:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x009c
            yr r1 = r6.e     // Catch:{ all -> 0x007b }
            r1.remove(r0)     // Catch:{ all -> 0x007b }
        L_0x009c:
            monitor-exit(r2)     // Catch:{ all -> 0x007b }
            goto L_0x0000
        L_0x009f:
            monitor-exit(r2)     // Catch:{ all -> 0x007b }
            throw r6
        L_0x00a1:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a1 }
            throw r6     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a4 }
            throw r6
        L_0x00a7:
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "TOO_MANY_SUBSCRIBERS"
            java.lang.String r1 = r6.getMessage()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cc
            goto L_0x00d4
        L_0x00cc:
            java.lang.String r0 = r6.getMessage()
            if (r0 != 0) goto L_0x00d3
            goto L_0x00d7
        L_0x00d3:
            throw r6
        L_0x00d4:
            r6.getMessage()
        L_0x00d7:
            return r2
        L_0x00d8:
            monitor-exit(r6)     // Catch:{ all -> 0x000c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xme.e():boolean");
    }

    public final void f(long j2) {
        this.f.schedule(new zme(this, this.a, this.b, Math.min(Math.max(30, 2 * j2), i)), j2, TimeUnit.SECONDS);
        d(true);
    }
}
