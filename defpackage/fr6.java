package defpackage;

import android.net.Uri;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: fr6  reason: default package */
public final class fr6 {
    public static final CancellationException l = new CancellationException("Prefetching is not enabled");
    public final f5b a;
    public final o3e b;
    public final o3e c;
    public final xw5 d;
    public final ww5 e;
    public final el8 f;
    public final el8 g;
    public final m54 h;
    public final o3e i;
    public final AtomicLong j = new AtomicLong();
    public final hr6 k;

    static {
        new CancellationException("ImageRequest is null");
        new CancellationException("Modified URL is null");
    }

    public fr6(f5b f5b, Set set, Set set2, t3e t3e, qe4 qe4, qe4 qe42, o3e o3e, m54 m54, o3e o3e2, hr6 hr6) {
        this.a = f5b;
        this.b = t3e;
        this.c = o3e;
        this.d = new xw5(set);
        this.e = new ww5(set2);
        this.f = qe4;
        this.g = qe42;
        this.h = m54;
        this.i = o3e2;
        this.k = hr6;
    }

    public final g0 a(tr6 tr6, Object obj) {
        return b(tr6, obj, (sr6) null, (tac) null, (String) null);
    }

    public final g0 b(tr6 tr6, Object obj, sr6 sr6, tac tac, String str) {
        if (tr6 == null) {
            return wx3.o(new NullPointerException());
        }
        try {
            y4b c2 = this.a.c(tr6);
            if (sr6 == null) {
                sr6 = sr6.FULL_FETCH;
            }
            return h(c2, tr6, sr6, obj, tac, str);
        } catch (Exception e2) {
            return wx3.o(e2);
        }
    }

    public final g0 c(tr6 tr6) {
        if (tr6.b != null) {
            try {
                y4b e2 = this.a.e(tr6);
                if (tr6.i != null) {
                    ur6 b2 = ur6.b(tr6);
                    b2.d = null;
                    tr6 = b2.a();
                }
                return h(e2, tr6, sr6.FULL_FETCH, (Object) null, (tac) null, (String) null);
            } catch (Exception e3) {
                return wx3.o(e3);
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public final zm0 d(tr6 tr6, m18 m18) {
        n06.s();
        k1b k1b = tr6.q;
        m54 m54 = this.h;
        return k1b != null ? m54.r(tr6, m18) : m54.l(tr6, m18);
    }

    public final xw5 e(tr6 tr6, tac tac) {
        if (tr6 != null) {
            xw5 xw5 = this.d;
            tac tac2 = tr6.r;
            if (tac == null) {
                if (tac2 == null) {
                    return xw5;
                }
                return new xw5(xw5, tac2);
            } else if (tac2 == null) {
                return new xw5(xw5, tac);
            } else {
                return new xw5(xw5, tac, tac2);
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public final g0 f(tr6 tr6, m18 m18) {
        n06.s();
        u3b u3b = u3b.b;
        CancellationException cancellationException = l;
        o3e o3e = this.i;
        hr6 hr6 = this.k;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return wx3.o(cancellationException);
        }
        try {
            hr6.v.getClass();
            if (tr6 != null) {
                Boolean bool = tr6.p;
                boolean booleanValue = bool != null ? !bool.booleanValue() : ((Boolean) o3e.get()).booleanValue();
                f5b f5b = this.a;
                return i(booleanValue ? f5b.d(tr6) : f5b.b(tr6), tr6, m18, u3b);
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Exception e2) {
            return wx3.o(e2);
        }
    }

    public final g0 g(tr6 tr6) {
        u3b u3b = u3b.c;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return wx3.o(l);
        }
        if (tr6 == null) {
            return wx3.o(new NullPointerException("imageRequest is null"));
        }
        try {
            return i(this.a.d(tr6), tr6, (m18) null, u3b);
        } catch (Exception e2) {
            return wx3.o(e2);
        }
    }

    public final g0 h(y4b y4b, tr6 tr6, sr6 sr6, Object obj, tac tac, String str) {
        boolean z;
        tr6 tr62 = tr6;
        n06.s();
        wz6 wz6 = new wz6(e(tr6, tac), this.e);
        try {
            sr6 sr62 = tr62.l;
            sr6 sr63 = sr6;
            sr6 sr64 = sr62.a > sr63.a ? sr62 : sr63;
            String valueOf = String.valueOf(this.j.getAndIncrement());
            if (!tr62.e) {
                if (fye.e(tr62.b)) {
                    z = false;
                    ji0 ji0 = new ji0(tr6, valueOf, str, wz6, obj, sr64, false, z, tr62.k, this.k);
                    n06.s();
                    y4b y4b2 = y4b;
                    c13 c13 = new c13(y4b, ji0, wz6, 0);
                    n06.s();
                    return c13;
                }
            }
            z = true;
            ji0 ji02 = new ji0(tr6, valueOf, str, wz6, obj, sr64, false, z, tr62.k, this.k);
            n06.s();
            y4b y4b22 = y4b;
            c13 c132 = new c13(y4b, ji02, wz6, 0);
            n06.s();
            return c132;
        } catch (Exception e2) {
            return wx3.o(e2);
        }
    }

    public final g0 i(y4b y4b, tr6 tr6, m18 m18, u3b u3b) {
        tr6 tr62 = tr6;
        sr6 sr6 = sr6.FULL_FETCH;
        wz6 wz6 = new wz6(e(tr62, (tac) null), this.e);
        Uri uri = tr62.b;
        if (!uri.equals(uri)) {
            ur6 b2 = ur6.b(tr6);
            b2.a = uri;
            tr62 = b2.a();
        }
        tr6 tr63 = tr62;
        try {
            sr6 sr62 = tr63.l;
            sr6 sr63 = sr62.a > 1 ? sr62 : sr6;
            String valueOf = String.valueOf(this.j.getAndIncrement());
            hr6 hr6 = this.k;
            di9 di9 = hr6.v;
            return new c13(y4b, new ji0(tr63, valueOf, (String) null, wz6, m18, sr63, true, false, u3b, hr6), wz6, 1);
        } catch (Exception e2) {
            return wx3.o(e2);
        }
    }
}
