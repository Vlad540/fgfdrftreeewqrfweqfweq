package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: gp4  reason: default package */
public final class gp4 implements Iterator, z67 {
    public final /* synthetic */ int a = 2;
    public final Iterator b;
    public int c;

    public gp4(Iterator it) {
        this.b = it;
    }

    public final boolean hasNext() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            case 1:
                return this.b.hasNext();
            case 2:
                return this.b.hasNext();
            default:
                return this.c > 0 && this.b.hasNext();
        }
        while (true) {
            int i = this.c;
            it = this.b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.hasNext();
    }

    public final Object next() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            case 1:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new uv6(i, this.b.next());
                }
                p23.G();
                throw null;
            case 2:
                int i2 = this.c;
                this.c = i2 + 1;
                if (i2 >= 0) {
                    return new uv6(i2, this.b.next());
                }
                p23.G();
                throw null;
            default:
                int i3 = this.c;
                if (i3 != 0) {
                    this.c = i3 - 1;
                    return this.b.next();
                }
                throw new NoSuchElementException();
        }
        while (true) {
            int i4 = this.c;
            it = this.b;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.next();
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public gp4(es esVar) {
        this.b = ((dyc) esVar.b).iterator();
    }

    public gp4(hp4 hp4, byte b2) {
        this.c = hp4.c;
        this.b = hp4.b.iterator();
    }

    public gp4(hp4 hp4) {
        this.b = hp4.b.iterator();
        this.c = hp4.c;
    }
}
