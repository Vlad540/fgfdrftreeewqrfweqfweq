package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: lr1  reason: default package */
public final class lr1 implements hu1 {
    public ww1 A0;
    public final LinkedHashMap B0;
    public int C0;
    public final fr1 D0;
    public final ope E0;
    public final bv1 F0;
    public final boolean G0;
    public final boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public s39 L0;
    public final s30 M0;
    public final s39 N0;
    public final HashSet O0;
    public ft1 P0;
    public final Object Q0;
    public boolean R0;
    public final si4 S0;
    public final mod T0;
    public final h4e U0;
    public final nu7 V0;
    public volatile int W0 = 3;
    public final b2b X;
    public final nu7 Y;
    public final zq1 Z;
    public final x3a a;
    public final ku1 b;
    public final ryc c;
    public final vd6 o;
    public final kr1 w0;
    public final or1 x0;
    public CameraDevice y0;
    public int z0;

    /* JADX WARNING: type inference failed for: r1v3, types: [nu7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v1, types: [nu7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v2, types: [s30, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v17, types: [java.lang.Object, oq1] */
    public lr1(Context context, ku1 ku1, String str, or1 or1, ope ope, bv1 bv1, Executor executor, Handler handler, si4 si4, long j) {
        ku1 ku12 = ku1;
        String str2 = str;
        or1 or12 = or1;
        bv1 bv12 = bv1;
        b2b b2b = new b2b(22);
        this.X = b2b;
        this.z0 = 0;
        new AtomicInteger(0);
        this.B0 = new LinkedHashMap();
        this.C0 = 0;
        this.I0 = false;
        this.J0 = false;
        this.K0 = true;
        this.O0 = new HashSet();
        this.P0 = it1.a;
        this.Q0 = new Object();
        this.R0 = false;
        ? obj = new Object();
        obj.b = this;
        obj.a = null;
        this.V0 = obj;
        this.b = ku12;
        this.E0 = ope;
        this.F0 = bv12;
        vd6 vd6 = new vd6(handler);
        this.o = vd6;
        ryc ryc = new ryc(executor);
        this.c = ryc;
        kr1 kr1 = r1;
        kr1 kr12 = new kr1(this, ryc, vd6, j);
        this.w0 = kr1;
        this.a = new x3a(str2);
        ((vb9) b2b.b).i(new bi7(gu1.CLOSED));
        ? obj2 = new Object();
        obj2.a = bv12;
        yh7 yh7 = new yh7();
        obj2.b = yh7;
        yh7.i(new t80(5, (u80) null));
        this.Y = obj2;
        ? obj3 = new Object();
        obj3.b = new Object();
        obj3.c = new LinkedHashSet();
        obj3.o = new LinkedHashSet();
        obj3.X = new LinkedHashSet();
        obj3.Y = new ut1((s30) obj3);
        obj3.a = ryc;
        this.M0 = obj3;
        this.S0 = si4;
        try {
            et1 a2 = ku1.a(str);
            ryc ryc2 = ryc;
            ryc ryc3 = ryc;
            zq1 zq1 = r1;
            zq1 zq12 = new zq1(a2, vd6, ryc2, new nfc(7, (Object) this), or12.j);
            this.Z = zq1;
            this.x0 = or12;
            or12.t(zq1);
            or12.h.m((vb9) obj2.b);
            this.T0 = mod.y(a2);
            this.A0 = z();
            ryc ryc4 = ryc3;
            this.N0 = new s39(ryc4, vd6, handler, (s30) obj3, or12.j, zf4.a);
            this.G0 = or12.j.i(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.H0 = or12.j.i(LegacyCameraSurfaceCleanupQuirk.class);
            fr1 fr1 = new fr1(this, str2);
            this.D0 = fr1;
            u5g u5g = new u5g(6, (Object) this);
            synchronized (bv12.b) {
                e07.p("Camera is already registered: " + this, !bv12.e.containsKey(this));
                bv12.e.put(this, new zu1(ryc4, u5g, fr1));
            }
            ku12.a.b0(ryc4, fr1);
            this.U0 = new h4e(context, str2, ku12, new Object());
        } catch (CameraAccessExceptionCompat e) {
            throw new Exception(e);
        }
    }

    public static String v(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String w(s39 s39) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        s39.getClass();
        sb.append(s39.hashCode());
        return sb.toString();
    }

    public static String x(mye mye) {
        return mye.g() + mye.hashCode();
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [ul7, java.lang.Object] */
    public final void A(boolean z) {
        if (!z) {
            this.w0.e.b = -1;
        }
        this.w0.a();
        this.V0.i();
        toString();
        F(8);
        try {
            ku1 ku1 = this.b;
            ku1.a.Z(this.x0.a, this.c, t());
        } catch (CameraAccessExceptionCompat e) {
            e.getMessage();
            toString();
            if (e.a != 10001) {
                nu7 nu7 = this.V0;
                if (((lr1) nu7.b).W0 != 8) {
                    ((lr1) nu7.b).toString();
                    return;
                }
                ((lr1) nu7.b).toString();
                nu7.i();
                ? obj = new Object();
                obj.c = nu7;
                obj.b = new AtomicBoolean(false);
                obj.a = ((lr1) nu7.b).o.schedule((Runnable) new gr1(obj, 0), 2000, TimeUnit.MILLISECONDS);
                nu7.a = obj;
                return;
            }
            E(3, new u80(e, 7), true);
        } catch (SecurityException e2) {
            e2.getMessage();
            toString();
            F(7);
            this.w0.b();
        }
    }

    public final void B() {
        e07.p((String) null, this.W0 == 9);
        b2d s = this.a.s();
        if (!s.l || !s.k) {
            toString();
        } else if (!this.F0.e(this.y0.getId(), this.E0.B(this.y0.getId()))) {
            int i = this.E0.b;
            toString();
        } else {
            HashMap hashMap = new HashMap();
            Collection<c2d> t = this.a.t();
            Collection u = this.a.u();
            z80 z80 = pzd.a;
            ArrayList arrayList = new ArrayList(u);
            Iterator it = t.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c2d c2d = (c2d) it.next();
                ia3 ia3 = c2d.g.b;
                z80 z802 = pzd.a;
                if (ia3.l(z802) && c2d.b().size() != 1) {
                    String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", new Object[]{Integer.valueOf(c2d.b().size())});
                    break;
                } else if (c2d.g.b.l(z802)) {
                    int i2 = 0;
                    for (c2d c2d2 : t) {
                        if (((pye) arrayList.get(i2)).t() == rye.Y) {
                            e07.p("MeteringRepeating should contain a surface", !c2d2.b().isEmpty());
                            hashMap.put((xc4) c2d2.b().get(0), 1L);
                        } else if (c2d2.g.b.l(z802) && !c2d2.b().isEmpty()) {
                            hashMap.put((xc4) c2d2.b().get(0), (Long) c2d2.g.b.h(z802));
                        }
                        i2++;
                    }
                }
            }
            ww1 ww1 = this.A0;
            synchronized (ww1.a) {
                ww1.l = hashMap;
            }
            ww1 ww12 = this.A0;
            c2d b2 = s.b();
            CameraDevice cameraDevice = this.y0;
            cameraDevice.getClass();
            s39 s39 = this.N0;
            ct0.a(ww12.l(b2, cameraDevice, new q7e((xe6) s39.e, (xe6) s39.f, (s30) s39.d, (Executor) s39.a, (ScheduledExecutorService) s39.b, (Handler) s39.c)), new qe4(this, ww12, false, 9), this.c);
        }
    }

    public final void C() {
        if (this.L0 != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.L0.getClass();
            sb.append(this.L0.hashCode());
            String sb2 = sb.toString();
            x3a x3a = this.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) x3a.b;
            if (linkedHashMap.containsKey(sb2)) {
                nye nye = (nye) linkedHashMap.get(sb2);
                nye.e = false;
                if (!nye.f) {
                    linkedHashMap.remove(sb2);
                }
            }
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.L0.getClass();
            sb3.append(this.L0.hashCode());
            String sb4 = sb3.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) x3a.b;
            if (linkedHashMap2.containsKey(sb4)) {
                nye nye2 = (nye) linkedHashMap2.get(sb4);
                nye2.f = false;
                if (!nye2.e) {
                    linkedHashMap2.remove(sb4);
                }
            }
            s39 s39 = this.L0;
            cs6 cs6 = (cs6) s39.a;
            if (cs6 != null) {
                cs6.a();
            }
            s39.a = null;
            this.L0 = null;
        }
    }

    public final void D() {
        c2d c2d;
        List unmodifiableList;
        e07.p((String) null, this.A0 != null);
        toString();
        ww1 ww1 = this.A0;
        synchronized (ww1.a) {
            c2d = ww1.f;
        }
        synchronized (ww1.a) {
            unmodifiableList = Collections.unmodifiableList(ww1.b);
        }
        ww1 z = z();
        this.A0 = z;
        z.n(c2d);
        this.A0.j(unmodifiableList);
        if (hr1.t(this.W0) != 8) {
            ww1.h();
            toString();
        } else if (this.G0 && ww1.h()) {
            toString();
            F(6);
        }
        if (this.H0 && ww1.h()) {
            toString();
            this.I0 = true;
        }
        ww1.a();
        ch7 m = ww1.m();
        rf0.n(this.W0);
        toString();
        this.B0.put(ww1, m);
        ct0.a(m, new otf(this, ww1, false), pa2.j());
    }

    public final void E(int i, u80 u80, boolean z) {
        gu1 gu1;
        gu1 gu12;
        t80 t80;
        HashMap hashMap;
        String B;
        toString();
        boolean z2 = false;
        if (kne.a()) {
            Trace.setCounter(am7.C("CX:C2State[" + this + "]"), (long) hr1.t(i));
            if (u80 != null) {
                this.C0++;
            }
            if (this.C0 > 0) {
                Trace.setCounter(am7.C("CX:C2StateErrorCode[" + this + "]"), (long) (u80 != null ? u80.a : 0));
            }
        }
        this.W0 = i;
        switch (hr1.t(i)) {
            case 0:
                gu1 = gu1.RELEASED;
                break;
            case 1:
                gu1 = gu1.RELEASING;
                break;
            case 2:
                gu1 = gu1.CLOSED;
                break;
            case 3:
                gu1 = gu1.PENDING_OPEN;
                break;
            case 4:
            case 5:
                gu1 = gu1.CLOSING;
                break;
            case 6:
            case 7:
                gu1 = gu1.OPENING;
                break;
            case 8:
                gu1 = gu1.OPEN;
                break;
            case 9:
                gu1 = gu1.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: ".concat(rf0.q(i)));
        }
        bv1 bv1 = this.F0;
        synchronized (bv1.b) {
            try {
                int i2 = bv1.f;
                if (gu1 == gu1.RELEASED) {
                    zu1 zu1 = (zu1) bv1.e.remove(this);
                    if (zu1 != null) {
                        bv1.b();
                        gu12 = zu1.a;
                    } else {
                        gu12 = null;
                    }
                } else {
                    zu1 zu12 = (zu1) bv1.e.get(this);
                    e07.o(zu12, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    gu1 gu13 = zu12.a;
                    zu12.a = gu1;
                    gu1 gu14 = gu1.OPENING;
                    if (gu1 == gu14) {
                        if (gu1.a || gu13 == gu14) {
                            z2 = true;
                        }
                        e07.p("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", z2);
                    }
                    if (gu13 != gu1) {
                        bv1.c(this, gu1);
                        bv1.b();
                    }
                    gu12 = gu13;
                }
                if (gu12 != gu1) {
                    zu1 a2 = (bv1.d.b == 2 && gu1 == gu1.CONFIGURED && (B = bv1.d.B(p().d())) != null) ? bv1.a(B) : null;
                    if (i2 < 1 && bv1.f > 0) {
                        hashMap = new HashMap();
                        for (Map.Entry entry : bv1.e.entrySet()) {
                            if (((zu1) entry.getValue()).a == gu1.PENDING_OPEN) {
                                hashMap.put((ms1) entry.getKey(), (zu1) entry.getValue());
                            }
                        }
                    } else if (gu1 != gu1.PENDING_OPEN || bv1.f <= 0) {
                        hashMap = null;
                    } else {
                        hashMap = new HashMap();
                        hashMap.put(this, (zu1) bv1.e.get(this));
                    }
                    if (hashMap != null && !z) {
                        hashMap.remove(this);
                    }
                    if (hashMap != null) {
                        for (zu1 zu13 : hashMap.values()) {
                            zu13.getClass();
                            try {
                                Executor executor = zu13.b;
                                av1 av1 = zu13.d;
                                Objects.requireNonNull(av1);
                                executor.execute(new ds1(2, (fr1) av1));
                            } catch (RejectedExecutionException unused) {
                            }
                        }
                    }
                    if (a2 != null) {
                        try {
                            Executor executor2 = a2.b;
                            u5g u5g = a2.c;
                            Objects.requireNonNull(u5g);
                            executor2.execute(new ds1(3, u5g));
                        } catch (RejectedExecutionException unused2) {
                        }
                    }
                }
            } finally {
                while (true) {
                }
            }
        }
        ((vb9) this.X.b).i(new bi7(gu1));
        nu7 nu7 = this.Y;
        nu7.getClass();
        switch (gu1.ordinal()) {
            case 0:
            case 2:
                t80 = new t80(5, u80);
                break;
            case 1:
            case 4:
                t80 = new t80(4, u80);
                break;
            case 3:
                bv1 bv12 = (bv1) nu7.a;
                synchronized (bv12.b) {
                    Iterator it = bv12.e.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((zu1) ((Map.Entry) it.next()).getValue()).a == gu1.CLOSING) {
                                t80 = new t80(2, (u80) null);
                                break;
                            }
                        } else {
                            t80 = new t80(1, (u80) null);
                            break;
                        }
                    }
                }
            case 5:
                t80 = new t80(2, u80);
                break;
            case 6:
            case 7:
                t80 = new t80(3, u80);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + gu1);
        }
        t80.toString();
        gu1.toString();
        Objects.toString(u80);
        if (!Objects.equals((t80) ((vb9) nu7.b).d(), t80)) {
            t80.toString();
            ((vb9) nu7.b).i(t80);
        }
    }

    public final void F(int i) {
        E(i, (u80) null, true);
    }

    public final ArrayList G(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mye mye = (mye) it.next();
            boolean z = this.K0;
            String x = x(mye);
            Class<?> cls = mye.getClass();
            c2d c2d = z ? mye.n : mye.o;
            pye pye = mye.f;
            va0 va0 = mye.g;
            arrayList2.add(new s80(x, cls, c2d, pye, va0 != null ? va0.a : null, va0, mye.c() == null ? null : nzd.J(mye)));
        }
        return arrayList2;
    }

    public final void H(ArrayList arrayList) {
        boolean z;
        Size size;
        boolean isEmpty = this.a.t().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            s80 s80 = (s80) it.next();
            if (!this.a.B(s80.a)) {
                x3a x3a = this.a;
                String str = s80.a;
                c2d c2d = s80.c;
                pye pye = s80.d;
                va0 va0 = s80.f;
                List list = s80.g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) x3a.b;
                nye nye = (nye) linkedHashMap.get(str);
                if (nye == null) {
                    nye = new nye(c2d, pye, va0, list);
                    linkedHashMap.put(str, nye);
                }
                nye.e = true;
                x3a.N(str, c2d, pye, va0, list);
                arrayList2.add(s80.a);
                if (s80.b == b3b.class && (size = s80.e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            TextUtils.join(", ", arrayList2);
            toString();
            if (isEmpty) {
                this.Z.y(true);
                zq1 zq1 = this.Z;
                synchronized (zq1.d) {
                    zq1.p++;
                }
            }
            q();
            L();
            K();
            D();
            if (this.W0 == 9) {
                B();
            } else {
                int t = hr1.t(this.W0);
                if (t == 2 || t == 3) {
                    I(false);
                } else if (t != 4) {
                    toString();
                } else {
                    F(7);
                    if (!this.B0.isEmpty() && !this.J0 && this.z0 == 0) {
                        if (this.y0 == null) {
                            z = false;
                        }
                        e07.p("Camera Device should be open if session close is not complete", z);
                        F(9);
                        B();
                    }
                }
            }
            if (rational != null) {
                this.Z.h.e = rational;
            }
        }
    }

    public final void I(boolean z) {
        toString();
        if (!this.F0.d(this)) {
            toString();
            F(4);
            return;
        }
        A(z);
    }

    public final void J(boolean z) {
        toString();
        if (!this.D0.b || !this.F0.d(this)) {
            toString();
            F(4);
            return;
        }
        A(z);
    }

    public final void K() {
        x3a x3a = this.a;
        x3a.getClass();
        b2d b2d = new b2d();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) x3a.b).entrySet()) {
            nye nye = (nye) entry.getValue();
            if (nye.f && nye.e) {
                b2d.a(nye.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        boolean z = b2d.l && b2d.k;
        zq1 zq1 = this.Z;
        if (z) {
            int i = b2d.b().g.c;
            zq1.x = i;
            zq1.h.n = i;
            zq1.n.c = i;
            b2d.a(zq1.s());
            this.A0.n(b2d.b());
            return;
        }
        zq1.x = 1;
        zq1.h.n = 1;
        zq1.n.c = 1;
        this.A0.n(zq1.s());
    }

    public final void L() {
        boolean z = false;
        for (pye d : this.a.u()) {
            z |= ((Boolean) d.d(pye.q0, Boolean.FALSE)).booleanValue();
        }
        this.Z.l.c = z;
    }

    public final void b(ft1 ft1) {
        if (ft1 == null) {
            ft1 = it1.a;
        }
        ft1.v();
        this.P0 = ft1;
        synchronized (this.Q0) {
        }
    }

    public final void c(mye mye) {
        mye.getClass();
        this.c.execute(new cr1(this, x(mye), this.K0 ? mye.n : mye.o, mye.f, mye.g, mye.c() == null ? null : nzd.J(mye), 0));
    }

    public final void e(mye mye) {
        mye.getClass();
        this.c.execute(new cr1(this, x(mye), this.K0 ? mye.n : mye.o, mye.f, mye.g, mye.c() == null ? null : nzd.J(mye), 2));
    }

    public final ns9 f() {
        return this.X;
    }

    public final ot1 g() {
        return this.Z;
    }

    public final ft1 h() {
        return this.P0;
    }

    public final void i(mye mye) {
        mye.getClass();
        this.c.execute(new cr1(this, x(mye), this.K0 ? mye.n : mye.o, mye.f, mye.g, mye.c() == null ? null : nzd.J(mye), 1));
    }

    public final void j(boolean z) {
        this.c.execute(new t50((Object) this, z, 7));
    }

    public final void k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            zq1 zq1 = this.Z;
            synchronized (zq1.d) {
                zq1.p++;
            }
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                mye mye = (mye) it.next();
                String x = x(mye);
                HashSet hashSet = this.O0;
                if (!hashSet.contains(x)) {
                    hashSet.add(x);
                    mye.v();
                    mye.t();
                }
            }
            try {
                this.c.execute(new br1(this, new ArrayList(G(arrayList)), 1));
            } catch (RejectedExecutionException unused) {
                toString();
                zq1.q();
            }
        }
    }

    public final void l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(G(arrayList2));
            Iterator it = new ArrayList(arrayList2).iterator();
            while (it.hasNext()) {
                mye mye = (mye) it.next();
                String x = x(mye);
                HashSet hashSet = this.O0;
                if (hashSet.contains(x)) {
                    mye.w();
                    hashSet.remove(x);
                }
            }
            this.c.execute(new br1(this, arrayList3, 0));
        }
    }

    public final void m(mye mye) {
        mye.getClass();
        this.c.execute(new dr1(this, 2, x(mye)));
    }

    public final void o(boolean z) {
        this.K0 = z;
    }

    public final fu1 p() {
        return this.x0;
    }

    public final void q() {
        s39 s39;
        x3a x3a = this.a;
        c2d b2 = x3a.s().b();
        pw1 pw1 = b2.g;
        int size = Collections.unmodifiableList(pw1.a).size();
        int size2 = b2.b().size();
        if (b2.b().isEmpty()) {
            return;
        }
        if (Collections.unmodifiableList(pw1.a).isEmpty()) {
            if (this.L0 == null) {
                this.L0 = new s39(this.x0.b, this.S0, new ar1(this, 2));
            }
            if (y() && (s39 = this.L0) != null) {
                String w = w(s39);
                s39 s392 = this.L0;
                c2d c2d = (c2d) s392.b;
                rye rye = rye.Y;
                List singletonList = Collections.singletonList(rye);
                LinkedHashMap linkedHashMap = (LinkedHashMap) x3a.b;
                nye nye = (nye) linkedHashMap.get(w);
                r39 r39 = (r39) s392.c;
                if (nye == null) {
                    nye = new nye(c2d, r39, (va0) null, singletonList);
                    linkedHashMap.put(w, nye);
                }
                nye.e = true;
                x3a.N(w, c2d, r39, (va0) null, singletonList);
                s39 s393 = this.L0;
                c2d c2d2 = (c2d) s393.b;
                List singletonList2 = Collections.singletonList(rye);
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) x3a.b;
                nye nye2 = (nye) linkedHashMap2.get(w);
                if (nye2 == null) {
                    nye2 = new nye(c2d2, (r39) s393.c, (va0) null, singletonList2);
                    linkedHashMap2.put(w, nye2);
                }
                nye2.f = true;
            }
        } else if (size2 == 1 && size == 1) {
            C();
        } else if (size >= 2) {
            C();
        } else if (this.L0 != null && !y()) {
            C();
        }
    }

    public final void r() {
        ArrayList<pw1> arrayList;
        boolean z = this.W0 == 5 || this.W0 == 2 || (this.W0 == 7 && this.z0 != 0);
        e07.p("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + rf0.q(this.W0) + " (error: " + v(this.z0) + ")", z);
        D();
        ww1 ww1 = this.A0;
        synchronized (ww1.a) {
            try {
                if (!ww1.b.isEmpty()) {
                    arrayList = new ArrayList<>(ww1.b);
                    ww1.b.clear();
                } else {
                    arrayList = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (arrayList != null) {
            for (pw1 pw1 : arrayList) {
                for (ps1 a2 : pw1.e) {
                    a2.a(pw1.a());
                }
            }
        }
    }

    public final void s() {
        e07.p((String) null, this.W0 == 2 || this.W0 == 5);
        e07.p((String) null, this.B0.isEmpty());
        if (!this.I0) {
            u();
        } else if (this.J0) {
            toString();
        } else if (!this.D0.b) {
            this.I0 = false;
            u();
            toString();
        } else {
            toString();
            vn1 f = hwf.f(new ar1(this, 1));
            this.J0 = true;
            f.b.c(new b(26, this), this.c);
        }
    }

    public final CameraDevice.StateCallback t() {
        ArrayList arrayList = new ArrayList(this.a.s().b().c);
        arrayList.add((ut1) this.M0.Y);
        arrayList.add(this.w0);
        return lp.j(arrayList);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.x0.a});
    }

    public final void u() {
        e07.p((String) null, this.W0 == 2 || this.W0 == 5);
        e07.p((String) null, this.B0.isEmpty());
        this.y0 = null;
        if (this.W0 == 5) {
            F(3);
            return;
        }
        this.b.a.g0(this.D0);
        F(1);
    }

    public final boolean y() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.Q0) {
            try {
                i = this.E0.b == 2 ? 1 : 0;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        x3a x3a = this.a;
        x3a.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) x3a.b).entrySet()) {
            if (((nye) entry.getValue()).e) {
                arrayList2.add((nye) entry.getValue());
            }
        }
        for (nye nye : Collections.unmodifiableCollection(arrayList2)) {
            List list = nye.d;
            if (list == null || list.get(0) != rye.Y) {
                if (nye.c == null || nye.d == null) {
                    nye.toString();
                    return false;
                }
                c2d c2d = nye.a;
                pye pye = nye.b;
                for (xc4 xc4 : c2d.b()) {
                    h4e h4e = this.U0;
                    int inputFormat = pye.getInputFormat();
                    xa0 b2 = xa0.b(i, inputFormat, xc4.h, h4e.i(inputFormat));
                    int inputFormat2 = pye.getInputFormat();
                    Size size = xc4.h;
                    va0 va0 = nye.c;
                    arrayList.add(new k80(b2, inputFormat2, size, va0.b, nye.d, va0.d, (Range) pye.d(pye.p0, (Object) null)));
                }
            }
        }
        this.L0.getClass();
        HashMap hashMap = new HashMap();
        s39 s39 = this.L0;
        hashMap.put((r39) s39.c, Collections.singletonList((Size) s39.d));
        try {
            this.U0.g(i, arrayList, hashMap, false, false);
            toString();
            return true;
        } catch (IllegalArgumentException unused) {
            toString();
            return false;
        }
    }

    public final ww1 z() {
        ww1 ww1;
        synchronized (this.Q0) {
            ww1 = new ww1(this.T0, this.x0.j, false);
        }
        return ww1;
    }
}
