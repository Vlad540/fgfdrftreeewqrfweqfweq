package defpackage;

import android.os.Handler;

/* renamed from: ald  reason: default package */
public final class ald implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ald(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.gms.cloudmessaging.zzt, java.lang.Exception] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c2, code lost:
        r7 = r7.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cd, code lost:
        if (r7.getBoolean("unsupported", false) == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        r6.c(new java.lang.Exception("Not supported by GmsCore", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00db, code lost:
        r6.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x00e2;
                case 1: goto L_0x00a3;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r7.what
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 == r2) goto L_0x000f
            goto L_0x00a0
        L_0x000f:
            java.lang.Object r0 = r6.b
            c6g r0 = (defpackage.c6g) r0
            java.util.HashMap r0 = r0.a
            monitor-enter(r0)
            java.lang.Object r7 = r7.obj     // Catch:{ all -> 0x004c }
            k5g r7 = (defpackage.k5g) r7     // Catch:{ all -> 0x004c }
            java.lang.Object r6 = r6.b     // Catch:{ all -> 0x004c }
            c6g r6 = (defpackage.c6g) r6     // Catch:{ all -> 0x004c }
            java.util.HashMap r6 = r6.a     // Catch:{ all -> 0x004c }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x004c }
            l5g r6 = (defpackage.l5g) r6     // Catch:{ all -> 0x004c }
            if (r6 == 0) goto L_0x0051
            int r1 = r6.b     // Catch:{ all -> 0x004c }
            r3 = 3
            if (r1 != r3) goto L_0x0051
            java.lang.String.valueOf(r7)     // Catch:{ all -> 0x004c }
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x004c }
            r1.<init>()     // Catch:{ all -> 0x004c }
            android.content.ComponentName r1 = r6.Y     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x003d
            r7.getClass()     // Catch:{ all -> 0x004c }
            r1 = 0
        L_0x003d:
            if (r1 != 0) goto L_0x004e
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ all -> 0x004c }
            java.lang.String r7 = r7.b     // Catch:{ all -> 0x004c }
            defpackage.a24.o(r7)     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "unknown"
            r1.<init>(r7, r3)     // Catch:{ all -> 0x004c }
            goto L_0x004e
        L_0x004c:
            r6 = move-exception
            goto L_0x0054
        L_0x004e:
            r6.onServiceDisconnected(r1)     // Catch:{ all -> 0x004c }
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
        L_0x0052:
            r1 = r2
            goto L_0x00a0
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r6
        L_0x0056:
            java.lang.Object r0 = r6.b
            c6g r0 = (defpackage.c6g) r0
            java.util.HashMap r0 = r0.a
            monitor-enter(r0)
            java.lang.Object r7 = r7.obj     // Catch:{ all -> 0x009c }
            k5g r7 = (defpackage.k5g) r7     // Catch:{ all -> 0x009c }
            java.lang.Object r3 = r6.b     // Catch:{ all -> 0x009c }
            c6g r3 = (defpackage.c6g) r3     // Catch:{ all -> 0x009c }
            java.util.HashMap r3 = r3.a     // Catch:{ all -> 0x009c }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x009c }
            l5g r3 = (defpackage.l5g) r3     // Catch:{ all -> 0x009c }
            if (r3 == 0) goto L_0x009e
            java.util.HashMap r4 = r3.a     // Catch:{ all -> 0x009c }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x009e
            boolean r4 = r3.c     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0092
            k5g r4 = r3.X     // Catch:{ all -> 0x009c }
            c6g r5 = r3.Z     // Catch:{ all -> 0x009c }
            z59 r5 = r5.c     // Catch:{ all -> 0x009c }
            r5.removeMessages(r2, r4)     // Catch:{ all -> 0x009c }
            c6g r4 = r3.Z     // Catch:{ all -> 0x009c }
            nfc r5 = r4.d     // Catch:{ all -> 0x009c }
            android.content.Context r4 = r4.b     // Catch:{ all -> 0x009c }
            r5.r(r4, r3)     // Catch:{ all -> 0x009c }
            r3.c = r1     // Catch:{ all -> 0x009c }
            r1 = 2
            r3.b = r1     // Catch:{ all -> 0x009c }
        L_0x0092:
            java.lang.Object r6 = r6.b     // Catch:{ all -> 0x009c }
            c6g r6 = (defpackage.c6g) r6     // Catch:{ all -> 0x009c }
            java.util.HashMap r6 = r6.a     // Catch:{ all -> 0x009c }
            r6.remove(r7)     // Catch:{ all -> 0x009c }
            goto L_0x009e
        L_0x009c:
            r6 = move-exception
            goto L_0x00a1
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            goto L_0x0052
        L_0x00a0:
            return r1
        L_0x00a1:
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            throw r6
        L_0x00a3:
            int r0 = r7.arg1
            java.lang.Object r6 = r6.b
            r1 = r6
            o5g r1 = (defpackage.o5g) r1
            monitor-enter(r1)
            android.util.SparseArray r6 = r1.X     // Catch:{ all -> 0x00b7 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ all -> 0x00b7 }
            v5g r6 = (defpackage.v5g) r6     // Catch:{ all -> 0x00b7 }
            if (r6 != 0) goto L_0x00b9
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            goto L_0x00de
        L_0x00b7:
            r6 = move-exception
            goto L_0x00e0
        L_0x00b9:
            android.util.SparseArray r2 = r1.X     // Catch:{ all -> 0x00b7 }
            r2.remove(r0)     // Catch:{ all -> 0x00b7 }
            r1.c()     // Catch:{ all -> 0x00b7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            android.os.Bundle r7 = r7.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r7.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x00db
            java.lang.String r7 = "Not supported by GmsCore"
            com.google.android.gms.cloudmessaging.zzt r0 = new com.google.android.gms.cloudmessaging.zzt
            r1 = 0
            r0.<init>(r7, r1)
            r6.c(r0)
            goto L_0x00de
        L_0x00db:
            r6.a(r7)
        L_0x00de:
            r6 = 1
            return r6
        L_0x00e0:
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            throw r6
        L_0x00e2:
            int r0 = r7.what
            if (r0 == 0) goto L_0x00e8
            r6 = 0
            return r6
        L_0x00e8:
            java.lang.Object r6 = r6.b
            e3 r6 = (e3) r6
            java.lang.Object r7 = r7.obj
            defpackage.hr1.r(r7)
            java.lang.Object r6 = r6.a
            monitor-enter(r6)
            r7 = 0
            throw r7     // Catch:{ all -> 0x00f8 }
        L_0x00f6:
            monitor-exit(r6)     // Catch:{ all -> 0x00f8 }
            throw r7
        L_0x00f8:
            r7 = move-exception
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ald.handleMessage(android.os.Message):boolean");
    }
}
