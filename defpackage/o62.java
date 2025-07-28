package defpackage;

import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o62  reason: default package */
public final class o62 {
    public final long A;
    public final List B;
    public final g62 C;
    public final int D;
    public final String E;
    public final List F;
    public final int G;
    public final d62 H;
    public final String I;
    public final ii5 J;
    public final j62 K;
    public final long L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final long P;
    public final int Q;
    public final Map R;
    public final int S;
    public final n00 T;
    public final long U;
    public final int V;
    public final long W;
    public final int X;
    public final long Y;
    public final long Z;
    public final long a;
    public final List a0;
    public final n62 b;
    public final long b0;
    public final m62 c;
    public final long c0;
    public final long d;
    public final long d0;
    public final Map e;
    public final kp0 e0;
    public final long f;
    public final j4a f0;
    public final String g;
    public final long g0;
    public final String h;
    public final long h0;
    public final String i;
    public boolean i0;
    public final long j;
    public final long j0;
    public final long k;
    public final boolean k0;
    public final long l;
    public final long l0;
    public final int m;
    public final String m0;
    public final i62 n;
    public final Map n0;
    public final String o;
    public final k62 o0;
    public final f62 p;
    public final long p0;
    public final b62 q;
    public final long q0;
    public final b62 r;
    public final int r0;
    public final b62 s;
    public final b62 t;
    public final b62 u;
    public final b62 v;
    public final b62 w;
    public final long x;
    public final List y;
    public final List z;

    public o62(y52 y52) {
        this.a = y52.a;
        n62 n62 = y52.b;
        if (n62 == null) {
            this.b = n62.a;
        } else {
            this.b = n62;
        }
        m62 m62 = y52.c;
        if (m62 == null) {
            this.c = m62.a;
        } else {
            this.c = m62;
        }
        this.d = y52.d;
        Map map = y52.e;
        this.e = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f = y52.f;
        this.g = y52.g;
        this.h = y52.h;
        this.i = y52.i;
        this.j = y52.j;
        this.k = y52.k;
        this.l = y52.l;
        this.m = y52.m;
        i62 i62 = y52.n;
        this.n = i62 != null ? i62.b(true) : new i62();
        this.o = y52.o;
        this.p = y52.p;
        this.q = y52.q;
        this.r = y52.r;
        this.s = y52.s;
        this.t = y52.t;
        this.u = y52.u;
        this.v = y52.v;
        this.w = y52.w;
        this.x = y52.x;
        List list = y52.y;
        this.y = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        List list2 = y52.z;
        this.z = list2 != null ? Collections.unmodifiableList(list2) : Collections.emptyList();
        this.A = y52.A;
        List list3 = y52.B;
        this.B = list3 != null ? Collections.unmodifiableList(list3) : Collections.emptyList();
        this.C = y52.D;
        this.D = y52.G;
        this.E = y52.H;
        List list4 = y52.I;
        if (list4 == null) {
            this.F = Collections.emptyList();
        } else {
            this.F = list4;
        }
        this.G = y52.J;
        d62 d62 = y52.K;
        if (d62 == null) {
            this.H = d62.j;
        } else {
            this.H = d62;
        }
        this.r0 = y52.r0;
        this.I = y52.E;
        ii5 ii5 = y52.F;
        this.J = ii5 == null ? ii5.d : ii5;
        this.K = y52.C;
        this.L = y52.L;
        this.M = y52.M;
        this.N = y52.N;
        this.O = y52.O;
        this.P = y52.P;
        this.Q = y52.Q;
        this.R = y52.R;
        this.S = y52.S;
        this.T = y52.T;
        this.U = y52.U;
        this.V = y52.V;
        this.W = y52.W;
        this.X = y52.X;
        this.Y = y52.Y;
        this.Z = y52.Z;
        this.a0 = y52.a0;
        this.b0 = y52.b0;
        this.c0 = y52.c0;
        this.e0 = y52.d0;
        this.d0 = y52.e0;
        this.f0 = y52.f0;
        this.g0 = y52.g0;
        this.h0 = y52.h0;
        this.i0 = y52.i0;
        this.n0 = y52.j0;
        this.j0 = y52.k0;
        this.k0 = y52.l0;
        this.o0 = y52.m0;
        this.l0 = y52.n0;
        this.m0 = y52.o0;
        this.p0 = y52.p0;
        this.q0 = y52.q0;
    }

    public final f62 a() {
        f62 f62 = this.p;
        return f62 != null ? f62 : f62.h;
    }

    public final String b(fj0 fj0, ej0 ej0) {
        String str = this.h;
        if (URLUtil.isContentUrl(str) || URLUtil.isFileUrl(str)) {
            return str;
        }
        if (!r1g.p(str)) {
            return vx3.t(str, fj0, ej0);
        }
        return null;
    }

    public final int c() {
        if (this.b == n62.a) {
            return 2;
        }
        return this.D;
    }

    public final boolean d() {
        return this.c == m62.a;
    }

    public final boolean e() {
        return this.b == n62.a;
    }

    public final boolean f(long j2) {
        if (this.a == 0 && this.b == n62.a && this.d == j2) {
            Map map = this.e;
            return map.size() == 1 && map.containsKey(Long.valueOf(j2));
        }
    }

    public final boolean g() {
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            if (this.c == m62.Z) {
                return false;
            }
        } else if (ordinal != 1 && ordinal != 2) {
            throw new IllegalStateException("invalid chat type");
        } else if (this.a == 0) {
            return false;
        }
        return true;
    }

    public final y52 h() {
        y52 y52 = new y52();
        y52.a = this.a;
        y52.b = this.b;
        y52.c = this.c;
        y52.d = this.d;
        Map map = this.e;
        kgd kgd = new kgd(map.size());
        kgd.putAll(map);
        y52.e = kgd;
        y52.f = this.f;
        y52.g = this.g;
        y52.h = this.h;
        y52.i = this.i;
        y52.j = this.j;
        y52.k = this.k;
        y52.l = this.l;
        y52.m = this.m;
        y52.n = this.n.b(false);
        y52.o = this.o;
        y52.p = this.p;
        y52.q = this.q;
        y52.r = this.r;
        y52.s = this.s;
        y52.t = this.t;
        y52.u = this.u;
        y52.v = this.v;
        y52.w = this.w;
        y52.x = this.x;
        y52.y = new ArrayList(this.y);
        y52.z = new ArrayList(this.z);
        y52.A = this.A;
        y52.B = new ArrayList(this.B);
        y52.C = this.K;
        y52.D = this.C;
        y52.r0 = this.r0;
        y52.E = this.I;
        y52.F = this.J;
        y52.G = this.D;
        y52.H = this.E;
        y52.I = new ArrayList(this.F);
        y52.J = this.G;
        y52.K = this.H;
        y52.L = this.L;
        y52.M = this.M;
        y52.N = this.N;
        y52.O = this.O;
        y52.P = this.P;
        y52.Q = this.Q;
        y52.e(this.R);
        y52.S = this.S;
        y52.T = this.T;
        y52.U = this.U;
        y52.V = this.V;
        y52.W = this.W;
        y52.X = this.X;
        y52.Y = this.Y;
        y52.Z = this.Z;
        y52.a0 = this.a0;
        y52.d0 = this.e0;
        y52.b0 = this.b0;
        y52.c0 = this.c0;
        y52.e0 = this.d0;
        y52.f0 = this.f0;
        y52.g0 = this.g0;
        y52.h0 = this.h0;
        y52.i0 = this.i0;
        y52.j0 = this.n0;
        y52.l0 = this.k0;
        y52.m0 = this.o0;
        y52.k0 = this.j0;
        y52.n0 = this.l0;
        y52.o0 = this.m0;
        y52.p0 = this.p0;
        y52.q0 = this.q0;
        return y52;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatData{serverId=");
        sb.append(this.a);
        sb.append(", type=");
        n62 n62 = this.b;
        sb.append(n62);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", owner=");
        sb.append(this.d);
        sb.append(", participants={");
        n62 n622 = n62.a;
        Map map = this.e;
        sb.append(n62 == n622 ? r1g.s(map.keySet()) : Integer.valueOf(map.size()));
        sb.append("}, title='");
        sb.append(this.g);
        sb.append("', lastMessageId=");
        sb.append(this.j);
        sb.append(", lastEventTime=");
        sb.append(this.k);
        sb.append(", newMessages=");
        sb.append(this.m);
        sb.append(", lastPushMessage=");
        sb.append(this.o0);
        sb.append(", markedAsUnread=");
        sb.append(this.k0);
        sb.append(", chatSettings=");
        sb.append(this.p);
        sb.append(", lastReactionMessageId= ");
        sb.append(this.l0);
        sb.append(", lastReaction");
        return me4.l(sb, this.m0, '}');
    }
}
