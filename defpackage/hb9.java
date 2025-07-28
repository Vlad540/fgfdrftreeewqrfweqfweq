package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* renamed from: hb9  reason: default package */
public final class hb9 extends l5e implements i26 {
    public Bundle X;
    public int Y;
    public final /* synthetic */ vx3 Z;
    public final /* synthetic */ nb9 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hb9(vx3 vx3, nb9 nb9, Continuation continuation) {
        super(2, continuation);
        this.Z = vx3;
        this.w0 = nb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hb9(this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0096, code lost:
        r0 = o0e.H(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r35) {
        /*
            r34 = this;
            r1 = r34
            pu3 r3 = pu3.a
            int r0 = r1.Y
            r4 = 0
            r5 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r7) goto L_0x001c
            if (r0 != r5) goto L_0x0014
            wx3.H(r35)
            goto L_0x0310
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001c:
            android.os.Bundle r0 = r1.X
            wx3.H(r35)
            r15 = r0
            r0 = r35
            goto L_0x00fb
        L_0x0026:
            wx3.H(r35)
            vx3 r0 = r1.Z
            boolean r8 = r0 instanceof defpackage.ra9
            if (r8 == 0) goto L_0x02d6
            java.lang.String r8 = "MediaMetadata.Extra.CHAT_ID"
            ra9 r0 = (defpackage.ra9) r0
            long r9 = r0.g
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r9)
            wia r9 = new wia
            r9.<init>(r8, r0)
            java.lang.String r0 = "MediaMetadata.Extra.MESSAGE_ID"
            vx3 r8 = r1.Z
            ra9 r8 = (defpackage.ra9) r8
            long r10 = r8.h
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r10)
            wia r10 = new wia
            r10.<init>(r0, r8)
            java.lang.String r0 = "MediaMetadata.Extra.ATTACH_ID"
            vx3 r8 = r1.Z
            ra9 r8 = (defpackage.ra9) r8
            java.lang.String r8 = r8.i
            wia r11 = new wia
            r11.<init>(r0, r8)
            wia[] r0 = new wia[]{r9, r10, r11}
            android.os.Bundle r8 = jjd.j(r0)
            xa9 r15 = new xa9
            nb9 r14 = r1.w0
            vx3 r0 = r1.Z
            ra9 r0 = (defpackage.ra9) r0
            long r11 = r0.h
            java.lang.String r13 = r0.i
            java.lang.String r10 = r0.j
            r9 = r15
            r16 = r10
            r10 = r14
            r6 = r14
            r14 = r16
            r9.<init>(r10, r11, r13, r14)
            r1.X = r8
            r1.Y = r7
            android.net.Uri r0 = android.net.Uri.parse(r16)     // Catch:{ all -> 0x00a1 }
            java.lang.String r9 = "expires"
            java.lang.String r0 = r0.getQueryParameter(r9)     // Catch:{ all -> 0x00a1 }
            f03 r9 = r6.e     // Catch:{ all -> 0x00a1 }
            lqc r9 = (defpackage.lqc) r9     // Catch:{ all -> 0x00a1 }
            long r9 = r9.m()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x00a3
            java.lang.Long r0 = o0e.H(r0)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x00a3
            long r11 = r0.longValue()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a8
        L_0x00a1:
            r0 = move-exception
            goto L_0x00b4
        L_0x00a3:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00a8:
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00ae
            r0 = r7
            goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            goto L_0x00ba
        L_0x00b4:
            kcc r9 = new kcc
            r9.<init>(r0)
            r0 = r9
        L_0x00ba:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r10 = r0 instanceof kcc
            if (r10 == 0) goto L_0x00c1
            r0 = r9
        L_0x00c1:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            i4a r6 = r6.g
            long r9 = r15.b
            java.lang.String r9 = java.lang.String.valueOf(r9)
            ml4 r6 = r6.a()
            vuf r6 = r6.b
            o64 r6 = (o64) r6
            zj4 r6 = r6.d(r9)
            if (r6 == 0) goto L_0x00e4
            int r6 = r6.b
            r9 = 4
            if (r6 != r9) goto L_0x00e4
            r6 = r7
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            boolean r9 = h0e.c0(r16)
            if (r9 != 0) goto L_0x00f3
            if (r0 != 0) goto L_0x00f3
            if (r6 == 0) goto L_0x00f0
            goto L_0x00f3
        L_0x00f0:
            r0 = r16
            goto L_0x00f7
        L_0x00f3:
            java.lang.Object r0 = r15.a(r1)
        L_0x00f7:
            if (r0 != r3) goto L_0x00fa
            return r3
        L_0x00fa:
            r15 = r8
        L_0x00fb:
            r22 = r0
            java.lang.String r22 = (java.lang.String) r22
            if (r22 == 0) goto L_0x02b8
            boolean r0 = h0e.c0(r22)
            if (r0 == 0) goto L_0x0109
            goto L_0x02b8
        L_0x0109:
            nb9 r0 = r1.w0
            vx3 r6 = r1.Z
            ra9 r6 = (defpackage.ra9) r6
            long r8 = r6.h
            java.lang.String r11 = java.lang.String.valueOf(r8)
            m68 r6 = m68.c
            vx3 r8 = r1.Z
            ra9 r8 = (defpackage.ra9) r8
            java.lang.String r14 = r8.k
            java.lang.String r13 = r8.l
            int r8 = defpackage.nb9.K
            pae r8 = r0.b
            n3a r8 = (n3a) r8
            zr7 r12 = r8.c()
            ib9 r10 = new ib9
            r16 = 0
            r8 = r10
            r9 = r0
            r7 = r10
            r10 = r22
            r2 = r12
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            kotlinx.coroutines.internal.ContextScope r0 = r0.h
            xs7.E(r0, r2, r4, r7, r5)
            nb9 r0 = r1.w0
            vx3 r2 = r1.Z
            ra9 r2 = (defpackage.ra9) r2
            long r14 = r2.h
            java.lang.String r7 = r2.i
            long r12 = r2.g
            r1.X = r4
            r1.Y = r5
            i4a r2 = r0.g
            java.lang.String r8 = java.lang.String.valueOf(r14)
            ml4 r9 = r2.a()
            vuf r9 = r9.b
            o64 r9 = (o64) r9
            zj4 r8 = r9.d(r8)
            if (r8 == 0) goto L_0x01bc
            int r9 = r8.b
            r10 = 3
            if (r9 == r10) goto L_0x0166
            goto L_0x01bc
        L_0x0166:
            pl4 r8 = r8.a
            android.net.Uri r8 = r8.b
            android.net.Uri$Builder r8 = r8.buildUpon()
            ns7 r9 = m68.a
            r9.getClass()
            java.lang.String r9 = "MediaItemType"
            r10 = 1
            java.lang.String r11 = java.lang.String.valueOf(r10)
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r9, r11)
            android.net.Uri r8 = r8.build()
            java.lang.String r8 = r8.toString()
            t97 r9 = r2.d
            java.lang.Object r9 = r9.getValue()
            mgd r9 = (mgd) r9
            z54 r9 = r9.i(r8)
            long r9 = zp3.a(r9)
            t97 r2 = r2.d
            java.lang.Object r2 = r2.getValue()
            mgd r2 = (mgd) r2
            monitor-enter(r2)
            mif r11 = r2.c     // Catch:{ all -> 0x01b4 }
            dw0 r8 = r11.f(r8)     // Catch:{ all -> 0x01b4 }
            if (r8 == 0) goto L_0x01b6
            r4 = 0
            long r4 = r8.a(r4, r9)     // Catch:{ all -> 0x01b4 }
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x01b6
            r17 = 1
            goto L_0x01b8
        L_0x01b4:
            r0 = move-exception
            goto L_0x01ba
        L_0x01b6:
            r17 = 0
        L_0x01b8:
            monitor-exit(r2)
            goto L_0x01be
        L_0x01ba:
            monitor-exit(r2)     // Catch:{ all -> 0x01b4 }
            throw r0
        L_0x01bc:
            r17 = 0
        L_0x01be:
            if (r17 == 0) goto L_0x0202
            to8 r1 = r0.d
            vo8 r1 = r1.q(r14)
            if (r1 == 0) goto L_0x01f0
            jj7 r2 = r1.D0
            if (r2 == 0) goto L_0x01f0
            java.lang.Object r2 = r2.a
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x01f0
            java.util.Iterator r2 = r2.iterator()
        L_0x01d6:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01ec
            java.lang.Object r4 = r2.next()
            r5 = r4
            o10 r5 = (defpackage.o10) r5
            java.lang.String r5 = r5.q
            boolean r5 = hhd.f(r5, r7)
            if (r5 == 0) goto L_0x01d6
            goto L_0x01ed
        L_0x01ec:
            r4 = 0
        L_0x01ed:
            o10 r4 = (defpackage.o10) r4
            goto L_0x01f1
        L_0x01f0:
            r4 = 0
        L_0x01f1:
            if (r4 == 0) goto L_0x01fe
            g10 r2 = r4.n
            g10 r4 = defpackage.g10.c
            if (r2 == r4) goto L_0x01fe
            to8 r0 = r0.d
            r0.u(r1, r7, r4)
        L_0x01fe:
            jue r0 = jue.a
            goto L_0x02b5
        L_0x0202:
            java.lang.String r2 = "MediaMetadata.Extra.CHAT_ID"
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r12)
            wia r5 = new wia
            r5.<init>(r2, r4)
            java.lang.String r2 = "MediaMetadata.Extra.ATTACH_ID"
            wia r4 = new wia
            r4.<init>(r2, r7)
            java.lang.String r2 = "MediaMetadata.Extra.MESSAGE_ID"
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r14)
            wia r9 = new wia
            r9.<init>(r2, r8)
            wia[] r2 = new wia[]{r5, r4, r9}
            android.os.Bundle r2 = jjd.j(r2)
            i4a r4 = r0.g
            java.lang.String r9 = java.lang.String.valueOf(r14)
            r11 = 0
            r5 = 0
            r8 = r22
            r10 = r6
            r24 = r12
            r12 = r5
            r13 = r2
            l68 r2 = defpackage.nb9.j(r8, r9, r10, r11, r12, r13)
            r4.getClass()
            a68 r5 = r2.b
            if (r5 == 0) goto L_0x027f
            android.net.Uri r5 = r5.a
            if (r5 == 0) goto L_0x027f
            android.net.Uri r6 = kjd.K(r5, r2)
            java.lang.String r32 = r6.toString()
            pl4 r6 = new pl4
            po5 r8 = ws6.b
            e8c r30 = e8c.X
            java.lang.String r8 = r2.a
            r31 = 0
            r33 = 0
            r29 = 0
            r26 = r6
            r27 = r8
            r28 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            t97 r5 = r4.c
            java.lang.Object r5 = r5.getValue()
            cs7 r5 = (defpackage.cs7) r5
            zr7 r5 = r5.a
            zr7 r5 = r5.getImmediate()
            bw4 r8 = bw4.a
            hg9 r9 = new hg9
            r10 = 3
            r9.<init>(r4, r10, r6)
            r5.dispatch(r8, r9)
        L_0x027f:
            java.lang.String r2 = r2.a
            h4a r5 = new h4a
            r6 = 0
            r5.<init>(r4, r2, r6)
            rn1 r2 = ez3.h(r5)
            r4 = 2
            r5 = 1
            pj5 r2 = ez3.e(r2, r5, r4)
            pae r4 = r0.b
            n3a r4 = (n3a) r4
            zr7 r4 = r4.c()
            pj5 r2 = ez3.J(r2, r4)
            eb9 r4 = new eb9
            r18 = r4
            r19 = r14
            r21 = r7
            r23 = r0
            r18.<init>(r19, r21, r22, r23, r24)
            java.lang.Object r0 = r2.c(r4, r1)
            pu3 r1 = pu3.a
            if (r0 != r1) goto L_0x02b3
            goto L_0x02b5
        L_0x02b3:
            jue r0 = jue.a
        L_0x02b5:
            if (r0 != r3) goto L_0x0310
            return r3
        L_0x02b8:
            int r0 = defpackage.nb9.K
            java.lang.String r0 = "nb9"
            vx3 r1 = r1.Z
            ra9 r1 = (defpackage.ra9) r1
            java.lang.String r1 = r1.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid audio url: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            udd.U(r0, r1)
            jue r0 = jue.a
            return r0
        L_0x02d6:
            boolean r2 = r0 instanceof defpackage.sa9
            if (r2 == 0) goto L_0x0313
            nb9 r2 = r1.w0
            mg5 r3 = r2.c
            sa9 r0 = (defpackage.sa9) r0
            long r4 = r0.g
            java.io.File r0 = r3.d(r4)
            java.lang.String r5 = r0.getAbsolutePath()
            vx3 r0 = r1.Z
            sa9 r0 = (defpackage.sa9) r0
            long r0 = r0.g
            java.lang.String r6 = java.lang.String.valueOf(r0)
            m68 r7 = m68.o
            pae r0 = r2.b
            n3a r0 = (n3a) r0
            zr7 r0 = r0.c()
            ib9 r1 = new ib9
            r11 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r1
            r4 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.internal.ContextScope r2 = r2.h
            r3 = 0
            r4 = 2
            xs7.E(r2, r0, r3, r1, r4)
        L_0x0310:
            jue r0 = jue.a
            return r0
        L_0x0313:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb9.o(java.lang.Object):java.lang.Object");
    }
}
