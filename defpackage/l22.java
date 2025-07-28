package defpackage;

import java.util.Collections;

/* renamed from: l22  reason: default package */
public abstract class l22 {
    public static final kc3 a = new kc3(f2a.R, new hge(h2a.a), 2, false);
    public static final r7e b = new r7e(new di1(29));

    public static eed a(i22 i22) {
        int i = h2a.E;
        tf3 k = i22.k();
        String d = k != null ? k.d() : null;
        if (d != null) {
            return new eed(i22.a, new jge(i, cs.g0(new Object[]{d})), new hge(cic.M), p23.B(new kc3(f2a.Q, new hge(h2a.A), 1, false), a));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static eed b(long j) {
        return new eed(j, new hge(h2a.b), (mge) null, p23.B(new kc3(f2a.T, new hge(h2a.B), 1, false), a));
    }

    public static eed c(long j) {
        return new eed(j, new hge(h2a.j), (mge) null, p23.B(new kc3(f2a.T, new hge(h2a.i), 1, false), a));
    }

    public static eed d(i22 i22) {
        long j = i22.a;
        int i = h2a.d;
        i22.h0();
        return new eed(j, new jge(i, cs.g0(new Object[]{i22.y0})), new hge(cic.x), p23.B(new kc3(f2a.I, new hge(h2a.f), 1, false), new kc3(f2a.B, new hge(h2a.c), 1, false), a));
    }

    public static eed e(i22 i22) {
        long j = i22.a;
        int i = h2a.m;
        i22.h0();
        return new eed(j, new jge(i, cs.g0(new Object[]{i22.y0})), (mge) null, p23.B(new kc3(f2a.S, new hge(h2a.h), 1, false), a));
    }

    public static eed f(i22 i22) {
        long j = i22.a;
        int i = h2a.m;
        i22.h0();
        return new eed(j, new jge(i, cs.g0(new Object[]{i22.y0})), new hge(cic.C), p23.B(new kc3(f2a.I, new hge(h2a.r), 1, false), new kc3(f2a.C, new hge(h2a.k), 1, false), a));
    }

    public static eed g(i22 i22) {
        long j = i22.a;
        int i = h2a.K;
        i22.h0();
        return new eed(j, new jge(i, cs.g0(new Object[]{i22.y0})), new hge(cic.y), p23.B(new kc3(f2a.S, new hge(h2a.l), 1, false), new kc3(f2a.T, new hge(h2a.k), 1, false), a));
    }

    public static eed h(i22 i22) {
        long j = i22.a;
        int i = h2a.e;
        i22.h0();
        return new eed(j, new jge(i, cs.g0(new Object[]{i22.y0})), (mge) null, p23.B(new kc3(f2a.U, new hge(h2a.C), 1, false), a));
    }

    public static eed i(i22 i22) {
        long j = i22.a;
        int i = h2a.e;
        i22.h0();
        return new eed(j, new jge(i, cs.g0(new Object[]{i22.y0})), (mge) null, p23.B(new kc3(f2a.I, new hge(h2a.f), 1, false), a));
    }

    public static eed j(i22 i22) {
        long j = i22.a;
        int i = h2a.o;
        i22.h0();
        return new eed(j, new jge(i, cs.g0(new Object[]{i22.y0})), (mge) null, p23.B(new kc3(f2a.U, new hge(h2a.D), 1, false), (kc3) b.getValue()));
    }

    public static eed k(i22 i22) {
        long j = i22.a;
        int i = h2a.o;
        i22.h0();
        return new eed(j, new jge(i, cs.g0(new Object[]{i22.y0})), (mge) null, p23.B(new kc3(f2a.I, new hge(h2a.r), 1, false), (kc3) b.getValue()));
    }

    public static eed l(i22 i22) {
        return new eed(i22.a, new hge(h2a.O), (mge) null, p23.B(new kc3(f2a.W, new hge(h2a.M), 3, false), new kc3(f2a.X, new hge(h2a.N), 3, false), new kc3(f2a.V, new hge(h2a.L), 3, false), new kc3(f2a.Y, new hge(h2a.P), 1, false), a));
    }

    public static eed m() {
        return new eed(Long.MAX_VALUE, new lge("Действие находится в разработке!"), new lge("Возвращайтесь позже :)"), Collections.singletonList(new kc3(Integer.MIN_VALUE, new lge("Вернусь позже"), 3, false)));
    }
}
