package defpackage;

import java.util.concurrent.Callable;

/* renamed from: z1c  reason: default package */
public final class z1c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pec b;
    public final /* synthetic */ b2c c;

    public /* synthetic */ z1c(b2c b2c, pec pec, int i) {
        this.a = i;
        this.c = b2c;
        this.b = pec;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [c2c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v5, types: [wu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.lang.Object, le4] */
    /* JADX WARNING: type inference failed for: r8v7, types: [c2c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v11, types: [wu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v9, types: [java.lang.Object, le4] */
    /* JADX WARNING: type inference failed for: r8v12, types: [c2c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v17, types: [wu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v14, types: [java.lang.Object, le4] */
    /* JADX WARNING: type inference failed for: r8v17, types: [c2c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v23, types: [wu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v19, types: [java.lang.Object, le4] */
    /* JADX WARNING: type inference failed for: r14v0, types: [c2c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v3, types: [wu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v25, types: [java.lang.Object, le4] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0278 A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0279 A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0350 A[Catch:{ all -> 0x02f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0351 A[Catch:{ all -> 0x02f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0428 A[Catch:{ all -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0429 A[Catch:{ all -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0 A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2 A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a0 A[Catch:{ all -> 0x0145 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a1 A[Catch:{ all -> 0x0145 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x037a;
                case 1: goto L_0x02a2;
                case 2: goto L_0x01ca;
                case 3: goto L_0x00f2;
                default: goto L_0x0007;
            }
        L_0x0007:
            b2c r1 = r0.c
            aec r1 = r1.a
            pec r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "id"
            int r0 = defpackage.gp0.o(r1, r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = "recent_type"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = "recent_time"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r6 = "sticker_id"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = "emoji"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r8 = "gif"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x0063 }
            java.lang.String r9 = "gif_id"
            int r9 = defpackage.gp0.o(r1, r9)     // Catch:{ all -> 0x0063 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0063 }
            int r11 = r1.getCount()     // Catch:{ all -> 0x0063 }
            r10.<init>(r11)     // Catch:{ all -> 0x0063 }
        L_0x004b:
            boolean r11 = r1.moveToNext()     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x00ea
            boolean r11 = r1.isNull(r6)     // Catch:{ all -> 0x0063 }
            if (r11 != 0) goto L_0x0066
            le4 r11 = new le4     // Catch:{ all -> 0x0063 }
            r11.<init>()     // Catch:{ all -> 0x0063 }
            long r12 = r1.getLong(r6)     // Catch:{ all -> 0x0063 }
            r11.a = r12     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r0 = move-exception
            goto L_0x00ee
        L_0x0066:
            r11 = r2
        L_0x0067:
            boolean r12 = r1.isNull(r7)     // Catch:{ all -> 0x0063 }
            if (r12 != 0) goto L_0x0082
            wu4 r12 = new wu4     // Catch:{ all -> 0x0063 }
            r12.<init>()     // Catch:{ all -> 0x0063 }
            boolean r13 = r1.isNull(r7)     // Catch:{ all -> 0x0063 }
            if (r13 == 0) goto L_0x007b
            r12.a = r2     // Catch:{ all -> 0x0063 }
            goto L_0x0083
        L_0x007b:
            java.lang.String r13 = r1.getString(r7)     // Catch:{ all -> 0x0063 }
            r12.a = r13     // Catch:{ all -> 0x0063 }
            goto L_0x0083
        L_0x0082:
            r12 = r2
        L_0x0083:
            boolean r13 = r1.isNull(r8)     // Catch:{ all -> 0x0063 }
            if (r13 == 0) goto L_0x0092
            boolean r13 = r1.isNull(r9)     // Catch:{ all -> 0x0063 }
            if (r13 != 0) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            r13 = r2
            goto L_0x00ad
        L_0x0092:
            xw2 r13 = new xw2     // Catch:{ all -> 0x0063 }
            r14 = 6
            r13.<init>(r14)     // Catch:{ all -> 0x0063 }
            boolean r14 = r1.isNull(r8)     // Catch:{ all -> 0x0063 }
            if (r14 == 0) goto L_0x00a1
            r13.c = r2     // Catch:{ all -> 0x0063 }
            goto L_0x00a7
        L_0x00a1:
            byte[] r14 = r1.getBlob(r8)     // Catch:{ all -> 0x0063 }
            r13.c = r14     // Catch:{ all -> 0x0063 }
        L_0x00a7:
            long r14 = r1.getLong(r9)     // Catch:{ all -> 0x0063 }
            r13.b = r14     // Catch:{ all -> 0x0063 }
        L_0x00ad:
            c2c r14 = new c2c     // Catch:{ all -> 0x0063 }
            r14.<init>()     // Catch:{ all -> 0x0063 }
            r15 = r3
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x0063 }
            r14.a = r2     // Catch:{ all -> 0x0063 }
            r2 = r15
            boolean r3 = r1.isNull(r2)     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x00c2
            r3 = 0
            goto L_0x00ca
        L_0x00c2:
            int r3 = r1.getInt(r2)     // Catch:{ all -> 0x0063 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0063 }
        L_0x00ca:
            r2c r3 = lp.L(r3)     // Catch:{ all -> 0x0063 }
            r14.b = r3     // Catch:{ all -> 0x0063 }
            r15 = r2
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x0063 }
            r14.c = r2     // Catch:{ all -> 0x0063 }
            long r2 = r1.getLong(r5)     // Catch:{ all -> 0x0063 }
            r14.d = r2     // Catch:{ all -> 0x0063 }
            r14.e = r11     // Catch:{ all -> 0x0063 }
            r14.f = r12     // Catch:{ all -> 0x0063 }
            r14.g = r13     // Catch:{ all -> 0x0063 }
            r10.add(r14)     // Catch:{ all -> 0x0063 }
            r3 = r15
            r2 = 0
            goto L_0x004b
        L_0x00ea:
            r1.close()
            return r10
        L_0x00ee:
            r1.close()
            throw r0
        L_0x00f2:
            b2c r1 = r0.c
            aec r1 = r1.a
            pec r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "id"
            int r0 = defpackage.gp0.o(r1, r0)     // Catch:{ all -> 0x0145 }
            java.lang.String r3 = "recent_type"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x0145 }
            java.lang.String r4 = "recent_time"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x0145 }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x0145 }
            java.lang.String r6 = "sticker_id"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x0145 }
            java.lang.String r7 = "emoji"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x0145 }
            java.lang.String r8 = "gif"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = "gif_id"
            int r9 = defpackage.gp0.o(r1, r9)     // Catch:{ all -> 0x0145 }
            boolean r10 = r1.moveToFirst()     // Catch:{ all -> 0x0145 }
            if (r10 == 0) goto L_0x01c2
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x0145 }
            if (r10 != 0) goto L_0x0148
            le4 r10 = new le4     // Catch:{ all -> 0x0145 }
            r10.<init>()     // Catch:{ all -> 0x0145 }
            long r11 = r1.getLong(r6)     // Catch:{ all -> 0x0145 }
            r10.a = r11     // Catch:{ all -> 0x0145 }
            goto L_0x0149
        L_0x0145:
            r0 = move-exception
            goto L_0x01c6
        L_0x0148:
            r10 = r2
        L_0x0149:
            boolean r6 = r1.isNull(r7)     // Catch:{ all -> 0x0145 }
            if (r6 != 0) goto L_0x0164
            wu4 r6 = new wu4     // Catch:{ all -> 0x0145 }
            r6.<init>()     // Catch:{ all -> 0x0145 }
            boolean r11 = r1.isNull(r7)     // Catch:{ all -> 0x0145 }
            if (r11 == 0) goto L_0x015d
            r6.a = r2     // Catch:{ all -> 0x0145 }
            goto L_0x0165
        L_0x015d:
            java.lang.String r7 = r1.getString(r7)     // Catch:{ all -> 0x0145 }
            r6.a = r7     // Catch:{ all -> 0x0145 }
            goto L_0x0165
        L_0x0164:
            r6 = r2
        L_0x0165:
            boolean r7 = r1.isNull(r8)     // Catch:{ all -> 0x0145 }
            if (r7 == 0) goto L_0x0174
            boolean r7 = r1.isNull(r9)     // Catch:{ all -> 0x0145 }
            if (r7 != 0) goto L_0x0172
            goto L_0x0174
        L_0x0172:
            r7 = r2
            goto L_0x018f
        L_0x0174:
            xw2 r7 = new xw2     // Catch:{ all -> 0x0145 }
            r11 = 6
            r7.<init>(r11)     // Catch:{ all -> 0x0145 }
            boolean r11 = r1.isNull(r8)     // Catch:{ all -> 0x0145 }
            if (r11 == 0) goto L_0x0183
            r7.c = r2     // Catch:{ all -> 0x0145 }
            goto L_0x0189
        L_0x0183:
            byte[] r8 = r1.getBlob(r8)     // Catch:{ all -> 0x0145 }
            r7.c = r8     // Catch:{ all -> 0x0145 }
        L_0x0189:
            long r8 = r1.getLong(r9)     // Catch:{ all -> 0x0145 }
            r7.b = r8     // Catch:{ all -> 0x0145 }
        L_0x018f:
            c2c r8 = new c2c     // Catch:{ all -> 0x0145 }
            r8.<init>()     // Catch:{ all -> 0x0145 }
            long r11 = r1.getLong(r0)     // Catch:{ all -> 0x0145 }
            r8.a = r11     // Catch:{ all -> 0x0145 }
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x01a1
            goto L_0x01a9
        L_0x01a1:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x0145 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0145 }
        L_0x01a9:
            r2c r0 = lp.L(r2)     // Catch:{ all -> 0x0145 }
            r8.b = r0     // Catch:{ all -> 0x0145 }
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x0145 }
            r8.c = r2     // Catch:{ all -> 0x0145 }
            long r2 = r1.getLong(r5)     // Catch:{ all -> 0x0145 }
            r8.d = r2     // Catch:{ all -> 0x0145 }
            r8.e = r10     // Catch:{ all -> 0x0145 }
            r8.f = r6     // Catch:{ all -> 0x0145 }
            r8.g = r7     // Catch:{ all -> 0x0145 }
            r2 = r8
        L_0x01c2:
            r1.close()
            return r2
        L_0x01c6:
            r1.close()
            throw r0
        L_0x01ca:
            b2c r1 = r0.c
            aec r1 = r1.a
            pec r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "id"
            int r0 = defpackage.gp0.o(r1, r0)     // Catch:{ all -> 0x021d }
            java.lang.String r3 = "recent_type"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x021d }
            java.lang.String r4 = "recent_time"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x021d }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x021d }
            java.lang.String r6 = "sticker_id"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x021d }
            java.lang.String r7 = "emoji"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x021d }
            java.lang.String r8 = "gif"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x021d }
            java.lang.String r9 = "gif_id"
            int r9 = defpackage.gp0.o(r1, r9)     // Catch:{ all -> 0x021d }
            boolean r10 = r1.moveToFirst()     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x029a
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x021d }
            if (r10 != 0) goto L_0x0220
            le4 r10 = new le4     // Catch:{ all -> 0x021d }
            r10.<init>()     // Catch:{ all -> 0x021d }
            long r11 = r1.getLong(r6)     // Catch:{ all -> 0x021d }
            r10.a = r11     // Catch:{ all -> 0x021d }
            goto L_0x0221
        L_0x021d:
            r0 = move-exception
            goto L_0x029e
        L_0x0220:
            r10 = r2
        L_0x0221:
            boolean r6 = r1.isNull(r7)     // Catch:{ all -> 0x021d }
            if (r6 != 0) goto L_0x023c
            wu4 r6 = new wu4     // Catch:{ all -> 0x021d }
            r6.<init>()     // Catch:{ all -> 0x021d }
            boolean r11 = r1.isNull(r7)     // Catch:{ all -> 0x021d }
            if (r11 == 0) goto L_0x0235
            r6.a = r2     // Catch:{ all -> 0x021d }
            goto L_0x023d
        L_0x0235:
            java.lang.String r7 = r1.getString(r7)     // Catch:{ all -> 0x021d }
            r6.a = r7     // Catch:{ all -> 0x021d }
            goto L_0x023d
        L_0x023c:
            r6 = r2
        L_0x023d:
            boolean r7 = r1.isNull(r8)     // Catch:{ all -> 0x021d }
            if (r7 == 0) goto L_0x024c
            boolean r7 = r1.isNull(r9)     // Catch:{ all -> 0x021d }
            if (r7 != 0) goto L_0x024a
            goto L_0x024c
        L_0x024a:
            r7 = r2
            goto L_0x0267
        L_0x024c:
            xw2 r7 = new xw2     // Catch:{ all -> 0x021d }
            r11 = 6
            r7.<init>(r11)     // Catch:{ all -> 0x021d }
            boolean r11 = r1.isNull(r8)     // Catch:{ all -> 0x021d }
            if (r11 == 0) goto L_0x025b
            r7.c = r2     // Catch:{ all -> 0x021d }
            goto L_0x0261
        L_0x025b:
            byte[] r8 = r1.getBlob(r8)     // Catch:{ all -> 0x021d }
            r7.c = r8     // Catch:{ all -> 0x021d }
        L_0x0261:
            long r8 = r1.getLong(r9)     // Catch:{ all -> 0x021d }
            r7.b = r8     // Catch:{ all -> 0x021d }
        L_0x0267:
            c2c r8 = new c2c     // Catch:{ all -> 0x021d }
            r8.<init>()     // Catch:{ all -> 0x021d }
            long r11 = r1.getLong(r0)     // Catch:{ all -> 0x021d }
            r8.a = r11     // Catch:{ all -> 0x021d }
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x0279
            goto L_0x0281
        L_0x0279:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x021d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021d }
        L_0x0281:
            r2c r0 = lp.L(r2)     // Catch:{ all -> 0x021d }
            r8.b = r0     // Catch:{ all -> 0x021d }
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x021d }
            r8.c = r2     // Catch:{ all -> 0x021d }
            long r2 = r1.getLong(r5)     // Catch:{ all -> 0x021d }
            r8.d = r2     // Catch:{ all -> 0x021d }
            r8.e = r10     // Catch:{ all -> 0x021d }
            r8.f = r6     // Catch:{ all -> 0x021d }
            r8.g = r7     // Catch:{ all -> 0x021d }
            r2 = r8
        L_0x029a:
            r1.close()
            return r2
        L_0x029e:
            r1.close()
            throw r0
        L_0x02a2:
            b2c r1 = r0.c
            aec r1 = r1.a
            pec r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "id"
            int r0 = defpackage.gp0.o(r1, r0)     // Catch:{ all -> 0x02f5 }
            java.lang.String r3 = "recent_type"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x02f5 }
            java.lang.String r4 = "recent_time"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x02f5 }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x02f5 }
            java.lang.String r6 = "sticker_id"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x02f5 }
            java.lang.String r7 = "emoji"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x02f5 }
            java.lang.String r8 = "gif"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x02f5 }
            java.lang.String r9 = "gif_id"
            int r9 = defpackage.gp0.o(r1, r9)     // Catch:{ all -> 0x02f5 }
            boolean r10 = r1.moveToFirst()     // Catch:{ all -> 0x02f5 }
            if (r10 == 0) goto L_0x0372
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x02f5 }
            if (r10 != 0) goto L_0x02f8
            le4 r10 = new le4     // Catch:{ all -> 0x02f5 }
            r10.<init>()     // Catch:{ all -> 0x02f5 }
            long r11 = r1.getLong(r6)     // Catch:{ all -> 0x02f5 }
            r10.a = r11     // Catch:{ all -> 0x02f5 }
            goto L_0x02f9
        L_0x02f5:
            r0 = move-exception
            goto L_0x0376
        L_0x02f8:
            r10 = r2
        L_0x02f9:
            boolean r6 = r1.isNull(r7)     // Catch:{ all -> 0x02f5 }
            if (r6 != 0) goto L_0x0314
            wu4 r6 = new wu4     // Catch:{ all -> 0x02f5 }
            r6.<init>()     // Catch:{ all -> 0x02f5 }
            boolean r11 = r1.isNull(r7)     // Catch:{ all -> 0x02f5 }
            if (r11 == 0) goto L_0x030d
            r6.a = r2     // Catch:{ all -> 0x02f5 }
            goto L_0x0315
        L_0x030d:
            java.lang.String r7 = r1.getString(r7)     // Catch:{ all -> 0x02f5 }
            r6.a = r7     // Catch:{ all -> 0x02f5 }
            goto L_0x0315
        L_0x0314:
            r6 = r2
        L_0x0315:
            boolean r7 = r1.isNull(r8)     // Catch:{ all -> 0x02f5 }
            if (r7 == 0) goto L_0x0324
            boolean r7 = r1.isNull(r9)     // Catch:{ all -> 0x02f5 }
            if (r7 != 0) goto L_0x0322
            goto L_0x0324
        L_0x0322:
            r7 = r2
            goto L_0x033f
        L_0x0324:
            xw2 r7 = new xw2     // Catch:{ all -> 0x02f5 }
            r11 = 6
            r7.<init>(r11)     // Catch:{ all -> 0x02f5 }
            boolean r11 = r1.isNull(r8)     // Catch:{ all -> 0x02f5 }
            if (r11 == 0) goto L_0x0333
            r7.c = r2     // Catch:{ all -> 0x02f5 }
            goto L_0x0339
        L_0x0333:
            byte[] r8 = r1.getBlob(r8)     // Catch:{ all -> 0x02f5 }
            r7.c = r8     // Catch:{ all -> 0x02f5 }
        L_0x0339:
            long r8 = r1.getLong(r9)     // Catch:{ all -> 0x02f5 }
            r7.b = r8     // Catch:{ all -> 0x02f5 }
        L_0x033f:
            c2c r8 = new c2c     // Catch:{ all -> 0x02f5 }
            r8.<init>()     // Catch:{ all -> 0x02f5 }
            long r11 = r1.getLong(r0)     // Catch:{ all -> 0x02f5 }
            r8.a = r11     // Catch:{ all -> 0x02f5 }
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x02f5 }
            if (r0 == 0) goto L_0x0351
            goto L_0x0359
        L_0x0351:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x02f5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02f5 }
        L_0x0359:
            r2c r0 = lp.L(r2)     // Catch:{ all -> 0x02f5 }
            r8.b = r0     // Catch:{ all -> 0x02f5 }
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x02f5 }
            r8.c = r2     // Catch:{ all -> 0x02f5 }
            long r2 = r1.getLong(r5)     // Catch:{ all -> 0x02f5 }
            r8.d = r2     // Catch:{ all -> 0x02f5 }
            r8.e = r10     // Catch:{ all -> 0x02f5 }
            r8.f = r6     // Catch:{ all -> 0x02f5 }
            r8.g = r7     // Catch:{ all -> 0x02f5 }
            r2 = r8
        L_0x0372:
            r1.close()
            return r2
        L_0x0376:
            r1.close()
            throw r0
        L_0x037a:
            b2c r1 = r0.c
            aec r1 = r1.a
            pec r0 = r0.b
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "id"
            int r0 = defpackage.gp0.o(r1, r0)     // Catch:{ all -> 0x03cd }
            java.lang.String r3 = "recent_type"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x03cd }
            java.lang.String r4 = "recent_time"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x03cd }
            java.lang.String r5 = "server_id"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x03cd }
            java.lang.String r6 = "sticker_id"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x03cd }
            java.lang.String r7 = "emoji"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x03cd }
            java.lang.String r8 = "gif"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x03cd }
            java.lang.String r9 = "gif_id"
            int r9 = defpackage.gp0.o(r1, r9)     // Catch:{ all -> 0x03cd }
            boolean r10 = r1.moveToFirst()     // Catch:{ all -> 0x03cd }
            if (r10 == 0) goto L_0x044a
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x03cd }
            if (r10 != 0) goto L_0x03d0
            le4 r10 = new le4     // Catch:{ all -> 0x03cd }
            r10.<init>()     // Catch:{ all -> 0x03cd }
            long r11 = r1.getLong(r6)     // Catch:{ all -> 0x03cd }
            r10.a = r11     // Catch:{ all -> 0x03cd }
            goto L_0x03d1
        L_0x03cd:
            r0 = move-exception
            goto L_0x044e
        L_0x03d0:
            r10 = r2
        L_0x03d1:
            boolean r6 = r1.isNull(r7)     // Catch:{ all -> 0x03cd }
            if (r6 != 0) goto L_0x03ec
            wu4 r6 = new wu4     // Catch:{ all -> 0x03cd }
            r6.<init>()     // Catch:{ all -> 0x03cd }
            boolean r11 = r1.isNull(r7)     // Catch:{ all -> 0x03cd }
            if (r11 == 0) goto L_0x03e5
            r6.a = r2     // Catch:{ all -> 0x03cd }
            goto L_0x03ed
        L_0x03e5:
            java.lang.String r7 = r1.getString(r7)     // Catch:{ all -> 0x03cd }
            r6.a = r7     // Catch:{ all -> 0x03cd }
            goto L_0x03ed
        L_0x03ec:
            r6 = r2
        L_0x03ed:
            boolean r7 = r1.isNull(r8)     // Catch:{ all -> 0x03cd }
            if (r7 == 0) goto L_0x03fc
            boolean r7 = r1.isNull(r9)     // Catch:{ all -> 0x03cd }
            if (r7 != 0) goto L_0x03fa
            goto L_0x03fc
        L_0x03fa:
            r7 = r2
            goto L_0x0417
        L_0x03fc:
            xw2 r7 = new xw2     // Catch:{ all -> 0x03cd }
            r11 = 6
            r7.<init>(r11)     // Catch:{ all -> 0x03cd }
            boolean r11 = r1.isNull(r8)     // Catch:{ all -> 0x03cd }
            if (r11 == 0) goto L_0x040b
            r7.c = r2     // Catch:{ all -> 0x03cd }
            goto L_0x0411
        L_0x040b:
            byte[] r8 = r1.getBlob(r8)     // Catch:{ all -> 0x03cd }
            r7.c = r8     // Catch:{ all -> 0x03cd }
        L_0x0411:
            long r8 = r1.getLong(r9)     // Catch:{ all -> 0x03cd }
            r7.b = r8     // Catch:{ all -> 0x03cd }
        L_0x0417:
            c2c r8 = new c2c     // Catch:{ all -> 0x03cd }
            r8.<init>()     // Catch:{ all -> 0x03cd }
            long r11 = r1.getLong(r0)     // Catch:{ all -> 0x03cd }
            r8.a = r11     // Catch:{ all -> 0x03cd }
            boolean r0 = r1.isNull(r3)     // Catch:{ all -> 0x03cd }
            if (r0 == 0) goto L_0x0429
            goto L_0x0431
        L_0x0429:
            int r0 = r1.getInt(r3)     // Catch:{ all -> 0x03cd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03cd }
        L_0x0431:
            r2c r0 = lp.L(r2)     // Catch:{ all -> 0x03cd }
            r8.b = r0     // Catch:{ all -> 0x03cd }
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x03cd }
            r8.c = r2     // Catch:{ all -> 0x03cd }
            long r2 = r1.getLong(r5)     // Catch:{ all -> 0x03cd }
            r8.d = r2     // Catch:{ all -> 0x03cd }
            r8.e = r10     // Catch:{ all -> 0x03cd }
            r8.f = r6     // Catch:{ all -> 0x03cd }
            r8.g = r7     // Catch:{ all -> 0x03cd }
            r2 = r8
        L_0x044a:
            r1.close()
            return r2
        L_0x044e:
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1c.call():java.lang.Object");
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.m();
                return;
            case 1:
                this.b.m();
                return;
            case 2:
                this.b.m();
                return;
            case 3:
                this.b.m();
                return;
            default:
                this.b.m();
                return;
        }
    }
}
