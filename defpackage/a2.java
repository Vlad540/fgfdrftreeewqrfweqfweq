package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: a2  reason: default package */
public final class a2 extends y3d {
    public final /* synthetic */ c2 a;

    public a2(c2 c2Var) {
        this.a = c2Var;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.a.c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return new b2(this.a);
    }

    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        y1 y1Var = this.a.o;
        Object key = entry.getKey();
        Map map = y1Var.o;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        y1Var.X -= size;
        return true;
    }

    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            boolean z = false;
            for (Object remove : collection) {
                z |= remove(remove);
            }
            return z;
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(ct0.d(collection.size()));
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return this.a.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.a.c.size();
    }
}
