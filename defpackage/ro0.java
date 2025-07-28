package defpackage;

/* renamed from: ro0  reason: default package */
public final class ro0 implements e75 {
    public final /* synthetic */ int a;
    public final fid b;

    public ro0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new fid(35152, 2, "image/png");
                return;
            default:
                this.b = new fid(16973, 2, "image/bmp");
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    public final void S(i75 i75) {
        switch (this.a) {
            case 0:
                this.b.S(i75);
                return;
            default:
                this.b.S(i75);
                return;
        }
    }

    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.b.d(j, j2);
                return;
            default:
                this.b.d(j, j2);
                return;
        }
    }

    public final int g(g75 g75, le4 le4) {
        switch (this.a) {
            case 0:
                return this.b.g(g75, le4);
            default:
                return this.b.g(g75, le4);
        }
    }

    public final boolean n(g75 g75) {
        switch (this.a) {
            case 0:
                return this.b.n(g75);
            default:
                return this.b.n(g75);
        }
    }

    public final void release() {
        int i = this.a;
    }
}
