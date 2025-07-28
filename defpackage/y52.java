package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: y52  reason: default package */
public final class y52 {
    public long A;
    public List B;
    public j62 C;
    public g62 D;
    public String E;
    public ii5 F;
    public int G;
    public String H;
    public List I;
    public int J;
    public d62 K;
    public long L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;
    public int Q;
    public yr R = new kgd(0);
    public int S;
    public n00 T;
    public long U;
    public int V;
    public long W;
    public int X;
    public long Y;
    public long Z;
    public long a;
    public List a0;
    public n62 b;
    public long b0;
    public m62 c;
    public long c0;
    public long d;
    public kp0 d0 = kp0.c;
    public Map e;
    public long e0;
    public long f;
    public j4a f0;
    public String g;
    public long g0;
    public String h;
    public long h0;
    public String i;
    public boolean i0;
    public long j;
    public Map j0;
    public long k;
    public long k0;
    public long l;
    public boolean l0;
    public int m;
    public k62 m0 = null;
    public i62 n = new i62();
    public long n0;
    public String o;
    public String o0;
    public f62 p;
    public long p0;
    public b62 q;
    public long q0;
    public b62 r;
    public int r0 = 2;
    public b62 s;
    public b62 t;
    public b62 u;
    public b62 v;
    public b62 w;
    public long x;
    public List y;
    public List z;

    public final void a(z52 z52) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(z52);
    }

    public final o62 b() {
        return new o62(this);
    }

    public final List c() {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        return this.B;
    }

    public final Map d() {
        if (this.e == null) {
            this.e = new kgd(2);
        }
        return this.e;
    }

    public final void e(Map map) {
        if (map == null) {
            this.R = new kgd(2);
            return;
        }
        kgd kgd = new kgd(map.size());
        this.R = kgd;
        kgd.putAll(map);
    }
}
