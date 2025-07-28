package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: wr  reason: default package */
public final class wr implements Iterator, Map.Entry {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ yr o;

    public wr(yr yrVar) {
        this.o = yrVar;
        this.a = yrVar.c - 1;
    }

    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.b;
            yr yrVar = this.o;
            return hhd.f(key, yrVar.f(i)) && hhd.f(entry.getValue(), yrVar.i(this.b));
        }
    }

    public final Object getKey() {
        if (this.c) {
            return this.o.f(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.c) {
            return this.o.i(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final int hashCode() {
        if (this.c) {
            int i = this.b;
            yr yrVar = this.o;
            Object f = yrVar.f(i);
            Object i2 = yrVar.i(this.b);
            int i3 = 0;
            int hashCode = f == null ? 0 : f.hashCode();
            if (i2 != null) {
                i3 = i2.hashCode();
            }
            return hashCode ^ i3;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object next() {
        if (hasNext()) {
            this.b++;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.c) {
            this.o.g(this.b);
            this.b--;
            this.a--;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.c) {
            return this.o.h(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
