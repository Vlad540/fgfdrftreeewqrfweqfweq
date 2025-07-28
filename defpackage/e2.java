package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: e2  reason: default package */
public final class e2 extends h2 implements NavigableMap {
    public final /* synthetic */ y1 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e2(y1 y1Var, NavigableMap navigableMap) {
        super(y1Var, navigableMap);
        this.Z = y1Var;
    }

    public final SortedSet b() {
        return new f2(this.Z, d());
    }

    public final SortedSet c() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = d().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    public final Object ceilingKey(Object obj) {
        return d().ceilingKey(obj);
    }

    public final NavigableSet descendingKeySet() {
        return ((e2) descendingMap()).navigableKeySet();
    }

    public final NavigableMap descendingMap() {
        return new e2(this.Z, d().descendingMap());
    }

    public final ps6 e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection d = this.Z.d();
        d.addAll((Collection) entry.getValue());
        it.remove();
        return new ps6(entry.getKey(), Collections.unmodifiableList((List) d));
    }

    /* renamed from: f */
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.c);
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = d().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = d().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    public final Object floorKey(Object obj) {
        return d().floorKey(obj);
    }

    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = d().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    public final Object higherKey(Object obj) {
        return d().higherKey(obj);
    }

    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = d().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = d().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    public final Object lowerKey(Object obj) {
        return d().lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return e(((a2) entrySet()).iterator());
    }

    public final Map.Entry pollLastEntry() {
        return e(((a2) ((c2) descendingMap()).entrySet()).iterator());
    }

    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new e2(this.Z, d().headMap(obj, z));
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new e2(this.Z, d().subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new e2(this.Z, d().tailMap(obj, z));
    }
}
