package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: it7  reason: default package */
public final class it7 extends t2 {
    public final /* synthetic */ int a;
    public final ht7 b;

    public /* synthetic */ it7(int i, ht7 ht7) {
        this.a = i;
        this.b = ht7;
    }

    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ht7 ht7 = this.b;
                ht7.getClass();
                int g = ht7.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                return hhd.f(ht7.b[g], entry.getValue());
            default:
                return this.b.containsKey(obj);
        }
    }

    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                return this.b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    public final int getSize() {
        switch (this.a) {
            case 0:
                return this.b.x0;
            default:
                return this.b.x0;
        }
    }

    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return this.b.isEmpty();
            default:
                return this.b.isEmpty();
        }
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                ht7 ht7 = this.b;
                ht7.getClass();
                return new et7(0, ht7);
            default:
                ht7 ht72 = this.b;
                ht72.getClass();
                return new et7(1, ht72);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ht7 ht7 = this.b;
                ht7.c();
                int g = ht7.g(entry.getKey());
                if (g < 0 || !hhd.f(ht7.b[g], entry.getValue())) {
                    return false;
                }
                ht7.j(g);
                return true;
            default:
                ht7 ht72 = this.b;
                ht72.c();
                int g2 = ht72.g(obj);
                if (g2 < 0) {
                    return false;
                }
                ht72.j(g2);
                return true;
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                this.b.c();
                return super.removeAll(collection);
            default:
                this.b.c();
                return super.removeAll(collection);
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                this.b.c();
                return super.retainAll(collection);
            default:
                this.b.c();
                return super.retainAll(collection);
        }
    }
}
