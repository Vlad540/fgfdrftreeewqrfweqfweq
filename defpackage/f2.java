package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: f2  reason: default package */
public final class f2 extends i2 implements NavigableSet {
    public final /* synthetic */ y1 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f2(y1 y1Var, NavigableMap navigableMap) {
        super(y1Var, navigableMap);
        this.o = y1Var;
    }

    /* renamed from: b */
    public final NavigableMap a() {
        return (NavigableMap) ((SortedMap) this.a);
    }

    public final Object ceiling(Object obj) {
        return a().ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return ((d2) descendingSet()).iterator();
    }

    public final NavigableSet descendingSet() {
        return new f2(this.o, a().descendingMap());
    }

    public final Object floor(Object obj) {
        return a().floorKey(obj);
    }

    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return a().higherKey(obj);
    }

    public final Object lower(Object obj) {
        return a().lowerKey(obj);
    }

    public final Object pollFirst() {
        b2 b2Var = (b2) iterator();
        if (!b2Var.hasNext()) {
            return null;
        }
        Object next = b2Var.next();
        b2Var.remove();
        return next;
    }

    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new f2(this.o, a().headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new f2(this.o, a().subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new f2(this.o, a().tailMap(obj, z));
    }
}
