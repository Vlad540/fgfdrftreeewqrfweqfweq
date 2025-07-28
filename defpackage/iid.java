package defpackage;

/* renamed from: iid  reason: default package */
public final class iid implements yjc {
    public int a;
    public boolean b;
    public final /* synthetic */ kid c;

    public iid(kid kid) {
        this.c = kid;
    }

    public final void a() {
        if (!this.b) {
            kid kid = this.c;
            kid.X.n(c49.g(kid.y0.n), kid.y0, 0, (Object) null, 0);
            this.b = true;
        }
    }

    public final void c() {
        kid kid = this.c;
        if (!kid.z0) {
            kid.x0.c();
        }
    }

    public final boolean d() {
        return this.c.A0;
    }

    public final int e(long j) {
        a();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    public final int j(qe4 qe4, n24 n24, int i) {
        a();
        kid kid = this.c;
        boolean z = kid.A0;
        if (z && kid.B0 == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            n24.a(4);
            return -4;
        } else if ((i & 2) != 0 || i2 == 0) {
            qe4.c = kid.y0;
            this.a = 1;
            return -5;
        } else if (!z) {
            return -3;
        } else {
            kid.B0.getClass();
            n24.a(1);
            n24.Z = 0;
            if ((i & 4) == 0) {
                n24.x(kid.C0);
                n24.X.put(kid.B0, 0, kid.C0);
            }
            if ((i & 1) == 0) {
                this.a = 2;
            }
            return -4;
        }
    }
}
