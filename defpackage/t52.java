package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: t52  reason: default package */
public final class t52 {
    public static final yz I = new yz(10);
    public static final yz J = new yz(9);
    public static final EnumSet K;
    public static final EnumSet L;
    public static final EnumSet M;
    public static final ak0 N = new ak0(17);
    public final nj4 A;
    public final nj4 B;
    public final t97 C;
    public final nj4 D;
    public final grd E = hrd.a((Object) null);
    public final yr F = new kgd(0);
    public s52 G;
    public final ReentrantLock H = new ReentrantLock();
    public i22 a = null;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public volatile boolean i = false;
    public final l73 j = new l73();
    public final Set k = Collections.synchronizedSet(new HashSet());
    public final nj4 l;
    public final tt0 m;
    public final g2b n;
    public final nj4 o;
    public final nj4 p;
    public final nj4 q;
    public final nj4 r;
    public final nj4 s;
    public final nj4 t;
    public final qmc u;
    public final nj4 v;
    public final nj4 w;
    public final nj4 x;
    public final qmc y;
    public final qmc z;

    static {
        m62 m62 = m62.a;
        m62 m622 = m62.b;
        K = EnumSet.of(m62, new m62[]{m622, m62.c, m62.X, m62.o, m62.Y, m62.Z});
        L = EnumSet.of(m62, m622);
        M = EnumSet.of(m62);
    }

    public t52(nj4 nj4, tt0 tt0, g2b g2b, nj4 nj42, nj4 nj43, nj4 nj44, nj4 nj45, nj4 nj46, nj4 nj47, qmc qmc, nj4 nj48, nj4 nj49, nj4 nj410, nj4 nj411, qmc qmc2, qmc qmc3, nj4 nj412, nj4 nj413, t97 t97) {
        this.l = nj4;
        this.m = tt0;
        this.n = g2b;
        this.o = nj42;
        this.D = nj411;
        this.p = nj43;
        this.q = nj44;
        this.r = nj45;
        this.s = nj46;
        this.t = nj47;
        this.u = qmc;
        this.v = nj48;
        this.w = nj49;
        this.x = nj410;
        this.y = qmc2;
        this.z = qmc3;
        this.A = nj412;
        this.B = nj413;
        this.C = t97;
    }

    public static b62 G(y52 y52, Set set) {
        if (e00.G0.equals(set)) {
            b62 b62 = y52.q;
            return b62 != null ? b62 : b62.g;
        } else if (e00.H0.equals(set)) {
            b62 b622 = y52.r;
            return b622 != null ? b622 : b62.g;
        } else if (e00.I0.equals(set)) {
            b62 b623 = y52.s;
            return b623 != null ? b623 : b62.g;
        } else if (e00.J0.equals(set)) {
            b62 b624 = y52.t;
            return b624 != null ? b624 : b62.g;
        } else if (e00.K0.equals(set)) {
            b62 b625 = y52.u;
            return b625 != null ? b625 : b62.g;
        } else if (e00.L0.equals(set)) {
            b62 b626 = y52.v;
            return b626 != null ? b626 : b62.g;
        } else if (e00.M0.equals(set)) {
            b62 b627 = y52.w;
            return b627 != null ? b627 : b62.g;
        } else {
            b62 b628 = b62.f;
            return new b62((h62) null, 0, 0, 0, Collections.emptyList());
        }
    }

    public static b62 H(o62 o62, Set set) {
        if (e00.G0.equals(set)) {
            b62 b62 = o62.q;
            return b62 != null ? b62 : b62.g;
        } else if (e00.H0.equals(set)) {
            b62 b622 = o62.r;
            return b622 != null ? b622 : b62.g;
        } else if (e00.I0.equals(set)) {
            b62 b623 = o62.s;
            return b623 != null ? b623 : b62.g;
        } else if (e00.J0.equals(set)) {
            b62 b624 = o62.t;
            return b624 != null ? b624 : b62.g;
        } else if (e00.K0.equals(set)) {
            b62 b625 = o62.u;
            return b625 != null ? b625 : b62.g;
        } else if (e00.L0.equals(set)) {
            b62 b626 = o62.v;
            return b626 != null ? b626 : b62.g;
        } else if (e00.M0.equals(set)) {
            b62 b627 = o62.w;
            return b627 != null ? b627 : b62.g;
        } else {
            b62 b628 = b62.f;
            return new b62((h62) null, 0, 0, 0, Collections.emptyList());
        }
    }

    public static boolean K(o62 o62, Set set) {
        if (e00.G0.equals(set)) {
            return o62.q != null;
        }
        if (e00.H0.equals(set)) {
            return o62.r != null;
        }
        if (e00.I0.equals(set)) {
            return o62.s != null;
        }
        if (e00.J0.equals(set)) {
            return o62.t != null;
        }
        if (e00.K0.equals(set)) {
            return o62.u != null;
        }
        if (e00.L0.equals(set)) {
            return o62.v != null;
        }
        if (e00.M0.equals(set)) {
            return o62.w != null;
        }
        return false;
    }

    public static void a0(y52 y52, Set set, b62 b62) {
        if (e00.G0.equals(set)) {
            y52.q = b62;
        } else if (e00.H0.equals(set)) {
            y52.r = b62;
        } else if (e00.I0.equals(set)) {
            y52.s = b62;
        } else if (e00.J0.equals(set)) {
            y52.t = b62;
        } else if (e00.K0.equals(set)) {
            y52.u = b62;
        } else if (e00.L0.equals(set)) {
            y52.v = b62;
        } else if (e00.M0.equals(set)) {
            y52.w = b62;
        }
    }

    public static void l0(y52 y52, vo8 vo8) {
        if (!vo8.n()) {
            y52.j = vo8.b;
            long j2 = y52.k;
            long j3 = vo8.o;
            if (j3 > j2) {
                y52.k = j3;
                return;
            }
            long j4 = vo8.A0;
            if (j4 > j2) {
                y52.k = j4;
            }
        }
    }

    public static boolean m(i22 i22, EnumSet enumSet, boolean z2, jb5 jb5) {
        o62 o62 = i22.b;
        if (o62.b == n62.c) {
            if (i22.G() && !i22.e0() && o62.a().e == 0) {
                return false;
            }
            if (z2) {
                boolean z3 = ((kb5) jb5).s() && (i22.w() || i22.a0() || d8.v(i22.d(i22.Y), 512));
                if ((i22.v() || z3) && i22.A()) {
                    return true;
                }
            } else if (i22.Z()) {
                return true;
            }
            return false;
        } else if (!z2 && i22.H() && i22.b0() && !i22.a0() && i22.I()) {
            return true;
        } else {
            if (!i22.H() || i22.b0() || !i22.A() || o62.a().e != 0) {
                return enumSet.contains(o62.c);
            }
            return false;
        }
    }

    public static void q(y52 y52) {
        f62 f62 = y52.p;
        if (f62 == null) {
            f62 = f62.h;
        }
        e62 a2 = f62.a();
        a2.e = 0;
        y52.p = new f62(a2);
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [w52, java.lang.Object] */
    public static void t(y52 y52, long j2, long j3, int i2, long j4, Map map, long j5, int i3, long j6, long j7, String str, String str2, x3a x3a) {
        n62 n62;
        g62 g62;
        y52 y522 = y52;
        long j8 = j2;
        long j9 = j3;
        int i4 = i2;
        long j10 = j4;
        x3a x3a2 = x3a;
        int i5 = 2;
        if (i4 == 2 || j9 != 0) {
            y522.l = j9;
        }
        if (i4 == 2 || j8 != 0) {
            y522.a = j8;
        }
        int t2 = hr1.t(i2);
        if (t2 != 1) {
            n62 = n62.b;
            if (t2 != 2) {
                if (t2 == 3) {
                    n62 = n62.c;
                } else if (t2 == 4) {
                    n62 = n62.o;
                }
            }
        } else {
            n62 = n62.a;
        }
        y522.b = n62;
        if (i4 == 3) {
            y522.I = Collections.singletonList(Long.valueOf(j4));
            Long valueOf = Long.valueOf(j4);
            ? obj = new Object();
            obj.b = j10;
            obj.a = 2047;
            y52.e(Collections.singletonMap(valueOf, new x52(obj)));
        }
        if (i3 != 0) {
            if (hr1.t(i3) == 1) {
                i5 = 1;
            }
            y522.r0 = i5;
        } else {
            y522.r0 = 2;
        }
        y522.c = m62.Z;
        y522.d = j10;
        y522.G = map.size();
        y52.d().putAll(map);
        y522.k = j5;
        y522.p0 = j6;
        y522.q0 = j7;
        y522.g = str;
        y522.h = str2;
        if (x3a2 != null) {
            long[] jArr = (long[]) x3a2.b;
            if (jArr.length > 0) {
                g62 = new g62(jArr);
                y522.D = g62;
            }
        }
        g62 = null;
        y522.D = g62;
    }

    public final p62 A(long j2) {
        p62 p62 = (p62) this.e.get(Long.valueOf(j2));
        return (p62 != null || this.i) ? p62 : ((hz3) ((a04) this.l.get())).b.e(j2);
    }

    public final i22 B(long j2) {
        ConcurrentHashMap concurrentHashMap = this.f;
        i22 i22 = (i22) concurrentHashMap.get(Long.valueOf(j2));
        if (i22 != null) {
            return n(i22);
        }
        e();
        return n((i22) concurrentHashMap.get(Long.valueOf(j2)));
    }

    public final ArrayList C(EnumSet enumSet, boolean z2, w1b w1b) {
        boolean z3;
        e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : this.f.entrySet()) {
            i22 i22 = (i22) value.getValue();
            if (w1b != null) {
                try {
                    z3 = w1b.test(i22);
                } catch (Exception unused) {
                }
                if (z3 && m(i22, enumSet, z2, ((j2b) this.n).e)) {
                    arrayList.add(i22);
                }
            }
            z3 = true;
            arrayList.add(i22);
        }
        return arrayList;
    }

    public final List D(Comparator comparator) {
        ArrayList w2 = w((ak0) null);
        Collections.sort(w2, comparator);
        return Collections.unmodifiableList(w2);
    }

    public final i22 E(long j2) {
        return (i22) this.c.get(Long.valueOf(j2 ^ J()));
    }

    public final int F() {
        int i2 = 0;
        for (i22 i22 : this.f.values()) {
            if (i22.b.a().e != 0) {
                i2++;
            }
        }
        return i2;
    }

    public final mc9 I(long j2) {
        Long valueOf = Long.valueOf(j2);
        yr yrVar = this.F;
        Object obj = yrVar.get(valueOf);
        if (obj == null) {
            obj = hrd.a((Object) null);
            yrVar.put(valueOf, obj);
        }
        return (mc9) obj;
    }

    public final long J() {
        return ((j2b) this.n).a.s();
    }

    public final boolean L(long j2, z52 z52) {
        i22 B2 = B(j2);
        return B2 != null && B2.b.B.contains(z52);
    }

    public final p62 M(long j2) {
        long j3 = j2;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "t52", us8.i(j3, "insertDialog contactId="), (Throwable) null);
        }
        long J2 = J();
        long J3 = J() ^ j3;
        kgd kgd = new kgd(2);
        kgd.put(Long.valueOf(J2), 0L);
        kgd.put(Long.valueOf(j2), 0L);
        y52 y52 = new y52();
        t(y52, J3, J3, 2, J2, kgd, 0, 3, 0, 0, "", "", (x3a) null);
        o62 o62 = new o62(y52);
        i22 E2 = E(j2);
        if (E2 == null) {
            return new p62(((hz3) ((a04) this.l.get())).b.d(o62), o62);
        }
        ((hz3) ((a04) this.l.get())).b.g(E2.a, o62);
        return new p62(E2.a, E2.b);
    }

    public final vo8 N(long j2, ym8 ym8) {
        udd.q("t52", "insertMessageIfNeeded");
        vo8 vo8 = null;
        if (ym8 == null) {
            return null;
        }
        nj4 nj4 = this.s;
        vo8 j3 = ((to8) nj4.get()).j(j2, ym8.a);
        if (j3 != null) {
            return j3;
        }
        long j4 = ym8.Y;
        if (j4 != 0) {
            nec nec = ((hz3) ((to8) nj4.get()).a).c;
            jp8 h2 = nec.d().h(j2, j4);
            if (h2 != null) {
                vo8 = nec.b(h2);
            }
            if (vo8 != null) {
                udd.p("t52", "last message for chat %d founded by cid %d. Update it", new Object[]{Long.valueOf(j2), Long.valueOf(j4)});
                nec nec2 = ((hz3) ((a04) this.l.get())).c;
                s59 s59 = bp8.b;
                nec2.getClass();
                nec2.o(ym8, j2, false, (ls8) null);
                ((to8) nj4.get()).w(vo8, fu7.g(ym8.w0, (zpc) this.q.get()));
                return ((to8) nj4.get()).q(vo8.b);
            }
        }
        udd.p("t52", "insertMessageIfNeeded: insert message, cid = %d, chatId = %d, chatId = %d", new Object[]{Long.valueOf(j4), Long.valueOf(j2), Long.valueOf(ym8.b)});
        return ((to8) nj4.get()).q(((to8) nj4.get()).f(j2, J(), ym8));
    }

    public final void O() {
        yia yia;
        e();
        if (!this.f.isEmpty()) {
            Iterator it = this.f.values().iterator();
            while (true) {
                boolean z2 = true;
                if (it.hasNext()) {
                    i22 i22 = (i22) it.next();
                    boolean z3 = i22.y0 != null;
                    boolean z4 = i22.z0 != null;
                    boolean z5 = i22.B0 != null;
                    if (i22.A0.get() == null) {
                        z2 = false;
                    }
                    i22.y0 = null;
                    i22.z0 = null;
                    i22.B0 = null;
                    i22.A0.set((Object) null);
                    if (z3) {
                        i22.h0();
                    }
                    if (z4) {
                        i22.g0();
                    }
                    if (z5) {
                        i22.i0();
                    }
                    if (z2 && (yia = (yia) i22.A0.updateAndGet(new g22(i22, 0))) != null) {
                        CharSequence charSequence = (CharSequence) yia.b;
                    }
                } else {
                    this.m.c(new mw2(Collections.emptyList(), true));
                    return;
                }
            }
        }
    }

    public final boolean P(i22 i22) {
        i22 i222 = this.a;
        return i222 != null && i22.a == i222.a;
    }

    public final void Q(long j2) {
        i22 B2 = B(j2);
        if (B2 != null) {
            h(j2, false, new j9(this, 17, B2));
        }
        i22 i2 = i(j2, m62.b);
        long j3 = i2.b.a;
        ((eha) this.v.get()).getClass();
        eha.a(j3);
        o62 o62 = i2.b;
        long j4 = o62.a;
        gy9 gy9 = (gy9) ((pk) this.p.get());
        if (gy9.o(j2)) {
            gy9.w(gy9, new w92(((j2b) gy9.z()).a.n(), j2, j4));
        }
        t97 t97 = this.C;
        if (t97.getValue() != null) {
            b92 b92 = (b92) ((v72) t97.getValue());
            b92.getClass();
            xs7.E(b92.Z, (hu3) null, (ru3) null, new o82(b92, o62.a, (Continuation) null), 3);
        }
        mw2 mw2 = new mw2(Collections.singletonList(Long.valueOf(j2)), true);
        tt0 tt0 = this.m;
        tt0.c(mw2);
        tt0.c(new ea7(j2));
    }

    public final void R(long j2, y52 y52, vo8 vo8) {
        udd.p("t52", "onControlMessage, chatId = %d, messageDb.event = %s", new Object[]{Long.valueOf(y52.a), vo8.f().a});
        t00 f2 = vo8.f();
        int ordinal = f2.a.ordinal();
        z52 z52 = z52.c;
        switch (ordinal) {
            case 1:
            case 2:
                Iterator it = f2.c.iterator();
                while (it.hasNext()) {
                    Long l2 = (Long) it.next();
                    if (!L(j2, z52)) {
                        y52.d().put(l2, 0L);
                    }
                }
                return;
            case 3:
                boolean L2 = L(j2, z52);
                long j3 = f2.b;
                if (!L2) {
                    y52.d().remove(Long.valueOf(j3));
                }
                if (j3 == J()) {
                    y52.c = m62.b;
                    return;
                }
                return;
            case 4:
                Map d2 = y52.d();
                long j4 = vo8.Y;
                d2.remove(Long.valueOf(j4));
                if (j4 == J()) {
                    y52.c = m62.o;
                    return;
                }
                return;
            case 5:
                if (!L(j2, z52.a)) {
                    y52.g = f2.d;
                    return;
                }
                return;
            case 6:
                if (!L(j2, z52.b)) {
                    y52.h = f2.f;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final i22 S(long j2, long j3, vo8 vo8) {
        StringBuilder k2 = hr1.k(j2, "onMsgSend, chatId = ", ", serverChatId = ");
        k2.append(j3);
        k2.append(", messageDb = ");
        k2.append(vo8);
        udd.q("t52", k2.toString());
        return h(j2, true, new u42(this, j3, vo8, j2));
    }

    public final i22 T(long j2, boolean z2, vo8 vo8, boolean z3, long j3) {
        long j4 = j2;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            StringBuilder k2 = hr1.k(j2, "onNotifMessage: chatId=", ",message=");
            k2.append(vo8.b);
            k2.append(",updateNewMessage=");
            k2.append(z3);
            fn6.d(tn7, "t52", k2.toString(), (Throwable) null);
        } else {
            vo8 vo82 = vo8;
            boolean z4 = z3;
        }
        return h(j2, true, new v42(this, vo8, z2, z3, j2, j3));
    }

    public final void U(long j2, p62 p62) {
        this.d.put(Long.valueOf(j2), p62);
        o62 o62 = p62.c;
        long j3 = o62.a;
        if (j3 != 0 || o62.f(((j2b) this.n).a.s())) {
            this.e.put(Long.valueOf(j3), p62);
        }
        this.b.put(Long.valueOf(p62.c.l), p62);
    }

    public final void V(long j2, boolean z2) {
        udd.q("t52", "removeFromFavorites: " + j2);
        Z(j2, 0, z2);
    }

    public final void W(long j2, z52 z52) {
        if (L(j2, z52)) {
            h(j2, false, new k52(z52, 0));
        }
    }

    public final p62 X(long j2) {
        o72 o72;
        xdc xdc = ((hz3) ((a04) this.l.get())).b;
        yp2 c2 = xdc.c();
        c2.getClass();
        pec a2 = pec.a(1, "SELECT * FROM chats WHERE id = ?");
        a2.j(1, j2);
        aec aec = c2.a;
        aec.b();
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            int o3 = gp0.o(o2, ApiProtocol.KEY_ID);
            int o4 = gp0.o(o2, "server_id");
            int o5 = gp0.o(o2, "data");
            int o6 = gp0.o(o2, "favourite_index");
            int o7 = gp0.o(o2, "sort_time");
            int o8 = gp0.o(o2, "cid");
            if (o2.moveToFirst()) {
                o72 = new o72(o2.getLong(o3), o2.getLong(o4), c2.a().a(o2.isNull(o5) ? null : o2.getBlob(o5)), o2.getLong(o6), o2.getLong(o7), o2.getLong(o8));
            } else {
                o72 = null;
            }
            if (o72 != null) {
                return xdc.a(o72);
            }
            return null;
        } finally {
            o2.close();
            a2.m();
        }
    }

    public final void Y(long j2, boolean z2) {
        udd.p("t52", "setChatSubscribedToUpdates: chatId=%d, subscribed=%b", new Object[]{Long.valueOf(j2), Boolean.valueOf(z2)});
        try {
            i22 i22 = (i22) e0((String) null, new b52((Object) this, j2, (Object) new g52(z2, 1), 2));
        } catch (Throwable th) {
            udd.s("t52", "setChatSubscribedToUpdates fail!", th);
        }
    }

    public final void Z(long j2, long j3, boolean z2) {
        h(j2, false, new f00(j3, 3));
        if (z2) {
            ((gy9) ((pk) this.p.get())).r(j2);
        }
        this.m.c(new mw2(Collections.singletonList(Long.valueOf(j2)), true));
    }

    public final i22 b(n62 n62, List list, String str, String str2) {
        p62 p62;
        n62 n622 = n62;
        if (n622 == n62.a) {
            p62 = M(((Long) list.get(0)).longValue());
        } else {
            List list2 = list;
            long J2 = J();
            long nanoTime = System.nanoTime();
            kgd kgd = new kgd(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kgd.put((Long) it.next(), 0L);
            }
            kgd.put(Long.valueOf(J2), 0L);
            y52 y52 = new y52();
            t(y52, 0, nanoTime, 3, J2, kgd, 0, 3, 0, 0, str, str2, (x3a) null);
            o62 o62 = new o62(y52);
            p62 = new p62(((hz3) ((a04) this.l.get())).b.d(o62), o62);
        }
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "t52", "add chat; chatId=" + p62.b + ",type=" + n622, (Throwable) null);
        }
        U(p62.b, p62);
        return h0(p62.b, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r6v30, types: [java.lang.Object, n00] */
    /* JADX WARNING: type inference failed for: r2v67, types: [w52, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r9.l == r6) goto L_0x003c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x063b  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x06cf  */
    /* JADX WARNING: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.i22 b0(defpackage.j22 r49, defpackage.tn2 r50) {
        /*
            r48 = this;
            r0 = r48
            r1 = r49
            r2 = r50
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[]{r49, r50}
            java.lang.String r5 = "t52"
            java.lang.String r6 = "storeChatFromServer, chat = %s, chatSettings = %s"
            udd.p(r5, r6, r4)
            long r6 = r1.a
            p62 r4 = r0.A(r6)
            if (r4 != 0) goto L_0x0058
            int r6 = r1.b1
            if (r6 != r3) goto L_0x0058
            long r6 = r1.y0
            java.util.concurrent.ConcurrentHashMap r4 = r0.b
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.Object r8 = r4.get(r8)
            p62 r8 = (defpackage.p62) r8
            if (r8 == 0) goto L_0x003e
            o62 r9 = r8.c
            boolean r10 = r9.e()
            if (r10 == 0) goto L_0x003e
            long r9 = r9.l
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x003e
        L_0x003c:
            r4 = r8
            goto L_0x0058
        L_0x003e:
            nj4 r8 = r0.l
            java.lang.Object r8 = r8.get()
            a04 r8 = (defpackage.a04) r8
            hz3 r8 = (defpackage.hz3) r8
            xdc r8 = r8.b
            p62 r8 = r8.f(r6)
            if (r8 == 0) goto L_0x003c
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.put(r6, r8)
            goto L_0x003c
        L_0x0058:
            if (r4 != 0) goto L_0x0063
            r48.e()
            long r6 = r1.a
            p62 r4 = r0.A(r6)
        L_0x0063:
            m62 r6 = defpackage.m62.Z
            if (r4 != 0) goto L_0x00d0
            long r13 = r1.a
            long r3 = r1.y0
            int r15 = r1.b1
            long r18 = r48.J()
            java.util.Map r12 = r1.o
            long r7 = r1.z0
            int r11 = r1.c1
            long r9 = r1.Z0
            r31 = r5
            r32 = r6
            long r5 = r1.a1
            x3a r2 = r1.I0
            y52 r1 = new y52
            r1.<init>()
            java.lang.String r28 = ""
            java.lang.String r29 = ""
            r20 = r12
            r12 = r1
            r17 = r15
            r15 = r3
            r21 = r7
            r23 = r11
            r24 = r9
            r26 = r5
            r30 = r2
            t(r12, r13, r15, r17, r18, r20, r21, r23, r24, r26, r28, r29, r30)
            o62 r2 = new o62
            r2.<init>(r1)
            nj4 r1 = r0.l
            java.lang.Object r1 = r1.get()
            a04 r1 = (defpackage.a04) r1
            hz3 r1 = (defpackage.hz3) r1
            xdc r1 = r1.b
            long r3 = r1.d(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r5 = "storeChatFromServer: insert chat, chatId = %d"
            r6 = r31
            udd.p(r6, r5, r1)
            p62 r1 = new p62
            r1.<init>(r3, r2)
            r0.U(r3, r1)
            r4 = r1
            r3 = r32
            r2 = 1
            r1 = r49
            goto L_0x00f0
        L_0x00d0:
            r32 = r6
            r6 = r5
            java.lang.String r2 = r1.b
            int r2 = defpackage.th2.a(r2)
            r3 = 6
            if (r2 != r3) goto L_0x00ed
            long r2 = r1.y0
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00ed
            long r1 = r4.b
            r3 = r32
            r0.i(r1, r3)
            r0 = 0
            return r0
        L_0x00ed:
            r3 = r32
            r2 = 0
        L_0x00f0:
            long r7 = r4.b
            ym8 r5 = r1.x0
            vo8 r5 = r0.N(r7, r5)
            long r7 = r4.b
            ym8 r9 = r1.L0
            vo8 r7 = r0.N(r7, r9)
            long r13 = r4.b
            long r8 = r1.B0
            p62 r4 = r0.z(r13)
            if (r4 != 0) goto L_0x0115
            boolean r10 = r0.i
            if (r10 != 0) goto L_0x0115
            r48.e()
            p62 r4 = r0.z(r13)
        L_0x0115:
            if (r4 != 0) goto L_0x013c
            nj4 r0 = r0.o
            java.lang.Object r0 = r0.get()
            g15 r0 = (defpackage.g15) r0
            ru.ok.tamtam.exception.ChatNotFoundException r2 = new ru.ok.tamtam.exception.ChatNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "chat "
            r3.<init>(r4)
            long r4 = r1.a
            java.lang.String r1 = " is not found"
            java.lang.String r1 = defpackage.wn6.k(r3, r4, r1)
            r2.<init>(r1)
            r4a r0 = (r4a) r0
            r1 = 1
            r0.c(r2, r1)
            r8 = 0
            goto L_0x06db
        L_0x013c:
            long r10 = r48.J()
            o62 r12 = r4.c
            y52 r15 = r12.h()
            int r12 = r1.b1
            int r12 = hr1.t(r12)
            r32 = r3
            n62 r3 = defpackage.n62.a
            r16 = r2
            r2 = 1
            if (r12 == r2) goto L_0x016b
            n62 r2 = defpackage.n62.b
            r19 = r2
            r2 = 2
            if (r12 == r2) goto L_0x0162
            r2 = 3
            if (r12 == r2) goto L_0x0168
            r2 = 4
            if (r12 == r2) goto L_0x0165
        L_0x0162:
            r2 = r19
            goto L_0x016c
        L_0x0165:
            n62 r2 = defpackage.n62.o
            goto L_0x016c
        L_0x0168:
            n62 r2 = defpackage.n62.c
            goto L_0x016c
        L_0x016b:
            r2 = r3
        L_0x016c:
            java.lang.String r12 = r1.b
            int r12 = defpackage.th2.a(r12)
            int r12 = hr1.t(r12)
            m62 r19 = defpackage.m62.a
            m62 r20 = defpackage.m62.b
            m62 r21 = defpackage.m62.o
            r22 = r3
            m62 r3 = defpackage.m62.X
            if (r12 == 0) goto L_0x01b1
            r23 = r3
            r3 = 1
            if (r12 == r3) goto L_0x01ac
            r3 = 2
            if (r12 == r3) goto L_0x01a7
            r3 = 3
            if (r12 == r3) goto L_0x01a2
            r3 = 4
            if (r12 == r3) goto L_0x019d
            r3 = 5
            if (r12 == r3) goto L_0x0198
        L_0x0193:
            r24 = r10
            r3 = r19
            goto L_0x01b4
        L_0x0198:
            r24 = r10
            r3 = r32
            goto L_0x01b4
        L_0x019d:
            m62 r3 = defpackage.m62.Y
            r24 = r10
            goto L_0x01b4
        L_0x01a2:
            r24 = r10
            r3 = r23
            goto L_0x01b4
        L_0x01a7:
            r24 = r10
            r3 = r21
            goto L_0x01b4
        L_0x01ac:
            r24 = r10
            r3 = r20
            goto L_0x01b4
        L_0x01b1:
            r23 = r3
            goto L_0x0193
        L_0x01b4:
            long r10 = r1.a
            r15.a = r10
            r15.b = r2
            r15.c = r3
            long r2 = r1.c
            r15.d = r2
            java.util.List r2 = r15.c()
            z52 r3 = defpackage.z52.a
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x01da
            java.lang.String r2 = r1.Y
            boolean r3 = r1g.p(r2)
            if (r3 != 0) goto L_0x01d7
            r15.g = r2
            goto L_0x01da
        L_0x01d7:
            r2 = 0
            r15.g = r2
        L_0x01da:
            java.util.List r2 = r15.c()
            z52 r3 = defpackage.z52.b
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0202
            java.lang.String r2 = r1.Z
            boolean r3 = r1g.p(r2)
            if (r3 != 0) goto L_0x01f2
            r15.h = r2
            r2 = 0
            goto L_0x01f5
        L_0x01f2:
            r2 = 0
            r15.h = r2
        L_0x01f5:
            java.lang.String r3 = r1.w0
            boolean r10 = r1g.p(r3)
            if (r10 != 0) goto L_0x0200
            r15.i = r3
            goto L_0x0202
        L_0x0200:
            r15.i = r2
        L_0x0202:
            long r2 = r15.k
            long r10 = r1.z0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x020c
            r15.k = r10
        L_0x020c:
            long r2 = r1.P0
            r15.P = r2
            long r2 = r1.X
            r15.f = r2
            long r2 = r1.y0
            r15.l = r2
            java.util.Map r2 = r1.o
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x024a
            java.util.List r3 = r15.c()
            z52 r10 = defpackage.z52.c
            boolean r3 = r3.contains(r10)
            if (r3 != 0) goto L_0x023b
            java.util.Map r3 = r15.d()
            r3.clear()
            java.util.Map r3 = r15.d()
            r3.putAll(r2)
            goto L_0x0256
        L_0x023b:
            java.util.Map r3 = r15.d()
            r3.clear()
            java.util.Map r3 = r15.d()
            r3.putAll(r2)
            goto L_0x0256
        L_0x024a:
            int r2 = r1.b1
            r3 = 4
            if (r2 != r3) goto L_0x0256
            java.util.Map r2 = r15.d()
            r2.clear()
        L_0x0256:
            int r2 = r1.c1
            if (r2 == 0) goto L_0x0267
            int r2 = hr1.t(r2)
            r3 = 1
            if (r2 == r3) goto L_0x0263
            r2 = 2
            goto L_0x0264
        L_0x0263:
            r2 = 1
        L_0x0264:
            r15.r0 = r2
            goto L_0x026a
        L_0x0267:
            r2 = 2
            r15.r0 = r2
        L_0x026a:
            java.lang.String r2 = r1.H0
            r15.E = r2
            int r2 = r1.C0
            r15.G = r2
            java.lang.String r2 = r1.D0
            r15.H = r2
            java.util.List r2 = r1.E0
            r15.I = r2
            java.util.Map r2 = r1.Q0
            if (r2 == 0) goto L_0x0284
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0289
        L_0x0284:
            r31 = r6
            r27 = r7
            goto L_0x02db
        L_0x0289:
            java.util.HashMap r3 = new java.util.HashMap
            int r10 = r2.size()
            r3.<init>(r10)
            java.util.Set r10 = r2.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x029a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x02d6
            java.lang.Object r11 = r10.next()
            java.lang.Long r11 = (java.lang.Long) r11
            java.lang.Object r12 = r2.get(r11)
            ga r12 = (defpackage.ga) r12
            r26 = r2
            w52 r2 = new w52
            r2.<init>()
            r31 = r6
            r27 = r7
            long r6 = r12.a
            r2.b = r6
            int r6 = r12.b
            r2.a = r6
            long r6 = r12.c
            r2.c = r6
            java.lang.String r6 = r12.d
            r2.d = r6
            x52 r6 = new x52
            r6.<init>(r2)
            r3.put(r11, r6)
            r2 = r26
            r7 = r27
            r6 = r31
            goto L_0x029a
        L_0x02d6:
            r31 = r6
            r27 = r7
            goto L_0x02df
        L_0x02db:
            java.util.Map r3 = java.util.Collections.emptyMap()
        L_0x02df:
            r15.e(r3)
            int r2 = r1.F0
            r15.J = r2
            nj2 r2 = r1.G0
            if (r2 != 0) goto L_0x02ee
            r28 = r13
            r3 = 0
            goto L_0x031b
        L_0x02ee:
            d62 r3 = new d62
            boolean r6 = r2.g
            boolean r7 = r2.h
            boolean r10 = r2.a
            boolean r11 = r2.b
            boolean r12 = r2.c
            r28 = r13
            boolean r13 = r2.d
            boolean r14 = r2.e
            boolean r0 = r2.i
            boolean r2 = r2.j
            r32 = r3
            r33 = r10
            r34 = r11
            r35 = r12
            r36 = r13
            r37 = r14
            r38 = r6
            r39 = r7
            r40 = r0
            r41 = r2
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L_0x031b:
            r15.K = r3
            x3a r0 = r1.I0
            if (r0 == 0) goto L_0x032e
            java.lang.Object r0 = r0.b
            long[] r0 = (long[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x032e
            g62 r2 = new g62
            r2.<init>(r0)
            goto L_0x032f
        L_0x032e:
            r2 = 0
        L_0x032f:
            r15.D = r2
            ii5 r0 = new ii5
            int r2 = r1.J0
            r3 = 2
            r0.<init>(r2, r3)
            r15.F = r0
            zc6 r0 = r1.K0
            if (r0 == 0) goto L_0x0373
            j62 r2 = new j62
            long r6 = r0.a
            boolean r10 = r0.b
            boolean r11 = r0.c
            boolean r12 = r0.o
            java.lang.String r13 = r0.X
            java.lang.String r14 = r0.Y
            boolean r3 = r0.Z
            r44 = r8
            boolean r8 = r0.w0
            int r9 = r0.x0
            ad6 r0 = r0.y0
            r32 = r2
            r33 = r6
            r35 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r39 = r14
            r40 = r3
            r41 = r8
            r42 = r9
            r43 = r0
            r32.<init>(r33, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r15.C = r2
            goto L_0x0375
        L_0x0373:
            r44 = r8
        L_0x0375:
            java.util.List r0 = r15.c()
            z52 r2 = defpackage.z52.o
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0385
            boolean r0 = r1.M0
            r15.M = r0
        L_0x0385:
            boolean r0 = r1.N0
            r15.N = r0
            boolean r0 = r1.O0
            r15.O = r0
            y2f r0 = r1.R0
            if (r0 == 0) goto L_0x03be
            byte r3 = r0.Y
            if (r3 == 0) goto L_0x039c
            r6 = 1
            if (r3 == r6) goto L_0x039a
            r3 = 1
            goto L_0x039d
        L_0x039a:
            r3 = 3
            goto L_0x039d
        L_0x039c:
            r3 = 2
        L_0x039d:
            n00 r6 = new n00
            r6.<init>()
            java.lang.String r7 = r0.a
            r6.a = r7
            long r7 = r0.b
            r6.b = r7
            java.lang.String r7 = r0.c
            r6.c = r7
            int r7 = r0.o
            r6.d = r7
            java.util.List r0 = r0.X
            r6.e = r0
            r6.f = r3
            n00 r0 = new n00
            r0.<init>(r6)
            goto L_0x03bf
        L_0x03be:
            r0 = 0
        L_0x03bf:
            r15.T = r0
            kp0 r0 = new kp0
            lp0 r3 = r1.S0
            boolean r6 = r3.a
            boolean r3 = r3.b
            r0.<init>((boolean) r6, (boolean) r3)
            r15.d0 = r0
            long r6 = r1.T0
            r15.e0 = r6
            java.util.Map r0 = r1.U0
            r15.j0 = r0
            long r6 = r1.V0
            r15.k0 = r6
            long r6 = r1.X0
            r15.n0 = r6
            java.lang.String r0 = r1.Y0
            r15.o0 = r0
            long r6 = r1.Z0
            r15.p0 = r6
            long r6 = r1.a1
            r15.q0 = r6
            if (r5 == 0) goto L_0x0491
            long r6 = r5.o
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0406
            long r10 = r15.j
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0402
            o62 r0 = r4.c
            long r8 = r0.k
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0406
        L_0x0402:
            long r8 = r5.b
            r15.j = r8
        L_0x0406:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r8 = 0
            int r3 = (r44 > r8 ? 1 : (r44 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0442
            r3 = r48
            nj4 r5 = r3.s
            java.lang.Object r5 = r5.get()
            to8 r5 = (defpackage.to8) r5
            r13 = r28
            r8 = r44
            vo8 r5 = r5.j(r13, r8)
            if (r5 == 0) goto L_0x043f
            i62 r8 = r15.n
            long r9 = r5.o
            md4 r5 = defpackage.md4.REGULAR
            r11 = r6
            r28 = r13
            r13 = r5
            boolean r5 = oyb.w(r8, r9, r11, r13)
            if (r5 == 0) goto L_0x043c
            java.lang.String r5 = "updateChatFromServer: prevMesssage found, extend its chunk"
            r13 = r31
            udd.q(r13, r5)
            goto L_0x044a
        L_0x043c:
            r13 = r31
            goto L_0x0445
        L_0x043f:
            r28 = r13
            goto L_0x043c
        L_0x0442:
            r3 = r48
            goto L_0x043c
        L_0x0445:
            java.lang.String r5 = "updateChatFromServer: chunk for prevMessage not found"
            udd.q(r13, r5)
        L_0x044a:
            int r5 = r1.b1
            r8 = 4
            if (r5 == r8) goto L_0x049a
            java.util.Map r5 = r15.d()
            java.lang.Long r8 = java.lang.Long.valueOf(r24)
            boolean r5 = r5.containsKey(r8)
            if (r5 == 0) goto L_0x049a
            java.util.Map r5 = r15.d()
            java.lang.Long r8 = java.lang.Long.valueOf(r24)
            java.lang.Object r5 = r5.get(r8)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0477
            long r8 = r5.longValue()
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x049a
        L_0x0477:
            long r8 = r1.P0
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0481
            r8 = 1
            long r8 = r6 - r8
        L_0x0481:
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.util.Map r6 = r15.d()
            java.lang.Long r7 = java.lang.Long.valueOf(r24)
            r6.put(r7, r5)
            goto L_0x049a
        L_0x0491:
            r5 = 0
            r3 = r48
            r13 = r31
            r15.j = r5
            r0 = 0
        L_0x049a:
            i62 r5 = r15.n
            md4 r11 = defpackage.md4.DELAYED
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r24 = r8
            r10 = r11
            boolean r5 = oyb.w(r5, r6, r8, r10)
            if (r5 != 0) goto L_0x04b5
            i62 r5 = r15.n
            r6 = r24
            oyb.H(r5, r6, r11)
        L_0x04b5:
            int r5 = r1.A0
            r15.m = r5
            java.util.List r5 = r15.c()
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L_0x04d0
            if (r27 == 0) goto L_0x04cc
            r2 = r27
            long r5 = r2.b
            r15.L = r5
            goto L_0x04d0
        L_0x04cc:
            r5 = 0
            r15.L = r5
        L_0x04d0:
            o62 r2 = r4.c
            m62 r2 = r2.c
            m62 r5 = r15.c
            if (r2 == r5) goto L_0x0594
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "handleChatStatus, chatId = "
            r2.<init>(r5)
            long r5 = r15.a
            r2.append(r5)
            java.lang.String r5 = ", status = "
            r2.append(r5)
            m62 r5 = r15.c
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            udd.q(r13, r2)
            m62 r2 = r15.c
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x053c
            r5 = 1
            if (r2 == r5) goto L_0x0524
            r5 = 3
            if (r2 == r5) goto L_0x051a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "chat status = "
            r2.<init>(r5)
            m62 r5 = r15.c
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            udd.q(r13, r2)
            m62 r2 = r15.c
            r5 = r2
            goto L_0x0554
        L_0x051a:
            q(r15)
            r5 = 0
            r15.x = r5
            r5 = r21
            goto L_0x0554
        L_0x0524:
            r5 = 0
            q(r15)
            r15.x = r5
            o62 r2 = r4.c
            m62 r2 = r2.c
            r5 = r23
            if (r2 != r5) goto L_0x0534
            goto L_0x0554
        L_0x0534:
            m62 r5 = defpackage.m62.c
            if (r2 != r5) goto L_0x0539
            goto L_0x0554
        L_0x0539:
            r5 = r20
            goto L_0x0554
        L_0x053c:
            r5 = r23
            o62 r2 = r4.c
            m62 r6 = r2.c
            if (r6 != r5) goto L_0x0552
            n62 r6 = r2.b
            r7 = r22
            if (r6 != r7) goto L_0x0554
            long r6 = r2.k
            long r8 = r15.k
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0554
        L_0x0552:
            r5 = r19
        L_0x0554:
            o62 r2 = r4.c
            long r6 = r2.f
            long r8 = r15.f
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0581
            java.lang.String r2 = "created time is not the same, mark messages as deleted"
            udd.q(r13, r2)
            long r6 = r15.f
            long r8 = r4.b
            int r2 = r3.r(r8, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "created_issue: removed "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = " messages"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            udd.q(r13, r2)
        L_0x0581:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "new chat status = "
            r2.<init>(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            udd.q(r13, r2)
            r15.c = r5
        L_0x0594:
            o62 r2 = r4.c
            long r5 = r2.U
            r15.U = r5
            int r5 = r2.V
            r15.V = r5
            long r5 = r2.W
            r15.W = r5
            int r5 = r2.X
            r15.X = r5
            x3a r5 = r1.I0
            if (r5 == 0) goto L_0x05b7
            java.lang.Object r5 = r5.b
            long[] r5 = (long[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L_0x05b7
            g62 r6 = new g62
            r6.<init>(r5)
            goto L_0x05b8
        L_0x05b7:
            r6 = 0
        L_0x05b8:
            r15.D = r6
            r5 = 0
            r15.m0 = r5
            long r5 = r2.f
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x060c
            long r7 = r15.f
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x060c
            i62 r2 = r15.n
            md4 r5 = defpackage.md4.REGULAR
            java.util.ArrayList r2 = oyb.n(r2, r7, r5)
            i62 r6 = r15.n
            java.util.ArrayList r6 = r6.d(r5)
            r6.clear()
            defpackage.i62.e(r5)
            i62 r6 = r15.n
            java.util.ArrayList r6 = r6.d(r5)
            r6.addAll(r2)
            defpackage.i62.e(r5)
            tt0 r2 = r3.m
            l89 r6 = new l89
            long r11 = r15.f
            r17 = 0
            r8 = r6
            r9 = r28
            r19 = r11
            r11 = r17
            r7 = r13
            r46 = r28
            r13 = r19
            r31 = r7
            r7 = r15
            r15 = r5
            r8.<init>(r9, r11, r13, r15)
            r2.c(r6)
        L_0x0609:
            r2 = r50
            goto L_0x0612
        L_0x060c:
            r31 = r13
            r7 = r15
            r46 = r28
            goto L_0x0609
        L_0x0612:
            if (r2 == 0) goto L_0x0620
            o62 r4 = r4.c
            f62 r4 = r4.a()
            f62 r2 = defpackage.fu7.i(r2, r4)
            r7.p = r2
        L_0x0620:
            boolean r1 = r1.W0
            r7.l0 = r1
            if (r0 == 0) goto L_0x0631
            i62 r1 = r7.n
            long r4 = r0.longValue()
            md4 r0 = defpackage.md4.REGULAR
            oyb.H(r1, r4, r0)
        L_0x0631:
            long r0 = r7.n0
            java.lang.String r2 = r7.o0
            boolean r4 = r1g.p(r2)
            if (r4 == 0) goto L_0x063e
            r5 = r46
            goto L_0x06ac
        L_0x063e:
            nj4 r4 = r3.s
            java.lang.Object r4 = r4.get()
            to8 r4 = (defpackage.to8) r4
            r5 = r46
            vo8 r4 = r4.j(r5, r0)
            if (r4 == 0) goto L_0x06ac
            yr8 r4 = r4.W0
            if (r4 == 0) goto L_0x0653
            goto L_0x06ac
        L_0x0653:
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0658
            goto L_0x067d
        L_0x0658:
            boolean r8 = r4.c()
            if (r8 != 0) goto L_0x065f
            goto L_0x067d
        L_0x065f:
            tn7 r8 = defpackage.tn7.X
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "updateMessageReactionIfPresent: adding first reaction="
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r10 = " for message with serverId="
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r11 = r31
            r10 = 0
            r4.d(r8, r11, r9, r10)
        L_0x067d:
            nj4 r4 = r3.s
            java.lang.Object r4 = r4.get()
            to8 r4 = (defpackage.to8) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            yyb r1 = new yyb
            zyb r8 = defpackage.zyb.EMOJI
            ryb r9 = new ryb
            r9.<init>(r2)
            r1.<init>(r8, r9)
            xr8 r2 = new xr8
            r8 = 1
            r2.<init>(r1, r8)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            yr8 r2 = new yr8
            r9 = 0
            r2.<init>(r1, r8, r9)
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r2)
            r4.h(r0)
        L_0x06ac:
            o62 r0 = new o62
            r0.<init>(r7)
            p62 r1 = new p62
            r1.<init>(r5, r0)
            r3.U(r5, r1)
            nj4 r1 = r3.l
            java.lang.Object r1 = r1.get()
            a04 r1 = (defpackage.a04) r1
            hz3 r1 = (defpackage.hz3) r1
            xdc r1 = r1.b
            r1.g(r5, r0)
            r0 = 0
            i22 r8 = r3.h0(r5, r0)
            if (r16 == 0) goto L_0x06db
            tt0 r0 = r3.m
            m9 r1 = new m9
            long r2 = r8.a
            r1.<init>(r2)
            r0.c(r1)
        L_0x06db:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t52.b0(j22, tn2):i22");
    }

    public final void c(long j2, z52 z52) {
        if (!L(j2, z52)) {
            h(j2, false, new k52(z52, 1));
        }
    }

    public final zb9 c0(List list) {
        return (zb9) e0("storeChatsFromServer", new ic0((Object) this, (Object) list, (Object) null, 20));
    }

    public final void d(long j2, List list) {
        i22 B2 = B(j2);
        if (B2 != null) {
            h(j2, false, new d52(0, list));
            this.m.c(new mw2(Collections.singletonList(Long.valueOf(B2.a)), false));
        }
    }

    public final zb9 d0(List list, Map map) {
        return (zb9) e0("storeChatsFromServer", new ic0((Object) this, (Object) list, (Object) map, 20));
    }

    public final void e() {
        if (!this.i) {
            f0("awaitLoading", new w42(this, 0));
        }
    }

    public final Object e0(String str, r3e r3e) {
        fn6 fn6;
        fn6 fn62;
        fn6 fn63;
        if (str != null) {
            fn6 fn64 = udd.e;
            if (fn64 != null && fn64.c()) {
                tn7 tn7 = tn7.X;
                fn64.d(tn7, "t52", "syncSelf(" + str + ')', (Throwable) null);
            }
            if (this.H.isLocked() && (fn63 = udd.e) != null && fn63.c()) {
                tn7 tn72 = tn7.Z;
                StringBuilder m2 = hr1.m("syncSelf(", str, "): self is locked! ");
                m2.append(this.H.getHoldCount());
                fn63.d(tn72, "t52", m2.toString(), (Throwable) null);
            }
        }
        this.H.lock();
        try {
            Object obj = r3e.get();
            this.H.unlock();
            if (!(str == null || (fn62 = udd.e) == null || !fn62.c())) {
                fn62.d(tn7.X, "t52", wn6.i("syncSelf(", str, "): unlocked"), (Throwable) null);
            }
            return obj;
        } catch (Throwable th) {
            this.H.unlock();
            if (!(str == null || (fn6 = udd.e) == null || !fn6.c())) {
                fn6.d(tn7.X, "t52", wn6.i("syncSelf(", str, "): unlocked"), (Throwable) null);
            }
            throw th;
        }
    }

    public final v63 f() {
        l73 l73 = this.j;
        return (l73.a.get() == l73.X && l73.c == null) ? c73.a : l73;
    }

    public final void f0(String str, Runnable runnable) {
        e0(str, new zx1(6, runnable));
    }

    public final i22 g(p62 p62, vo8 vo8) {
        i22 b2 = ((p72) this.x.get()).b(p62, vo8);
        f0((String) null, new a52(this, p62.b, b2, true));
        return b2;
    }

    public final void g0(long j2) {
        i22 B2 = B(j2);
        if (B2 != null) {
            l(0, B2);
            ((gy9) ((pk) this.p.get())).r(B2.a);
            t97 t97 = this.C;
            if (t97.getValue() != null) {
                long j3 = B2.b.a;
                b92 b92 = (b92) ((v72) t97.getValue());
                qod qod = b92.L0;
                if (qod != null) {
                    qod.cancel((CancellationException) null);
                }
                u82 u82 = new u82(b92, (Continuation) null);
                b92.L0 = xs7.E(b92.Z, b92.Y, (ru3) null, u82, 2);
            }
        }
    }

    public final i22 h(long j2, boolean z2, of3 of3) {
        if (z(j2) == null) {
            e();
        }
        p62 z3 = z(j2);
        if (z3 == null) {
            udd.q("t52", "changeChatField: chat with id = " + j2 + " not found");
            return null;
        }
        y52 h2 = z3.c.h();
        try {
            of3.accept(h2);
            U(j2, new p62(j2, new o62(h2)));
            ((luf) this.w.get()).a(new k1d(j2));
            return h0(j2, z2);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final i22 h0(long j2, boolean z2) {
        vo8 j3;
        long j4 = j2;
        i22 B2 = B(j2);
        p62 z3 = z(j2);
        if (z3 == null) {
            throw new IllegalArgumentException(us8.i(j4, "chat is null for #"));
        } else if (B2 == null || z2) {
            return g(z3, (vo8) null);
        } else {
            o62 o62 = z3.c;
            long j5 = o62.j;
            o62 o622 = B2.b;
            boolean z4 = false;
            boolean z5 = j5 == o622.j;
            boolean z6 = o62.L == o622.L;
            if (o62.j0 == o622.j0) {
                z4 = true;
            }
            if (!z5 || !z6 || !z4) {
                return g(z3, (vo8) null);
            }
            boolean E2 = B2.E();
            nj4 nj4 = this.x;
            xm8 xm8 = B2.c;
            i22 b2 = (!E2 || xm8 != null || (j3 = ((to8) this.s.get()).j(j4, o62.j)) == null) ? null : ((p72) nj4.get()).b(z3, j3);
            if (b2 == null) {
                b2 = ((p72) nj4.get()).a(j2, ((j2b) this.n).a.s(), z3.c, xm8, B2.o, B2.X);
                b2.l0((di3) this.r.get());
            }
            i22 i22 = b2;
            f0((String) null, new a52(this, j2, i22, true));
            return i22;
        }
    }

    public final i22 i(long j2, m62 m62) {
        return h(j2, false, new zx1(5, m62));
    }

    public final void i0(long j2, long j3) {
        udd.p("t52", "updateChatLastSearchClickTime: chatId=%d, chatSearchClickTime=%d", new Object[]{Long.valueOf(j2), Long.valueOf(j3)});
        p62 z2 = z(j2);
        if (z2 == null) {
            return;
        }
        if (z2.c.Y < j3 || j3 == 0) {
            h(j2, false, new f00(j3, 5));
        }
    }

    public final void j(long j2, m62 m62) {
        udd.q("t52", "changeDialogStatus, contactId = " + j2 + ", status = " + m62);
        i22 E2 = E(j2);
        if (E2 != null) {
            long j3 = E2.a;
            i(j3, m62);
            this.m.c(new mw2(Collections.singletonList(Long.valueOf(j3)), true));
        }
    }

    public final void j0(long j2, o62 o62, long j3) {
        udd.p("t52", "updateChatWriteTime: chatId=%d, chatWriteTime=%d", new Object[]{Long.valueOf(j2), Long.valueOf(j3)});
        if (o62 != null && o62.Z < j3) {
            h(j2, false, new f00(j3, 9));
        }
    }

    public final void k(long j2, long j3, j4a j4a) {
        udd.p("t52", "Change draft: %d, draft = %s draftUpdateTime = %d", new Object[]{Long.valueOf(j2), j4a, Long.valueOf(j3)});
        i22 h2 = h(j2, false, new b52((Object) this, (Object) j4a, j3, 0));
        t97 t97 = this.C;
        if (t97.getValue() != null) {
            ((b92) ((v72) t97.getValue())).k(j2, h2);
        }
        this.m.c(new mw2(Collections.singletonList(Long.valueOf(j2)), true));
    }

    public final i22 k0(long j2, vo8 vo8, boolean z2) {
        if (vo8 != null && vo8.n()) {
            return B(j2);
        }
        udd.q("t52", "updateLastMessage: chatId = " + j2 + ", messageDb = " + vo8 + ", force = " + z2);
        return h(j2, true, new i52(this, vo8, z2, j2));
    }

    public final void l(long j2, i22 i22) {
        StringBuilder sb = new StringBuilder("changeMuteUntil, chatId = ");
        long j3 = i22.a;
        sb.append(j3);
        sb.append(", dontDisturbUntil = ");
        sb.append(j2);
        udd.q("t52", sb.toString());
        h(j3, false, new f00(j2, 2));
        t97 t97 = this.C;
        if (t97.getValue() != null) {
            long j4 = i22.b.a;
            b92 b92 = (b92) ((v72) t97.getValue());
            qod qod = b92.L0;
            if (qod != null) {
                qod.cancel((CancellationException) null);
            }
            u82 u82 = new u82(b92, (Continuation) null);
            b92.L0 = xs7.E(b92.Z, b92.Y, (ru3) null, u82, 2);
        }
        this.m.c(new mw2(Collections.singletonList(Long.valueOf(j3)), false));
    }

    public final void m0(String str, long j2, long j3, long j4) {
        udd.p("t52", "updateLastPushMessage %d", new Object[]{Long.valueOf(j2)});
        long j5 = j2;
        i22 y2 = y(j2);
        if (y2 == null) {
            udd.R("t52", (IOException) null, "updateLastPushMessage: chat not found! %d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
            return;
        }
        z42 z42 = new z42(j3, str, j4);
        long j6 = y2.a;
        h(j6, true, z42);
        this.m.c(new mw2(Collections.singletonList(Long.valueOf(j6)), true));
    }

    public final i22 n(i22 i22) {
        if (i22 == null) {
            return null;
        }
        if (i22.c == null) {
            o62 o62 = i22.b;
            if (o62.j != 0) {
                p62 X = X(i22.a);
                vo8 q2 = ((to8) this.s.get()).q(o62.j);
                if (q2 == null) {
                    return i22;
                }
                udd.T("t52", "checkChat! lastMessage is null but chat.data.getLastMessageId() not 0", new Object[0]);
                ((g15) this.o.get()).c(new Exception("check.chat.error"), false);
                U(X.b, X);
                return g(X, q2);
            }
        }
        return i22;
    }

    public final void n0(int i2, long j2) {
        udd.q("t52", "updateNewMessages, chatId = " + j2 + ", count = " + i2);
        h(j2, false, new hc0(i2, 3, this));
        this.m.c(new mw2(Collections.singletonList(Long.valueOf(j2)), false));
    }

    public final void o(long j2, long j3) {
        udd.p("t52", "clearChatInternal: id=%d, time=%d", new Object[]{Long.valueOf(j2), Long.valueOf(j3)});
        i22 B2 = B(j2);
        if (B2 != null) {
            long j4 = B2.b.a;
            ((eha) this.v.get()).getClass();
            eha.a(j4);
        }
        I(j2).setValue((Object) null);
        h(j2, false, new f00(1 + j3, 7));
        r(j2, j3);
        h(j2, false, new f00(j3, 6));
        l89 l89 = new l89(j2, 0, j3, md4.REGULAR);
        tt0 tt0 = this.m;
        tt0.c(l89);
        tt0.c(new mw2(Collections.singletonList(Long.valueOf(j2)), false));
    }

    public final void o0(long j2) {
        udd.p("t52", "updatePinMessage: chatId = %d", new Object[]{Long.valueOf(j2)});
        h0(j2, true);
    }

    public final void p(long j2) {
        udd.p("t52", "clearDraft, chatId = %d", new Object[]{Long.valueOf(j2)});
        i22 B2 = B(j2);
        if (B2 == null) {
            udd.R("t52", (IOException) null, "clearDraft: chat is null", Arrays.copyOf(new Object[0], 0));
            return;
        }
        k(j2, B2.b.g0, (j4a) null);
    }

    public final i22 p0(long j2, long j3, long j4, int i2, boolean z2) {
        long j5 = j2;
        udd.p("t52", "updateReadMark: chatId=%d, userId=%d, mark=%d, newMessages=%d, notifySelfReadMarkChangedListener=%b", new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i2), Boolean.valueOf(z2)});
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        i22 h2 = h(j5, false, new o52(this, j3, j4, i2, atomicBoolean, z2));
        if (atomicBoolean.get()) {
            nj4 nj4 = this.B;
            if (nj4.get() != null) {
                ((kq9) nj4.get()).e(j5, j4);
            }
        }
        return h2;
    }

    public final int r(long j2, long j3) {
        udd.p("t52", "clearMessagesInChat id=%d, time=%d", new Object[]{Long.valueOf(j2), Long.valueOf(j3)});
        to8 to8 = (to8) this.s.get();
        to8.getClass();
        int d2 = to8.d(j2, j3, md4.REGULAR);
        u(j2, (y52) null, j3);
        v(j2);
        return d2;
    }

    public final void s() {
        if (this.i && !this.f.isEmpty()) {
            for (i22 i22 : this.f.values()) {
                i22.y0 = null;
                i22.z0 = null;
                i22.B0 = null;
                i22.A0.set((Object) null);
            }
            this.m.c(new mw2(Collections.emptyList(), true));
        }
    }

    public final void u(long j2, y52 y52, long j3) {
        if (j3 == Long.MAX_VALUE) {
            j3--;
        }
        vo8 r2 = ((to8) this.s.get()).r(j2, 1 + j3);
        udd.p("t52", "findAndUpdateFirstMessage, chatId = %d, time = %s, message = %s", new Object[]{Long.valueOf(j2), ez3.T(Long.valueOf(j3)), r2});
        long j4 = 0;
        if (y52 == null) {
            if (r2 != null) {
                j4 = r2.b;
            }
            h(j2, false, new f00(j4, 4));
            return;
        }
        if (r2 != null) {
            j4 = r2.b;
        }
        y52.x = j4;
    }

    public final void v(long j2) {
        to8 to8 = (to8) this.s.get();
        to8.getClass();
        k0(j2, to8.p(j2, md4.REGULAR), true);
    }

    public final ArrayList w(ak0 ak0) {
        j2b j2b = (j2b) this.n;
        return C(L, false, new qh0(j2b.a.s(), j2b.b.u(), ak0));
    }

    public final dhd x(long j2) {
        i22 i22 = (i22) this.f.get(Long.valueOf(j2));
        if (i22 != null) {
            return dhd.g(i22);
        }
        return new o73(new mv9(2, new f52(this, j2, 0)), f()).m(this.y);
    }

    public final i22 y(long j2) {
        ConcurrentHashMap concurrentHashMap = this.g;
        i22 i22 = (i22) concurrentHashMap.get(Long.valueOf(j2));
        if (i22 != null) {
            return i22;
        }
        e();
        return (i22) concurrentHashMap.get(Long.valueOf(j2));
    }

    public final p62 z(long j2) {
        p62 p62 = (p62) this.d.get(Long.valueOf(j2));
        return (p62 != null || this.i) ? p62 : X(j2);
    }
}
