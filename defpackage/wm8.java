package defpackage;

import java.util.Iterator;

/* renamed from: wm8  reason: default package */
public final class wm8 implements Iterator, z67 {
    public final Iterator a;
    public final Iterator b;
    public final /* synthetic */ ij4 c;

    public wm8(ij4 ij4) {
        this.c = ij4;
        this.a = ((dyc) ij4.c).iterator();
        this.b = ((dyc) ij4.b).iterator();
    }

    public final boolean hasNext() {
        return this.a.hasNext() && this.b.hasNext();
    }

    public final Object next() {
        this.c.getClass();
        return new wia(this.a.next(), this.b.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
