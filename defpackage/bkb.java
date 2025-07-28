package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: bkb  reason: default package */
public final class bkb extends vje {
    public static final bkb g = new bkb(e8c.X, (akb) null);
    public static final Object h = new Object();
    public final ws6 e;
    public final akb f;

    static {
        po5 po5 = ws6.b;
    }

    public bkb(ws6 ws6, akb akb) {
        this.e = ws6;
        this.f = akb;
    }

    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkb)) {
            return false;
        }
        bkb bkb = (bkb) obj;
        return am7.j(this.e, bkb.e) && am7.j(this.f, bkb.f);
    }

    public final qje g(int i, qje qje, boolean z) {
        akb v = v(i);
        Long valueOf = Long.valueOf(v.b);
        long S = oze.S(v.c);
        qje.getClass();
        qje.j(valueOf, (Object) null, i, S, 0, w8.g, false);
        return qje;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f});
    }

    public final int i() {
        return p();
    }

    public final Object m(int i) {
        throw new UnsupportedOperationException();
    }

    public final tje n(int i, tje tje, long j) {
        akb v = v(i);
        tje.b(h, v.a, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, (z58) null, 0, oze.S(v.c), i, i, 0);
        return tje;
    }

    public final int p() {
        return this.e.size() + (this.f == null ? 0 : 1);
    }

    public final boolean r(l68 l68) {
        akb akb = this.f;
        if (akb != null && l68.equals(akb.a)) {
            return true;
        }
        int i = 0;
        while (true) {
            ws6 ws6 = this.e;
            if (i >= ws6.size()) {
                return false;
            }
            if (l68.equals(((akb) ws6.get(i)).a)) {
                return true;
            }
            i++;
        }
    }

    public final bkb s(int i, l68 l68, long j) {
        ws6 ws6 = this.e;
        int size = ws6.size();
        akb akb = this.f;
        oyb.d(i < size || (i == ws6.size() && akb != null));
        if (i == ws6.size()) {
            return new bkb(ws6, new akb(l68, -1, j));
        }
        long j2 = ((akb) ws6.get(i)).b;
        ts6 ts6 = new ts6();
        ts6.f(ws6.subList(0, i));
        ts6.d(new akb(l68, j2, j));
        ts6.f(ws6.subList(i + 1, ws6.size()));
        return new bkb(ts6.j(), akb);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ms6, ts6] */
    public final bkb t(int i, List list) {
        ? ms6 = new ms6(4);
        ws6 ws6 = this.e;
        ms6.e(ws6.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            ms6.a(new akb((l68) list.get(i2), -1, -9223372036854775807L));
        }
        ms6.e(ws6.subList(i, ws6.size()));
        return new bkb(ms6.j(), this.f);
    }

    public final long u(int i) {
        if (i >= 0) {
            ws6 ws6 = this.e;
            if (i < ws6.size()) {
                return ((akb) ws6.get(i)).b;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r2.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.akb v(int r3) {
        /*
            r2 = this;
            ws6 r0 = r2.e
            int r1 = r0.size()
            if (r3 != r1) goto L_0x000d
            akb r2 = r2.f
            if (r2 == 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            java.lang.Object r2 = r0.get(r3)
            akb r2 = (defpackage.akb) r2
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.v(int):akb");
    }
}
