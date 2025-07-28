package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: i2  reason: default package */
public class i2 extends d2 implements SortedSet {
    public final /* synthetic */ y1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i2(y1 y1Var, SortedMap sortedMap) {
        super(y1Var, sortedMap);
        this.c = y1Var;
    }

    public SortedMap a() {
        return (SortedMap) this.a;
    }

    public final Comparator comparator() {
        return a().comparator();
    }

    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new i2(this.c, a().headMap(obj));
    }

    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new i2(this.c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new i2(this.c, a().tailMap(obj));
    }
}
