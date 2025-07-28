package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: du6  reason: default package */
public final class du6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ h46 Y;
    public final /* synthetic */ bv6 Z;
    public final /* synthetic */ dde w0;
    public final /* synthetic */ ConcurrentHashMap x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public du6(h46 h46, bv6 bv6, dde dde, ConcurrentHashMap concurrentHashMap, Continuation continuation) {
        super(2, continuation);
        this.Y = h46;
        this.Z = bv6;
        this.w0 = dde;
        this.x0 = concurrentHashMap;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        du6 du6 = new du6(this.Y, this.Z, this.w0, this.x0, continuation);
        du6.X = obj;
        return du6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa A[Catch:{ all -> 0x009a, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ab A[Catch:{ all -> 0x009a, all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d8 A[Catch:{ all -> 0x009a, all -> 0x01fb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r38) {
        /*
            r37 = this;
            r0 = r37
            wx3.H(r38)
            java.lang.Object r1 = r0.X
            ou3 r1 = (ou3) r1
            f46 r2 = defpackage.f46.f
            h46 r3 = r0.Y
            boolean r2 = hhd.f(r3, r2)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            bv6 r5 = r0.Z
            android.content.ContentResolver r6 = r5.o
            android.net.Uri r7 = r3.i()
            java.lang.String[] r8 = r3.d
            java.lang.String r9 = r3.a
            java.lang.String[] r10 = r3.b
            java.lang.String r11 = r3.c
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x0201
            java.util.concurrent.ConcurrentHashMap r7 = r0.x0
            java.lang.String r8 = r3.f()     // Catch:{ all -> 0x009a }
            int r8 = r6.getColumnIndex(r8)     // Catch:{ all -> 0x009a }
            r10 = -1
            if (r8 != r10) goto L_0x003c
        L_0x0039:
            r0 = 0
            goto L_0x01f6
        L_0x003c:
            java.lang.String r11 = r3.b()     // Catch:{ all -> 0x009a }
            int r11 = r6.getColumnIndex(r11)     // Catch:{ all -> 0x009a }
            if (r11 != r10) goto L_0x0047
            goto L_0x0039
        L_0x0047:
            java.lang.String r12 = r3.a()     // Catch:{ all -> 0x009a }
            int r12 = r6.getColumnIndex(r12)     // Catch:{ all -> 0x009a }
            if (r12 != r10) goto L_0x0052
            goto L_0x0039
        L_0x0052:
            java.lang.String r13 = r3.c()     // Catch:{ all -> 0x009a }
            int r13 = r6.getColumnIndex(r13)     // Catch:{ all -> 0x009a }
            if (r13 != r10) goto L_0x005d
            goto L_0x0039
        L_0x005d:
            java.lang.String r14 = r3.d()     // Catch:{ all -> 0x009a }
            int r14 = r6.getColumnIndex(r14)     // Catch:{ all -> 0x009a }
            if (r14 != r10) goto L_0x0068
            goto L_0x0039
        L_0x0068:
            java.lang.String r15 = r3.g()     // Catch:{ all -> 0x009a }
            int r15 = r6.getColumnIndex(r15)     // Catch:{ all -> 0x009a }
            java.lang.Integer r9 = new java.lang.Integer     // Catch:{ all -> 0x009a }
            r9.<init>(r15)     // Catch:{ all -> 0x009a }
            int r15 = r9.intValue()     // Catch:{ all -> 0x009a }
            if (r15 == r10) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r9 = 0
        L_0x007d:
            java.lang.String r15 = r3.h()     // Catch:{ all -> 0x009a }
            if (r15 == 0) goto L_0x0098
            int r15 = r6.getColumnIndex(r15)     // Catch:{ all -> 0x009a }
            java.lang.Integer r10 = new java.lang.Integer     // Catch:{ all -> 0x009a }
            r10.<init>(r15)     // Catch:{ all -> 0x009a }
            int r15 = r10.intValue()     // Catch:{ all -> 0x009a }
            r17 = r10
            r10 = -1
            if (r15 == r10) goto L_0x0098
            r10 = r17
            goto L_0x009e
        L_0x0098:
            r10 = 0
            goto L_0x009e
        L_0x009a:
            r0 = move-exception
            r1 = r0
            goto L_0x01fa
        L_0x009e:
            boolean r15 = n1g.A(r1)     // Catch:{ all -> 0x009a }
            if (r15 == 0) goto L_0x0039
            boolean r15 = r6.moveToNext()     // Catch:{ all -> 0x009a }
            if (r15 == 0) goto L_0x0039
            r15 = r1
            long r0 = r6.getLong(r8)     // Catch:{ all -> 0x009a }
            r28 = r8
            int r8 = r6.getInt(r11)     // Catch:{ all -> 0x009a }
            r29 = r11
            java.lang.Integer r11 = new java.lang.Integer     // Catch:{ all -> 0x009a }
            r11.<init>(r8)     // Catch:{ all -> 0x009a }
            boolean r11 = r4.contains(r11)     // Catch:{ all -> 0x009a }
            if (r11 != 0) goto L_0x00c8
            java.lang.String r11 = r6.getString(r12)     // Catch:{ all -> 0x009a }
            if (r11 != 0) goto L_0x00d0
        L_0x00c8:
            r0 = r37
            r1 = r15
            r8 = r28
            r11 = r29
            goto L_0x009e
        L_0x00d0:
            android.net.Uri r16 = at7.u(r6, r13)     // Catch:{ all -> 0x009a }
            if (r16 != 0) goto L_0x00e3
            r30 = r12
            android.net.Uri r12 = r3.i()     // Catch:{ all -> 0x009a }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r12, r0)     // Catch:{ all -> 0x009a }
            r26 = r12
            goto L_0x00e7
        L_0x00e3:
            r30 = r12
            r26 = r16
        L_0x00e7:
            java.lang.String r12 = r3.j()     // Catch:{ all -> 0x009a }
            if (r9 != 0) goto L_0x00ee
            goto L_0x00fc
        L_0x00ee:
            r16 = r12
            int r12 = r9.intValue()     // Catch:{ all -> 0x009a }
            java.lang.String r12 = r6.getString(r12)     // Catch:{ all -> 0x009a }
            if (r12 != 0) goto L_0x00fc
            r12 = r16
        L_0x00fc:
            r16 = 11
            r31 = r9
            int[] r9 = hr1.w(r16)     // Catch:{ all -> 0x009a }
            r32 = r13
            int r13 = r9.length     // Catch:{ all -> 0x009a }
            r33 = r15
            r15 = 0
        L_0x010a:
            if (r15 >= r13) goto L_0x0120
            r16 = r9[r15]     // Catch:{ all -> 0x009a }
            r17 = r9
            java.lang.String r9 = defpackage.us8.f(r16)     // Catch:{ all -> 0x009a }
            boolean r9 = r9.equalsIgnoreCase(r12)     // Catch:{ all -> 0x009a }
            if (r9 == 0) goto L_0x011b
            goto L_0x0122
        L_0x011b:
            int r15 = r15 + 1
            r9 = r17
            goto L_0x010a
        L_0x0120:
            r16 = 0
        L_0x0122:
            if (r16 != 0) goto L_0x0126
            r16 = 1
        L_0x0126:
            int r13 = hr1.t(r16)     // Catch:{ all -> 0x009a }
            switch(r13) {
                case 1: goto L_0x013d;
                case 2: goto L_0x013d;
                case 3: goto L_0x012d;
                case 4: goto L_0x013d;
                case 5: goto L_0x013d;
                case 6: goto L_0x013d;
                case 7: goto L_0x013d;
                case 8: goto L_0x013d;
                default: goto L_0x012d;
            }     // Catch:{ all -> 0x009a }
        L_0x012d:
            r0 = r37
            r8 = r28
            r11 = r29
            r12 = r30
            r9 = r31
            r13 = r32
            r1 = r33
            goto L_0x009e
        L_0x013d:
            if (r10 == 0) goto L_0x0148
            int r13 = r10.intValue()     // Catch:{ all -> 0x009a }
            int r13 = r6.getInt(r13)     // Catch:{ all -> 0x009a }
            goto L_0x0149
        L_0x0148:
            r13 = 0
        L_0x0149:
            long r22 = r6.getLong(r14)     // Catch:{ all -> 0x009a }
            o46 r15 = new o46     // Catch:{ all -> 0x009a }
            i46 r9 = new i46     // Catch:{ all -> 0x009a }
            r34 = r10
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x009a }
            r35 = r14
            java.util.List r14 = java.util.Collections.singletonList(r3)     // Catch:{ all -> 0x009a }
            r9.<init>(r10, r11, r14)     // Catch:{ all -> 0x009a }
            r10 = 0
            r15.<init>(r9, r10, r10, r2)     // Catch:{ all -> 0x009a }
            java.util.concurrent.ConcurrentHashMap r10 = r5.F0
            java.lang.Object r14 = r10.get(r9)     // Catch:{ all -> 0x009a }
            yk7 r14 = (defpackage.yk7) r14     // Catch:{ all -> 0x009a }
            if (r14 == 0) goto L_0x0177
            r36 = r15
            long r14 = r14.X     // Catch:{ all -> 0x009a }
            int r14 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r14 >= 0) goto L_0x0196
            goto L_0x0179
        L_0x0177:
            r36 = r15
        L_0x0179:
            yk7 r14 = new yk7     // Catch:{ all -> 0x009a }
            java.lang.Integer r15 = new java.lang.Integer     // Catch:{ all -> 0x009a }
            r15.<init>(r13)     // Catch:{ all -> 0x009a }
            r27 = 960(0x3c0, float:1.345E-42)
            r25 = 0
            r16 = r14
            r17 = r0
            r19 = r26
            r20 = r12
            r21 = r8
            r24 = r15
            r16.<init>(r17, r19, r20, r21, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x009a }
            r10.put(r9, r14)     // Catch:{ all -> 0x009a }
        L_0x0196:
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x009a }
            r0.<init>(r8)     // Catch:{ all -> 0x009a }
            r4.add(r0)     // Catch:{ all -> 0x009a }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x009a }
            r0.<init>(r8)     // Catch:{ all -> 0x009a }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x009a }
            o46 r0 = (defpackage.o46) r0     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x01d8
            o46 r15 = new o46     // Catch:{ all -> 0x009a }
            i46 r1 = new i46     // Catch:{ all -> 0x009a }
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x009a }
            n46 r10 = r0.a     // Catch:{ all -> 0x009a }
            java.util.List r10 = r10.d()     // Catch:{ all -> 0x009a }
            java.util.ArrayList r10 = o23.j0(r10, r3)     // Catch:{ all -> 0x009a }
            r1.<init>(r9, r11, r10)     // Catch:{ all -> 0x009a }
            boolean r0 = r0.d     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x01ca
            if (r2 == 0) goto L_0x01c7
            goto L_0x01ca
        L_0x01c7:
            r0 = 0
            r9 = 0
            goto L_0x01cc
        L_0x01ca:
            r0 = 0
            r9 = 1
        L_0x01cc:
            r15.<init>(r1, r0, r0, r9)     // Catch:{ all -> 0x009a }
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x009a }
            r0.<init>(r8)     // Catch:{ all -> 0x009a }
            r7.remove(r0)     // Catch:{ all -> 0x009a }
            goto L_0x01da
        L_0x01d8:
            r15 = r36
        L_0x01da:
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x009a }
            r0.<init>(r8)     // Catch:{ all -> 0x009a }
            r7.put(r0, r15)     // Catch:{ all -> 0x009a }
            r0 = r37
            r8 = r28
            r11 = r29
            r12 = r30
            r9 = r31
            r13 = r32
            r1 = r33
            r10 = r34
            r14 = r35
            goto L_0x009e
        L_0x01f6:
            urd.l(r6, r0)
            goto L_0x0201
        L_0x01fa:
            throw r1     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r0 = move-exception
            r2 = r0
            urd.l(r6, r1)
            throw r2
        L_0x0201:
            r3.toString()
            r0 = r37
            dde r0 = r0.w0
            r0.getClass()
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du6.o(java.lang.Object):java.lang.Object");
    }
}
