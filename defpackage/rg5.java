package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rg5  reason: default package */
public final class rg5 implements Iterator, z67 {
    public final /* synthetic */ dyc X;
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public int c;
    public Object o;

    public rg5(sg5 sg5) {
        this.X = sg5;
        this.b = sg5.a.iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        sg5 sg5;
        do {
            Iterator it = this.b;
            if (it.hasNext()) {
                next = it.next();
                sg5 = (sg5) this.X;
            } else {
                this.c = 0;
                return;
            }
        } while (((Boolean) sg5.c.invoke(next)).booleanValue() != sg5.b);
        this.o = next;
        this.c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.o;
        if (it2 == null || !it2.hasNext()) {
            do {
                Iterator it3 = this.b;
                if (it3.hasNext()) {
                    Object next = it3.next();
                    xi5 xi5 = (xi5) this.X;
                    it = (Iterator) xi5.c.invoke(xi5.b.invoke(next));
                } else {
                    this.c = 2;
                    this.o = null;
                    return false;
                }
            } while (!it.hasNext());
            this.o = it;
            this.c = 1;
            return true;
        }
        this.c = 1;
        return true;
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            default:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return b();
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c != 0) {
                    Object obj = this.o;
                    this.o = null;
                    this.c = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                int i = this.c;
                if (i == 2) {
                    throw new NoSuchElementException();
                } else if (i != 0 || b()) {
                    this.c = 0;
                    return ((Iterator) this.o).next();
                } else {
                    throw new NoSuchElementException();
                }
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public rg5(xi5 xi5) {
        this.X = xi5;
        this.b = xi5.a.iterator();
    }
}
