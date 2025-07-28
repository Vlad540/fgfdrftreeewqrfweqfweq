package defpackage;

import java.util.Objects;

/* renamed from: ht9  reason: default package */
public final class ht9 extends pj0 {
    public final j26 Y;
    public Object Z;
    public boolean w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ht9(bw9 bw9) {
        super(bw9);
        ns7 ns7 = z3d.g;
        this.Y = ns7;
    }

    public final void c(Object obj) {
        if (!this.o) {
            int i = this.X;
            bw9 bw9 = this.a;
            if (i != 0) {
                bw9.c(obj);
                return;
            }
            try {
                Object apply = this.Y.apply(obj);
                if (this.w0) {
                    boolean equals = Objects.equals(this.Z, apply);
                    this.Z = apply;
                    if (equals) {
                        return;
                    }
                } else {
                    this.w0 = true;
                    this.Z = apply;
                }
                bw9.c(obj);
            } catch (Throwable th) {
                ek8.a0(th);
                this.b.f();
                onError(th);
            }
        }
    }

    public final Object poll() {
        while (true) {
            Object poll = this.c.poll();
            if (poll == null) {
                return null;
            }
            Object apply = this.Y.apply(poll);
            if (!this.w0) {
                this.w0 = true;
                this.Z = apply;
                return poll;
            } else if (!Objects.equals(this.Z, apply)) {
                this.Z = apply;
                return poll;
            } else {
                this.Z = apply;
            }
        }
    }
}
