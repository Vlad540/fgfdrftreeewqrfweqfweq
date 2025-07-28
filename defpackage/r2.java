package defpackage;

import java.util.AbstractList;
import java.util.List;

/* renamed from: r2  reason: default package */
public abstract class r2 extends AbstractList implements List, b77 {
    public abstract Object a(int i);

    public abstract int getSize();

    public final /* bridge */ Object remove(int i) {
        return a(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
