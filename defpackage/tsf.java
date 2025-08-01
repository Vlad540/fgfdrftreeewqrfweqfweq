package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: tsf  reason: default package */
public final class tsf implements ServiceConnection {
    public rsf X;
    public boolean Y = false;
    public final Context a;
    public final Intent b;
    public final ScheduledExecutorService c;
    public final ArrayDeque o = new ArrayDeque();

    public tsf(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new zf9("Firebase-FirebaseInstanceIdServiceConnection", 0));
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r1.s(r2, r2.getClass().getName(), r8.b, r8, 65, (java.util.concurrent.Executor) null) != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r8 = this;
            monitor-enter(r8)
        L_0x0001:
            java.util.ArrayDeque r0 = r8.o     // Catch:{ all -> 0x0021 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x0060
            rsf r0 = r8.X     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0023
            java.util.ArrayDeque r0 = r8.o     // Catch:{ all -> 0x0021 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0021 }
            ssf r0 = (defpackage.ssf) r0     // Catch:{ all -> 0x0021 }
            rsf r1 = r8.X     // Catch:{ all -> 0x0021 }
            r1.a(r0)     // Catch:{ all -> 0x0021 }
            goto L_0x0001
        L_0x0021:
            r0 = move-exception
            goto L_0x0062
        L_0x0023:
            boolean r0 = r8.Y     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0028
            goto L_0x005e
        L_0x0028:
            r0 = 1
            r8.Y = r0     // Catch:{ all -> 0x0021 }
            nfc r1 = defpackage.nfc.p()     // Catch:{ SecurityException -> 0x0046 }
            android.content.Context r2 = r8.a     // Catch:{ SecurityException -> 0x0046 }
            android.content.Intent r4 = r8.b     // Catch:{ SecurityException -> 0x0046 }
            java.lang.Class r0 = r2.getClass()     // Catch:{ SecurityException -> 0x0046 }
            java.lang.String r3 = r0.getName()     // Catch:{ SecurityException -> 0x0046 }
            r7 = 0
            r6 = 65
            r5 = r8
            boolean r0 = r1.s(r2, r3, r4, r5, r6, r7)     // Catch:{ SecurityException -> 0x0046 }
            if (r0 == 0) goto L_0x0046
            goto L_0x005e
        L_0x0046:
            r0 = 0
            r8.Y = r0     // Catch:{ all -> 0x0021 }
        L_0x0049:
            java.util.ArrayDeque r0 = r8.o     // Catch:{ all -> 0x0021 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x005e
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0021 }
            ssf r0 = (defpackage.ssf) r0     // Catch:{ all -> 0x0021 }
            vde r0 = r0.b     // Catch:{ all -> 0x0021 }
            r1 = 0
            r0.d(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0049
        L_0x005e:
            monitor-exit(r8)
            return
        L_0x0060:
            monitor-exit(r8)
            return
        L_0x0062:
            monitor-exit(r8)     // Catch:{ all -> 0x0021 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsf.a():void");
    }

    public final synchronized n6g b(Intent intent) {
        ssf ssf;
        ssf = new ssf(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        ssf.b.a.b(scheduledExecutorService, new xle(19, scheduledExecutorService.schedule(new pfe(16, ssf), 20, TimeUnit.SECONDS)));
        this.o.add(ssf);
        a();
        return ssf.b.a;
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.Y = false;
            if (!(iBinder instanceof rsf)) {
                Objects.toString(iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.o;
                    if (!arrayDeque.isEmpty()) {
                        ((ssf) arrayDeque.poll()).b.d((Object) null);
                    } else {
                        return;
                    }
                }
            } else {
                this.X = (rsf) iBinder;
                a();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
