package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* renamed from: nzd  reason: default package */
public final class nzd extends mye {
    public y1d A;
    public y1d B;
    public z1d C;
    public final ozd p;
    public final zcf q;
    public final q97 r;
    public final q97 s;
    public ydc t;
    public ydc u;
    public ez2 v;
    public o4e w;
    public o4e x;
    public o4e y;
    public o4e z;

    public nzd(hu1 hu1, hu1 hu12, q97 q97, q97 q972, HashSet hashSet, sye sye) {
        super(K(hashSet));
        this.p = K(hashSet);
        this.r = q97;
        this.s = q972;
        this.q = new zcf(hu1, hu12, hashSet, sye, new sic(18, this));
    }

    public static ArrayList J(mye mye) {
        ArrayList arrayList = new ArrayList();
        if (mye instanceof nzd) {
            for (mye mye2 : ((nzd) mye).q.a) {
                arrayList.add(mye2.f.t());
            }
        } else {
            arrayList.add(mye.f.t());
        }
        return arrayList;
    }

    public static ozd K(HashSet hashSet) {
        fc9 c = fc9.c();
        new e3(c);
        c.j(qq6.z, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            mye mye = (mye) it.next();
            if (mye.f.l(pye.s0)) {
                arrayList.add(mye.f.t());
            }
        }
        c.j(ozd.b, arrayList);
        c.j(br6.E, 2);
        return new ozd(hga.a(c));
    }

    public final void F() {
        z1d z1d = this.C;
        if (z1d != null) {
            z1d.b();
            this.C = null;
        }
        o4e o4e = this.w;
        if (o4e != null) {
            o4e.c();
            this.w = null;
        }
        o4e o4e2 = this.x;
        if (o4e2 != null) {
            o4e2.c();
            this.x = null;
        }
        o4e o4e3 = this.y;
        if (o4e3 != null) {
            o4e3.c();
            this.y = null;
        }
        o4e o4e4 = this.z;
        if (o4e4 != null) {
            o4e4.c();
            this.z = null;
        }
        ydc ydc = this.u;
        if (ydc != null) {
            ydc.release();
            this.u = null;
        }
        ez2 ez2 = this.v;
        if (ez2 != null) {
            ((r4e) ez2.a).release();
            gt0.I(new oc4(6, ez2));
            this.v = null;
        }
        ydc ydc2 = this.t;
        if (ydc2 != null) {
            ydc2.release();
            this.t = null;
        }
    }

    public final List G(String str, String str2, pye pye, va0 va0, va0 va02) {
        boolean z2;
        ydc ydc;
        va0 va03 = va0;
        va0 va04 = va02;
        gt0.i();
        zcf zcf = this.q;
        if (va04 == null) {
            H(str, str2, pye, va0, (va0) null);
            hu1 c = c();
            Objects.requireNonNull(c);
            k5f k5f = this.m;
            if (k5f == null || k5f.b != 1) {
                ydc = new ydc(c, new bb4(va03.b));
            } else {
                ydc = new ydc(c, new s4e(k5f));
                this.t = ydc;
            }
            this.u = ydc;
            boolean z3 = this.i != null;
            o4e o4e = this.y;
            int k = k();
            zcf.getClass();
            HashMap hashMap = new HashMap();
            for (mye mye : zcf.a) {
                hashMap.put(mye, zcf.q(mye, zcf.z0, zcf.Y, o4e, k, z3));
            }
            rp4 J = this.u.J(new ab0(this.y, new ArrayList(hashMap.values())));
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                hashMap2.put((mye) entry.getKey(), (o4e) J.get(entry.getValue()));
            }
            zcf.u(hashMap2);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{this.A.c()}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        H(str, str2, pye, va0, va02);
        Matrix matrix = this.j;
        hu1 i = i();
        Objects.requireNonNull(i);
        boolean n = i.n();
        Rect rect = this.i;
        if (rect != null) {
            z2 = false;
        } else {
            Size size = va04.a;
            z2 = false;
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        hu1 i2 = i();
        Objects.requireNonNull(i2);
        int h = h(i2, z2);
        hu1 i3 = i();
        Objects.requireNonNull(i3);
        boolean n2 = n(i3);
        zcf zcf2 = zcf;
        o4e o4e2 = new o4e(3, 34, va02, matrix, n, rect, h, -1, n2);
        this.x = o4e2;
        hu1 i4 = i();
        Objects.requireNonNull(i4);
        this.z = L(o4e2, i4);
        y1d I = I(this.x, pye, va04);
        this.B = I;
        z1d z1d = this.C;
        if (z1d != null) {
            z1d.b();
        }
        zcf zcf3 = zcf2;
        boolean z4 = z2;
        z1d z1d2 = new z1d(new mzd(this, str, str2, pye, va0, va02));
        this.C = z1d2;
        I.f = z1d2;
        this.v = new ez2(c(), i(), (r4e) new pp4(va03.b, this.r, this.s));
        boolean z5 = this.i != null ? true : z4;
        o4e o4e3 = this.y;
        o4e o4e4 = this.z;
        int k2 = k();
        zcf3.getClass();
        HashMap hashMap3 = new HashMap();
        for (mye mye2 : zcf3.a) {
            zcf zcf4 = zcf3;
            int i5 = k2;
            mye mye3 = mye2;
            ba0 q2 = zcf4.q(mye2, zcf3.z0, zcf3.Y, o4e3, i5, z5);
            hu1 hu1 = zcf3.Z;
            Objects.requireNonNull(hu1);
            hashMap3.put(mye3, new c90(q2, zcf4.q(mye3, zcf3.A0, hu1, o4e4, i5, z5)));
        }
        ez2 ez2 = this.v;
        d90 d90 = new d90(this.y, this.z, new ArrayList(hashMap3.values()));
        ez2.getClass();
        r4e r4e = (r4e) ez2.a;
        gt0.i();
        ez2.X = d90;
        ez2.o = new HashMap();
        d90 d902 = (d90) ez2.X;
        o4e o4e5 = d902.a;
        for (c90 c90 : d902.c) {
            rp4 rp4 = (rp4) ez2.o;
            ba0 ba0 = c90.a;
            Rect rect2 = ba0.d;
            Matrix matrix2 = new Matrix();
            Size e = hqe.e(rect2);
            int i6 = ba0.f;
            Size g = hqe.g(e, i6);
            Size size2 = ba0.e;
            e07.k(hqe.d(g, z4, size2));
            Rect h2 = hqe.h(size2);
            uwb a = o4e5.g.a();
            a.b = size2;
            rp4.put(c90, new o4e(ba0.b, ba0.c, a.i(), matrix2, false, h2, o4e5.i - i6, -1, o4e5.e != ba0.g ? true : z4));
        }
        try {
            r4e.a(o4e5.d((hu1) ez2.b, true));
        } catch (ProcessingException unused) {
        }
        o4e o4e6 = d902.b;
        try {
            r4e.a(o4e6.d((hu1) ez2.c, z4));
        } catch (ProcessingException unused2) {
        }
        for (Map.Entry entry2 : ((rp4) ez2.o).entrySet()) {
            hu1 hu12 = (hu1) ez2.b;
            hu1 hu13 = (hu1) ez2.c;
            ez2.a(hu12, hu13, o4e5, o4e6, entry2);
            ((o4e) entry2.getValue()).a(new qp4(ez2, hu12, hu13, o4e5, o4e6, entry2, 0));
        }
        rp4 rp42 = (rp4) ez2.o;
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry3 : hashMap3.entrySet()) {
            hashMap4.put((mye) entry3.getKey(), (o4e) rp42.get(entry3.getValue()));
        }
        zcf3.u(hashMap4);
        Object[] objArr = {this.A.c(), this.B.c()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i7 = z4; i7 < 2; i7++) {
            Object obj2 = objArr[i7];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void H(String str, String str2, pye pye, va0 va0, va0 va02) {
        va0 va03 = va0;
        Matrix matrix = this.j;
        hu1 c = c();
        Objects.requireNonNull(c);
        boolean n = c.n();
        Size size = va03.a;
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        hu1 c2 = c();
        Objects.requireNonNull(c2);
        int h = h(c2, false);
        hu1 c3 = c();
        Objects.requireNonNull(c3);
        o4e o4e = new o4e(3, 34, va0, matrix, n, rect2, h, -1, n(c3));
        this.w = o4e;
        hu1 c4 = c();
        Objects.requireNonNull(c4);
        this.y = L(o4e, c4);
        y1d I = I(this.w, pye, va03);
        this.A = I;
        z1d z1d = this.C;
        if (z1d != null) {
            z1d.b();
        }
        z1d z1d2 = new z1d(new mzd(this, str, str2, pye, va0, va02));
        this.C = z1d2;
        I.f = z1d2;
    }

    public final y1d I(o4e o4e, pye pye, va0 va0) {
        y1d d = y1d.d(pye, va0.a);
        zcf zcf = this.q;
        int i = -1;
        for (mye mye : zcf.a) {
            int i2 = ((c2d) mye.f.h(pye.k0)).g.c;
            Integer valueOf = Integer.valueOf(i);
            List list = c2d.j;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        w30 w30 = d.b;
        if (i != -1) {
            w30.c = i;
        }
        for (mye mye2 : zcf.a) {
            c2d c = y1d.d(mye2.f, va0.a).c();
            pw1 pw1 = c.g;
            w30.a(pw1.e);
            for (ps1 ps1 : c.e) {
                w30.b(ps1);
                ArrayList arrayList = d.e;
                if (!arrayList.contains(ps1)) {
                    arrayList.add(ps1);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c.d) {
                ArrayList arrayList2 = d.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c.c) {
                ArrayList arrayList3 = d.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            d.a(pw1.b);
        }
        o4e.getClass();
        gt0.i();
        o4e.b();
        e07.p("Consumer can only be linked once.", !o4e.j);
        o4e.j = true;
        d.b(o4e.l, va0.b, -1);
        w30.b(zcf.w0);
        ia3 ia3 = va0.d;
        if (ia3 != null) {
            w30.c(ia3);
        }
        return d;
    }

    public final o4e L(o4e o4e, hu1 hu1) {
        int i;
        boolean z2;
        k5f k5f = this.m;
        if (k5f == null || k5f.c == 2) {
            return o4e;
        }
        boolean z3 = true;
        if (k5f.b == 1) {
            return o4e;
        }
        this.t = new ydc(hu1, new s4e(k5f));
        k5f k5f2 = this.m;
        k5f2.getClass();
        if (k5f2.c == 1) {
            hu1 c = c();
            c.getClass();
            i = h(c, false);
        } else {
            i = 0;
        }
        k5f k5f3 = this.m;
        k5f3.getClass();
        Rect h = k5f3.c == 1 ? hqe.h(o4e.g.a) : o4e.d;
        Size g = hqe.g(hqe.e(h), i);
        k5f k5f4 = this.m;
        k5f4.getClass();
        if (k5f4.c == 1) {
            hu1 c2 = c();
            c2.getClass();
            if (!c2.d() || !c2.n()) {
                z3 = false;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        ba0 ba0 = new ba0(UUID.randomUUID(), o4e.f, o4e.a, h, g, i, z2, true);
        o4e o4e2 = (o4e) this.t.J(new ab0(o4e, Collections.singletonList(ba0))).get(ba0);
        Objects.requireNonNull(o4e2);
        return o4e2;
    }

    public final pye f(boolean z2, sye sye) {
        ozd ozd = this.p;
        ia3 a = sye.a(ozd.t(), 1);
        if (z2) {
            a = ia3.s(a, ozd.a);
        }
        if (a == null) {
            return null;
        }
        return l(a).r();
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    public final oye l(ia3 ia3) {
        return new e3(fc9.e(ia3));
    }

    public final void s() {
        zcf zcf = this.q;
        for (mye mye : zcf.a) {
            ycf ycf = (ycf) zcf.c.get(mye);
            Objects.requireNonNull(ycf);
            mye.a(ycf, (hu1) null, (pye) null, mye.f(true, zcf.X));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.pye u(defpackage.fu1 r12, defpackage.oye r13) {
        /*
            r11 = this;
            r12 = 1
            ob9 r0 = r13.o()
            zcf r11 = r11.q
            kbc r1 = r11.z0
            fu1 r2 = r1.f
            r3 = 34
            java.util.List r4 = r2.q(r3)
            java.util.Set r5 = r1.d
            java.util.Iterator r6 = r5.iterator()
        L_0x0017:
            boolean r7 = r6.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x0056
            java.lang.Object r7 = r6.next()
            pye r7 = (defpackage.pye) r7
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            z80 r10 = defpackage.pye.r0
            java.lang.Object r9 = r7.d(r10, r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0035
            goto L_0x0017
        L_0x0035:
            boolean r9 = r7 instanceof defpackage.br6
            if (r9 == 0) goto L_0x0017
            br6 r7 = (defpackage.br6) r7
            z80 r9 = defpackage.br6.J
            java.lang.Object r7 = r7.d(r9, r8)
            ibc r7 = (defpackage.ibc) r7
            if (r7 == 0) goto L_0x0017
            int r7 = r7.c
            if (r7 != r12) goto L_0x0017
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            java.util.List r2 = r2.k(r3)
            r6.addAll(r2)
            r4 = r6
        L_0x0056:
            z80 r2 = defpackage.br6.I
            r6 = r0
            hga r6 = (defpackage.hga) r6
            r6.getClass()
            java.lang.Object r2 = r6.h(r2)     // Catch:{ IllegalArgumentException -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r2 = r8
        L_0x0064:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0096
            java.util.Iterator r2 = r2.iterator()
        L_0x006c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0090
            java.lang.Object r4 = r2.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x006c
            java.lang.Object r2 = r4.second
            android.util.Size[] r2 = (android.util.Size[]) r2
            java.util.List r2 = java.util.Arrays.asList(r2)
        L_0x008e:
            r4 = r2
            goto L_0x0096
        L_0x0090:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x008e
        L_0x0096:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00a4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b8
            java.lang.Object r6 = r5.next()
            pye r6 = (defpackage.pye) r6
            java.util.List r6 = r1.b(r6)
            r3.addAll(r6)
            goto L_0x00a4
        L_0x00b8:
            java.util.Iterator r3 = r3.iterator()
        L_0x00bc:
            boolean r5 = r3.hasNext()
            r6 = 0
            android.util.Rational r7 = r1.c
            if (r5 == 0) goto L_0x00de
            java.lang.Object r5 = r3.next()
            android.util.Size r5 = (android.util.Size) r5
            android.util.Rational r9 = defpackage.os.a
            android.util.Size r9 = defpackage.hjd.c
            boolean r5 = defpackage.os.a(r5, r7, r9)
            if (r5 != 0) goto L_0x00bc
            android.util.Rational r3 = r1.b
            java.util.ArrayList r3 = r1.f(r3, r4, r6)
            r2.addAll(r3)
        L_0x00de:
            java.util.ArrayList r3 = r1.f(r7, r4, r6)
            r2.addAll(r3)
            java.util.ArrayList r3 = r1.e(r4, r6)
            r2.addAll(r3)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00f9
            java.util.ArrayList r1 = r1.e(r4, r12)
            r2.addAll(r1)
        L_0x00f9:
            r2.toString()
            z80 r1 = defpackage.br6.K
            fc9 r0 = (defpackage.fc9) r0
            r0.j(r1, r2)
            z80 r1 = defpackage.pye.o0
            java.util.HashSet r2 = r11.x0
            java.util.Iterator r3 = r2.iterator()
            r4 = r6
        L_0x010c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x012d
            java.lang.Object r5 = r3.next()
            pye r5 = (defpackage.pye) r5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            z80 r9 = defpackage.pye.o0
            java.lang.Object r5 = r5.d(r9, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r4 = java.lang.Math.max(r4, r5)
            goto L_0x010c
        L_0x012d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.j(r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x013d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0151
            java.lang.Object r3 = r2.next()
            pye r3 = (defpackage.pye) r3
            zq4 r3 = r3.n()
            r1.add(r3)
            goto L_0x013d
        L_0x0151:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0159
            goto L_0x01f9
        L_0x0159:
            java.lang.Object r2 = r1.get(r6)
            zq4 r2 = (defpackage.zq4) r2
            int r3 = r2.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = r12
        L_0x016c:
            int r5 = r1.size()
            if (r4 >= r5) goto L_0x01ec
            java.lang.Object r5 = r1.get(r4)
            zq4 r5 = (defpackage.zq4) r5
            int r7 = r5.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r10 = r3.equals(r9)
            if (r10 == 0) goto L_0x018a
        L_0x0188:
            r3 = r7
            goto L_0x01c4
        L_0x018a:
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x0191
            goto L_0x01c4
        L_0x0191:
            r9 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L_0x01a7
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L_0x01a7
            goto L_0x0188
        L_0x01a7:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x01bc
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto L_0x01bc
            goto L_0x01c4
        L_0x01bc:
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            r3 = r8
        L_0x01c4:
            int r5 = r5.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r9 = r2.equals(r7)
            if (r9 == 0) goto L_0x01d6
            r2 = r5
            goto L_0x01e5
        L_0x01d6:
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x01dd
            goto L_0x01e5
        L_0x01dd:
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e4:
            r2 = r8
        L_0x01e5:
            if (r3 == 0) goto L_0x01f9
            if (r2 != 0) goto L_0x01ea
            goto L_0x01f9
        L_0x01ea:
            int r4 = r4 + r12
            goto L_0x016c
        L_0x01ec:
            zq4 r8 = new zq4
            int r12 = r3.intValue()
            int r1 = r2.intValue()
            r8.<init>(r12, r1)
        L_0x01f9:
            if (r8 == 0) goto L_0x0246
            z80 r12 = defpackage.qq6.A
            r0.j(r12, r8)
            java.util.Set r11 = r11.a
            java.util.Iterator r11 = r11.iterator()
        L_0x0206:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0241
            java.lang.Object r12 = r11.next()
            mye r12 = (defpackage.mye) r12
            pye r1 = r12.f
            int r1 = r1.u()
            if (r1 == 0) goto L_0x0229
            z80 r1 = defpackage.pye.u0
            pye r2 = r12.f
            int r2 = r2.u()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.j(r1, r2)
        L_0x0229:
            pye r1 = r12.f
            int r1 = r1.y()
            if (r1 == 0) goto L_0x0206
            z80 r1 = defpackage.pye.t0
            pye r12 = r12.f
            int r12 = r12.y()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.j(r1, r12)
            goto L_0x0206
        L_0x0241:
            pye r11 = r13.r()
            return r11
        L_0x0246:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzd.u(fu1, oye):pye");
    }

    public final void v() {
        for (mye mye : this.q.a) {
            mye.v();
            mye.t();
        }
    }

    public final void w() {
        for (mye w2 : this.q.a) {
            w2.w();
        }
    }

    public final va0 x(ia3 ia3) {
        this.A.a(ia3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.A.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        uwb a = this.g.a();
        a.e = ia3;
        return a.i();
    }

    public final va0 y(va0 va0, va0 va02) {
        E(G(e(), i() == null ? null : i().p().d(), this.f, va0, va02));
        p();
        return va0;
    }

    public final void z() {
        F();
        zcf zcf = this.q;
        for (mye mye : zcf.a) {
            ycf ycf = (ycf) zcf.c.get(mye);
            Objects.requireNonNull(ycf);
            mye.D(ycf);
        }
    }
}
