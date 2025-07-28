package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: y1  reason: default package */
public abstract class y1 extends q2 implements Serializable {
    public transient int X;
    public final transient Map o;

    public y1(Map map) {
        if (map.isEmpty()) {
            this.o = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        c2 c = c();
        this.c = c;
        return c;
    }

    public final void b() {
        Map map = this.o;
        for (Collection clear : map.values()) {
            clear.clear();
        }
        map.clear();
        this.X = 0;
    }

    public c2 c() {
        return new c2(this, this.o);
    }

    public abstract Collection d();

    public d2 e() {
        return new d2(this, this.o);
    }

    public final List f(Object obj) {
        Collection collection = (Collection) this.o.get(obj);
        if (collection == null) {
            collection = d();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new l2(this, obj, list, (j2) null) : new l2(this, obj, list, (j2) null);
    }

    public final boolean g(Object obj, Object obj2) {
        Map map = this.o;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            Collection d = d();
            if (d.add(obj2)) {
                this.X++;
                map.put(obj, d);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.X++;
            return true;
        }
    }

    public final p2 h() {
        p2 p2Var = this.b;
        if (p2Var != null) {
            return p2Var;
        }
        p2 p2Var2 = new p2(0, this);
        this.b = p2Var2;
        return p2Var2;
    }
}
