package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: me3  reason: default package */
public final class me3 {
    public HashSet a = null;
    public int b;
    public boolean c;
    public final ff3 d;
    public final int e;
    public me3 f;
    public int g = 0;
    public int h = Integer.MIN_VALUE;
    public nld i;

    public me3(ff3 ff3, int i2) {
        this.d = ff3;
        this.e = i2;
    }

    public final void a(me3 me3, int i2) {
        b(me3, i2, Integer.MIN_VALUE, false);
    }

    public final boolean b(me3 me3, int i2, int i3, boolean z) {
        if (me3 == null) {
            j();
            return true;
        } else if (!z && !i(me3)) {
            return false;
        } else {
            this.f = me3;
            if (me3.a == null) {
                me3.a = new HashSet();
            }
            HashSet hashSet = this.f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.g = i2;
            this.h = i3;
            return true;
        }
    }

    public final void c(int i2, krf krf, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                r1g.i(((me3) it.next()).d, i2, arrayList, krf);
            }
        }
    }

    public final int d() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r2 = r3.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r3 = this;
            ff3 r0 = r3.d
            int r0 = r0.g0
            r1 = 8
            if (r0 != r1) goto L_0x000a
            r3 = 0
            return r3
        L_0x000a:
            int r0 = r3.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x001b
            me3 r2 = r3.f
            if (r2 == 0) goto L_0x001b
            ff3 r2 = r2.d
            int r2 = r2.g0
            if (r2 != r1) goto L_0x001b
            return r0
        L_0x001b:
            int r3 = r3.g
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me3.e():int");
    }

    public final me3 f() {
        int i2 = this.e;
        int t = hr1.t(i2);
        ff3 ff3 = this.d;
        switch (t) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return ff3.K;
            case 2:
                return ff3.L;
            case 3:
                return ff3.I;
            case 4:
                return ff3.J;
            default:
                throw new AssertionError(th2.o(i2));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((me3) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(me3 me3) {
        boolean z = false;
        if (me3 == null) {
            return false;
        }
        int i2 = this.e;
        ff3 ff3 = me3.d;
        int i3 = me3.e;
        if (i3 == i2) {
            return i2 != 6 || (ff3.E && this.d.E);
        }
        switch (hr1.t(i2)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i3 == 2 || i3 == 4;
                if (!(ff3 instanceof bd6)) {
                    return z2;
                }
                if (z2 || i3 == 8) {
                    z = true;
                }
                return z;
            case 2:
            case 4:
                boolean z3 = i3 == 3 || i3 == 5;
                if (!(ff3 instanceof bd6)) {
                    return z3;
                }
                if (z3 || i3 == 9) {
                    z = true;
                }
                return z;
            case 5:
                return (i3 == 2 || i3 == 4) ? false : true;
            case 6:
                return (i3 == 6 || i3 == 8 || i3 == 9) ? false : true;
            default:
                throw new AssertionError(th2.o(i2));
        }
    }

    public final void j() {
        HashSet hashSet;
        me3 me3 = this.f;
        if (!(me3 == null || (hashSet = me3.a) == null)) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        nld nld = this.i;
        if (nld == null) {
            this.i = new nld(1);
        } else {
            nld.c();
        }
    }

    public final void l(int i2) {
        this.b = i2;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + th2.o(this.e);
    }
}
