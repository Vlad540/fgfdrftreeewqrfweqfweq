package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: x3d  reason: default package */
public final class x3d extends w3d implements SortedSet {
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    public final Object first() {
        Iterator it = this.a.iterator();
        it.getClass();
        u1b u1b = this.b;
        u1b.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (u1b.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.SortedSet, w3d] */
    public final SortedSet headSet(Object obj) {
        return new w3d(((SortedSet) this.a).headSet(obj), this.b);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            Object last = sortedSet.last();
            if (this.b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.SortedSet, w3d] */
    public final SortedSet subSet(Object obj, Object obj2) {
        return new w3d(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.SortedSet, w3d] */
    public final SortedSet tailSet(Object obj) {
        return new w3d(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
