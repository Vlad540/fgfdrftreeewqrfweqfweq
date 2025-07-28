package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ForwardingControllerListener2;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: k0  reason: default package */
public abstract class k0 implements gn4, ad4, f76 {
    public static final Map v = at6.a("component_tag", "drawee");
    public static final Map w = at6.b(HasExtraData.KEY_ORIGIN, "memory_bitmap", HasExtraData.KEY_ORIGIN_SUBCATEGORY, "shortcut");
    public static final Class x = k0.class;
    public final kn4 a;
    public final bd4 b;
    public final Executor c;
    public uo6 d;
    public g76 e;
    public bs3 f;
    public final ForwardingControllerListener2 g;
    public y66 h;
    public Drawable i;
    public String j;
    public Object k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public g0 q;
    public Object r;
    public boolean s;
    public boolean t;
    public Drawable u;

    public k0(bd4 bd4, ExecutorService executorService) {
        this.a = kn4.c ? new kn4() : kn4.b;
        this.g = new ForwardingControllerListener2();
        this.s = true;
        this.t = false;
        this.b = bd4;
        this.c = executorService;
        g((Object) null, (String) null);
    }

    public final void a(bs3 bs3) {
        bs3.getClass();
        bs3 bs32 = this.f;
        if (bs32 instanceof j0) {
            ((j0) bs32).b(bs3);
        } else if (bs32 != null) {
            if (n06.w()) {
                n06.g("AbstractDraweeController#createInternal");
            }
            j0 j0Var = new j0();
            j0Var.b(bs32);
            j0Var.b(bs3);
            if (n06.w()) {
                n06.m();
            }
            this.f = j0Var;
        } else {
            this.f = bs3;
        }
    }

    public abstract Drawable b(Object obj);

    public final Animatable c() {
        Drawable drawable = this.u;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    public final bs3 d() {
        bs3 bs3 = this.f;
        return bs3 == null ? dh0.a : bs3;
    }

    public abstract oq6 e(Object obj);

    public final y66 f() {
        y66 y66 = this.h;
        if (y66 != null) {
            return y66;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.k);
    }

    public final synchronized void g(Object obj, String str) {
        bd4 bd4;
        try {
            n06.s();
            this.a.a(jn4.Y);
            if (!this.s && (bd4 = this.b) != null) {
                bd4.b(this);
            }
            this.l = false;
            o();
            this.o = false;
            uo6 uo6 = this.d;
            if (uo6 != null) {
                uo6.b = false;
                uo6.a = 4;
                uo6.c = 0;
            }
            g76 g76 = this.e;
            if (g76 != null) {
                g76.a = null;
                g76.c = false;
                g76.d = false;
                g76.a = this;
            }
            bs3 bs3 = this.f;
            if (bs3 instanceof j0) {
                j0 j0Var = (j0) bs3;
                synchronized (j0Var) {
                    j0Var.a.clear();
                }
            } else {
                this.f = null;
            }
            y66 y66 = this.h;
            if (y66 != null) {
                y66.f.o(y66.a);
                y66.g();
                lfc lfc = this.h.d;
                lfc.X = null;
                lfc.invalidateSelf();
                this.h = null;
            }
            this.i = null;
            if (m75.a.i(2)) {
                m75.f(x, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.j, str);
            }
            this.j = str;
            this.k = obj;
            n06.s();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final boolean h(String str, g0 g0Var) {
        if (g0Var == null && this.q == null) {
            return true;
        }
        return str.equals(this.j) && g0Var == this.q && this.m;
    }

    public final void i(String str, Throwable th) {
        if (m75.a.i(2)) {
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            if (m75.a.i(2)) {
                eo7 eo7 = m75.a;
                String simpleName = x.getSimpleName();
                String.format((Locale) null, "controller %x %s: %s: failure: %s", new Object[]{valueOf, str2, str, th});
                eo7.b(simpleName);
            }
        }
    }

    public final void j(Object obj, String str) {
        if (m75.a.i(2)) {
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "<null>";
            e13 e13 = (e13) obj;
            int i2 = 0;
            if (e13 != null && e13.m0()) {
                i2 = System.identityHashCode(e13.b.b());
            }
            Object[] objArr = {valueOf, str2, str, simpleName, Integer.valueOf(i2)};
            if (m75.a.i(2)) {
                eo7 eo7 = m75.a;
                String simpleName2 = x.getSimpleName();
                String.format((Locale) null, "controller %x %s: %s: image: %s %x", objArr);
                eo7.b(simpleName2);
            }
        }
    }

    public final ControllerListener2.Extras k(Map map, Map map2, Uri uri) {
        String str;
        PointF pointF;
        y66 y66 = this.h;
        if (y66 instanceof y66) {
            str = String.valueOf(!(y66.e(2) instanceof glc) ? null : y66.f(2).X);
            pointF = !(y66.e(2) instanceof glc) ? null : y66.f(2).Z;
        } else {
            pointF = null;
            str = null;
        }
        y66 y662 = this.h;
        Rect bounds = y662 == null ? null : y662.d.getBounds();
        Object obj = this.k;
        boolean z = this.t;
        ControllerListener2.Extras extras = new ControllerListener2.Extras();
        if (bounds != null) {
            extras.viewportWidth = bounds.width();
            extras.viewportHeight = bounds.height();
        }
        extras.scaleType = str;
        if (pointF != null) {
            extras.focusX = Float.valueOf(pointF.x);
            extras.focusY = Float.valueOf(pointF.y);
        }
        extras.callerContext = obj;
        extras.logWithHighSamplingRate = z;
        extras.mainUri = uri;
        extras.datasourceExtras = map;
        extras.imageExtras = map2;
        extras.shortcutExtras = w;
        extras.componentExtras = v;
        extras.imageSourceExtras = null;
        return extras;
    }

    public final void l(String str, g0 g0Var, Throwable th, boolean z) {
        Drawable drawable;
        n06.s();
        if (!h(str, g0Var)) {
            i("ignore_old_datasource @ onFailure", th);
            g0Var.a();
            n06.s();
            return;
        }
        this.a.a(z ? jn4.B0 : jn4.C0);
        ForwardingControllerListener2 forwardingControllerListener2 = this.g;
        if (z) {
            i("final_failed @ onFailure", th);
            this.q = null;
            this.n = true;
            y66 y66 = this.h;
            if (y66 != null) {
                if (!this.o || (drawable = this.u) == null) {
                    boolean q2 = q();
                    r75 r75 = y66.e;
                    if (q2) {
                        r75.G0++;
                        y66.c();
                        if (r75.a(4) != null) {
                            y66.b(4);
                        } else {
                            y66.b(1);
                        }
                        r75.c();
                    } else {
                        r75.G0++;
                        y66.c();
                        if (r75.a(5) != null) {
                            y66.b(5);
                        } else {
                            y66.b(1);
                        }
                        r75.c();
                    }
                } else {
                    y66.j(drawable, 1.0f, true);
                }
            }
            ControllerListener2.Extras k2 = k(g0Var == null ? null : g0Var.a, (Map) null, (Uri) null);
            d().d(this.j, th);
            forwardingControllerListener2.onFailure(this.j, th, k2);
        } else {
            i("intermediate_failed @ onFailure", th);
            d().k(this.j, th);
            forwardingControllerListener2.onIntermediateImageFailed(this.j);
        }
        n06.s();
    }

    public final void m(String str, g0 g0Var, Object obj, float f2, boolean z, boolean z2, boolean z3) {
        Drawable b2;
        Object obj2;
        Drawable drawable;
        try {
            n06.s();
            if (!h(str, g0Var)) {
                j(obj, "ignore_old_datasource @ onNewResult");
                e13.S((e13) obj);
                g0Var.a();
                n06.s();
                return;
            }
            this.a.a(z ? jn4.z0 : jn4.A0);
            try {
                b2 = b(obj);
                obj2 = this.r;
                drawable = this.u;
                this.r = obj;
                this.u = b2;
                if (z) {
                    j(obj, "set_final_result @ onNewResult");
                    this.q = null;
                    f().j(b2, 1.0f, z2);
                    oq6 e2 = e(obj);
                    d().a(str, e2, c());
                    this.g.onFinalImageSet(str, e2, k(g0Var == null ? null : g0Var.a, e2 == null ? null : e2.getExtras(), (Uri) null));
                } else if (z3) {
                    j(obj, "set_temporary_result @ onNewResult");
                    f().j(b2, 1.0f, z2);
                    oq6 e3 = e(obj);
                    d().a(str, e3, c());
                    this.g.onFinalImageSet(str, e3, k(g0Var == null ? null : g0Var.a, e3 == null ? null : e3.getExtras(), (Uri) null));
                } else {
                    j(obj, "set_intermediate_result @ onNewResult");
                    f().j(b2, f2, z2);
                    oq6 e4 = e(obj);
                    d().h(str, e4);
                    this.g.onIntermediateImageSet(str, e4);
                }
                if (!(drawable == null || drawable == b2)) {
                    if (drawable instanceof en4) {
                        ((en4) drawable).a();
                    }
                }
                if (!(obj2 == null || obj2 == obj)) {
                    j(obj2, "release_previous_result @ onNewResult");
                    e13.S((e13) obj2);
                }
                n06.s();
            } catch (Exception e5) {
                j(obj, "drawable_failed @ onNewResult");
                e13.S((e13) obj);
                l(str, g0Var, e5, z);
                n06.s();
            }
        } catch (Throwable th) {
            n06.s();
            throw th;
        }
    }

    public final void n() {
        this.a.a(jn4.x0);
        uo6 uo6 = this.d;
        if (uo6 != null) {
            uo6.c = 0;
        }
        g76 g76 = this.e;
        if (g76 != null) {
            g76.c = false;
            g76.d = false;
        }
        y66 y66 = this.h;
        if (y66 != null) {
            y66.f.o(y66.a);
            y66.g();
        }
        o();
    }

    public final void o() {
        Map map;
        Map map2;
        boolean z = this.m;
        this.m = false;
        this.n = false;
        g0 g0Var = this.q;
        if (g0Var != null) {
            map = g0Var.a;
            g0Var.a();
            this.q = null;
        } else {
            map = null;
        }
        Drawable drawable = this.u;
        if (drawable != null && (drawable instanceof en4)) {
            ((en4) drawable).a();
        }
        if (this.p != null) {
            this.p = null;
        }
        this.u = null;
        Object obj = this.r;
        if (obj != null) {
            oq6 e2 = e(obj);
            map2 = e2 == null ? null : e2.getExtras();
            j(this.r, BuildConfig.BUILD_TYPE);
            e13.S((e13) this.r);
            this.r = null;
        } else {
            map2 = null;
        }
        if (z) {
            d().g(this.j);
            this.g.onRelease(this.j, k(map, map2, (Uri) null));
        }
    }

    public final void p(g0 g0Var, oq6 oq6) {
        d().e(this.k, this.j);
        String str = this.j;
        Object obj = this.k;
        xwa xwa = (xwa) this;
        tr6 tr6 = xwa.H;
        tr6 tr62 = xwa.I;
        Map map = null;
        Uri uri = tr6 != null ? tr6.b : null;
        if (uri == null) {
            uri = tr62 != null ? tr62.b : null;
        }
        Map map2 = g0Var == null ? null : g0Var.a;
        if (oq6 != null) {
            map = oq6.getExtras();
        }
        this.g.onSubmit(str, obj, k(map2, map, uri));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r1 = this;
            boolean r0 = r1.n
            if (r0 == 0) goto L_0x0014
            uo6 r1 = r1.d
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.b
            if (r0 == 0) goto L_0x0014
            int r0 = r1.c
            int r1 = r1.a
            if (r0 >= r1) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.q():boolean");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r8 = this;
            defpackage.n06.s()
            r0 = r8
            xwa r0 = (defpackage.xwa) r0
            defpackage.n06.s()
            el8 r1 = r0.A     // Catch:{ all -> 0x0031 }
            r2 = 0
            if (r1 == 0) goto L_0x002c
            ov0 r3 = r0.B     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x0013
            goto L_0x002c
        L_0x0013:
            e13 r1 = r1.get(r3)     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object r3 = r1.e0()     // Catch:{ all -> 0x0031 }
            b13 r3 = (defpackage.b13) r3     // Catch:{ all -> 0x0031 }
            tjb r3 = r3.getQualityInfo()     // Catch:{ all -> 0x0031 }
            et6 r3 = (defpackage.et6) r3     // Catch:{ all -> 0x0031 }
            boolean r3 = r3.c     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x0034
            r1.close()     // Catch:{ all -> 0x0031 }
        L_0x002c:
            defpackage.n06.s()
            r3 = r2
            goto L_0x0038
        L_0x0031:
            r8 = move-exception
            goto L_0x00e5
        L_0x0034:
            defpackage.n06.s()
            r3 = r1
        L_0x0038:
            r1 = 0
            r4 = 1
            if (r3 == 0) goto L_0x006e
            defpackage.n06.s()
            r8.q = r2
            r8.m = r4
            r8.n = r1
            kn4 r1 = r8.a
            jn4 r2 = defpackage.jn4.H0
            r1.a(r2)
            g0 r1 = r8.q
            oq6 r2 = r8.e(r3)
            r8.p(r1, r2)
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = r8.j
            g0 r2 = r8.q
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            r6 = 1
            r7 = 1
            r0 = r8
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            defpackage.n06.s()
            defpackage.n06.s()
            return
        L_0x006b:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r8
        L_0x006e:
            kn4 r3 = r8.a
            jn4 r5 = defpackage.jn4.y0
            r3.a(r5)
            y66 r3 = r8.h
            r5 = 0
            r3.m(r5, r4)
            r8.m = r4
            r8.n = r1
            defpackage.n06.s()
            eo7 r1 = defpackage.m75.a
            r3 = 2
            boolean r1 = r1.i(r3)
            if (r1 == 0) goto L_0x009a
            int r1 = java.lang.System.identityHashCode(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Class<xwa> r4 = defpackage.xwa.class
            java.lang.String r5 = "controller %x: getDataSource"
            defpackage.m75.d(r4, r1, r5)
        L_0x009a:
            o3e r0 = r0.C
            java.lang.Object r0 = r0.get()
            g0 r0 = (defpackage.g0) r0
            defpackage.n06.s()
            r8.q = r0
            r8.p(r0, r2)
            eo7 r0 = defpackage.m75.a
            boolean r0 = r0.i(r3)
            if (r0 == 0) goto L_0x00cd
            java.lang.Class r0 = x
            java.lang.String r1 = "controller %x %s: submitRequest: dataSource: %x"
            int r2 = java.lang.System.identityHashCode(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = r8.j
            g0 r4 = r8.q
            int r4 = java.lang.System.identityHashCode(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            defpackage.m75.f(r0, r1, r2, r3, r4)
        L_0x00cd:
            java.lang.String r0 = r8.j
            g0 r1 = r8.q
            boolean r1 = r1.f()
            i0 r2 = new i0
            r2.<init>(r8, r0, r1)
            g0 r0 = r8.q
            java.util.concurrent.Executor r8 = r8.c
            r0.m(r2, r8)
            defpackage.n06.s()
            return
        L_0x00e5:
            defpackage.n06.s()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.r():void");
    }

    public String toString() {
        jg8 X = at7.X(this);
        X.g("isAttached", this.l);
        X.g("isRequestSubmitted", this.m);
        X.g("hasFetchFailed", this.n);
        e13 e13 = (e13) this.r;
        int i2 = 0;
        if (e13 != null && e13.m0()) {
            i2 = System.identityHashCode(e13.b.b());
        }
        X.f(i2, "fetchedImage");
        X.h(this.a.a.toString(), "events");
        return X.toString();
    }
}
