package defpackage;

/* renamed from: gue  reason: default package */
public final class gue extends rj0 {
    public final /* synthetic */ hue a;

    public gue(hue hue) {
        this.a = hue;
    }

    public final void cancel() {
        if (!this.a.w0) {
            this.a.w0 = true;
            Runnable runnable = (Runnable) this.a.c.getAndSet((Object) null);
            if (runnable != null) {
                runnable.run();
            }
            this.a.Z.lazySet((Object) null);
            if (this.a.y0.getAndIncrement() == 0) {
                this.a.Z.lazySet((Object) null);
                hue hue = this.a;
                if (!hue.A0) {
                    hue.b.clear();
                }
            }
        }
    }

    public final void clear() {
        this.a.b.clear();
    }

    public final void i(long j) {
        if (f1e.d(j)) {
            hue hue = this.a;
            z3d.b(hue.z0, j);
            hue.i();
        }
    }

    public final boolean isEmpty() {
        return this.a.b.isEmpty();
    }

    public final Object poll() {
        return this.a.b.poll();
    }

    public final int q(int i) {
        this.a.A0 = true;
        return 2;
    }
}
