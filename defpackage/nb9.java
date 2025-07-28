package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: nb9  reason: default package */
public final class nb9 implements va9, zp {
    public static final long I;
    public static final long J;
    public static final /* synthetic */ int K = 0;
    public boolean A;
    public l68 B;
    public l68 C;
    public z78 D;
    public long E;
    public float F;
    public final grd G;
    public final t0c H;
    public final Context a;
    public final pae b;
    public final mg5 c;
    public final to8 d;
    public final f03 e;
    public final tt0 f;
    public final i4a g;
    public final ContextScope h;
    public final t97 i;
    public final t97 j;
    public volatile qod k;
    public int l;
    public r38 m;
    public za9 n;
    public final CopyOnWriteArraySet o = new CopyOnWriteArraySet();
    public final LinkedHashMap p = new LinkedHashMap();
    public Handler q;
    public final eq6 r = new eq6(16, this);
    public final grd s;
    public final t0c t;
    public final grd u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final float z;

    static {
        int i2 = zp4.o;
        eq4 eq4 = eq4.o;
        I = mt0.P(1, eq4);
        J = mt0.P(3, eq4);
    }

    public nb9(Context context, xzc xzc, pae pae, mg5 mg5, to8 to8, f03 f03, tt0 tt0, aq aqVar, i4a i4a, ku3 ku3, t97 t97, t97 t972) {
        this.a = context;
        this.b = pae;
        this.c = mg5;
        this.d = to8;
        this.e = f03;
        this.f = tt0;
        this.g = i4a;
        this.i = t97;
        this.j = t972;
        this.h = n1g.a(((n3a) pae).c().getImmediate().plus(x87.c()).plus(ku3));
        grd a2 = hrd.a(-1L);
        this.s = a2;
        this.t = new t0c(a2);
        this.u = hrd.a(-1L);
        this.v = 1;
        this.z = 1.0f;
        this.A = true;
        this.E = -1;
        this.F = 1.0f;
        kdf kdf = (kdf) aqVar;
        kdf.i.add(this);
        if (kdf.c()) {
            h();
        }
        grd a3 = hrd.a(Float.valueOf(0.0f));
        this.G = a3;
        this.H = new t0c(a3);
    }

    public static final l68 d(nb9 nb9, int i2) {
        if (i2 == -1) {
            nb9.getClass();
            return null;
        }
        r38 r38 = nb9.m;
        if (r38 != null) {
            return r38.x0().n(i2, r38.a, 0).c;
        }
        return null;
    }

    public static final void i(nb9 nb9) {
        nb9.l = 0;
        xs7.E(nb9.h, (hu3) null, (ru3) null, new mb9(nb9, (Continuation) null), 3);
        if (nb9.n == null) {
            za9 za9 = new za9(nb9);
            r38 r38 = nb9.m;
            if (r38 != null) {
                r38.z(za9);
            }
            nb9.n = za9;
        }
        udd.q("nb9", "notifyListeners");
        synchronized (nb9.o) {
            Iterator it = nb9.o.iterator();
            while (it.hasNext()) {
                ((ya9) it.next()).a(nb9.l(), nb9.m());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [x78, java.lang.Object] */
    public static l68 j(String str, String str2, m68 m68, String str3, String str4, Bundle bundle) {
        a68 a68;
        r58 r58 = new r58();
        q44 q44 = new q44();
        List emptyList = Collections.emptyList();
        e8c e8c = e8c.X;
        x58 x58 = new x58();
        d68 d68 = d68.d;
        w58 w58 = null;
        Uri parse = str == null ? null : Uri.parse(str);
        str2.getClass();
        ? obj = new Object();
        obj.b = str3;
        obj.a = str4;
        obj.H = bundle;
        obj.G = Integer.valueOf(m68.ordinal());
        z78 z78 = new z78(obj);
        oyb.k(((Uri) q44.e) == null || ((UUID) q44.d) != null);
        if (parse != null) {
            if (((UUID) q44.d) != null) {
                w58 = new w58(q44);
            }
            a68 = new a68(parse, (String) null, w58, (p58) null, emptyList, (String) null, e8c, (Object) null, -9223372036854775807L);
        } else {
            a68 = null;
        }
        return new l68(str2, new t58(r58), a68, new z58(x58), z78, d68);
    }

    public final void a() {
        udd.q("nb9", "disconnect: ");
        g();
        this.k = xs7.E(this.h, (hu3) null, (ru3) null, new db9(this, (Continuation) null), 3);
    }

    public final void c() {
        h();
    }

    public final void e(ta9 ta9) {
        synchronized (this.o) {
            try {
                ab9 ab9 = new ab9(ta9);
                ya9 ya9 = (ya9) this.p.put(ta9, ab9);
                if (ya9 != null) {
                    this.o.remove(ya9);
                }
                this.o.add(ab9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        udd.q("nb9", "cancelPositionObserving");
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacks(this.r);
        }
    }

    public final void g() {
        udd.q("nb9", "cancelScheduledConnectionAction");
        qod qod = this.k;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        this.k = null;
    }

    public final void h() {
        g();
        this.k = xs7.E(this.h, (hu3) null, (ru3) null, new bb9(this, (Continuation) null), 3);
    }

    public final void k(boolean z2) {
        udd.q("nb9", "disconnectNow started");
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacks(this.r);
        }
        this.q = null;
        xs7.E(this.h, (hu3) null, (ru3) null, new mb9(this, (Continuation) null), 3);
        if (z2) {
            g();
        }
    }

    public final long l() {
        String str;
        Long H2;
        l68 l68 = this.B;
        if (l68 == null || (str = l68.a) == null || (H2 = o0e.H(str)) == null) {
            return -1;
        }
        return H2.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = (r1 = r1.d).H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m68 m() {
        /*
            r1 = this;
            ns7 r0 = m68.a
            l68 r1 = r1.B
            if (r1 == 0) goto L_0x0013
            z78 r1 = r1.d
            if (r1 == 0) goto L_0x0013
            java.lang.Integer r1 = r1.H
            if (r1 == 0) goto L_0x0013
            int r1 = r1.intValue()
            goto L_0x0014
        L_0x0013:
            r1 = -1
        L_0x0014:
            r0.getClass()
            m68 r1 = defpackage.ns7.c(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb9.m():m68");
    }

    public final ua9 n() {
        z78 z78 = this.D;
        LinkedHashMap linkedHashMap = null;
        if (z78 == null) {
            return null;
        }
        CharSequence charSequence = z78.a;
        if (charSequence == null) {
            charSequence = "";
        }
        Bundle bundle = z78.I;
        if (bundle != null) {
            Set<String> keySet = bundle.keySet();
            int S = ju7.S(q23.H(keySet, 10));
            if (S < 16) {
                S = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(S);
            for (String str : keySet) {
                linkedHashMap2.put(str, bundle.get(str));
            }
            linkedHashMap = linkedHashMap2;
        }
        if (linkedHashMap == null) {
            linkedHashMap = iw4.a;
        }
        return new ua9(z78.b, charSequence, linkedHashMap);
    }

    public final long o() {
        return ((Number) this.s.getValue()).longValue();
    }

    public final boolean p(long j2) {
        return l() == j2;
    }

    public final void q() {
        xs7.E(this.h, (hu3) null, (ru3) null, new fb9(this, (Continuation) null), 3);
    }

    public final void r() {
        xs7.E(this.h, (hu3) null, (ru3) null, new gb9(this, (Continuation) null), 3);
    }

    public final void s(ta9 ta9) {
        synchronized (this.o) {
            ya9 ya9 = (ya9) this.p.remove(ta9);
            if (ya9 != null) {
                this.o.remove(ya9);
            }
        }
    }

    public final void t() {
        xs7.E(this.h, (hu3) null, (ru3) null, new lb9(this, (Continuation) null), 3);
    }

    public final void u() {
        udd.q("nb9", "tryToStartPositionObserving");
        f();
        if (this.q == null) {
            this.q = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.q;
        if (handler != null) {
            handler.post(this.r);
        }
    }
}
