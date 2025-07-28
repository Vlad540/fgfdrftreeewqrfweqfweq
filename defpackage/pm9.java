package defpackage;

import java.util.List;

/* renamed from: pm9  reason: default package */
public final class pm9 extends lbe {
    public final int X;
    public final List Y;
    public final long c;
    public final long o;

    public pm9(long j, long j2, int i, List list) {
        this.c = j;
        this.o = j2;
        this.X = i;
        this.Y = list;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.pm9 c(defpackage.ws8 r20) {
        /*
            r1 = r20
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            boolean r0 = r20.m()
            if (r0 != 0) goto L_0x000f
        L_0x000c:
            r4 = 0
            goto L_0x021f
        L_0x000f:
            r5 = 1
            r6 = 0
            int r0 = jjd.K(r20)     // Catch:{ all -> 0x0017 }
            r7 = r0
            goto L_0x0047
        L_0x0017:
            r0 = move-exception
            r7 = r0
            udd.S(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0035
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r7)
            goto L_0x0022
        L_0x0035:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0046
            if (r0 == r5) goto L_0x0045
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0045:
            throw r7
        L_0x0046:
            r7 = r6
        L_0x0047:
            if (r7 != 0) goto L_0x004a
            goto L_0x000c
        L_0x004a:
            hw4 r8 = hw4.a
            r11 = r6
            r17 = r11
            r18 = r8
            r13 = 0
            r15 = 0
        L_0x0055:
            if (r11 >= r7) goto L_0x0219
            java.lang.String r0 = jjd.M(r20)     // Catch:{ all -> 0x005c }
            goto L_0x008c
        L_0x005c:
            r0 = move-exception
            r12 = r0
            udd.S(r3, r2, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0067:
            boolean r19 = r0.hasNext()
            if (r19 == 0) goto L_0x007a
            java.lang.Object r19 = r0.next()
            ny9 r19 = (ny9) r19
            r19.getClass()
            ny9.a(r12)
            goto L_0x0067
        L_0x007a:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x008b
            if (r0 == r5) goto L_0x008a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x008a:
            throw r12
        L_0x008b:
            r0 = 0
        L_0x008c:
            if (r0 != 0) goto L_0x0092
        L_0x008e:
            r9 = 0
            goto L_0x0215
        L_0x0092:
            int r12 = r0.hashCode()
            switch(r12) {
                case -1440013438: goto L_0x0198;
                case -1361631597: goto L_0x014c;
                case -731385813: goto L_0x0101;
                case -372020745: goto L_0x009b;
                default: goto L_0x0099;
            }
        L_0x0099:
            goto L_0x01a0
        L_0x009b:
            java.lang.String r12 = "counters"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00a5
            goto L_0x01a0
        L_0x00a5:
            sp8 r0 = r20.n()     // Catch:{ all -> 0x00d0 }
            int r0 = r0.a()     // Catch:{ all -> 0x00d0 }
            r12 = 7
            if (r0 != r12) goto L_0x00c6
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00d0 }
            r0.<init>()     // Catch:{ all -> 0x00d0 }
            int r12 = r20.s0()     // Catch:{ all -> 0x00d0 }
            r4 = r6
        L_0x00ba:
            if (r4 >= r12) goto L_0x00ca
            sr8 r9 = gwf.C(r20)     // Catch:{ all -> 0x00d0 }
            r0.add(r9)     // Catch:{ all -> 0x00d0 }
            int r4 = r4 + 1
            goto L_0x00ba
        L_0x00c6:
            r20.z()     // Catch:{ all -> 0x00d0 }
            r0 = 0
        L_0x00ca:
            if (r0 != 0) goto L_0x00cd
            r0 = r8
        L_0x00cd:
            r18 = r0
            goto L_0x008e
        L_0x00d0:
            r0 = move-exception
            udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = defpackage.uzc.a
            java.util.Iterator r4 = r4.iterator()
        L_0x00da:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00ed
            java.lang.Object r9 = r4.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r0)
            goto L_0x00da
        L_0x00ed:
            int r4 = defpackage.m4b.a
            int r4 = hr1.t(r4)
            if (r4 == 0) goto L_0x00fe
            if (r4 == r5) goto L_0x00fd
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00fd:
            throw r0
        L_0x00fe:
            r18 = r8
            goto L_0x008e
        L_0x0101:
            java.lang.String r4 = "totalCount"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x010b
            goto L_0x01a0
        L_0x010b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            int r0 = jjd.I(r20)     // Catch:{ all -> 0x0118 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0118 }
            goto L_0x0146
        L_0x0118:
            r0 = move-exception
            udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.uzc.a
            java.util.Iterator r9 = r9.iterator()
        L_0x0122:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0135
            java.lang.Object r10 = r9.next()
            ny9 r10 = (ny9) r10
            r10.getClass()
            ny9.a(r0)
            goto L_0x0122
        L_0x0135:
            int r9 = defpackage.m4b.a
            int r9 = hr1.t(r9)
            if (r9 == 0) goto L_0x0146
            if (r9 == r5) goto L_0x0145
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0145:
            throw r0
        L_0x0146:
            int r17 = r4.intValue()
            goto L_0x008e
        L_0x014c:
            java.lang.String r4 = "chatId"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0155
            goto L_0x01a0
        L_0x0155:
            r9 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            long r12 = jjd.J(r1, r9)     // Catch:{ all -> 0x0164 }
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0164 }
            goto L_0x0192
        L_0x0164:
            r0 = move-exception
            udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.uzc.a
            java.util.Iterator r9 = r9.iterator()
        L_0x016e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0181
            java.lang.Object r10 = r9.next()
            ny9 r10 = (ny9) r10
            r10.getClass()
            ny9.a(r0)
            goto L_0x016e
        L_0x0181:
            int r9 = defpackage.m4b.a
            int r9 = hr1.t(r9)
            if (r9 == 0) goto L_0x0192
            if (r9 == r5) goto L_0x0191
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0191:
            throw r0
        L_0x0192:
            long r13 = r4.longValue()
            goto L_0x008e
        L_0x0198:
            java.lang.String r4 = "messageId"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01d4
        L_0x01a0:
            r20.z()     // Catch:{ all -> 0x01a5 }
            goto L_0x008e
        L_0x01a5:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01b0:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01c3
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x01b0
        L_0x01c3:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x008e
            if (r0 == r5) goto L_0x01d3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d3:
            throw r4
        L_0x01d4:
            r9 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            long r15 = jjd.J(r1, r9)     // Catch:{ all -> 0x01e3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x01e3 }
            goto L_0x0211
        L_0x01e3:
            r0 = move-exception
            udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.uzc.a
            java.util.Iterator r12 = r12.iterator()
        L_0x01ed:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0200
            java.lang.Object r15 = r12.next()
            ny9 r15 = (ny9) r15
            r15.getClass()
            ny9.a(r0)
            goto L_0x01ed
        L_0x0200:
            int r12 = defpackage.m4b.a
            int r12 = hr1.t(r12)
            if (r12 == 0) goto L_0x0211
            if (r12 == r5) goto L_0x0210
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0210:
            throw r0
        L_0x0211:
            long r15 = r4.longValue()
        L_0x0215:
            int r11 = r11 + 1
            goto L_0x0055
        L_0x0219:
            pm9 r4 = new pm9
            r12 = r4
            r12.<init>(r13, r15, r17, r18)
        L_0x021f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pm9.c(ws8):pm9");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm9)) {
            return false;
        }
        pm9 pm9 = (pm9) obj;
        return this.c == pm9.c && this.o == pm9.o && this.X == pm9.X && hhd.f(this.Y, pm9.Y);
    }

    public final int hashCode() {
        return this.Y.hashCode() + c3d.d(this.X, sxe.m(Long.hashCode(this.c) * 31, 31, this.o), 31);
    }

    public final String toString() {
        int size = this.Y.size();
        return "{chatId=" + this.c + ", messageId=" + this.o + ", totalCount=" + this.X + ", counters count=" + size + " }";
    }
}
