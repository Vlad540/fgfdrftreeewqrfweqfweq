package defpackage;

import java.util.Objects;

/* renamed from: st9  reason: default package */
public final class st9 extends pj0 {
    public final /* synthetic */ int Y;
    public final Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st9(bw9 bw9, Object obj, int i) {
        super(bw9);
        this.Y = i;
        this.Z = obj;
    }

    public final void c(Object obj) {
        switch (this.Y) {
            case 0:
                int i = this.X;
                bw9 bw9 = this.a;
                if (i == 0) {
                    try {
                        if (((v1b) this.Z).test(obj)) {
                            bw9.c(obj);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        ek8.a0(th);
                        this.b.f();
                        onError(th);
                        return;
                    }
                } else {
                    bw9.c((Object) null);
                    return;
                }
            default:
                if (!this.o) {
                    int i2 = this.X;
                    bw9 bw92 = this.a;
                    if (i2 != 0) {
                        bw92.c((Object) null);
                        return;
                    }
                    try {
                        Object apply = ((j26) this.Z).apply(obj);
                        Objects.requireNonNull(apply, "The mapper function returned a null value.");
                        bw92.c(apply);
                        return;
                    } catch (Throwable th2) {
                        ek8.a0(th2);
                        this.b.f();
                        onError(th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final Object poll() {
        Object poll;
        switch (this.Y) {
            case 0:
                break;
            default:
                Object poll2 = this.c.poll();
                if (poll2 == null) {
                    return null;
                }
                Object apply = ((j26) this.Z).apply(poll2);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
        }
        do {
            poll = this.c.poll();
            if (poll == null || ((v1b) this.Z).test(poll)) {
                return poll;
            }
            poll = this.c.poll();
            return poll;
        } while (((v1b) this.Z).test(poll));
        return poll;
    }
}
