package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o1b  reason: default package */
public final class o1b {
    public final w6a a;
    public final di3 b;
    public final g2b c;
    public final vo8 d;
    public final rj e;
    public i22 f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public String k;
    public String l;
    public String m;
    public l04 n;
    public boolean o;
    public boolean p;
    public boolean q;

    public o1b(w6a w6a, di3 di3, g2b g2b, vo8 vo8, i22 i22, rj rjVar) {
        this.a = w6a;
        this.b = di3;
        this.c = g2b;
        this.d = vo8;
        this.e = rjVar;
        if (i22 != null) {
            h(i22);
            return;
        }
        d();
        f();
        e();
        c(w6a.g());
    }

    public final String a(i22 i22, vo8 vo8) {
        boolean z = ((j2b) this.c).c.g.getBoolean("audio.transcription.enabled", true);
        boolean m2 = vo8.m();
        String str = vo8.w0;
        if (!m2) {
            return str;
        }
        if (!vo8.B() && !r1g.p(str)) {
            return str;
        }
        w6a w6a = this.a;
        if (i22 == null || i22.G() || i22.J() || i22.N()) {
            return w6a.e.f(w6a.a, w6a, vo8, false, false, false, z, w6a.c.s(), true);
        }
        String f2 = w6a.e.f(w6a.a, w6a, vo8, false, false, false, z, w6a.c.s(), true);
        w6a.e.f(w6a.a, w6a, vo8, false, false, false, z, w6a.c.s(), true);
        return f2;
    }

    public final CharSequence b(i22 i22) {
        this.f = i22;
        w6a w6a = this.a;
        i(i22, w6a.f(), w6a.e());
        return this.i;
    }

    public final void c(int i2) {
        tf3 i3 = this.b.i(this.d.Y, true);
        if (this.h == null) {
            this.h = this.a.j.b(i2, i3.d());
        }
    }

    public final void d() {
        if (this.n == null) {
            vo8 vo8 = this.d;
            this.n = l04.g(vo8.n() ? vo8.X0.a : vo8.k(), TimeZone.getDefault());
        }
    }

    public final void e() {
        String str;
        if (this.l == null) {
            d();
            l04 l04 = this.n;
            w6a w6a = this.a;
            Locale u = w6a.c.u();
            l04 g2 = l04.g(System.currentTimeMillis(), TimeZone.getDefault());
            boolean C = xs7.C(g2, l04);
            Context context = w6a.a;
            if (C) {
                str = context.getString(avb.tt_dates_today);
            } else {
                l04.f();
                Integer num = l04.c;
                l04.f();
                l04 l2 = new l04(l04.a, l04.b, num, (Integer) null, (Integer) null, (Integer) null, 0).l(1);
                g2.f();
                Integer num2 = g2.c;
                g2.f();
                if (l2.equals(new l04(g2.a, g2.b, num2, (Integer) null, (Integer) null, (Integer) null, 0))) {
                    str = context.getString(avb.tt_dates_yesterday);
                } else {
                    long h2 = l04.h(TimeZone.getDefault());
                    str = g2.a.equals(l04.a) ? xs7.w(u, h2, false) : xs7.w(u, h2, true);
                }
            }
            this.l = str;
        }
    }

    public final void f() {
        if (this.k == null) {
            vo8 vo8 = this.d;
            long k2 = vo8.n() ? vo8.X0.a : vo8.k();
            w6a w6a = this.a;
            this.k = xs7.p(w6a.a, k2, w6a.c.u());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.i22 r15) {
        /*
            r14 = this;
            boolean r0 = r14.p
            if (r0 != 0) goto L_0x0069
            vo8 r0 = r14.d
            boolean r1 = r0.v()
            g2b r2 = r14.c
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001b
            r5 = r2
            j2b r5 = (defpackage.j2b) r5
            i03 r5 = r5.a
            r5.getClass()
            goto L_0x001d
        L_0x001b:
            r5 = r3
            goto L_0x001e
        L_0x001d:
            r5 = r4
        L_0x001e:
            java.lang.CharSequence r6 = r14.g
            boolean r6 = r1g.p(r6)
            if (r6 != 0) goto L_0x0067
            if (r5 == 0) goto L_0x0067
            java.lang.CharSequence r8 = r14.g
            if (r15 == 0) goto L_0x003a
            boolean r5 = r15.H()
            if (r5 != 0) goto L_0x0038
            boolean r5 = r15.N()
            if (r5 == 0) goto L_0x003a
        L_0x0038:
            r9 = r4
            goto L_0x003b
        L_0x003a:
            r9 = r3
        L_0x003b:
            if (r15 == 0) goto L_0x0045
            boolean r15 = r15.k0()
            if (r15 == 0) goto L_0x0045
            r10 = r4
            goto L_0x0046
        L_0x0045:
            r10 = r3
        L_0x0046:
            r11 = r1 ^ 1
            j2b r2 = (defpackage.j2b) r2
            i03 r15 = r2.a
            long r1 = r15.s()
            long r5 = r0.Y
            int r15 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r15 == 0) goto L_0x0058
            r13 = r4
            goto L_0x0059
        L_0x0058:
            r13 = r3
        L_0x0059:
            w6a r7 = r14.a
            java.util.List r12 = r0.V0
            java.lang.CharSequence r15 = r7.a(r8, r9, r10, r11, r12, r13)
            java.lang.CharSequence r15 = mt0.F(r15)
            r14.g = r15
        L_0x0067:
            r14.p = r4
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1b.g(i22):void");
    }

    public final void h(i22 i22) {
        this.f = i22;
        w6a w6a = this.a;
        i(i22, w6a.f(), w6a.e());
        g(i22);
        d();
        f();
        e();
        c(w6a.g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(defpackage.i22 r24, int r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r0.o
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            vo8 r2 = r0.d
            boolean r3 = r2.v()
            r13 = 0
            di3 r14 = r0.b
            r15 = 1
            w6a r11 = r0.a
            long r9 = r2.Y
            if (r3 == 0) goto L_0x004d
            if (r1 == 0) goto L_0x0047
            boolean r6 = r24.G()
            tf3 r8 = r14.i(r9, r15)
            t97 r3 = r11.d
            java.lang.Object r3 = r3.getValue()
            r5 = r3
            di3 r5 = (defpackage.di3) r5
            i03 r3 = r11.c
            long r16 = r3.s()
            r12 = 0
            android.content.Context r3 = r11.a
            r18 = 0
            r4 = r11
            r7 = r2
            r19 = r9
            r9 = r18
            r10 = r12
            r18 = r11
            r11 = r16
            java.lang.CharSequence r3 = defpackage.dhe.k(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0055
        L_0x0047:
            r19 = r9
            r18 = r11
            r3 = r13
            goto L_0x0055
        L_0x004d:
            r19 = r9
            r18 = r11
            java.lang.String r3 = r0.a(r1, r2)
        L_0x0055:
            boolean r4 = r2.v()
            r10 = 0
            if (r4 == 0) goto L_0x0099
            boolean r4 = r1g.p(r3)
            if (r4 != 0) goto L_0x0099
            java.lang.String r4 = r3.toString()
            t00 r5 = r2.f()
            r11 = r19
            tf3 r6 = r14.i(r11, r10)
            r18.getClass()
            s00 r3 = r5.a
            int r3 = r3.ordinal()
            switch(r3) {
                case 1: goto L_0x0092;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0092;
                case 5: goto L_0x0092;
                case 6: goto L_0x0092;
                case 7: goto L_0x007c;
                case 8: goto L_0x0092;
                default: goto L_0x007c;
            }
        L_0x007c:
            r3 = r4
            r14 = r18
            goto L_0x009d
        L_0x0080:
            r14 = r18
            t97 r3 = r14.d
            java.lang.Object r3 = r3.getValue()
            r8 = r3
            di3 r8 = (defpackage.di3) r8
            r7 = r14
            r9 = r10
            android.text.SpannableStringBuilder r3 = defpackage.dhe.b(r4, r5, r6, r7, r8, r9)
            goto L_0x009d
        L_0x0092:
            r14 = r18
            java.lang.CharSequence r3 = defpackage.dhe.a(r4, r6, r14, r10)
            goto L_0x009d
        L_0x0099:
            r14 = r18
            r11 = r19
        L_0x009d:
            boolean r4 = r1g.p(r3)
            if (r4 != 0) goto L_0x0133
            r2.v()
            nu4 r4 = r14.j
            r5 = r25
            java.lang.CharSequence r4 = r4.b(r5, r3)
            java.lang.CharSequence r4 = mt0.F(r4)
            r0.g = r4
            boolean r4 = r2.m()
            if (r4 != 0) goto L_0x00db
            java.lang.CharSequence r4 = r0.g
            nu4 r6 = r14.j
            java.util.List r4 = r6.c(r4)
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x00db
            int r4 = r4.size()
            r6 = 3
            if (r4 > r6) goto L_0x00db
            java.lang.CharSequence r4 = r0.g
            nu4 r6 = r14.j
            boolean r4 = r6.g(r4)
            if (r4 == 0) goto L_0x00db
            r4 = r15
            goto L_0x00dc
        L_0x00db:
            r4 = r10
        L_0x00dc:
            g2b r6 = r0.c
            j2b r6 = (defpackage.j2b) r6
            i03 r6 = r6.a
            long r6 = r6.s()
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x00ed
            r20 = r15
            goto L_0x00ef
        L_0x00ed:
            r20 = r10
        L_0x00ef:
            java.lang.CharSequence r6 = r0.g
            rj r7 = r0.e
            boolean r22 = r7.a()
            if (r6 != 0) goto L_0x00fe
            r14.getClass()
            r5 = r13
            goto L_0x0110
        L_0x00fe:
            v6a r7 = r14.n
            r19 = 1
            java.util.List r8 = r2.V0
            r16 = r7
            r17 = r6
            r18 = r8
            r21 = r25
            java.lang.CharSequence r5 = r16.a(r17, r18, r19, r20, r21, r22)
        L_0x0110:
            java.lang.CharSequence r5 = mt0.F(r5)
            r0.g = r5
            boolean r5 = r2.m()
            if (r5 != 0) goto L_0x0130
            if (r4 == 0) goto L_0x012d
            java.util.List r2 = r2.V0
            r4 = r26
            java.lang.CharSequence r2 = r14.j(r3, r2, r4)
            java.lang.CharSequence r2 = mt0.F(r2)
            r0.i = r2
            goto L_0x0139
        L_0x012d:
            r0.i = r13
            goto L_0x0139
        L_0x0130:
            r0.i = r13
            goto L_0x0139
        L_0x0133:
            java.lang.String r2 = ""
            r0.g = r2
            r0.i = r13
        L_0x0139:
            java.lang.CharSequence r2 = r0.g
            if (r1 == 0) goto L_0x01c5
            boolean r3 = r24.k0()
            if (r3 == 0) goto L_0x01c5
            boolean r3 = r1g.p(r2)
            if (r3 != 0) goto L_0x01c5
            boolean r1 = r24.J()
            if (r1 == 0) goto L_0x0152
            java.util.regex.Pattern r1 = defpackage.ehe.c
            goto L_0x0154
        L_0x0152:
            java.util.regex.Pattern r1 = defpackage.ehe.e
        L_0x0154:
            r14.getClass()
            java.util.regex.Pattern r3 = gla.a
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r2)
            java.util.regex.Matcher r1 = r1.matcher(r4)
            r2 = r10
        L_0x0163:
            boolean r2 = r1.find(r2)
            if (r2 == 0) goto L_0x01bf
            java.util.regex.Matcher r2 = r3.matcher(r4)
            r5 = r10
        L_0x016e:
            boolean r6 = r2.find()
            if (r6 == 0) goto L_0x018e
            int r6 = r2.start()
            int r7 = r1.end()
            if (r6 > r7) goto L_0x018e
            java.lang.String r6 = r2.group()
            java.lang.String r7 = r1.group()
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x016e
            r5 = r15
            goto L_0x016e
        L_0x018e:
            if (r5 == 0) goto L_0x0195
            int r2 = r1.end()
            goto L_0x0163
        L_0x0195:
            java.lang.String r2 = r1.group()
            java.lang.String r5 = "/﻿"
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x01ba
            java.lang.String r2 = r1.group()
            r6 = 47
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r2 = r2.replace(r6, r5)
            int r5 = r1.start()
            int r6 = r1.end()
            r4.replace(r5, r6, r2)
        L_0x01ba:
            int r2 = r1.end()
            goto L_0x0163
        L_0x01bf:
            int r1 = defpackage.bmd.a
            bmd r2 = defpackage.oa2.F(r4, r15)
        L_0x01c5:
            r0.g = r2
            r0.o = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1b.i(i22, int, int):void");
    }
}
