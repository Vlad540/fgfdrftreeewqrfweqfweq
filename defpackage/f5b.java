package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: f5b  reason: default package */
public final class f5b {
    public final r7e A;
    public final r7e B;
    public final r7e C;
    public final ContentResolver a;
    public final b5b b;
    public final bm3 c;
    public final boolean d;
    public final v4b e;
    public final vl4 f;
    public final boolean g;
    public final wr6 h;
    public final Set i;
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();
    public final r7e l;
    public final r7e m;
    public final r7e n;
    public final r7e o;
    public final r7e p;
    public final r7e q;
    public final r7e r;
    public final r7e s;
    public final r7e t;
    public final r7e u;
    public final r7e v;
    public final r7e w;
    public final r7e x;
    public final r7e y;
    public final r7e z;

    public f5b(ContentResolver contentResolver, b5b b5b, bm3 bm3, boolean z2, v4b v4b, vl4 vl4, boolean z3, wr6 wr6, Set set) {
        this.a = contentResolver;
        this.b = b5b;
        this.c = bm3;
        this.d = z2;
        this.e = v4b;
        this.f = vl4;
        this.g = z3;
        this.h = wr6;
        this.i = set;
        new LinkedHashMap();
        this.l = new r7e(new e5b(this, 0));
        this.m = new r7e(new e5b(this, 17));
        this.n = new r7e(new e5b(this, 1));
        this.o = new r7e(new e5b(this, 2));
        this.p = new r7e(new e5b(this, 3));
        this.q = new r7e(new e5b(this, 4));
        this.r = new r7e(new e5b(this, 5));
        this.s = new r7e(new e5b(this, 6));
        this.t = new r7e(new e5b(this, 7));
        this.u = new r7e(new e5b(this, 8));
        this.v = new r7e(new e5b(this, 9));
        this.w = new r7e(new e5b(this, 10));
        this.x = new r7e(new e5b(this, 11));
        this.y = new r7e(new e5b(this, 12));
        this.z = new r7e(new e5b(this, 13));
        this.A = new r7e(new e5b(this, 14));
        this.B = new r7e(new e5b(this, 15));
        this.C = new r7e(new e5b(this, 16));
    }

    public final y4b a(tr6 tr6) {
        n06.s();
        Uri uri = tr6.b;
        int i2 = tr6.c;
        if (i2 == 0) {
            return (y4b) this.o.getValue();
        }
        r7e r7e = this.w;
        boolean z2 = tr6.g;
        switch (i2) {
            case 2:
                return z2 ? f() : (y4b) r7e.getValue();
            case 3:
                return z2 ? f() : (y4b) this.v.getValue();
            case 4:
                if (z2) {
                    return f();
                }
                String type = this.a.getType(uri);
                Map map = sh8.a;
                boolean z3 = false;
                if (type != null) {
                    z3 = p0e.Q(type, "video/", false);
                }
                return z3 ? (y4b) r7e.getValue() : (y4b) this.x.getValue();
            case 5:
                return (y4b) this.B.getValue();
            case 6:
                return (y4b) this.A.getValue();
            case 7:
                return (y4b) this.C.getValue();
            case 8:
                return (y4b) this.z.getValue();
            default:
                Set set = this.i;
                if (set != null) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        hr1.r(it.next());
                        throw null;
                    }
                }
                throw new IllegalArgumentException(rf0.h("Unsupported uri scheme! Uri is: ", qr4.c(uri)));
        }
    }

    public final y4b b(tr6 tr6) {
        y4b y4b;
        y4b a2 = a(tr6);
        synchronized (this) {
            y4b = (y4b) this.k.get(a2);
            if (y4b == null) {
                this.b.getClass();
                y4b = new v9(a2, 2);
                this.k.put(a2, y4b);
            }
        }
        return y4b;
    }

    public final y4b c(tr6 tr6) {
        n06.s();
        int i2 = tr6.v;
        y4b a2 = a(tr6);
        return tr6.q != null ? g(a2) : a2;
    }

    public final y4b d(tr6 tr6) {
        qr4.e(tr6);
        int i2 = tr6.c;
        if (i2 == 0) {
            return (y4b) this.q.getValue();
        }
        if (i2 == 2 || i2 == 3) {
            return (y4b) this.s.getValue();
        }
        throw new IllegalArgumentException(rf0.h("Unsupported uri scheme for encoded image fetch! Uri is: ", qr4.c(tr6.b)));
    }

    public final y4b e(tr6 tr6) {
        n06.s();
        int i2 = tr6.c;
        qr4.e(tr6);
        if (i2 == 0) {
            return (y4b) this.l.getValue();
        }
        if (i2 == 2 || i2 == 3) {
            return (y4b) this.m.getValue();
        }
        if (i2 == 4) {
            return (y4b) this.n.getValue();
        }
        Set set = this.i;
        if (set != null) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                hr1.r(it.next());
                throw null;
            }
        }
        throw new IllegalArgumentException(rf0.h("Unsupported uri scheme for encoded image fetch! Uri is: ", qr4.c(tr6.b)));
    }

    public final y4b f() {
        return (y4b) this.y.getValue();
    }

    public final synchronized y4b g(y4b y4b) {
        y4b y4b2;
        y4b2 = (y4b) this.j.get(y4b);
        if (y4b2 == null) {
            b5b b5b = this.b;
            rh9 rh9 = new rh9(y4b, b5b.p, (Executor) b5b.j.c());
            b5b b5b2 = this.b;
            bn0 bn0 = new bn0((qe4) b5b2.n, b5b2.o, rh9, 2);
            this.j.put(y4b, bn0);
            y4b2 = bn0;
        }
        return y4b2;
    }

    public final y4b h(y4b y4b) {
        b5b b5b = this.b;
        el8 el8 = b5b.n;
        m54 m54 = b5b.o;
        return new bn0(b5b.n, m54, new bie(new an0(m54, new bn0(el8, m54, y4b, 0)), this.e, 0), 0);
    }

    public final y4b i(y4b y4b) {
        boolean w2 = n06.w();
        b5b b5b = this.b;
        if (!w2) {
            return h(b5b.a(y4b));
        }
        n06.g("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            return h(b5b.a(y4b));
        } finally {
            n06.m();
        }
    }

    public final y4b j(jk7 jk7, wie[] wieArr) {
        v9 v9Var = new v9(l(jk7), 0);
        b5b b5b = this.b;
        wr6 wr6 = this.h;
        return i(new bie(b5b.b(new v9(wieArr), true, wr6), new rie(b5b.j.b(), b5b.b(v9Var, true, wr6)), 1));
    }

    public final synchronized gbc k(bm3 bm3) {
        b5b b5b;
        try {
            n06.s();
            b5b = this.b;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.b.b(new v9(l(new rh9(b5b.k, b5b.d, bm3)), 0), this.d && this.f != vl4.c, this.h);
    }

    public final an0 l(y4b y4b) {
        boolean z2 = this.g;
        b5b b5b = this.b;
        if (z2) {
            n06.s();
            o3e o3e = b5b.l;
            m54 m54 = b5b.o;
            y4b = new vh4(o3e, m54, new vh4(o3e, m54, y4b, 1), 0);
        }
        m54 m542 = b5b.o;
        return new an0(m542, b5b.s, new bn0((qe4) b5b.m, m542, y4b, 1));
    }
}
