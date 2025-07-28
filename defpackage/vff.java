package defpackage;

import java.util.concurrent.Callable;

/* renamed from: vff  reason: default package */
public final class vff implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pec b;
    public final /* synthetic */ xff c;

    public /* synthetic */ vff(xff xff, pec pec, int i) {
        this.a = i;
        this.c = xff;
        this.b = pec;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: ahf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: ahf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: ahf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: ahf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: ahf} */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x0035;
                default: goto L_0x0007;
            }
        L_0x0007:
            xff r1 = r0.c
            aec r1 = r1.a
            pec r2 = r0.b
            r0 = 0
            android.database.Cursor r1 = r1.o(r2, r0)
            boolean r3 = r1.moveToFirst()     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x0027
            r3 = 0
            boolean r4 = r1.isNull(r3)     // Catch:{ all -> 0x0025 }
            if (r4 == 0) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            java.lang.String r0 = r1.getString(r3)     // Catch:{ all -> 0x0025 }
            goto L_0x0027
        L_0x0025:
            r0 = move-exception
            goto L_0x002e
        L_0x0027:
            r1.close()
            r2.m()
            return r0
        L_0x002e:
            r1.close()
            r2.m()
            throw r0
        L_0x0035:
            xff r1 = r0.c
            aec r1 = r1.a
            pec r2 = r0.b
            r0 = 0
            android.database.Cursor r1 = r1.o(r2, r0)
            java.lang.String r3 = "id"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x00a3 }
            java.lang.String r4 = "user_id"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x00a3 }
            java.lang.String r5 = "bot_id"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = "token"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x00a3 }
            java.lang.String r7 = "access_requested"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x00a3 }
            java.lang.String r8 = "access_granted"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x00a3 }
            boolean r9 = r1.moveToFirst()     // Catch:{ all -> 0x00a3 }
            if (r9 == 0) goto L_0x00a5
            long r11 = r1.getLong(r3)     // Catch:{ all -> 0x00a3 }
            long r13 = r1.getLong(r4)     // Catch:{ all -> 0x00a3 }
            long r15 = r1.getLong(r5)     // Catch:{ all -> 0x00a3 }
            boolean r3 = r1.isNull(r6)     // Catch:{ all -> 0x00a3 }
            if (r3 == 0) goto L_0x007f
        L_0x007c:
            r17 = r0
            goto L_0x0084
        L_0x007f:
            java.lang.String r0 = r1.getString(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x007c
        L_0x0084:
            int r0 = r1.getInt(r7)     // Catch:{ all -> 0x00a3 }
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x008f
            r18 = r4
            goto L_0x0091
        L_0x008f:
            r18 = r3
        L_0x0091:
            int r0 = r1.getInt(r8)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009a
            r19 = r4
            goto L_0x009c
        L_0x009a:
            r19 = r3
        L_0x009c:
            ahf r0 = new ahf     // Catch:{ all -> 0x00a3 }
            r10 = r0
            r10.<init>(r11, r13, r15, r17, r18, r19)     // Catch:{ all -> 0x00a3 }
            goto L_0x00a5
        L_0x00a3:
            r0 = move-exception
            goto L_0x00ac
        L_0x00a5:
            r1.close()
            r2.m()
            return r0
        L_0x00ac:
            r1.close()
            r2.m()
            throw r0
        L_0x00b3:
            xff r1 = r0.c
            aec r1 = r1.a
            pec r2 = r0.b
            r0 = 0
            android.database.Cursor r1 = r1.o(r2, r0)
            java.lang.String r3 = "id"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x0135 }
            java.lang.String r4 = "user_id"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = "bot_id"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x0135 }
            java.lang.String r6 = "token"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x0135 }
            java.lang.String r7 = "access_requested"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x0135 }
            java.lang.String r8 = "access_granted"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x0135 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0135 }
            int r10 = r1.getCount()     // Catch:{ all -> 0x0135 }
            r9.<init>(r10)     // Catch:{ all -> 0x0135 }
        L_0x00eb:
            boolean r10 = r1.moveToNext()     // Catch:{ all -> 0x0135 }
            if (r10 == 0) goto L_0x0137
            long r12 = r1.getLong(r3)     // Catch:{ all -> 0x0135 }
            long r14 = r1.getLong(r4)     // Catch:{ all -> 0x0135 }
            long r16 = r1.getLong(r5)     // Catch:{ all -> 0x0135 }
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x0135 }
            if (r10 == 0) goto L_0x0106
            r18 = r0
            goto L_0x010c
        L_0x0106:
            java.lang.String r10 = r1.getString(r6)     // Catch:{ all -> 0x0135 }
            r18 = r10
        L_0x010c:
            int r10 = r1.getInt(r7)     // Catch:{ all -> 0x0135 }
            r11 = 0
            r19 = 1
            if (r10 == 0) goto L_0x0118
            r10 = r19
            goto L_0x0119
        L_0x0118:
            r10 = r11
        L_0x0119:
            int r20 = r1.getInt(r8)     // Catch:{ all -> 0x0135 }
            if (r20 == 0) goto L_0x0122
            r20 = r19
            goto L_0x0124
        L_0x0122:
            r20 = r11
        L_0x0124:
            ahf r11 = new ahf     // Catch:{ all -> 0x0135 }
            r21 = r11
            r11 = r21
            r19 = r10
            r11.<init>(r12, r14, r16, r18, r19, r20)     // Catch:{ all -> 0x0135 }
            r10 = r21
            r9.add(r10)     // Catch:{ all -> 0x0135 }
            goto L_0x00eb
        L_0x0135:
            r0 = move-exception
            goto L_0x013e
        L_0x0137:
            r1.close()
            r2.m()
            return r9
        L_0x013e:
            r1.close()
            r2.m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vff.call():java.lang.Object");
    }
}
