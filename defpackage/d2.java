package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: d2  reason: default package */
public class d2 extends y3d {
    public final Map a;
    public final /* synthetic */ y1 b;

    public d2(y1 y1Var, Map map) {
        this.b = y1Var;
        map.getClass();
        this.a = map;
    }

    public final void clear() {
        Iterator it = iterator();
        while (true) {
            b2 b2Var = (b2) it;
            if (b2Var.hasNext()) {
                b2Var.next();
                b2Var.remove();
            } else {
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.a.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.a.keySet().hashCode();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return new b2(this, this.a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.a.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.b.X -= i;
        } else {
            i = 0;
        }
        return i > 0;
    }

    public final int size() {
        return this.a.size();
    }
}
