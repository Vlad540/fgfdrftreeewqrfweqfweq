package com.google.firebase.messaging;

import java.util.ArrayDeque;

public class FirebaseMessagingService extends zy4 {
    public static final ArrayDeque Z = new ArrayDeque(10);
    public zgc Y;

    /* JADX WARNING: type inference failed for: r8v1, types: [it4, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Intent r10) {
        /*
            r9 = this;
            r0 = 3
            r1 = 1
            r2 = 0
            java.lang.String r3 = r10.getAction()
            java.lang.String r4 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0030
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0018
            goto L_0x0030
        L_0x0018:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "token"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.e(r10)
            goto L_0x018e
        L_0x002b:
            r10.getAction()
            goto L_0x018e
        L_0x0030:
            java.lang.String r3 = "google.message_id"
            java.lang.String r4 = r10.getStringExtra(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r6 = "message_id"
            if (r5 == 0) goto L_0x003f
            goto L_0x0057
        L_0x003f:
            java.util.ArrayDeque r5 = Z
            boolean r7 = r5.contains(r4)
            if (r7 == 0) goto L_0x0049
            goto L_0x0122
        L_0x0049:
            int r7 = r5.size()
            r8 = 10
            if (r7 < r8) goto L_0x0054
            r5.remove()
        L_0x0054:
            r5.add(r4)
        L_0x0057:
            java.lang.String r4 = "message_type"
            java.lang.String r4 = r10.getStringExtra(r4)
            if (r4 != 0) goto L_0x0061
            java.lang.String r4 = "gcm"
        L_0x0061:
            r5 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case -2062414158: goto L_0x008b;
                case 102161: goto L_0x0080;
                case 814694033: goto L_0x0075;
                case 814800675: goto L_0x006a;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x0095
        L_0x006a:
            java.lang.String r7 = "send_event"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0073
            goto L_0x0095
        L_0x0073:
            r5 = r0
            goto L_0x0095
        L_0x0075:
            java.lang.String r7 = "send_error"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x007e
            goto L_0x0095
        L_0x007e:
            r5 = 2
            goto L_0x0095
        L_0x0080:
            java.lang.String r7 = "gcm"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            r5 = r1
            goto L_0x0095
        L_0x008b:
            java.lang.String r7 = "deleted_messages"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r5 = r2
        L_0x0095:
            switch(r5) {
                case 0: goto L_0x011f;
                case 1: goto L_0x00c0;
                case 2: goto L_0x009f;
                case 3: goto L_0x009a;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x0122
        L_0x009a:
            r10.getStringExtra(r3)
            goto L_0x0122
        L_0x009f:
            java.lang.String r4 = r10.getStringExtra(r3)
            if (r4 != 0) goto L_0x00a8
            r10.getStringExtra(r6)
        L_0x00a8:
            com.google.firebase.messaging.SendException r4 = new com.google.firebase.messaging.SendException
            java.lang.String r5 = "error"
            java.lang.String r5 = r10.getStringExtra(r5)
            r4.<init>(r5)
            if (r5 != 0) goto L_0x00b6
            goto L_0x0122
        L_0x00b6:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = r5.toLowerCase(r4)
            r4.getClass()
            goto L_0x0122
        L_0x00c0:
            defpackage.h2g.q(r10)
            android.os.Bundle r4 = r10.getExtras()
            if (r4 != 0) goto L_0x00ce
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x00ce:
            java.lang.String r5 = "androidx.content.wakelockid"
            r4.remove(r5)
            boolean r5 = wq3.q(r4)
            if (r5 == 0) goto L_0x0116
            wq3 r5 = new wq3
            r5.<init>(r4)
            zf9 r7 = new zf9
            java.lang.String r8 = "Firebase-Messaging-Network-Io"
            r7.<init>(r8, r2)
            java.util.concurrent.ExecutorService r7 = java.util.concurrent.Executors.newSingleThreadExecutor(r7)
            it4 r8 = new it4
            r8.<init>()
            r8.a = r7
            r8.b = r9
            r8.c = r5
            boolean r5 = r8.m()     // Catch:{ all -> 0x0111 }
            if (r5 == 0) goto L_0x00fe
            r7.shutdown()
            goto L_0x0122
        L_0x00fe:
            r7.shutdown()
            boolean r5 = defpackage.h2g.C(r10)
            if (r5 == 0) goto L_0x0116
            java.lang.String r5 = "_nf"
            android.os.Bundle r7 = r10.getExtras()
            defpackage.h2g.r(r5, r7)
            goto L_0x0116
        L_0x0111:
            r9 = move-exception
            r7.shutdown()
            throw r9
        L_0x0116:
            v8c r5 = new v8c
            r5.<init>(r4)
            r9.d(r5)
            goto L_0x0122
        L_0x011f:
            r9.c()
        L_0x0122:
            zgc r4 = r9.Y
            if (r4 != 0) goto L_0x0131
            zgc r4 = new zgc
            android.content.Context r5 = r9.getApplicationContext()
            r4.<init>(r5)
            r9.Y = r4
        L_0x0131:
            zgc r9 = r9.Y
            hw9 r4 = r9.c
            int r4 = r4.g()
            r5 = 233700000(0xdedfaa0, float:1.46665885E-30)
            if (r4 < r5) goto L_0x0184
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = r10.getStringExtra(r3)
            if (r5 != 0) goto L_0x014d
            java.lang.String r5 = r10.getStringExtra(r6)
        L_0x014d:
            r4.putString(r3, r5)
            java.lang.String r3 = "google.product_id"
            boolean r5 = r10.hasExtra(r3)
            if (r5 == 0) goto L_0x0161
            int r10 = r10.getIntExtra(r3, r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x0162
        L_0x0161:
            r10 = 0
        L_0x0162:
            if (r10 == 0) goto L_0x016b
            int r10 = r10.intValue()
            r4.putInt(r3, r10)
        L_0x016b:
            android.content.Context r9 = r9.b
            i6g r9 = defpackage.i6g.g(r9)
            v5g r10 = new v5g
            monitor-enter(r9)
            int r3 = r9.b     // Catch:{ all -> 0x0181 }
            int r1 = r1 + r3
            r9.b = r1     // Catch:{ all -> 0x0181 }
            monitor-exit(r9)
            r10.<init>(r3, r0, r4, r2)
            r9.h(r10)
            goto L_0x018e
        L_0x0181:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0181 }
            throw r10
        L_0x0184:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "SERVICE_NOT_AVAILABLE"
            r9.<init>(r10)
            defpackage.gwf.n(r9)
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }

    public void c() {
    }

    public void d(v8c v8c) {
    }

    public void e(String str) {
    }
}
