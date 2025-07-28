package defpackage;

/* renamed from: l94  reason: default package */
public final class l94 implements e75 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public l94(int i) {
        if ((i & 1) != 0) {
            this.b = new fid(65496, 2, "image/jpeg");
        } else {
            this.b = new y47();
        }
    }

    private final void a() {
    }

    private final void b(long j, long j2) {
    }

    public final void S(i75 i75) {
        switch (this.a) {
            case 0:
                bpe B = i75.B(0, 3);
                i75.M(new wc0(-9223372036854775807L));
                i75.w();
                xu5 xu5 = (xu5) this.b;
                uu5 a2 = xu5.a();
                a2.m = c49.l("text/x-unknown");
                a2.i = xu5.n;
                B.e(new xu5(a2));
                return;
            default:
                ((e75) this.b).S(i75);
                return;
        }
    }

    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                return;
            default:
                ((e75) this.b).d(j, j2);
                return;
        }
    }

    public final int g(g75 g75, le4 le4) {
        switch (this.a) {
            case 0:
                return ((r74) g75).f(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((e75) this.b).g(g75, le4);
        }
    }

    public final boolean n(g75 g75) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((e75) this.b).n(g75);
        }
    }

    public final void release() {
        switch (this.a) {
            case 0:
                return;
            default:
                ((e75) this.b).release();
                return;
        }
    }

    public l94(xu5 xu5) {
        this.b = xu5;
    }
}
