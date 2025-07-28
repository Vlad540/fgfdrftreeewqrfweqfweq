package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: gy9  reason: default package */
public final class gy9 implements pk {
    public static final long[] g = new long[0];
    public final String a = gy9.class.getName();
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;

    public gy9(t97 t97, t97 t972, t97 t973, t97 t974, r7e r7e) {
        this.b = t97;
        this.c = t972;
        this.d = t973;
        this.e = t974;
        this.f = r7e;
    }

    public static long v(gy9 gy9, ol olVar) {
        sce A = gy9.A();
        A.getClass();
        return sce.a(A.a, new rce(olVar, false, false, 0, 0));
    }

    public static long w(gy9 gy9, ol olVar) {
        return sce.d(gy9.A(), olVar, false, 0, 12);
    }

    public final sce A() {
        return (sce) this.b.getValue();
    }

    public final long B(String str, boolean z) {
        if (true ^ (str == null || h0e.c0(str))) {
            return sce.b(A(), new nd7(((j2b) z()).a.n(), str, z));
        }
        throw new IllegalArgumentException("link is empty".toString());
    }

    public final long[] C(long j, long j2, List list, List list2, j63 j63, boolean z, md4 md4) {
        int ordinal;
        boolean o = o(j);
        long[] jArr = g02.b;
        if (!o) {
            return jArr;
        }
        if (list.size() == list2.size() || (ordinal = y().ordinal()) == 0) {
            if (list2.isEmpty()) {
                return jArr;
            }
            ArrayList x0 = o23.x0(list2, 100, 100);
            ArrayList x02 = o23.x0(list, 100, 100);
            ArrayList arrayList = new ArrayList(q23.H(x02, 10));
            Iterator it = x02.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(Long.valueOf(sce.d(A(), new j89(((j2b) z()).a.n(), j, j2, (List) next, (List) x0.get(i), j63, z, md4, false), false, 0, 12)));
                    i = i2;
                } else {
                    p23.G();
                    throw null;
                }
            }
            return o23.t0(arrayList);
        } else if (ordinal == 1) {
            udd.s(this.a, "messageIds.size() != messageServerIds.size()", new IllegalArgumentException("messageIds.size() != messageServerIds.size()"));
            return jArr;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("messageIds.size() != messageServerIds.size()");
        }
    }

    public final long D(long j, long j2, long j3, long j4, String str, String str2, ls8 ls8, List list, boolean z, List list2) {
        if (!o(j) || !p(j2) || !q(j4)) {
            return 0;
        }
        return sce.d(A(), new p89(((j2b) z()).a.n(), j, j2, j3, j4, str, str2, ls8, list, list2, z), false, 0, 12);
    }

    public final long E(long j, List list) {
        return v(this, new sm3(1, ((j2b) z()).a.n(), j, list));
    }

    public final long F(long j, long j2, long j3, long j4, String str, wr8 wr8) {
        int ordinal;
        if (!o(j) || !p(j2) || !q(j4)) {
            return 0;
        }
        if (str.length() > 0 || (ordinal = y().ordinal()) == 0) {
            long j5 = j;
            long j6 = j2;
            long j7 = j3;
            long j8 = j4;
            return sce.d(A(), new z89(((j2b) z()).a.n(), j5, j6, j7, j8, new rr8(wr8, str)), false, 0, 12);
        } else if (ordinal == 1) {
            udd.s(this.a, "reaction can't be empty", new IllegalArgumentException("reaction can't be empty"));
            return 0;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("reaction can't be empty");
        }
    }

    public final long G(String str, d10 d10) {
        return ((luf) this.e.getValue()).b(new f02(((j2b) z()).a.n(), str, 0, d10));
    }

    public final long H(boolean z) {
        String T = ez3.T(Long.valueOf(System.currentTimeMillis()));
        udd.q(this.a, "ping, active = " + z + ", current time = " + T);
        return v(this, new ova(((j2b) z()).a.n(), z));
    }

    public final long I(int i, long j, d10 d10, String str, String str2, String str3, String str4, String str5) {
        return sce.d(A(), new k5b(((j2b) z()).a.n(), str, str2, str3, j, d10, str4, str5, i), false, 0, 12);
    }

    public final long J(long j, long j2, List list, boolean z, int i) {
        sh2 sh2 = new sh2(((j2b) z()).a.n(), j, j2, 2, list, ch2.ADMIN, true, 0, i);
        if (z) {
            return sce.d(A(), sh2, false, 0, 12);
        }
        return v(this, sh2);
    }

    public final Object K(ibe ibe, Continuation continuation) {
        return A().e(ibe, continuation);
    }

    public final yhd L(ibe ibe, qmc qmc) {
        ybe ybe = (ybe) A().a;
        ybe.getClass();
        return new mv9(1, new joc(ybe, 6, ibe)).i(qmc);
    }

    public final long M(boolean z, long j, long j2, long j3, long j4, String str, boolean z2, boolean z3, String str2) {
        f7f f7f = r0;
        f7f f7f2 = new f7f(((j2b) z()).a.n(), j, j2, j3, j4, str, z2, z3, str2, false);
        return z ? sce.d(A(), f7f, false, 0, 12) : v(this, f7f);
    }

    public final long d(long j, long j2, List list, boolean z) {
        if (!o(j)) {
            return 0;
        }
        return sce.d(A(), new sh2(((j2b) z()).a.n(), j, j2, 1, list, ch2.MEMBER, z, 0, 0), false, 0, 12);
    }

    public final long e(int i, long j) {
        return sce.d(A(), new ct(i, ((j2b) z()).a.n(), j), false, 0, 12);
    }

    public final long f(int i, long[] jArr) {
        return sce.d(A(), new rt(i, ((j2b) z()).a.n(), jArr), false, 0, 12);
    }

    public final long g(int i, long j) {
        return v(this, new ut(i, ((j2b) z()).a.n(), j));
    }

    public final long h(long j, long j2, long j3) {
        if (!o(j)) {
            return 0;
        }
        return v(this, new mp2(((j2b) z()).a.n(), j, j2, 0, (String) null, false, (String) null, (HashMap) null, (String) null, (String) null, (d10) null, (Long) null, false, j3));
    }

    public final long i(long j, long j2, boolean z, long j3) {
        if (!o(j)) {
            return 0;
        }
        return sce.d(A(), new u62(((j2b) z()).a.n(), j, j2, j3, z), false, 0, 12);
    }

    public final long j(long j) {
        return v(this, new m92(0, ((j2b) z()).a.n(), Collections.singletonList(Long.valueOf(j))));
    }

    public final long k(long j, boolean z) {
        xn2 xn2 = new xn2(((j2b) z()).a.n(), j, false);
        return z ? sce.d(A(), xn2, false, 0, 12) : v(this, xn2);
    }

    public final long l(long j, long j2, int i, String str, boolean z, HashMap hashMap) {
        if (!o(j)) {
            return 0;
        }
        return v(this, new mp2(((j2b) z()).a.n(), j, j2, i, str, z, (String) null, hashMap, (String) null, (String) null, (d10) null, (Long) null, false, 0));
    }

    public final long m(long j, long j2, String str, String str2, d10 d10) {
        if (!o(j)) {
            return 0;
        }
        return sce.d(A(), new mp2(((j2b) z()).a.n(), j, j2, 0, (String) null, false, (String) null, (HashMap) null, str, str2, d10, (Long) null, false, 0), false, 0, 12);
    }

    public final long n(long j, String str, long j2) {
        if (!o(j)) {
            return 0;
        }
        return sce.d(A(), new mp2(((j2b) z()).a.n(), j, j2, 0, (String) null, false, str, (HashMap) null, (String) null, (String) null, (d10) null, (Long) null, false, 0), false, 0, 12);
    }

    public final boolean o(long j) {
        int ordinal;
        if ((j != 0) || (ordinal = y().ordinal()) == 0) {
            return true;
        }
        if (ordinal == 1) {
            udd.s(this.a, "invalid chat local id", new IllegalArgumentException("invalid chat local id"));
            return false;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("invalid chat local id");
        }
    }

    public final boolean p(long j) {
        int ordinal;
        if ((j != 0) || (ordinal = y().ordinal()) == 0) {
            return true;
        }
        if (ordinal == 1) {
            udd.s(this.a, "invalid message local id", new IllegalArgumentException("invalid message local id"));
            return false;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("invalid message local id");
        }
    }

    public final boolean q(long j) {
        int ordinal;
        if ((j != 0) || (ordinal = y().ordinal()) == 0) {
            return true;
        }
        if (ordinal == 1) {
            udd.s(this.a, "invalid message server id", new IllegalArgumentException("invalid message server id"));
            return false;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("invalid message server id");
        }
    }

    public final long r(long j) {
        if (!o(j)) {
            return 0;
        }
        return sce.d(A(), new ja3(((j2b) z()).a.n(), j, false, (gze) null, false, g, false, (ArrayList) null, (ArrayList) null), false, 0, 12);
    }

    public final long s() {
        return sce.d(A(), new ja3(((j2b) z()).a.n(), 0, true, (gze) null, false, g, false, (ArrayList) null, (ArrayList) null), false, 0, 12);
    }

    public final long t(gze gze, boolean z) {
        return sce.d(A(), new ja3(((j2b) z()).a.n(), 0, false, gze, z, g, false, (ArrayList) null, (ArrayList) null), false, 0, 12);
    }

    public final long[] u(List list) {
        if (list.isEmpty()) {
            return g02.b;
        }
        ArrayList x0 = o23.x0(list, 100, 100);
        int size = x0.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = Long.valueOf(v(this, new sm3(((j2b) z()).a.n(), o23.t0((List) x0.get(i)), -1))).longValue();
        }
        return jArr;
    }

    public final long x(String str, String str2, long j, long j2) {
        return sce.d(A(), new nd5(str, str2, ((j2b) z()).a.n(), j, j2), false, 0, 12);
    }

    public final fy9 y() {
        return (fy9) this.f.getValue();
    }

    public final g2b z() {
        return (g2b) this.c.getValue();
    }
}
