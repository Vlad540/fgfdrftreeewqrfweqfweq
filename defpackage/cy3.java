package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cy3  reason: default package */
public final class cy3 extends avc {
    public final j8e k = new j8e(3);

    public cy3(l68 l68, gv0 gv0, Executor executor) {
        super(l68, new iy3(), gv0, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0126, code lost:
        r16 = r3;
        r6 = r6 + 1;
        r1 = r27;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0117 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0109 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList e(defpackage.iv0 r28, defpackage.qg5 r29, boolean r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r30
            r3 = r29
            ey3 r3 = (defpackage.ey3) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
        L_0x000e:
            java.util.List r0 = r3.m
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x0130
            wma r7 = r3.b(r6)
            long r8 = r7.b
            long r8 = defpackage.oze.S(r8)
            long r10 = r3.d(r6)
            r12 = 0
        L_0x0025:
            java.util.List r0 = r7.c
            int r13 = r0.size()
            if (r12 >= r13) goto L_0x0126
            java.lang.Object r0 = r0.get(r12)
            r13 = r0
            y8 r13 = (defpackage.y8) r13
            r14 = 0
        L_0x0035:
            java.util.List r0 = r13.c
            int r0 = r0.size()
            if (r14 >= r0) goto L_0x0118
            java.util.List r0 = r13.c
            java.lang.Object r0 = r0.get(r14)
            kac r0 = (defpackage.kac) r0
            int r15 = r13.b     // Catch:{ IOException -> 0x00fe }
            wy3 r16 = r0.c()     // Catch:{ IOException -> 0x00fe }
            if (r16 == 0) goto L_0x0056
            r17 = r6
            r18 = r7
            r15 = r16
            r16 = r3
            goto L_0x007a
        L_0x0056:
            by3 r5 = new by3     // Catch:{ IOException -> 0x00fe }
            r16 = r3
            r3 = r28
            r5.<init>(r3, r15, r0)     // Catch:{ IOException -> 0x00fc }
            java.lang.Object r5 = r1.c(r5, r2)     // Catch:{ IOException -> 0x00fc }
            cy2 r5 = (defpackage.cy2) r5     // Catch:{ IOException -> 0x00fc }
            if (r5 != 0) goto L_0x006e
            r5 = 0
            r15 = r5
            r17 = r6
            r18 = r7
            goto L_0x007a
        L_0x006e:
            xw2 r15 = new xw2     // Catch:{ IOException -> 0x00fc }
            r17 = r6
            r18 = r7
            long r6 = r0.c     // Catch:{ IOException -> 0x00fa }
            r3 = 3
            r15.<init>((java.lang.Object) r5, (long) r6, (int) r3)     // Catch:{ IOException -> 0x00fa }
        L_0x007a:
            if (r15 == 0) goto L_0x00ee
            long r5 = r15.D(r10)
            r19 = -1
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x00e6
            j8e r3 = r1.k
            ws6 r7 = r0.b
            hj0 r3 = r3.C(r7)
            int r7 = defpackage.oze.a
            java.lang.String r3 = r3.a
            nxb r7 = r0.X
            if (r7 == 0) goto L_0x00a3
            r1 = 0
            yz3 r7 = pa2.f(r0, r3, r7, r1)
            yuc r1 = new yuc
            r1.<init>(r8, r7)
            r4.add(r1)
        L_0x00a3:
            nxb r1 = r0.d()
            if (r1 == 0) goto L_0x00b6
            r7 = 0
            yz3 r1 = pa2.f(r0, r3, r1, r7)
            yuc r7 = new yuc
            r7.<init>(r8, r1)
            r4.add(r7)
        L_0x00b6:
            long r19 = r15.C()
            long r5 = r19 + r5
            r21 = 1
            long r5 = r5 - r21
            r23 = r10
            r10 = r19
        L_0x00c4:
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0109
            long r19 = r15.b(r10)
            r25 = r5
            long r5 = r19 + r8
            nxb r1 = r15.p(r10)
            r7 = 0
            yz3 r1 = pa2.f(r0, r3, r1, r7)
            yuc r7 = new yuc
            r7.<init>(r5, r1)
            r4.add(r7)
            long r10 = r10 + r21
            r5 = r25
            goto L_0x00c4
        L_0x00e6:
            androidx.media3.exoplayer.offline.DownloadException r0 = new androidx.media3.exoplayer.offline.DownloadException
            java.lang.String r1 = "Unbounded segment index"
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            r23 = r10
            androidx.media3.exoplayer.offline.DownloadException r0 = new androidx.media3.exoplayer.offline.DownloadException     // Catch:{ IOException -> 0x00f8 }
            java.lang.String r1 = "Missing segment index"
            r0.<init>(r1)     // Catch:{ IOException -> 0x00f8 }
            throw r0     // Catch:{ IOException -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            goto L_0x0107
        L_0x00fa:
            r0 = move-exception
            goto L_0x0105
        L_0x00fc:
            r0 = move-exception
            goto L_0x0101
        L_0x00fe:
            r0 = move-exception
            r16 = r3
        L_0x0101:
            r17 = r6
            r18 = r7
        L_0x0105:
            r23 = r10
        L_0x0107:
            if (r2 == 0) goto L_0x0117
        L_0x0109:
            int r14 = r14 + 1
            r1 = r27
            r3 = r16
            r6 = r17
            r7 = r18
            r10 = r23
            goto L_0x0035
        L_0x0117:
            throw r0
        L_0x0118:
            r16 = r3
            r17 = r6
            r18 = r7
            r23 = r10
            int r12 = r12 + 1
            r1 = r27
            goto L_0x0025
        L_0x0126:
            r16 = r3
            r17 = r6
            int r6 = r17 + 1
            r1 = r27
            goto L_0x000e
        L_0x0130:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy3.e(iv0, qg5, boolean):java.util.ArrayList");
    }
}
