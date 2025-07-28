package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: uw5  reason: default package */
public abstract class uw5 extends at7 implements Map {
    public abstract Map Z();

    public final boolean a0(Object obj) {
        jqe jqe = new jqe(entrySet().iterator());
        if (obj == null) {
            while (jqe.hasNext()) {
                if (jqe.next() == null) {
                    return true;
                }
            }
        } else {
            while (jqe.hasNext()) {
                if (obj.equals(jqe.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void clear() {
        Z().clear();
    }

    public boolean containsKey(Object obj) {
        return Z().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return a0(obj);
    }

    public Set entrySet() {
        return Z().entrySet();
    }

    public Object get(Object obj) {
        return Z().get(obj);
    }

    public boolean isEmpty() {
        return Z().isEmpty();
    }

    public Set keySet() {
        return Z().keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return Z().put(obj, obj2);
    }

    public final void putAll(Map map) {
        Z().putAll(map);
    }

    public final Object remove(Object obj) {
        return Z().remove(obj);
    }

    public int size() {
        return Z().size();
    }

    public final Collection values() {
        return Z().values();
    }
}
