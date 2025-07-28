package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Predicate;
import kotlin.coroutines.Continuation;

/* renamed from: ru5  reason: default package */
public final class ru5 implements Collection, z67 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public ru5(su5 su5) {
        this.b = su5.a;
    }

    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof gy7)) {
                    return false;
                }
                return ((ConcurrentSkipListSet) this.b).contains((gy7) obj);
            default:
                return ((jc9) this.b).c(obj);
        }
    }

    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).containsAll(collection);
            default:
                if (collection.isEmpty()) {
                    return true;
                }
                for (Object c : collection) {
                    if (!((jc9) this.b).c(c)) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).isEmpty();
            default:
                return ((jc9) this.b).h();
        }
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).iterator();
            default:
                return r1g.r(new klc((jc9) this.b, (Continuation) null));
        }
    }

    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean removeIf(Predicate predicate) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final int size() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).size();
            default:
                return ((jc9) this.b).e;
        }
    }

    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                return n06.D(this);
            default:
                return n06.D(this);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                return n06.E(this, objArr);
            default:
                return n06.E(this, objArr);
        }
    }

    public ru5(jc9 jc9) {
        this.b = jc9;
    }
}
