package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: au7  reason: default package */
public abstract class au7 {
    public static final ArrayList a(List list, int i, int i2, int i3) {
        ArrayList x0 = o23.x0(list, i, i);
        ArrayList arrayList = new ArrayList(q23.H(x0, 10));
        Iterator it = x0.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 >= 0) {
                arrayList.add(new dga((List) next, i4 + i3, i2));
                i4 = i5;
            } else {
                p23.G();
                throw null;
            }
        }
        return arrayList;
    }

    public static final l31 b(CallsAudioDeviceInfo callsAudioDeviceInfo, boolean z) {
        int i = zt7.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? new g31(callsAudioDeviceInfo, z) : i != 5 ? new j31(callsAudioDeviceInfo) : new i31(callsAudioDeviceInfo) : new h31(callsAudioDeviceInfo) : new k31(callsAudioDeviceInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.s91 c(defpackage.qja r30, boolean r31, boolean r32, boolean r33, defpackage.xk1 r34, defpackage.b65 r35, defpackage.le1 r36) {
        /*
            r0 = r30
            r10 = r35
            ne1 r11 = r0.a
            if (r31 == 0) goto L_0x0013
            boolean r1 = r11.a()
            if (r1 == 0) goto L_0x0013
            ize r1 = defpackage.ize.b
        L_0x0010:
            r16 = r1
            goto L_0x002e
        L_0x0013:
            ize r1 = defpackage.ize.o
            if (r31 == 0) goto L_0x0018
            goto L_0x0010
        L_0x0018:
            if (r32 == 0) goto L_0x0029
            le1 r2 = r11.getId()
            r3 = r36
            boolean r2 = defpackage.hhd.f(r2, r3)
            if (r2 == 0) goto L_0x0029
            ize r1 = defpackage.ize.c
            goto L_0x0010
        L_0x0029:
            if (r32 == 0) goto L_0x0010
            ize r1 = defpackage.ize.a
            goto L_0x0010
        L_0x002e:
            boolean r1 = r10 instanceof defpackage.y55
            r12 = 1
            r13 = 3
            if (r1 != 0) goto L_0x0037
        L_0x0034:
            r17 = r13
            goto L_0x0049
        L_0x0037:
            boolean r2 = r11.k()
            if (r2 == 0) goto L_0x0040
            r17 = r12
            goto L_0x0049
        L_0x0040:
            boolean r2 = r11.b()
            if (r2 != 0) goto L_0x0034
            r2 = 2
            r17 = r2
        L_0x0049:
            r14 = 0
            if (r31 == 0) goto L_0x0056
            if (r1 != 0) goto L_0x0054
            boolean r1 = r10 instanceof defpackage.a65
            if (r1 != 0) goto L_0x0054
        L_0x0052:
            r15 = r12
            goto L_0x005d
        L_0x0054:
            r15 = r14
            goto L_0x005d
        L_0x0056:
            boolean r1 = r11.isConnected()
            if (r1 != 0) goto L_0x0054
            goto L_0x0052
        L_0x005d:
            le1 r18 = r11.getId()
            mc0 r9 = new mc0
            ub0 r1 = new ub0
            vl1 r8 = r0.b
            long r2 = r8.d()
            java.lang.CharSequence r0 = r8.j()
            r1.<init>(r0, r2)
            java.lang.String r0 = r8.q()
            r9.<init>(r1, r0)
            java.lang.String r19 = r8.getName()
            boolean r20 = r11.a()
            boolean r21 = r11.b()
            boolean r22 = r11.k()
            boolean r23 = r11.n()
            boolean r24 = r11.i()
            boolean r25 = r11.e()
            hze r26 = new hze
            le1 r0 = r11.getId()
            long r1 = r0.a
            boolean r4 = r11.a()
            t8f r5 = r11.s()
            if (r31 != 0) goto L_0x00b0
            boolean r0 = r11.isConnected()
            if (r0 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r6 = r14
            goto L_0x00b1
        L_0x00b0:
            r6 = r12
        L_0x00b1:
            boolean r7 = r11.t()
            boolean r27 = r11.isScreenCaptureEnabled()
            t8f r28 = r11.p()
            r0 = r26
            r3 = r31
            r29 = r8
            r8 = r27
            r27 = r9
            r9 = r28
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = r29.getName()
            boolean r6 = r11.isScreenCaptureEnabled()
            int r1 = r11.r()
            if (r1 != r13) goto L_0x00de
            r1 = r34
            r2 = r12
            goto L_0x00e1
        L_0x00de:
            r1 = r34
            r2 = r14
        L_0x00e1:
            android.content.Context r8 = r1.a
            if (r31 == 0) goto L_0x00eb
            int r0 = defpackage.ftb.call_me_member
            java.lang.String r0 = r8.getString(r0)
        L_0x00eb:
            if (r2 == 0) goto L_0x00f0
            java.lang.String r3 = "  "
            goto L_0x00f2
        L_0x00f0:
            java.lang.String r3 = ""
        L_0x00f2:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0)
            r9 = 0
            if (r2 == 0) goto L_0x0141
            bi5 r0 = new bi5
            int r2 = defpackage.n1a.F
            r3 = -3259817(0xffffffffffce4257, float:NaN)
            android.graphics.drawable.Drawable r2 = defpackage.kjd.C(r2, r3, r8)
            r3 = 12
            float r3 = (float) r3
            android.content.res.Resources r5 = dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r3
            int r5 = defpackage.a24.X(r5)
            android.content.res.Resources r7 = dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r3 = r3 * r7
            int r3 = defpackage.a24.X(r3)
            r2.setBounds(r14, r14, r5, r3)
            r3 = 6
            r0.<init>(r2, r9, r3)
            r2 = 17
            r4.setSpan(r0, r14, r12, r2)
        L_0x0141:
            r0 = r34
            r1 = r4
            r2 = r31
            r3 = r17
            r4 = r15
            r5 = r33
            r7 = r35
            android.text.SpannableStringBuilder r3 = r0.c(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r11.o()
            java.lang.String r1 = r29.getName()
            if (r0 == 0) goto L_0x0161
            int r0 = defpackage.ftb.call_me_member
            java.lang.String r1 = r8.getString(r0)
        L_0x0161:
            boolean r0 = r11.o()
            if (r0 == 0) goto L_0x0174
            boolean r0 = r11.isConnected()
            if (r0 != 0) goto L_0x0174
            int r0 = defpackage.r1a.K1
            java.lang.String r9 = r8.getString(r0)
            goto L_0x018d
        L_0x0174:
            boolean r0 = r11.k()
            if (r0 == 0) goto L_0x0181
            int r0 = defpackage.r1a.Q1
            java.lang.String r9 = r8.getString(r0)
            goto L_0x018d
        L_0x0181:
            boolean r0 = r11.b()
            if (r0 != 0) goto L_0x018d
            int r0 = defpackage.r1a.P1
            java.lang.String r9 = r8.getString(r0)
        L_0x018d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r4 = r0.toString()
            if (r32 == 0) goto L_0x01a9
            boolean r0 = r11.h()
            r11 = r0
            goto L_0x01aa
        L_0x01a9:
            r11 = r14
        L_0x01aa:
            s91 r28 = new s91
            r0 = r28
            r1 = r18
            r2 = r19
            r5 = r27
            r6 = r22
            r7 = r23
            r8 = r15
            r9 = r20
            r10 = r21
            r12 = r31
            r13 = r24
            r14 = r25
            r15 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r28
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au7.c(qja, boolean, boolean, boolean, xk1, b65, le1):s91");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r9.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.yh1 d(defpackage.eoc r9, defpackage.qja r10, java.util.Map r11, boolean r12) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x000b
            aoc r1 = r9.b
            if (r1 == 0) goto L_0x000b
            le1 r1 = r1.c
            r6 = r1
            goto L_0x000c
        L_0x000b:
            r6 = r0
        L_0x000c:
            ne1 r10 = r10.a
            le1 r1 = r10.getId()
            boolean r3 = defpackage.hhd.f(r6, r1)
            boolean r4 = r10.m()
            if (r9 == 0) goto L_0x001e
            foc r0 = r9.a
        L_0x001e:
            foc r9 = defpackage.foc.a
            r10 = 1
            if (r0 != r9) goto L_0x0025
            r5 = r10
            goto L_0x0027
        L_0x0025:
            r9 = 0
            r5 = r9
        L_0x0027:
            java.lang.Object r9 = r11.get(r6)
            r8 = r9
            qja r8 = (defpackage.qja) r8
            r7 = r12 ^ 1
            yh1 r9 = new yh1
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au7.d(eoc, qja, java.util.Map, boolean):yh1");
    }

    public static final ws7 e(s91 s91, u81 u81, xk1 xk1) {
        int i;
        SpannableStringBuilder spannableStringBuilder;
        s91 s912 = s91;
        u81 u812 = u81;
        boolean z = u812.g;
        boolean z2 = false;
        boolean z3 = z ? false : s912.Y;
        boolean z4 = u812.t;
        String str = s912.b;
        boolean z5 = s912.w0;
        boolean z6 = u812.m;
        hze hze = s912.D0;
        boolean z7 = s912.A0;
        int i2 = s912.F0;
        if (z4 || z) {
            i = i2;
            spannableStringBuilder = null;
        } else {
            if (hze != null) {
                z2 = hze.g;
            }
            i = i2;
            spannableStringBuilder = xk1.f(z7, i2, str, z, z5, z6, z2, u812.e);
        }
        return new ws7(s912.X, str, s912.a, z3, z6, s912.Z, z5, hze, z7, s912.z0, i, spannableStringBuilder, s912.o);
    }

    public static final bga f(s91 s91, boolean z, boolean z2, boolean z3) {
        s91 s912 = s91;
        boolean z4 = false;
        boolean z5 = z ? s912.Y : false;
        if (z2 || z3) {
            z4 = s912.w0;
        }
        boolean z6 = z4;
        ize ize = z ? s912.E0 : null;
        if (ize == null) {
            ize = ize.o;
        }
        return new bga(s912.X, s912.b, s912.a, z5, s912.y0, z6, s912.D0, ize, s912.A0, s912.c);
    }
}
