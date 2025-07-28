package defpackage;

import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* renamed from: p1g  reason: default package */
public final class p1g extends z59 {
    public final /* synthetic */ a b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1g(a aVar, Looper looper) {
        super(looper, 5);
        this.b = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r0 == 5) goto L_0x0036;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.a r0 = r9.b
            java.util.concurrent.atomic.AtomicInteger r0 = r0.K0
            int r0 = r0.get()
            int r1 = r10.arg1
            r2 = 7
            r3 = 1
            r4 = 2
            if (r0 == r1) goto L_0x0024
            int r9 = r10.what
            if (r9 == r4) goto L_0x0019
            if (r9 == r3) goto L_0x0019
            if (r9 != r2) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r9 = r10.obj
            v0g r9 = (defpackage.v0g) r9
            r9.getClass()
            r9.d()
            return
        L_0x0024:
            int r0 = r10.what
            r1 = 4
            r5 = 5
            if (r0 == r3) goto L_0x0036
            if (r0 == r2) goto L_0x0036
            if (r0 != r1) goto L_0x0034
            com.google.android.gms.common.internal.a r0 = r9.b
            r0.getClass()
            goto L_0x0036
        L_0x0034:
            if (r0 != r5) goto L_0x003e
        L_0x0036:
            com.google.android.gms.common.internal.a r0 = r9.b
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0148
        L_0x003e:
            int r0 = r10.what
            r6 = 0
            r7 = 8
            r8 = 3
            if (r0 != r1) goto L_0x0094
            com.google.android.gms.common.internal.a r0 = r9.b
            nd3 r1 = new nd3
            int r10 = r10.arg2
            r1.<init>(r10)
            r0.H0 = r1
            boolean r10 = r0.I0
            if (r10 == 0) goto L_0x0056
            goto L_0x007a
        L_0x0056:
            java.lang.String r10 = r0.p()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0061
            goto L_0x007a
        L_0x0061:
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 == 0) goto L_0x0068
            goto L_0x007a
        L_0x0068:
            java.lang.String r10 = r0.p()     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.Class.forName(r10)     // Catch:{ ClassNotFoundException -> 0x007a }
            com.google.android.gms.common.internal.a r10 = r9.b
            boolean r0 = r10.I0
            if (r0 == 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            r10.v(r8, r6)
            return
        L_0x007a:
            com.google.android.gms.common.internal.a r10 = r9.b
            nd3 r0 = r10.H0
            if (r0 == 0) goto L_0x0081
            goto L_0x0086
        L_0x0081:
            nd3 r0 = new nd3
            r0.<init>(r7)
        L_0x0086:
            mh0 r10 = r10.x0
            r10.w(r0)
            com.google.android.gms.common.internal.a r9 = r9.b
            r9.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x0094:
            if (r0 != r5) goto L_0x00b0
            com.google.android.gms.common.internal.a r10 = r9.b
            nd3 r0 = r10.H0
            if (r0 == 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            nd3 r0 = new nd3
            r0.<init>(r7)
        L_0x00a2:
            mh0 r10 = r10.x0
            r10.w(r0)
            com.google.android.gms.common.internal.a r9 = r9.b
            r9.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00b0:
            if (r0 != r8) goto L_0x00d2
            java.lang.Object r0 = r10.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00bb
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00bb:
            nd3 r0 = new nd3
            int r10 = r10.arg2
            r0.<init>(r10, r6)
            com.google.android.gms.common.internal.a r10 = r9.b
            mh0 r10 = r10.x0
            r10.w(r0)
            com.google.android.gms.common.internal.a r9 = r9.b
            r9.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00d2:
            r1 = 6
            if (r0 != r1) goto L_0x00f4
            com.google.android.gms.common.internal.a r0 = r9.b
            r0.v(r5, r6)
            com.google.android.gms.common.internal.a r0 = r9.b
            sbf r0 = r0.C0
            if (r0 == 0) goto L_0x00e9
            int r10 = r10.arg2
            java.lang.Object r0 = r0.a
            oa6 r0 = (defpackage.oa6) r0
            r0.R(r10)
        L_0x00e9:
            com.google.android.gms.common.internal.a r10 = r9.b
            r10.s()
            com.google.android.gms.common.internal.a r9 = r9.b
            com.google.android.gms.common.internal.a.u(r9, r5, r3, r6)
            return
        L_0x00f4:
            if (r0 != r4) goto L_0x010a
            com.google.android.gms.common.internal.a r9 = r9.b
            boolean r9 = r9.isConnected()
            if (r9 == 0) goto L_0x00ff
            goto L_0x010a
        L_0x00ff:
            java.lang.Object r9 = r10.obj
            v0g r9 = (defpackage.v0g) r9
            r9.getClass()
            r9.d()
            return
        L_0x010a:
            int r9 = r10.what
            if (r9 == r4) goto L_0x0124
            if (r9 == r3) goto L_0x0124
            if (r9 != r2) goto L_0x0113
            goto L_0x0124
        L_0x0113:
            java.lang.String r10 = "Don't know how to handle message: "
            java.lang.String r9 = wn6.h(r9, r10)
            java.lang.Exception r10 = new java.lang.Exception
            r10.<init>()
            java.lang.String r0 = "GmsClient"
            android.util.Log.wtf(r0, r9, r10)
            return
        L_0x0124:
            java.lang.Object r9 = r10.obj
            v0g r9 = (defpackage.v0g) r9
            monitor-enter(r9)
            java.lang.Object r10 = r9.a     // Catch:{ all -> 0x0133 }
            boolean r0 = r9.b     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0135
            r9.toString()     // Catch:{ all -> 0x0133 }
            goto L_0x0135
        L_0x0133:
            r10 = move-exception
            goto L_0x0146
        L_0x0135:
            monitor-exit(r9)     // Catch:{ all -> 0x0133 }
            if (r10 == 0) goto L_0x013b
            r9.a()
        L_0x013b:
            monitor-enter(r9)
            r9.b = r3     // Catch:{ all -> 0x0143 }
            monitor-exit(r9)     // Catch:{ all -> 0x0143 }
            r9.d()
            return
        L_0x0143:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0143 }
            throw r10
        L_0x0146:
            monitor-exit(r9)     // Catch:{ all -> 0x0133 }
            throw r10
        L_0x0148:
            java.lang.Object r9 = r10.obj
            v0g r9 = (defpackage.v0g) r9
            r9.getClass()
            r9.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1g.handleMessage(android.os.Message):void");
    }
}
