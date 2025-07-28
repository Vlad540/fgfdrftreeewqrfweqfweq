package defpackage;

import android.net.Uri;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: i22  reason: default package */
public final class i22 implements Comparable {
    public final AtomicReference A0 = new AtomicReference((Object) null);
    public volatile CharSequence B0;
    public volatile ryb C0;
    public volatile String D0;
    public final t1a E0;
    public final go2 F0;
    public yia G0 = null;
    public final xm8 X;
    public final long Y;
    public final ArrayList Z = new ArrayList();
    public final long a;
    public final o62 b;
    public final xm8 c;
    public final xm8 o;
    public volatile String w0;
    public volatile CharSequence x0;
    public volatile CharSequence y0;
    public volatile CharSequence z0;

    public i22(t1a t1a, go2 go2, long j, long j2, o62 o62, xm8 xm8, xm8 xm82, xm8 xm83) {
        this.E0 = t1a;
        this.F0 = go2;
        this.a = j;
        this.Y = j2;
        this.b = o62;
        this.c = xm8;
        this.o = xm82;
        this.X = xm83;
    }

    public final boolean A() {
        o62 o62 = this.b;
        return o62 != null && o62.c == m62.a;
    }

    public final boolean B() {
        return A() && b0();
    }

    public final boolean C(long j) {
        return this.b.R.containsKey(Long.valueOf(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D() {
        /*
            r0 = this;
            o62 r0 = r0.b
            if (r0 == 0) goto L_0x000e
            j62 r0 = r0.K
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.D():boolean");
    }

    public final boolean E() {
        boolean z;
        synchronized (this.Z) {
            try {
                z = false;
                if (J() && !this.Z.isEmpty() && ((tf3) this.Z.get(0)).s()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean F() {
        tf3 k = k();
        return J() && k != null && k.t();
    }

    public final boolean G() {
        return this.b.b == n62.c;
    }

    public final boolean H() {
        return this.b.b == n62.b;
    }

    public final boolean I() {
        return this.b.c == m62.Y;
    }

    public final boolean J() {
        return this.b.b == n62.a;
    }

    public final boolean K() {
        return this.b.a().e != 0;
    }

    public final boolean L(f03 f03, ip ipVar) {
        if (S(f03)) {
            return true;
        }
        qpc qpc = (qpc) ipVar;
        return (J() ? qpc.o() : qpc.n()) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = r1.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M() {
        /*
            r6 = this;
            boolean r0 = r6.B()
            o62 r1 = r6.b
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r6 = r3
            goto L_0x0030
        L_0x000c:
            boolean r0 = r6.G()
            if (r0 == 0) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            boolean r0 = r6.a0()
            if (r0 == 0) goto L_0x001b
        L_0x0019:
            r6 = r2
            goto L_0x0030
        L_0x001b:
            d62 r0 = r1.H
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x0024
            goto L_0x0019
        L_0x0024:
            long r4 = r6.Y
            int r6 = r6.d(r4)
            r0 = 64
            boolean r6 = d8.v(r6, r0)
        L_0x0030:
            if (r6 == 0) goto L_0x0039
            int r6 = r1.c()
            if (r6 <= 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = r3
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.M():boolean");
    }

    public final boolean N() {
        return this.b.b == n62.o;
    }

    public final boolean O() {
        o62 o62 = this.b;
        return o62 != null && o62.c == m62.Z;
    }

    public final boolean P() {
        return H() && X() && A() && !b0();
    }

    public final boolean Q() {
        return !J() && this.b.c == m62.b;
    }

    public final boolean R(jb5 jb5) {
        if (this.b.J.b(64)) {
            return false;
        }
        if (!J()) {
            return G() ? ((kb5) jb5).s() ? w() : v() : A() && b0();
        }
        if (F()) {
            return !d0();
        }
        tf3 k = k();
        if (k == null) {
            return false;
        }
        return !k.s();
    }

    public final boolean S(f03 f03) {
        o62 o62 = this.b;
        return o62.a().a == -1 || o62.a().a > ((lqc) f03).m();
    }

    public final boolean T() {
        if (F()) {
            o62 o62 = this.b;
            if (o62.e0.b || this.c == null || o62.a == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean U() {
        return this.b.H.c;
    }

    public final boolean V(long j) {
        return j == this.b.d && A();
    }

    public final boolean W() {
        return this.b.r0 == 2;
    }

    public final boolean X() {
        return this.b.r0 == 1;
    }

    public final boolean Y() {
        return A() && C(this.Y);
    }

    public final boolean Z() {
        return Y() || this.b.e.containsKey(Long.valueOf(this.Y));
    }

    public final boolean a() {
        d62 d62;
        if (J() || !B()) {
            return false;
        }
        o62 o62 = this.b;
        if (o62.J.b(2)) {
            return false;
        }
        if (a0()) {
            return true;
        }
        boolean s = s();
        if (!G() && (d62 = o62.H) != null && !d62.b) {
            return true;
        }
        return s;
    }

    public final boolean a0() {
        return this.Y == this.b.d && A();
    }

    public final boolean b() {
        if (a0()) {
            if (G()) {
                return true;
            }
            o62 o62 = this.b;
            if ((!r1g.p(o62.I)) || o62.c() > 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean b0() {
        return this.b.e.containsKey(Long.valueOf(this.Y)) || D();
    }

    public final Long c(long j) {
        if (A() && C(j)) {
            return Long.valueOf(((x52) this.b.R.get(Long.valueOf(j))).c);
        }
        return null;
    }

    public final boolean c0() {
        boolean z = this.b.H.h;
        if (z) {
            return true;
        }
        tf3 k = k();
        return k != null ? k.v() : z;
    }

    public final int compareTo(Object obj) {
        return pfa.f(((i22) obj).n(), n());
    }

    public final int d(long j) {
        if (!A()) {
            return 0;
        }
        o62 o62 = this.b;
        if (j == o62.d) {
            return 2047;
        }
        if (o62.R.containsKey(Long.valueOf(j))) {
            return ((x52) o62.R.get(Long.valueOf(j))).b;
        }
        return 0;
    }

    public final boolean d0() {
        return this.b.e0.b;
    }

    public final long e() {
        o62 o62 = this.b;
        if (o62.f(this.Y)) {
            return 0;
        }
        tf3 k = k();
        return k != null ? k.n() : o62.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1.R.containsKey(java.lang.Long.valueOf(r3)) != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e0() {
        /*
            r10 = this;
            r0 = 0
            o62 r1 = r10.b
            if (r1 == 0) goto L_0x0089
            n62 r2 = defpackage.n62.c
            long r3 = r10.Y
            m62 r10 = defpackage.m62.Y
            m62 r5 = r1.c
            n62 r6 = r1.b
            r7 = 1
            java.util.Map r8 = r1.e
            if (r6 != r2) goto L_0x003a
            boolean r2 = r1.d()
            if (r2 != 0) goto L_0x0088
            if (r5 != r10) goto L_0x0089
            boolean r10 = r1.d()
            if (r10 == 0) goto L_0x002f
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            java.util.Map r1 = r1.R
            boolean r10 = r1.containsKey(r10)
            if (r10 == 0) goto L_0x002f
            goto L_0x0088
        L_0x002f:
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            boolean r10 = r8.containsKey(r10)
            if (r10 == 0) goto L_0x0089
            goto L_0x0088
        L_0x003a:
            boolean r2 = r1.e()
            if (r2 == 0) goto L_0x0048
            boolean r2 = r1.d()
            if (r2 == 0) goto L_0x0048
            r2 = r7
            goto L_0x0049
        L_0x0048:
            r2 = r0
        L_0x0049:
            boolean r6 = r1.e()
            if (r6 != 0) goto L_0x0072
            if (r5 != r10) goto L_0x0072
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            boolean r10 = r8.containsKey(r10)
            if (r10 != 0) goto L_0x0063
            j62 r10 = r1.K
            if (r10 == 0) goto L_0x0072
            boolean r10 = r10.c
            if (r10 == 0) goto L_0x0072
        L_0x0063:
            long r8 = r1.d
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0070
            boolean r10 = r1.d()
            if (r10 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r10 = r7
            goto L_0x0073
        L_0x0072:
            r10 = r0
        L_0x0073:
            if (r2 != 0) goto L_0x0088
            boolean r2 = r1.d()
            if (r2 != 0) goto L_0x0088
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x0086
            m62 r1 = defpackage.m62.b
            if (r5 != r1) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            if (r10 == 0) goto L_0x0089
        L_0x0088:
            r0 = r7
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.e0():boolean");
    }

    public final String f(fj0 fj0, ej0 ej0) {
        o62 o62 = this.b;
        t1a t1a = this.E0;
        if (t1a != null) {
            String str = o62.f(((aqc) t1a.a.getValue()).a()) ? (String) t1a.b.getValue() : null;
            if (str != null) {
                return str;
            }
        }
        tf3 k = k();
        if (k == null) {
            return o62.b(fj0, ej0);
        }
        Uri x = at7.x(vx3.t(k.a.c.c, fj0, ej0));
        if (x == null) {
            return null;
        }
        return x.toString();
    }

    public final boolean f0() {
        xm8 xm8 = this.c;
        return xm8 != null && xm8.a.v() && xm8.a.f().a == s00.o && xm8.a.f().b == this.Y;
    }

    public final List g() {
        String b2;
        lg7 lg7 = null;
        o62 o62 = this.b;
        t1a t1a = this.E0;
        if (t1a != null) {
            List list = o62.f(((aqc) t1a.a.getValue()).a()) ? (List) t1a.c.getValue() : null;
            if (list != null) {
                return list;
            }
        }
        tf3 k = k();
        if (k != null) {
            return k.r();
        }
        String str = o62.h;
        yia yia = this.G0;
        if (yia == null || !xs7.m(yia.a, str)) {
            fj0 fj0 = fj0.b;
            fj0 fj02 = fj0.o;
            lg7 c2 = hwf.c();
            zcc it = new nv7(ij0.a).iterator();
            while (true) {
                ListIterator listIterator = it.b;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                fj0 fj03 = (fj0) listIterator.previous();
                if (fj03.compareTo(fj0) >= 0 && fj03.compareTo(fj02) <= 0 && (b2 = o62.b(fj03, ej0.a)) != null) {
                    c2.add(b2);
                }
            }
            lg7 a2 = hwf.a(c2);
            if (!a2.isEmpty()) {
                lg7 = a2;
            }
            this.G0 = new yia(str, lg7);
        }
        return (List) this.G0.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0() {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            java.lang.CharSequence r2 = r0.z0
            if (r2 == 0) goto L_0x0008
            return
        L_0x0008:
            go2 r2 = r0.F0
            r2.getClass()
            xm8 r3 = r0.c
            if (r3 == 0) goto L_0x0091
            nj4 r2 = r2.b
            java.lang.Object r2 = r2.get()
            r8 = r2
            w6a r8 = (w6a) r8
            vo8 r2 = r3.a
            boolean r5 = r2.v()
            tf3 r7 = r3.b
            r6 = 0
            r10 = 1
            if (r5 == 0) goto L_0x0038
            t00 r5 = r2.f()
            s00 r5 = r5.a
            s00 r9 = defpackage.s00.w0
            if (r5 != r9) goto L_0x0038
            t00 r3 = r2.f()
            java.lang.String r3 = r3.j
            goto L_0x00cb
        L_0x0038:
            boolean r5 = r2.v()
            if (r5 == 0) goto L_0x005e
            t00 r5 = r2.f()
            s00 r5 = r5.a
            s00 r9 = defpackage.s00.y0
            if (r5 != r9) goto L_0x005e
            xm8 r5 = r3.o
            if (r5 == 0) goto L_0x005e
            ho2 r2 = r5.w0
            ma2 r2 = (ma2) r2
            r2.getClass()
            xm8 r3 = r0.X
            if (r3 != 0) goto L_0x0058
            goto L_0x0091
        L_0x0058:
            android.text.SpannableString r1 = ma2.e(r2, r0, r3, r1)
            goto L_0x01c3
        L_0x005e:
            boolean r5 = r2.r()
            if (r5 == 0) goto L_0x007c
            boolean r1 = r7.Y
            if (r1 == 0) goto L_0x0072
            android.content.Context r1 = r8.a
            int r2 = defpackage.avb.tt_you_send_message
            java.lang.String r1 = r1.getString(r2)
            goto L_0x01c3
        L_0x0072:
            android.content.Context r1 = r8.a
            int r2 = defpackage.avb.tt_new_message
            java.lang.String r1 = r1.getString(r2)
            goto L_0x01c3
        L_0x007c:
            o1b r3 = r3.X
            r3.f = r0
            w6a r5 = r3.a
            int r9 = r5.f()
            int r5 = r5.e()
            r3.i(r0, r9, r5)
            java.lang.CharSequence r3 = r3.g
            if (r3 != 0) goto L_0x0094
        L_0x0091:
            r1 = 0
            goto L_0x01c3
        L_0x0094:
            java.lang.String r3 = r3.toString()
            java.util.regex.Pattern r5 = defpackage.ehe.a
            int r5 = r3.length()
            r9 = 200(0xc8, float:2.8E-43)
            if (r5 > r9) goto L_0x00a3
            goto L_0x00cb
        L_0x00a3:
            java.lang.String r3 = r3.substring(r6, r9)
            int r5 = r3.length()
            int r5 = r5 - r10
            char r5 = r3.charAt(r5)
            boolean r5 = java.lang.Character.isHighSurrogate(r5)
            if (r5 == 0) goto L_0x00c5
            int r5 = r3.length()
            if (r5 <= r10) goto L_0x00c5
            int r5 = r3.length()
            int r5 = r5 - r10
            java.lang.String r3 = r3.substring(r6, r5)
        L_0x00c5:
            java.lang.String r5 = "…"
            java.lang.String r3 = hr1.g(r3, r5)
        L_0x00cb:
            r8.getClass()
            r5 = 18
            int r9 = defpackage.dh4.b(r5)
            nu4 r11 = r8.j
            java.lang.CharSequence r3 = r11.b(r9, r3)
            java.lang.CharSequence r3 = mt0.F(r3)
            java.util.List r9 = r2.V0
            int r5 = defpackage.dh4.b(r5)
            java.lang.CharSequence r3 = r8.j(r3, r9, r5)
            p7c r5 = defpackage.ge.a
            if (r3 == 0) goto L_0x0188
            int r5 = r3.length()
            if (r5 != 0) goto L_0x00f4
            goto L_0x0188
        L_0x00f4:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            r9 = r6
            r11 = r9
        L_0x00fb:
            int r12 = r3.length()
            if (r9 >= r12) goto L_0x0132
            char r12 = r3.charAt(r9)
            r13 = 10
            if (r12 == r13) goto L_0x0110
            r13 = 13
            if (r12 != r13) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r13 = r6
            goto L_0x0111
        L_0x0110:
            r13 = r10
        L_0x0111:
            boolean r14 = iu7.G(r12)
            if (r13 != 0) goto L_0x011f
            if (r14 == 0) goto L_0x011a
            goto L_0x011f
        L_0x011a:
            r5.append(r12)
            r11 = r6
            goto L_0x0130
        L_0x011f:
            if (r11 != 0) goto L_0x012f
            if (r9 <= 0) goto L_0x012f
            int r11 = r3.length()
            int r11 = r11 - r10
            if (r9 >= r11) goto L_0x012f
            r11 = 32
            r5.append(r11)
        L_0x012f:
            r11 = r10
        L_0x0130:
            int r9 = r9 + r1
            goto L_0x00fb
        L_0x0132:
            boolean r9 = r3 instanceof android.text.Spanned
            if (r9 != 0) goto L_0x013b
            android.text.SpannableString r3 = android.text.SpannableString.valueOf(r5)
            goto L_0x0188
        L_0x013b:
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r9 = r3.length()
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            java.lang.Object[] r9 = r3.getSpans(r6, r9, r11)
            int r11 = r9.length
            r12 = r6
            r13 = r12
        L_0x014a:
            if (r12 >= r11) goto L_0x0184
            r14 = r9[r12]
            int r15 = r3.getSpanStart(r14)
            int r4 = r3.getSpanEnd(r14)
            int r10 = r3.getSpanFlags(r14)
            java.lang.CharSequence r4 = r3.subSequence(r15, r4)
            java.lang.String r4 = r4.toString()
            p7c r15 = defpackage.ge.a
            java.lang.String r1 = " "
            java.lang.String r4 = r15.b(r1, r4)
            p7c r15 = defpackage.ge.b
            java.lang.String r1 = r15.b(r1, r4)
            r4 = 4
            int r4 = h0e.a0(r5, r1, r13, r6, r4)
            if (r4 < 0) goto L_0x0180
            int r1 = r1.length()
            int r13 = r1 + r4
            r5.setSpan(r14, r4, r13, r10)
        L_0x0180:
            r1 = 1
            int r12 = r12 + r1
            r10 = 1
            goto L_0x014a
        L_0x0184:
            android.text.SpannableString r3 = android.text.SpannableString.valueOf(r5)
        L_0x0188:
            boolean r1 = r2.v()
            if (r1 == 0) goto L_0x01c2
            boolean r1 = r1g.p(r3)
            if (r1 != 0) goto L_0x01c2
            if (r7 == 0) goto L_0x01c2
            java.lang.String r5 = r3.toString()
            t00 r6 = r2.f()
            r8.getClass()
            s00 r1 = r6.a
            int r1 = r1.ordinal()
            switch(r1) {
                case 1: goto L_0x01bb;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01ab;
                case 4: goto L_0x01bb;
                case 5: goto L_0x01bb;
                case 6: goto L_0x01bb;
                case 7: goto L_0x01aa;
                case 8: goto L_0x01bb;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            goto L_0x01c0
        L_0x01ab:
            t97 r1 = r8.d
            java.lang.Object r1 = r1.getValue()
            r9 = r1
            di3 r9 = (defpackage.di3) r9
            r1 = 1
            r10 = r1
            android.text.SpannableStringBuilder r5 = defpackage.dhe.b(r5, r6, r7, r8, r9, r10)
            goto L_0x01c0
        L_0x01bb:
            r1 = 1
            java.lang.CharSequence r5 = defpackage.dhe.a(r5, r7, r8, r1)
        L_0x01c0:
            r1 = r5
            goto L_0x01c3
        L_0x01c2:
            r1 = r3
        L_0x01c3:
            r0.z0 = r1
            o62 r1 = r0.b
            j4a r1 = r1.f0
            if (r1 == 0) goto L_0x0229
            java.lang.String r1 = r1.c()
            boolean r1 = r1g.q(r1)
            if (r1 == 0) goto L_0x0229
            go2 r1 = r0.F0
            o62 r0 = r0.b
            j4a r0 = r0.f0
            java.lang.String r0 = r0.c()
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            fj r2 = defpackage.qh.c
            if (r2 != 0) goto L_0x01ec
            goto L_0x0229
        L_0x01ec:
            nj4 r3 = r1.e
            java.lang.Object r3 = r3.get()
            xzc r3 = (defpackage.xzc) r3
            r3.getClass()
            java.util.Set r3 = java.util.Collections.emptySet()
            r4 = 5
            boolean r3 = a06.s(r4, r3)
            if (r3 != 0) goto L_0x0203
            goto L_0x0229
        L_0x0203:
            nj4 r1 = r1.b
            java.lang.Object r1 = r1.get()
            w6a r1 = (w6a) r1
            nu4 r1 = r1.j
            java.lang.CharSequence r0 = r1.e(r0)
            java.util.List r0 = r2.a(r0)
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0220
            goto L_0x0229
        L_0x0220:
            java.lang.Object r0 = r0.next()
            hr1.r(r0)
            r0 = 0
            throw r0
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.g0():void");
    }

    public final long h(long j, md4 md4) {
        h62 y = oyb.y(j, this.b.n.d(md4));
        if (y != null) {
            long j2 = y.a;
            long j3 = y.b;
            if (j2 == j3) {
                return 0;
            }
            return j3;
        }
        return 0;
    }

    public final void h0() {
        if (this.y0 == null) {
            if (this.b.f(this.Y)) {
                this.y0 = p();
                return;
            }
            go2 go2 = this.F0;
            String p = p();
            nj4 nj4 = go2.b;
            w6a w6a = (w6a) nj4.get();
            w6a.getClass();
            float d = dh4.d(((j2b) w6a.i).c.g.getFloat("app.extra.text.size.sp", 0.0f));
            this.y0 = ((w6a) nj4.get()).j.b((int) (d + ((float) a24.X(TypedValue.applyDimension(2, (float) 16, dh4.c().getDisplayMetrics())))), p);
        }
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.Z) {
            arrayList.addAll(this.Z);
        }
        return arrayList;
    }

    public final void i0() {
        if (this.B0 == null) {
            t1a t1a = this.E0;
            if (t1a != null) {
                if (this.b.f(((aqc) t1a.a.getValue()).a())) {
                    this.B0 = "";
                    return;
                }
            }
            tf3 k = k();
            if (k != null) {
                this.B0 = k.m();
                return;
            }
            go2 go2 = this.F0;
            String p = p();
            nj4 nj4 = go2.b;
            Pattern pattern = t5a.a;
            this.B0 = ((w6a) nj4.get()).j.e(t5a.a(p, (w6a) nj4.get()));
        }
    }

    public final String j() {
        if (J() && k() != null) {
            return k().a.c.o;
        }
        if (H() || G()) {
            return this.b.E;
        }
        return null;
    }

    public final void j0() {
        String str;
        go2 go2 = this.F0;
        long j = this.Y;
        boolean f = this.b.f(((aqc) go2.g.get()).a());
        nj4 nj4 = go2.b;
        if (f) {
            str = ((w6a) nj4.get()).a.getString(avb.saved_messages);
        } else {
            String str2 = null;
            if (J()) {
                tf3 k = k();
                if (k != null) {
                    str2 = k.d();
                }
            } else {
                o62 o62 = this.b;
                if (!r1g.p(o62.g)) {
                    str2 = o62.g;
                } else {
                    ArrayList i = i();
                    if (!G() && !i.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        Iterator it = i.iterator();
                        while (it.hasNext()) {
                            tf3 tf3 = (tf3) it.next();
                            if (!tf3.w() && j != tf3.n()) {
                                sb.append(tf3.d().trim());
                                sb.append(", ");
                            }
                        }
                        if (sb.length() > 0) {
                            sb.delete(sb.length() - 2, sb.length());
                        }
                        str2 = sb.toString().trim();
                    } else if (G()) {
                        str2 = "";
                    }
                }
            }
            str = str2 == null ? ((w6a) nj4.get()).a.getString(avb.tt_chat_participants_empty__title) : str2;
        }
        this.w0 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.tf3 k() {
        /*
            r2 = this;
            java.util.ArrayList r0 = r2.Z
            monitor-enter(r0)
            boolean r1 = r2.J()     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x001e
            java.util.ArrayList r1 = r2.Z     // Catch:{ all -> 0x001c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r2 = r2.Z     // Catch:{ all -> 0x001c }
            r1 = 0
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x001c }
            tf3 r2 = (defpackage.tf3) r2     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r2
        L_0x001c:
            r2 = move-exception
            goto L_0x0021
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            r2 = 0
            return r2
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i22.k():tf3");
    }

    public final boolean k0() {
        return this.b.e0.a || F();
    }

    public final long l() {
        xm8 xm8 = this.c;
        if (xm8 != null) {
            return xm8.a.k();
        }
        return 0;
    }

    public final void l0(di3 di3) {
        di3.b();
        synchronized (this.Z) {
            try {
                this.Z.clear();
                for (Long longValue : this.b.e.keySet()) {
                    tf3 i = di3.i(longValue.longValue(), true);
                    long n = i.n();
                    long j = this.Y;
                    if (n != j || this.b.f(j)) {
                        this.Z.add(i);
                    }
                }
                j0();
            } finally {
                while (true) {
                }
            }
        }
        this.y0 = null;
        this.z0 = null;
        this.B0 = null;
        this.A0.set((Object) null);
    }

    public final long m() {
        boolean G = G();
        xm8 xm8 = this.c;
        if (!G || !I()) {
            o62 o62 = this.b;
            Map map = o62.e;
            long j = this.Y;
            Long l = (Long) map.get(Long.valueOf(j));
            if (l != null && l.longValue() != 0) {
                return l.longValue();
            }
            if (xm8 == null) {
                return 0;
            }
            if (!b0() || xm8.a.Y == j || ((G() && !Z()) || D())) {
                return xm8.a.o;
            }
            long j2 = xm8.a.o;
            long j3 = o62.P;
            return j2 <= j3 ? j2 - 1 : j3;
        } else if (xm8 != null) {
            return xm8.a.o;
        } else {
            return 0;
        }
    }

    public final long n() {
        return pfa.n(l(), this.b);
    }

    public final CharSequence o() {
        this.x0 = this.F0.a(this);
        return this.x0;
    }

    public final String p() {
        if (this.w0 == null) {
            j0();
        }
        return this.w0;
    }

    public final boolean q() {
        if (!B()) {
            return false;
        }
        return a0() || d8.v(d(this.Y), 4);
    }

    public final boolean r() {
        d62 d62;
        o62 o62 = this.b;
        if (o62.J.b(1) || !B()) {
            return false;
        }
        if (a0()) {
            return true;
        }
        boolean v = d8.v(d(this.Y), 2);
        if (!G() && (d62 = o62.H) != null && !d62.d) {
            return true;
        }
        return v;
    }

    public final boolean s() {
        if (!B()) {
            return false;
        }
        return a0() || d8.v(d(this.Y), 8);
    }

    public final boolean t() {
        xm8 xm8 = this.o;
        return (xm8 == null || xm8.a.z0 == ls8.DELETED || m() >= xm8.a.o) ? false : true;
    }

    public final String toString() {
        return "Chat{id=" + this.a + ",data=" + this.b + '}';
    }

    public final boolean u() {
        d62 d62;
        if (J() || N()) {
            return false;
        }
        o62 o62 = this.b;
        if (o62.J.b(16) || !B() || o62.J.b(16)) {
            return false;
        }
        if (a0()) {
            return true;
        }
        boolean v = d8.v(d(this.Y), 16);
        if (!G() && (d62 = o62.H) != null && d62.e) {
            return true;
        }
        return v;
    }

    public final boolean v() {
        return a0() || d8.v(d(this.Y), 1);
    }

    public final boolean w() {
        return a0() || d8.v(d(this.Y), 256);
    }

    public final boolean x() {
        if (!B() || G()) {
            return false;
        }
        d62 d62 = this.b.H;
        if (d62 == null || !d62.i) {
            return d8.v(d(this.Y), 128);
        }
        return true;
    }

    public final boolean y() {
        return t() && this.o.a.p(this.Y);
    }

    public final boolean z() {
        sq8 sq8;
        xm8 xm8;
        tf3 tf3;
        if (!y()) {
            if (t()) {
                xm8 xm82 = this.o;
                long j = xm82.a.Y;
                long j2 = this.Y;
                if (j == j2 || (sq8 = xm82.c) == null || (xm8 = sq8.c) == null || (tf3 = xm8.b) == null || tf3.n() != j2) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }
}
