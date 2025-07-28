package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: w27  reason: default package */
public final class w27 implements Iterator {
    public Iterator a;
    public Iterator b;
    public Iterator c;
    public ArrayDeque o;

    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.c;
                if (it3 != null && it3.hasNext()) {
                    it = this.c;
                    break;
                }
                ArrayDeque arrayDeque = this.o;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    it = null;
                } else {
                    this.c = (Iterator) this.o.removeFirst();
                }
            }
            it = null;
            this.c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.b = it4;
            if (it4 instanceof w27) {
                w27 w27 = (w27) it4;
                this.b = w27.b;
                if (this.o == null) {
                    this.o = new ArrayDeque();
                }
                this.o.addFirst(this.c);
                if (w27.o != null) {
                    while (!w27.o.isEmpty()) {
                        this.o.addFirst((Iterator) w27.o.removeLast());
                    }
                }
                this.c = w27.c;
            }
        }
    }

    public final Object next() {
        if (hasNext()) {
            Iterator it = this.b;
            this.a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        Iterator it = this.a;
        if (it != null) {
            it.remove();
            this.a = null;
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
