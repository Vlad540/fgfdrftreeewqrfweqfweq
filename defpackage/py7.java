package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: py7  reason: default package */
public final class py7 implements mh9 {
    public final qqd a;
    public final axb b;
    public final eje c;
    public final xwb d;
    public final ct3 e;
    public long f;
    public int g;
    public int h;
    public final my7 i;
    public ema j;
    public int k;
    public final CopyOnWriteArrayList l;

    /* JADX WARNING: Removed duplicated region for block: B:45:0x020f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public py7(defpackage.qqd r17, defpackage.my7 r18, defpackage.axb r19, defpackage.eje r20, defpackage.xwb r21, defpackage.ct3 r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            r5 = r22
            r16.<init>()
            r0.a = r1
            r0.b = r3
            r6 = r20
            r0.c = r6
            r0.d = r4
            r0.e = r5
            java.lang.String r6 = "MediaAdaptation"
            if (r2 == 0) goto L_0x01e1
            ky7 r7 = r2.a
            double r8 = r7.e
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r13 = "Invalid badNetwork.rttLeaveLevel2Mode: "
            java.lang.String r14 = " Must be >= 0"
            if (r12 > 0) goto L_0x0046
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r13)
            r2.append(r8)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r2)
            r4.reportException(r6, r2, r7)
            goto L_0x01e1
        L_0x0046:
            double r0 = r7.d
            int r12 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x0067
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "Invalid badNetwork.rttEnterLevel2Mode: "
            r2.<init>(r7)
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x0067:
            double r2 = r7.a
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            java.lang.String r15 = "Invalid badNetwork.rttThreshold: "
            if (r12 > 0) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r15)
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x0088:
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            java.lang.String r10 = " Must be < badNetwork.rttEnterLevel2Mode ("
            java.lang.String r11 = ")"
            if (r12 < 0) goto L_0x00af
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r15)
            r7.append(r2)
            r7.append(r10)
            r7.append(r0)
            r7.append(r11)
            java.lang.String r0 = r7.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x00af:
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x00d2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r13)
            r2.append(r8)
            r2.append(r10)
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x00d2:
            double r0 = r7.b
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x00f5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid badNetwork.lostPacketsLimitForRttBelowLowBound: "
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x00f5:
            double r0 = r7.c
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x0118
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid badNetwork.lostPacketsLimitForRttAboveLowBound: "
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x0118:
            r0 = r18
            ly7 r1 = r0.b
            double r2 = r1.a
            double r12 = r1.c
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0147
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid goodNetwork.rttLowBound: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " Must be < goodNetwork.rttHighBound ("
            r0.append(r1)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x0147:
            double r2 = r1.b
            r12 = 0
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x016a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid badNetwork.lostPacketsLimitForRttLowBound: "
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x016a:
            double r2 = r1.d
            r12 = 0
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x018c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid badNetwork.lostPacketsLimitForRttHighBound: "
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x018c:
            long r1 = r1.e
            r12 = 0
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x01a3
            java.lang.String r0 = "Invalid badNetwork.recoveryTimeoutMs: "
            java.lang.String r0 = defpackage.us8.j(r1, r0, r14)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x01a3:
            int r1 = r7.f
            if (r1 >= 0) goto L_0x01c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid badNetwork.videoBitrateLevel1K : "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = " Must be >= 0 ("
            r0.append(r1)
            r0.append(r8)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x01c9:
            int r2 = r7.g
            if (r2 <= r1) goto L_0x01de
            java.lang.String r0 = "Invalid badNetwork.videoBitrateLevel2K : "
            java.lang.String r3 = " Must be <= ("
            java.lang.String r0 = defpackage.rf0.g(r0, r2, r3, r1, r11)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r4.reportException(r6, r0, r1)
            goto L_0x01e1
        L_0x01de:
            r1 = r16
            goto L_0x01e7
        L_0x01e1:
            my7 r0 = new my7
            r0.<init>()
            goto L_0x01de
        L_0x01e7:
            r1.i = r0
            r2 = 1
            r1.k = r2
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r1.l = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Media adaptation control enabled. Configuration is "
            r3.<init>(r7)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.log(r6, r0)
            r0 = r17
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.j
            boolean r3 = r0.contains(r1)
            if (r3 == 0) goto L_0x020f
            goto L_0x0212
        L_0x020f:
            r0.add(r1)
        L_0x0212:
            int r0 = r1.h
            int r0 = r0 + r2
            r1.h = r0
            tqd r1 = defpackage.tqd.switches_to_good_net
            r2 = r5
            dt3 r2 = (defpackage.dt3) r2
            java.lang.String r2 = r2.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3 = r19
            r3.logSimple(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py7.<init>(qqd, my7, axb, eje, xwb, ct3):void");
    }

    public final void a(iy7 iy7) {
        this.l.remove(iy7);
    }

    public final ema b(int i2) {
        gma gma;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        ema ema;
        ema ema2 = this.j;
        if (ema2 == null) {
            i6 = 1280;
            i4 = 1280;
            str = "maintain-framerate";
            i5 = 1000;
            i3 = 30;
            gma = null;
        } else {
            int i7 = ema2.a;
            int i8 = ema2.b;
            int i9 = ema2.c;
            int i10 = ema2.d;
            gma gma2 = ema2.f;
            String str2 = ema2.e;
            str = str2 == null ? "maintain-framerate" : str2;
            i6 = i7;
            i4 = i8;
            i5 = i9;
            i3 = i10;
            gma = gma2;
        }
        int i11 = oy7.$EnumSwitchMapping$0[hr1.t(i2)];
        my7 my7 = this.i;
        if (i11 == 1) {
            ky7 ky7 = my7.a;
            if (ky7.i) {
                i6 = 320;
            }
            ema = new ema(i6, i4, ky7.j ? ky7.g : i5, i3, str, gma, 4, ky7.k ? 3 : 0, wn6.p(i2));
        } else if (i11 != 2) {
            ema ema3 = this.j;
            if (ema3 == null) {
                return new ema(i6, i4, i5, i3, str, gma, 1, 0, wn6.p(i2));
            }
            return new ema(ema3.a, ema3.b, ema3.c, ema3.d, "maintain-framerate", ema3.f, 1, ema3.h, wn6.p(i2));
        } else {
            ky7 ky72 = my7.a;
            if (ky72.i) {
                i6 = 640;
            }
            ema = new ema(i6, i4, ky72.j ? ky72.f : i5, i3, str, gma, 2, ky72.k ? 2 : 0, wn6.p(i2));
        }
        return ema;
    }

    public final void c(int i2, ny7 ny7) {
        int i3 = this.k;
        this.d.log("MediaAdaptation", "Update network condition. Current condition is " + wn6.s(i3) + ", new one is " + wn6.s(i2) + ", state is " + ny7);
        int i4 = oy7.$EnumSwitchMapping$0[hr1.t(i2)];
        tqd tqd = tqd.switches_to_bad_net;
        boolean z = true;
        ct3 ct3 = this.e;
        axb axb = this.b;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    int i5 = this.h + 1;
                    this.h = i5;
                    axb.logSimple(tqd.switches_to_good_net, ((dt3) ct3).a, String.valueOf(i5));
                }
            } else if (this.k == 1) {
                int i6 = this.g + 1;
                this.g = i6;
                axb.logSimple(tqd, ((dt3) ct3).a, String.valueOf(i6));
            }
        } else if (this.k == 1) {
            int i7 = this.g + 1;
            this.g = i7;
            axb.logSimple(tqd, ((dt3) ct3).a, String.valueOf(i7));
        }
        this.k = i2;
        ema b2 = b(i2);
        if (i2 == 1 || !this.i.a.h) {
            z = false;
        }
        jy7 jy7 = new jy7(i2, b2, z);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((iy7) it.next()).q(jy7);
        }
    }

    public final void d(iy7 iy7) {
        this.l.add(iy7);
        int i2 = this.k;
        ema b2 = b(i2);
        boolean z = true;
        if (this.k == 1 || !this.i.a.h) {
            z = false;
        }
        jy7 jy7 = new jy7(i2, b2, z);
        this.d.log("MediaAdaptation", "Got new subscriber, trigger my state event: " + jy7);
        iy7.q(jy7);
    }

    public final void e(ema ema) {
        this.j = ema;
        int i2 = this.k;
        ema b2 = b(i2);
        boolean z = true;
        if (i2 == 1 || !this.i.a.h) {
            z = false;
        }
        jy7 jy7 = new jy7(i2, b2, z);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((iy7) it.next()).q(jy7);
        }
    }
}
