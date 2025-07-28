package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: u3d  reason: default package */
public final class u3d extends t2 implements Serializable {
    public static final u3d b = new u3d(ht7.C0);
    public final ht7 a;

    static {
        ht7 ht7 = ht7.C0;
    }

    public u3d(ht7 ht7) {
        this.a = ht7;
    }

    public final boolean add(Object obj) {
        return this.a.a(obj) >= 0;
    }

    public final boolean addAll(Collection collection) {
        this.a.c();
        return super.addAll(collection);
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final int getSize() {
        return this.a.x0;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        ht7 ht7 = this.a;
        ht7.getClass();
        return new et7(1, ht7);
    }

    public final boolean remove(Object obj) {
        ht7 ht7 = this.a;
        ht7.c();
        int g = ht7.g(obj);
        if (g < 0) {
            return false;
        }
        ht7.j(g);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        this.a.c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        this.a.c();
        return super.retainAll(collection);
    }

    public u3d() {
        this(new ht7());
    }
}
