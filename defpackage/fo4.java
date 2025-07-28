package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: fo4  reason: default package */
public final class fo4 {
    public final int a;
    public final se8 b;
    public final CopyOnWriteArrayList c;

    public fo4(CopyOnWriteArrayList copyOnWriteArrayList, int i, se8 se8) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = se8;
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            do4 do4 = (do4) it.next();
            oze.W(do4.a, new bo4(this, do4.b, 3));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            do4 do4 = (do4) it.next();
            oze.W(do4.a, new bo4(this, do4.b, 1));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            do4 do4 = (do4) it.next();
            oze.W(do4.a, new bo4(this, do4.b, 2));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            do4 do4 = (do4) it.next();
            oze.W(do4.a, new wg1((Object) this, (Object) do4.b, i, 7));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            do4 do4 = (do4) it.next();
            oze.W(do4.a, new g5(this, do4.b, exc, 23));
        }
    }

    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            do4 do4 = (do4) it.next();
            oze.W(do4.a, new bo4(this, do4.b, 0));
        }
    }
}
