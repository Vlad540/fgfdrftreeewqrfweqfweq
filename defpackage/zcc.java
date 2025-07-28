package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: zcc  reason: default package */
public final class zcc implements ListIterator, z67 {
    public final /* synthetic */ int a = 0;
    public final ListIterator b;
    public final /* synthetic */ Object c;

    public zcc(nv7 nv7, int i) {
        this.c = nv7;
        this.b = ((List) nv7.b).listIterator(o23.Q(i, nv7));
    }

    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                ListIterator listIterator = this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasPrevious();
            default:
                return this.b.hasPrevious();
        }
    }

    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.previous();
            default:
                return this.b.previous();
        }
    }

    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return p23.A((adc) this.c) - this.b.previousIndex();
            default:
                return p23.A((nv7) this.c) - this.b.previousIndex();
        }
    }

    public final Object previous() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return this.b.next();
        }
    }

    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return p23.A((adc) this.c) - this.b.nextIndex();
            default:
                return p23.A((nv7) this.c) - this.b.nextIndex();
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                this.b.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public zcc(adc adc, int i) {
        this.c = adc;
        this.b = adc.a.listIterator(o23.Q(i, adc));
    }
}
