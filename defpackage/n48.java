package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: n48  reason: default package */
public final class n48 implements ServiceConnection {
    public final Bundle a;
    public final /* synthetic */ o48 b;

    public n48(o48 o48, Bundle bundle) {
        this.b = o48;
        this.a = bundle;
    }

    public final void onBindingDied(ComponentName componentName) {
        r38 r38 = this.b.a;
        Objects.requireNonNull(r38);
        r38.G(new eq6(6, r38));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|(4:5|6|7|8)(3:10|11|(3:13|14|15)(2:16|17))|18|19|20|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        r6 = r0.a;
        java.util.Objects.requireNonNull(r6);
        r6.G(new eq6(6, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ac, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x007b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r6, android.os.IBinder r7) {
        /*
            r5 = this;
            o48 r0 = r5.b
            java.lang.String r1 = "Service "
            java.lang.String r2 = "Expected connection to "
            m3d r3 = r0.e     // Catch:{ RemoteException -> 0x007b }
            l3d r3 = r3.a     // Catch:{ RemoteException -> 0x007b }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ RemoteException -> 0x007b }
            java.lang.String r4 = r6.getPackageName()     // Catch:{ RemoteException -> 0x007b }
            boolean r3 = r3.equals(r4)     // Catch:{ RemoteException -> 0x007b }
            r38 r4 = r0.a
            if (r3 != 0) goto L_0x0048
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x007b }
            r5.<init>(r2)     // Catch:{ RemoteException -> 0x007b }
            m3d r7 = r0.e     // Catch:{ RemoteException -> 0x007b }
            l3d r7 = r7.a     // Catch:{ RemoteException -> 0x007b }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ RemoteException -> 0x007b }
            r5.append(r7)     // Catch:{ RemoteException -> 0x007b }
            java.lang.String r7 = " but is connected to "
            r5.append(r7)     // Catch:{ RemoteException -> 0x007b }
            r5.append(r6)     // Catch:{ RemoteException -> 0x007b }
            java.lang.String r5 = r5.toString()     // Catch:{ RemoteException -> 0x007b }
            defpackage.ez3.A(r5)     // Catch:{ RemoteException -> 0x007b }
            java.util.Objects.requireNonNull(r4)
            eq6 r5 = new eq6
            r6 = 6
            r5.<init>(r6, r4)
            r4.G(r5)
            return
        L_0x0046:
            r5 = move-exception
            goto L_0x009e
        L_0x0048:
            pn6 r7 = defpackage.ud8.k(r7)     // Catch:{ RemoteException -> 0x007b }
            if (r7 != 0) goto L_0x0060
            java.lang.String r5 = "Service interface is missing."
            defpackage.ez3.A(r5)     // Catch:{ RemoteException -> 0x007b }
            java.util.Objects.requireNonNull(r4)
            eq6 r5 = new eq6
            r6 = 6
            r5.<init>(r6, r4)
            r4.G(r5)
            return
        L_0x0060:
            md3 r2 = new md3     // Catch:{ RemoteException -> 0x007b }
            android.content.Context r3 = r0.d     // Catch:{ RemoteException -> 0x007b }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ RemoteException -> 0x007b }
            int r4 = android.os.Process.myPid()     // Catch:{ RemoteException -> 0x007b }
            android.os.Bundle r5 = r5.a     // Catch:{ RemoteException -> 0x007b }
            r2.<init>(r3, r4, r5)     // Catch:{ RemoteException -> 0x007b }
            z48 r5 = r0.c     // Catch:{ RemoteException -> 0x007b }
            android.os.Bundle r2 = r2.b()     // Catch:{ RemoteException -> 0x007b }
            r7.f0(r5, r2)     // Catch:{ RemoteException -> 0x007b }
            goto L_0x009d
        L_0x007b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r5.<init>(r1)     // Catch:{ all -> 0x0046 }
            r5.append(r6)     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = " has died prematurely"
            r5.append(r6)     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0046 }
            defpackage.ez3.j0(r5)     // Catch:{ all -> 0x0046 }
            r38 r5 = r0.a
            java.util.Objects.requireNonNull(r5)
            eq6 r6 = new eq6
            r7 = 6
            r6.<init>(r7, r5)
            r5.G(r6)
        L_0x009d:
            return
        L_0x009e:
            r38 r6 = r0.a
            java.util.Objects.requireNonNull(r6)
            eq6 r7 = new eq6
            r0 = 6
            r7.<init>(r0, r6)
            r6.G(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n48.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        r38 r38 = this.b.a;
        Objects.requireNonNull(r38);
        r38.G(new eq6(6, r38));
    }
}
