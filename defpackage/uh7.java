package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: uh7  reason: default package */
public final class uh7 extends AbstractSequentialList implements Serializable {
    public final List a;
    public final e26 b;

    public uh7(e26 e26, List list) {
        list.getClass();
        this.a = list;
        this.b = e26;
    }

    public final ListIterator listIterator(int i) {
        return new sh7(this, this.a.listIterator(i), 1);
    }

    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    public final int size() {
        return this.a.size();
    }
}
