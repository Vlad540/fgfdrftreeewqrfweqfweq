package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: us6  reason: default package */
public final class us6 extends ws6 {
    public final transient ws6 c;

    public us6(ws6 ws6) {
        this.c = ws6;
    }

    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    public final boolean f() {
        return this.c.f();
    }

    public final Object get(int i) {
        ws6 ws6 = this.c;
        a06.k(i, ws6.size());
        return ws6.get((ws6.size() - 1) - i);
    }

    public final int indexOf(Object obj) {
        ws6 ws6 = this.c;
        int lastIndexOf = ws6.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (ws6.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        ws6 ws6 = this.c;
        int indexOf = ws6.indexOf(obj);
        if (indexOf >= 0) {
            return (ws6.size() - 1) - indexOf;
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final ws6 q() {
        return this.c;
    }

    /* renamed from: s */
    public final ws6 subList(int i, int i2) {
        ws6 ws6 = this.c;
        a06.o(i, i2, ws6.size());
        return ws6.subList(ws6.size() - i2, ws6.size() - i).q();
    }

    public final int size() {
        return this.c.size();
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
