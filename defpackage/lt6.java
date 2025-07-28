package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: lt6  reason: default package */
public abstract class lt6 extends gt6 implements NavigableSet, sld {
    public transient lt6 X;
    public final transient Comparator o;

    public lt6(Comparator comparator) {
        this.o = comparator;
    }

    public static l8c n(Comparator comparator) {
        return og9.a.equals(comparator) ? l8c.Z : new l8c(e8c.X, comparator);
    }

    public final Comparator comparator() {
        return this.o;
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        l8c l8c = (l8c) this;
        return l8c.p(0, l8c.q(obj, z));
    }

    /* renamed from: m */
    public final lt6 descendingSet() {
        lt6 lt6 = this.X;
        if (lt6 == null) {
            l8c l8c = (l8c) this;
            Comparator reverseOrder = Collections.reverseOrder(l8c.o);
            lt6 = l8c.isEmpty() ? n(reverseOrder) : new l8c(l8c.Y.q(), reverseOrder);
            this.X = lt6;
            lt6.X = this;
        }
        return lt6;
    }

    /* renamed from: o */
    public final l8c subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.o.compare(obj, obj2) <= 0) {
            l8c l8c = (l8c) this;
            l8c p = l8c.p(l8c.r(obj, z), l8c.Y.size());
            return p.p(0, p.q(obj2, z2));
        }
        throw new IllegalArgumentException();
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        l8c l8c = (l8c) this;
        return l8c.p(l8c.r(obj, z), l8c.Y.size());
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final SortedSet headSet(Object obj) {
        obj.getClass();
        l8c l8c = (l8c) this;
        return l8c.p(0, l8c.q(obj, false));
    }

    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        l8c l8c = (l8c) this;
        return l8c.p(l8c.r(obj, true), l8c.Y.size());
    }
}
