package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: zs6  reason: default package */
public abstract class zs6 implements Map, Serializable {
    public static final Map.Entry[] o = new Map.Entry[0];
    public transient gt6 a;
    public transient gt6 b;
    public transient ns6 c;

    public static jn a() {
        return new jn(4);
    }

    public static zs6 b(Map map) {
        if ((map instanceof zs6) && !(map instanceof SortedMap)) {
            zs6 zs6 = (zs6) map;
            if (!zs6.g()) {
                return zs6;
            }
        }
        Set entrySet = map.entrySet();
        jn jnVar = new jn(entrySet instanceof Collection ? entrySet.size() : 4);
        jnVar.L(entrySet);
        return jnVar.k();
    }

    public abstract gt6 c();

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract gt6 d();

    public abstract ns6 e();

    public final boolean equals(Object obj) {
        return ct0.j(this, obj);
    }

    /* renamed from: f */
    public gt6 entrySet() {
        gt6 gt6 = this.a;
        if (gt6 != null) {
            return gt6;
        }
        gt6 c2 = c();
        this.a = c2;
        return c2;
    }

    public abstract boolean g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public gt6 keySet() {
        gt6 gt6 = this.b;
        if (gt6 != null) {
            return gt6;
        }
        gt6 d = d();
        this.b = d;
        return d;
    }

    public final int hashCode() {
        return gp0.v(entrySet());
    }

    /* renamed from: i */
    public ns6 values() {
        ns6 ns6 = this.c;
        if (ns6 != null) {
            return ns6;
        }
        ns6 e = e();
        this.c = e;
        return e;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        ete.l(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
