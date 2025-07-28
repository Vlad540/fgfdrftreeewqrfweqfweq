package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: k2  reason: default package */
public final class k2 extends b2 implements ListIterator {
    public final /* synthetic */ l2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var) {
        super((j2) l2Var);
        this.X = l2Var;
    }

    public final void add(Object obj) {
        l2 l2Var = this.X;
        boolean isEmpty = l2Var.isEmpty();
        b().add(obj);
        l2Var.Y.X++;
        if (isEmpty) {
            l2Var.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    public final int nextIndex() {
        return b().nextIndex();
    }

    public final Object previous() {
        return b().previous();
    }

    public final int previousIndex() {
        return b().previousIndex();
    }

    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, int i) {
        super((j2) l2Var, ((List) l2Var.b).listIterator(i));
        this.X = l2Var;
    }
}
