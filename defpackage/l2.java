package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: l2  reason: default package */
public class l2 extends j2 implements List {
    public final /* synthetic */ y1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l2(y1 y1Var, Object obj, List list, j2 j2Var) {
        super(y1Var, obj, list, j2Var);
        this.Y = y1Var;
    }

    public final void add(int i, Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.Y.X++;
        if (isEmpty) {
            a();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.b).addAll(i, collection);
        if (addAll) {
            this.Y.X += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final Object get(int i) {
        b();
        return ((List) this.b).get(i);
    }

    public final int indexOf(Object obj) {
        b();
        return ((List) this.b).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.b).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        b();
        return new k2(this);
    }

    public final Object remove(int i) {
        b();
        Object remove = ((List) this.b).remove(i);
        y1 y1Var = this.Y;
        y1Var.X--;
        c();
        return remove;
    }

    public final Object set(int i, Object obj) {
        b();
        return ((List) this.b).set(i, obj);
    }

    public final List subList(int i, int i2) {
        b();
        List subList = ((List) this.b).subList(i, i2);
        j2 j2Var = this.c;
        if (j2Var == null) {
            j2Var = this;
        }
        y1 y1Var = this.Y;
        y1Var.getClass();
        boolean z = subList instanceof RandomAccess;
        Object obj = this.a;
        return z ? new l2(y1Var, obj, subList, j2Var) : new l2(y1Var, obj, subList, j2Var);
    }

    public final ListIterator listIterator(int i) {
        b();
        return new k2(this, i);
    }
}
