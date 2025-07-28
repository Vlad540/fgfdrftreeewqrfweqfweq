package defpackage;

import java.util.concurrent.Callable;

/* renamed from: csd  reason: default package */
public final class csd implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pec b;
    public final /* synthetic */ dsd c;

    public /* synthetic */ csd(dsd dsd, pec pec, int i) {
        this.a = i;
        this.c = dsd;
        this.b = pec;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r7v1, types: [rqd] */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r13 = this;
            int r0 = r13.a
            switch(r0) {
                case 0: goto L_0x0108;
                case 1: goto L_0x0083;
                case 2: goto L_0x0044;
                default: goto L_0x0005;
            }
        L_0x0005:
            dsd r0 = r13.c
            aec r0 = r0.a
            pec r13 = r13.b
            r1 = 0
            android.database.Cursor r0 = r0.o(r13, r1)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0034 }
            int r3 = r0.getCount()     // Catch:{ all -> 0x0034 }
            r2.<init>(r3)     // Catch:{ all -> 0x0034 }
        L_0x0019:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0036
            r3 = 0
            boolean r4 = r0.isNull(r3)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x0028
            r3 = r1
            goto L_0x0030
        L_0x0028:
            long r3 = r0.getLong(r3)     // Catch:{ all -> 0x0034 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0034 }
        L_0x0030:
            r2.add(r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0019
        L_0x0034:
            r1 = move-exception
            goto L_0x003d
        L_0x0036:
            r0.close()
            r13.m()
            return r2
        L_0x003d:
            r0.close()
            r13.m()
            throw r1
        L_0x0044:
            dsd r0 = r13.c
            aec r0 = r0.a
            pec r13 = r13.b
            r1 = 0
            android.database.Cursor r0 = r0.o(r13, r1)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0073 }
            int r3 = r0.getCount()     // Catch:{ all -> 0x0073 }
            r2.<init>(r3)     // Catch:{ all -> 0x0073 }
        L_0x0058:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x0075
            r3 = 0
            boolean r4 = r0.isNull(r3)     // Catch:{ all -> 0x0073 }
            if (r4 == 0) goto L_0x0067
            r3 = r1
            goto L_0x006f
        L_0x0067:
            long r3 = r0.getLong(r3)     // Catch:{ all -> 0x0073 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0073 }
        L_0x006f:
            r2.add(r3)     // Catch:{ all -> 0x0073 }
            goto L_0x0058
        L_0x0073:
            r1 = move-exception
            goto L_0x007c
        L_0x0075:
            r0.close()
            r13.m()
            return r2
        L_0x007c:
            r0.close()
            r13.m()
            throw r1
        L_0x0083:
            dsd r0 = r13.c
            aec r0 = r0.a
            pec r13 = r13.b
            r1 = 0
            android.database.Cursor r0 = r0.o(r13, r1)
            java.lang.String r2 = "id"
            int r2 = defpackage.gp0.o(r0, r2)     // Catch:{ all -> 0x00f8 }
            java.lang.String r3 = "status"
            int r3 = defpackage.gp0.o(r0, r3)     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = "entry"
            int r4 = defpackage.gp0.o(r0, r4)     // Catch:{ all -> 0x00f8 }
            java.lang.String r5 = "isCritical"
            int r5 = defpackage.gp0.o(r0, r5)     // Catch:{ all -> 0x00f8 }
            boolean r6 = r0.moveToFirst()     // Catch:{ all -> 0x00f8 }
            if (r6 == 0) goto L_0x00fa
            long r9 = r0.getLong(r2)     // Catch:{ all -> 0x00f8 }
            int r2 = r0.getInt(r3)     // Catch:{ all -> 0x00f8 }
            r3 = 1
            if (r2 == 0) goto L_0x00d7
            r6 = 10
            if (r2 != r6) goto L_0x00be
            r2 = 2
            r8 = r2
            goto L_0x00d8
        L_0x00be:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00f8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = "No such value "
            r3.<init>(r4)     // Catch:{ all -> 0x00f8 }
            r3.append(r2)     // Catch:{ all -> 0x00f8 }
            java.lang.String r2 = " for LogEntryStatus"
            r3.append(r2)     // Catch:{ all -> 0x00f8 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00f8 }
            r1.<init>(r2)     // Catch:{ all -> 0x00f8 }
            throw r1     // Catch:{ all -> 0x00f8 }
        L_0x00d7:
            r8 = r3
        L_0x00d8:
            boolean r2 = r0.isNull(r4)     // Catch:{ all -> 0x00f8 }
            if (r2 == 0) goto L_0x00df
            goto L_0x00e3
        L_0x00df:
            byte[] r1 = r0.getBlob(r4)     // Catch:{ all -> 0x00f8 }
        L_0x00e3:
            ln7 r11 = defpackage.ksd.a(r1)     // Catch:{ all -> 0x00f8 }
            int r1 = r0.getInt(r5)     // Catch:{ all -> 0x00f8 }
            if (r1 == 0) goto L_0x00ef
            r12 = r3
            goto L_0x00f1
        L_0x00ef:
            r1 = 0
            r12 = r1
        L_0x00f1:
            rqd r1 = new rqd     // Catch:{ all -> 0x00f8 }
            r7 = r1
            r7.<init>(r8, r9, r11, r12)     // Catch:{ all -> 0x00f8 }
            goto L_0x00fa
        L_0x00f8:
            r1 = move-exception
            goto L_0x0101
        L_0x00fa:
            r0.close()
            r13.m()
            return r1
        L_0x0101:
            r0.close()
            r13.m()
            throw r1
        L_0x0108:
            dsd r0 = r13.c
            aec r0 = r0.a
            pec r13 = r13.b
            r1 = 0
            android.database.Cursor r0 = r0.o(r13, r1)
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x012c
            r2 = 0
            boolean r3 = r0.isNull(r2)     // Catch:{ all -> 0x012a }
            if (r3 == 0) goto L_0x0121
            goto L_0x012c
        L_0x0121:
            long r1 = r0.getLong(r2)     // Catch:{ all -> 0x012a }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x012a }
            goto L_0x012c
        L_0x012a:
            r1 = move-exception
            goto L_0x0133
        L_0x012c:
            r0.close()
            r13.m()
            return r1
        L_0x0133:
            r0.close()
            r13.m()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csd.call():java.lang.Object");
    }
}
