package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ru.ok.android.externcalls.sdk.u;

/* renamed from: s27  reason: default package */
public final class s27 implements Iterator {
    public final /* synthetic */ r27 X;
    public final Iterator a;
    public Object b;
    public boolean c = false;
    public boolean o = false;

    public s27(r27 r27, Iterator it) {
        this.X = r27;
        this.a = it;
    }

    public final boolean hasNext() {
        Object next;
        if (this.o) {
            return true;
        }
        if (this.c) {
            return false;
        }
        do {
            Iterator it = this.a;
            if (it.hasNext()) {
                next = it.next();
                ((u) this.X.c).getClass();
            } else {
                this.c = true;
                return false;
            }
        } while (!u.b(next));
        this.o = true;
        this.b = next;
        return true;
    }

    public final Object next() {
        Object next;
        if (this.o) {
            this.o = false;
            return this.b;
        }
        do {
            Iterator it = this.a;
            if (it.hasNext()) {
                next = it.next();
                ((u) this.X.c).getClass();
            } else {
                throw new NoSuchElementException("This FilterIterator has nothing to output");
            }
        } while (!u.b(next));
        this.b = next;
        this.o = false;
        return next;
    }
}
