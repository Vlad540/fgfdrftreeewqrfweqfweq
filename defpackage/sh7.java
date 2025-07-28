package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* renamed from: sh7  reason: default package */
public final class sh7 extends jqe implements ListIterator {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractList c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh7(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.b = i;
        this.c = abstractList;
    }

    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                return ((th7) this.c).b.apply(obj);
            default:
                return ((uh7) this.c).b.apply(obj);
        }
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.a).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.a).nextIndex();
    }

    public final Object previous() {
        return a(((ListIterator) this.a).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.a).previousIndex();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
