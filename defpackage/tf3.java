package defpackage;

import java.text.CollationKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: tf3  reason: default package */
public final class tf3 implements Comparable {
    public CollationKey X;
    public final boolean Y;
    public final w6a Z;
    public final oi3 a;
    public CharSequence b;
    public CharSequence c;
    public String o;
    public yia w0 = null;

    public tf3(oi3 oi3, boolean z, w6a w6a) {
        this.a = oi3;
        this.Y = z;
        this.Z = w6a;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gi3, java.lang.Object] */
    public static tf3 a(long j, long j2, w6a w6a) {
        ? obj = new Object();
        obj.a = j;
        obj.f = Collections.singletonList(ii3.e);
        obj.s = j2;
        obj.k = mi3.b;
        obj.j = 2;
        return new tf3(new oi3(0, obj.a()), false, w6a);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gi3, java.lang.Object] */
    public static tf3 b(long j, long j2, w6a w6a) {
        ? obj = new Object();
        obj.a = j;
        obj.f = Collections.singletonList(ii3.e);
        obj.s = j2;
        obj.k = mi3.b;
        return new tf3(new oi3(0, obj.a()), false, w6a);
    }

    public final boolean c() {
        oi3 oi3 = this.a;
        return oi3.b != 0 && oi3.c.k == mi3.a;
    }

    public final int compareTo(Object obj) {
        return d().toLowerCase().compareTo(((tf3) obj).d().toLowerCase());
    }

    public final String d() {
        String str = null;
        if (this.Y) {
            ii3 h = h();
            String a2 = h != null ? h.a() : null;
            if (r1g.q(a2)) {
                return a2;
            }
        }
        oi3 oi3 = this.a;
        int i = oi3.c.j;
        w6a w6a = this.Z;
        if (i == 2) {
            return w6a.a.getString(avb.tt_unbind_ok_deleted_user);
        }
        if (i == 1) {
            return w6a.a.getString(avb.tt_blocked_user);
        }
        if (w()) {
            n();
            return w6a.a.getString(whc.t);
        }
        for (ii3 ii3 : oi3.c.f) {
            if (!ii3.equals(ii3.e)) {
                str = ii3.a();
                if (r1g.q(str)) {
                    return str;
                }
            }
        }
        if (!r1g.p(str)) {
            return str;
        }
        n();
        return w6a.a.getString(whc.t);
    }

    public final String e() {
        ii3 h;
        if (this.Y && (h = h()) != null) {
            String str = h.a;
            if (r1g.q(str)) {
                return str;
            }
        }
        ni3 ni3 = this.a.c;
        int i = ni3.j;
        w6a w6a = this.Z;
        if (i == 2) {
            return w6a.a.getString(avb.tt_unbind_ok_deleted_user);
        }
        if (i == 1) {
            return w6a.a.getString(avb.tt_blocked_user);
        }
        List list = ni3.f;
        if (!list.isEmpty()) {
            return ((ii3) list.get(0)).a;
        }
        n();
        return w6a.a.getString(whc.t);
    }

    public final String f() {
        ii3 h;
        if (this.Y && (h = h()) != null) {
            String str = h.b;
            if (r1g.q(str)) {
                return str;
            }
        }
        ni3 ni3 = this.a.c;
        int i = ni3.j;
        if (i == 2 || i == 1) {
            return null;
        }
        List list = ni3.f;
        if (list.isEmpty()) {
            return null;
        }
        return ((ii3) list.get(0)).b;
    }

    public final String g() {
        return this.a.c.p;
    }

    public final ii3 h() {
        Object obj;
        hi3 hi3 = hi3.c;
        List list = this.a.c.f;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                try {
                    if (((ii3) obj).c == hi3) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        obj = null;
        ii3 ii3 = (ii3) obj;
        if (ii3 != null && !r1g.p(ii3.a().trim())) {
            return ii3;
        }
        return null;
    }

    public final List i() {
        return this.a.c.f;
    }

    public final String j() {
        String c2 = ehe.c(this.a.c.p);
        return !r1g.p(c2) ? c2 : "";
    }

    public final int k() {
        return this.a.c.j;
    }

    public final CharSequence l(w6a w6a) {
        if (this.c == null) {
            this.c = w6a.j.b(0, this.a.c.o);
        }
        return this.c;
    }

    public final CharSequence m() {
        if (this.o == null) {
            Pattern pattern = t5a.a;
            this.o = t5a.b(e(), f());
        }
        return this.o;
    }

    public final long n() {
        return this.a.c.a;
    }

    public final long o() {
        return this.a.c.h;
    }

    public final String p(fj0 fj0) {
        if (!(!w())) {
            return null;
        }
        String t = vx3.t(this.a.c.c, fj0, ej0.a);
        if (!r1g.p(t)) {
            return t;
        }
        return null;
    }

    public final String q(String str, fj0 fj0) {
        if (!(!w())) {
            return null;
        }
        boolean z = this.Y;
        String str2 = z ? str : null;
        if (!r1g.p(str2)) {
            return str2;
        }
        oi3 oi3 = this.a;
        String t = vx3.t(oi3.c.c, fj0, ej0.a);
        if (!r1g.p(t)) {
            return t;
        }
        if (!w()) {
            if (z) {
                return str;
            }
            ni3 ni3 = oi3.c;
            if (!r1g.p(ni3.b)) {
                return ni3.b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (xs7.m(r0.a, r1.c.c) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List r() {
        /*
            r7 = this;
            yia r0 = r7.w0
            oi3 r1 = r7.a
            if (r0 == 0) goto L_0x0012
            ni3 r2 = r1.c
            java.lang.String r2 = r2.c
            java.lang.Object r0 = r0.a
            boolean r0 = xs7.m(r0, r2)
            if (r0 != 0) goto L_0x0062
        L_0x0012:
            fj0 r0 = defpackage.fj0.b
            fj0 r2 = defpackage.fj0.o
            lg7 r3 = hwf.c()
            pz4 r4 = defpackage.ij0.a
            nv7 r5 = new nv7
            r5.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x0025:
            r5 = r4
            zcc r5 = (zcc) r5
            java.util.ListIterator r5 = r5.b
            boolean r6 = r5.hasPrevious()
            if (r6 == 0) goto L_0x004c
            java.lang.Object r5 = r5.previous()
            fj0 r5 = (defpackage.fj0) r5
            int r6 = r5.compareTo(r0)
            if (r6 < 0) goto L_0x0025
            int r6 = r5.compareTo(r2)
            if (r6 > 0) goto L_0x0025
            java.lang.String r5 = r7.p(r5)
            if (r5 == 0) goto L_0x0025
            r3.add(r5)
            goto L_0x0025
        L_0x004c:
            lg7 r0 = hwf.a(r3)
            ni3 r1 = r1.c
            java.lang.String r1 = r1.c
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x005b
            r0 = 0
        L_0x005b:
            yia r2 = new yia
            r2.<init>(r1, r0)
            r7.w0 = r2
        L_0x0062:
            yia r7 = r7.w0
            java.lang.Object r7 = r7.b
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf3.r():java.util.List");
    }

    public final boolean s() {
        return this.a.c.i == li3.a;
    }

    public final boolean t() {
        return this.a.c.n.contains(ki3.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact{id=");
        oi3 oi3 = this.a;
        sb.append(oi3.b);
        sb.append(", data=");
        sb.append(oi3.c);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u() {
        return this.a.c.n.contains(ki3.a);
    }

    public final boolean v() {
        return this.a.c.n.contains(ki3.c);
    }

    public final boolean w() {
        return k() == 0 && this.a.c.a();
    }
}
