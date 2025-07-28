package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: c2  reason: default package */
public class c2 extends AbstractMap {
    public transient a2 a;
    public transient p2 b;
    public final transient Map c;
    public final /* synthetic */ y1 o;

    public c2(y1 y1Var, Map map) {
        this.o = y1Var;
        this.c = map;
    }

    public final ps6 a(Map.Entry entry) {
        Object key = entry.getKey();
        y1 y1Var = this.o;
        y1Var.getClass();
        List list = (List) ((Collection) entry.getValue());
        return new ps6(key, list instanceof RandomAccess ? new l2(y1Var, key, list, (j2) null) : new l2(y1Var, key, list, (j2) null));
    }

    public final void clear() {
        y1 y1Var = this.o;
        if (this.c == y1Var.o) {
            y1Var.b();
            return;
        }
        b2 b2Var = new b2(this);
        while (b2Var.hasNext()) {
            b2Var.next();
            b2Var.remove();
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Set entrySet() {
        a2 a2Var = this.a;
        if (a2Var != null) {
            return a2Var;
        }
        a2 a2Var2 = new a2(this);
        this.a = a2Var2;
        return a2Var2;
    }

    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        y1 y1Var = this.o;
        y1Var.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new l2(y1Var, obj, list, (j2) null) : new l2(y1Var, obj, list, (j2) null);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public Set keySet() {
        y1 y1Var = this.o;
        Set set = y1Var.a;
        if (set != null) {
            return set;
        }
        d2 e = y1Var.e();
        y1Var.a = e;
        return e;
    }

    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        y1 y1Var = this.o;
        Collection d = y1Var.d();
        d.addAll(collection);
        y1Var.X -= collection.size();
        collection.clear();
        return d;
    }

    public final int size() {
        return this.c.size();
    }

    public final String toString() {
        return this.c.toString();
    }

    public final Collection values() {
        p2 p2Var = this.b;
        if (p2Var != null) {
            return p2Var;
        }
        p2 p2Var2 = new p2(this);
        this.b = p2Var2;
        return p2Var2;
    }
}
