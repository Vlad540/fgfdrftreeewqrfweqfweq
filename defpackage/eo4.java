package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: eo4  reason: default package */
public final class eo4 {
    public final int a;
    public final re8 b;
    public final CopyOnWriteArrayList c;

    public eo4() {
        this(new CopyOnWriteArrayList(), 0, (re8) null);
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            co4 co4 = (co4) it.next();
            mze.H(co4.a, new ao4(this, co4.b, 3));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            co4 co4 = (co4) it.next();
            mze.H(co4.a, new ao4(this, co4.b, 1));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            co4 co4 = (co4) it.next();
            mze.H(co4.a, new ao4(this, co4.b, 2));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            co4 co4 = (co4) it.next();
            mze.H(co4.a, new wg1((Object) this, (Object) co4.b, i, 8));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            co4 co4 = (co4) it.next();
            mze.H(co4.a, new g5(this, co4.b, exc, 22));
        }
    }

    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            co4 co4 = (co4) it.next();
            mze.H(co4.a, new ao4(this, co4.b, 0));
        }
    }

    public eo4(CopyOnWriteArrayList copyOnWriteArrayList, int i, re8 re8) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = re8;
    }
}
