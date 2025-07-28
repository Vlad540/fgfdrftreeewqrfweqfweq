package defpackage;

/* renamed from: qa9  reason: default package */
public final class qa9 {
    public final h30 a = ((h30) vl.b().getAccessor().c(h30.class));
    public final pa9 b;
    public o10 c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g = true;

    public qa9(pa9 pa9) {
        this.b = pa9;
    }

    public final void a() {
        o10 o10;
        if (this.g) {
            long j = this.d;
            if (j != 0 && (o10 = this.c) != null) {
                if (o10.c()) {
                    o10.j.getClass();
                }
                this.c = o10;
                this.d = j;
                boolean z = false;
                this.g = false;
                h30 h30 = this.a;
                if (h30.c.p(j)) {
                    boolean z2 = this.f;
                    nb9 nb9 = h30.c;
                    if (z2 || !nb9.p(0) || !nb9.y) {
                        if (nb9.p(0) && nb9.x) {
                            z = true;
                        }
                        if (z) {
                            this.f = true;
                            if (!this.e) {
                                nb9.o();
                            }
                        } else if ((nb9.p(this.d) && nb9.w) || (nb9.p(0) && nb9.y)) {
                            this.f = true;
                        }
                    } else {
                        this.b.g();
                    }
                }
            }
        }
    }
}
