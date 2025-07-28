package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: j0d  reason: default package */
public final class j0d extends c0d {
    public final boolean X;
    public final md4 Y;
    public final String Z = j0d.class.getName();
    public final long b;
    public final List c;
    public final j63 o;

    public j0d(long j, List list, j63 j63, boolean z, md4 md4) {
        this.b = j;
        this.c = list;
        this.o = j63;
        this.X = z;
        this.Y = md4;
    }

    public final void x() {
        String str;
        i22 B = d().B(this.b);
        if (B == null) {
            j().c(new Exception("chat is null"), true);
        } else if (this.c == null) {
            to8 o2 = o();
            long j = this.b;
            cw8 d = ((hz3) o2.a).c.d();
            aec aec = d.a;
            aec.b();
            yv8 yv8 = d.s;
            yz5 f = yv8.f();
            f.j(1, j);
            f.j(2, 0);
            f.j(3, 0);
            try {
                aec.c();
                f.n();
                aec.r();
                aec.l();
                yv8.u(f);
                to8 o3 = o();
                long j2 = this.b;
                cw8 d2 = ((hz3) o3.a).c.d();
                aec aec2 = d2.a;
                aec2.b();
                th thVar = d2.l;
                yz5 f2 = thVar.f();
                d2.a().getClass();
                f2.j(1, (long) 10);
                f2.j(2, j2);
                f2.j(3, 0);
                f2.j(4, 0);
                try {
                    aec2.c();
                    f2.n();
                    aec2.r();
                    aec2.l();
                    thVar.u(f2);
                    if (this.Y == md4.REGULAR) {
                        d().v(this.b);
                    }
                    pk a = a();
                    long j3 = this.b;
                    md4 md4 = this.Y;
                    gy9 gy9 = (gy9) a;
                    if (gy9.o(j3)) {
                        gy9.w(gy9, new m89(((j2b) gy9.z()).a.n(), j3, 0, 0, md4));
                    }
                    t().c(new l89(this.b, 0, 0, this.Y));
                } catch (Throwable th) {
                    thVar.u(f2);
                    throw th;
                }
            } catch (Throwable th2) {
                yv8.u(f);
                throw th2;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Number longValue : this.c) {
                vo8 q = o().q(longValue.longValue());
                if (q != null) {
                    if (q.c == 0) {
                        arrayList2.add(q);
                        m().a(q);
                    } else {
                        arrayList.add(q);
                    }
                }
            }
            long j4 = B.b.a;
            boolean isEmpty = arrayList.isEmpty();
            ls8 ls8 = ls8.DELETED;
            if (isEmpty) {
                str = ", messages.size() = ";
            } else {
                int size = arrayList.size();
                StringBuilder sb = new StringBuilder("deleteServerMessages: chatId = ");
                long j5 = this.b;
                sb.append(j5);
                sb.append(", messages.size() = ");
                sb.append(size);
                udd.q(this.Z, sb.toString());
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList3.add(Long.valueOf(((vo8) it.next()).b));
                    } catch (Throwable th3) {
                        throw new RuntimeException(th3);
                    }
                }
                ((hz3) o().a).c.d().o(j5, arrayList3, ls8);
                pk a2 = a();
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        arrayList4.add(Long.valueOf(((vo8) it2.next()).c));
                    } catch (Throwable th4) {
                        throw new RuntimeException(th4);
                    }
                }
                str = ", messages.size() = ";
                ((gy9) a2).C(this.b, j4, arrayList3, arrayList4, this.o, this.X, this.Y);
                y(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                udd.q(this.Z, "deleteLocalMessages: chatId = " + this.b + str + arrayList2.size());
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    vo8 vo8 = (vo8) it3.next();
                    d0d d0d = this.a;
                    if (d0d == null) {
                        d0d = null;
                    }
                    zs8 zs8 = (zs8) d0d.z.getValue();
                    long j6 = vo8.b;
                    fn6 fn6 = udd.e;
                    if (fn6 != null) {
                        zs8.getClass();
                        if (fn6.c()) {
                            fn6.d(tn7.X, "zs8", us8.i(j6, "cancel: messageId="), (Throwable) null);
                        }
                    }
                    ((uc5) zs8.c.getValue()).a(j6);
                }
                to8 o4 = o();
                long j7 = this.b;
                ArrayList arrayList5 = new ArrayList(arrayList2.size());
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    try {
                        arrayList5.add(Long.valueOf(((vo8) it4.next()).b));
                    } catch (Throwable th5) {
                        throw new RuntimeException(th5);
                    }
                }
                ((hz3) o4.a).c.d().o(j7, arrayList5, ls8);
                y(arrayList2);
            }
            if (this.c.contains(Long.valueOf(B.b.j))) {
                d().v(this.b);
            } else if (this.c.contains(Long.valueOf(B.b.x))) {
                d().u(this.b, (y52) null, 0);
            }
            t().c(new l89(this.b, this.c, (md4) null));
        }
    }

    public final void y(ArrayList arrayList) {
        i22 B;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vo8 vo8 = (vo8) it.next();
            if (!(vo8 == null || (B = d().B(vo8.x0)) == null)) {
                d0d d0d = this.a;
                if (d0d == null) {
                    d0d = null;
                }
                long j = B.b.a;
                ((eha) d0d.p.getValue()).getClass();
                eha.b(j, vo8.b);
            }
        }
    }
}
