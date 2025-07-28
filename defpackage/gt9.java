package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: gt9  reason: default package */
public final class gt9 extends pj0 {
    public final Collection Y;
    public final j26 Z;

    public gt9(bw9 bw9, j26 j26, Collection collection) {
        super(bw9);
        this.Z = j26;
        this.Y = collection;
    }

    public final void b() {
        if (!this.o) {
            this.o = true;
            this.Y.clear();
            this.a.b();
        }
    }

    public final void c(Object obj) {
        if (!this.o) {
            int i = this.X;
            bw9 bw9 = this.a;
            if (i == 0) {
                try {
                    Object apply = this.Z.apply(obj);
                    Objects.requireNonNull(apply, "The keySelector returned a null key");
                    if (this.Y.add(apply)) {
                        bw9.c(obj);
                    }
                } catch (Throwable th) {
                    ek8.a0(th);
                    this.b.f();
                    onError(th);
                }
            } else {
                bw9.c((Object) null);
            }
        }
    }

    public final void clear() {
        this.Y.clear();
        super.clear();
    }

    public final void onError(Throwable th) {
        if (this.o) {
            xs7.F(th);
            return;
        }
        this.o = true;
        this.Y.clear();
        this.a.onError(th);
    }

    public final Object poll() {
        Object poll;
        Object apply;
        do {
            poll = this.c.poll();
            if (poll == null) {
                break;
            }
            apply = this.Z.apply(poll);
            Objects.requireNonNull(apply, "The keySelector returned a null key");
        } while (!this.Y.add(apply));
        return poll;
    }
}
