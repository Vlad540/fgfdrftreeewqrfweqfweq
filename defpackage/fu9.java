package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: fu9  reason: default package */
public final class fu9 extends tj0 {
    public boolean X;
    public boolean Y;
    public final bw9 a;
    public final Iterator b;
    public volatile boolean c;
    public boolean o;

    public fu9(bw9 bw9, Iterator it) {
        this.a = bw9;
        this.b = it;
    }

    public final void clear() {
        this.X = true;
    }

    public final void f() {
        this.c = true;
    }

    public final boolean h() {
        return this.c;
    }

    public final boolean isEmpty() {
        return this.X;
    }

    public final Object poll() {
        if (this.X) {
            return null;
        }
        boolean z = this.Y;
        Iterator it = this.b;
        if (!z) {
            this.Y = true;
        } else if (!it.hasNext()) {
            this.X = true;
            return null;
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        return next;
    }

    public final int q(int i) {
        this.o = true;
        return 1;
    }
}
