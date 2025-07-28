package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: af8  reason: default package */
public final class af8 {
    public long a;
    public int b;
    public Object c;
    public Serializable d;

    public af8() {
        this(new CopyOnWriteArrayList(), 0, (re8) null, 0);
    }

    public long a(long j) {
        long M = mze.M(j);
        if (M == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.a + M;
    }

    public void b(int i, vu5 vu5, int i2, Object obj, long j) {
        c(new i78(1, i, vu5, i2, obj, a(j), -9223372036854775807L));
    }

    public void c(i78 i78) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ye8 ye8 = (ye8) it.next();
            mze.H(ye8.a, new px4((Object) this, (Object) ye8.b, (Object) i78, 17));
        }
    }

    public void d(xi7 xi7, int i, int i2, vu5 vu5, int i3, Object obj, long j, long j2) {
        xi7 xi72 = xi7;
        e(xi7, new i78(i, i2, vu5, i3, obj, a(j), a(j2)));
    }

    public void e(xi7 xi7, i78 i78) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ye8 ye8 = (ye8) it.next();
            mze.H(ye8.a, new ve8(this, ye8.b, xi7, i78, 2));
        }
    }

    public void f(xi7 xi7, int i, int i2, vu5 vu5, int i3, Object obj, long j, long j2) {
        xi7 xi72 = xi7;
        g(xi7, new i78(i, i2, vu5, i3, obj, a(j), a(j2)));
    }

    public void g(xi7 xi7, i78 i78) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ye8 ye8 = (ye8) it.next();
            mze.H(ye8.a, new ve8(this, ye8.b, xi7, i78, 1));
        }
    }

    public void h(xi7 xi7, int i, int i2, vu5 vu5, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        xi7 xi72 = xi7;
        j(xi7, new i78(i, i2, vu5, i3, obj, a(j), a(j2)), iOException, z);
    }

    public void i(xi7 xi7, int i, IOException iOException, boolean z) {
        h(xi7, i, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void j(xi7 xi7, i78 i78, IOException iOException, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ye8 ye8 = (ye8) it.next();
            mze.H(ye8.a, new xe8((Object) this, (Object) ye8.b, (Object) xi7, (Object) i78, iOException, z, 0));
        }
    }

    public void k(xi7 xi7, int i, int i2, vu5 vu5, int i3, Object obj, long j, long j2) {
        xi7 xi72 = xi7;
        l(xi7, new i78(i, i2, vu5, i3, obj, a(j), a(j2)));
    }

    public void l(xi7 xi7, i78 i78) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ye8 ye8 = (ye8) it.next();
            mze.H(ye8.a, new ve8(this, ye8.b, xi7, i78, 0));
        }
    }

    public void m(i78 i78) {
        re8 re8 = (re8) this.c;
        re8.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ye8 ye8 = (ye8) it.next();
            mze.H(ye8.a, new wc3((Object) this, (Object) ye8.b, (Object) re8, (Object) i78, 12));
        }
    }

    public af8(CopyOnWriteArrayList copyOnWriteArrayList, int i, re8 re8, long j) {
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = re8;
        this.a = j;
    }
}
