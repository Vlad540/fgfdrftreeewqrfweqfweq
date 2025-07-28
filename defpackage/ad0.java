package defpackage;

/* renamed from: ad0  reason: default package */
public final class ad0 implements e75 {
    public final /* synthetic */ int a;
    public final ija b;
    public final fid c;

    public ad0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ija(4);
                this.c = new fid(-1, -1, "image/heif");
                return;
            case 2:
                this.b = new ija(4);
                this.c = new fid(-1, -1, "image/webp");
                return;
            default:
                this.b = new ija(4);
                this.c = new fid(-1, -1, "image/avif");
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    public final void S(i75 i75) {
        switch (this.a) {
            case 0:
                this.c.S(i75);
                return;
            case 1:
                this.c.S(i75);
                return;
            default:
                this.c.S(i75);
                return;
        }
    }

    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.d(j, j2);
                return;
            case 1:
                this.c.d(j, j2);
                return;
            default:
                this.c.d(j, j2);
                return;
        }
    }

    public final int g(g75 g75, le4 le4) {
        switch (this.a) {
            case 0:
                return this.c.g(g75, le4);
            case 1:
                return this.c.g(g75, le4);
            default:
                return this.c.g(g75, le4);
        }
    }

    public final boolean n(g75 g75) {
        switch (this.a) {
            case 0:
                ((r74) g75).b(4, false);
                r74 r74 = (r74) g75;
                ija ija = this.b;
                ija.D(4);
                r74.r(ija.a, 0, 4, false);
                if (ija.w() != ((long) 1718909296)) {
                    return false;
                }
                ija.D(4);
                r74.r(ija.a, 0, 4, false);
                return ija.w() == ((long) 1635150182);
            case 1:
                ((r74) g75).b(4, false);
                r74 r742 = (r74) g75;
                ija ija2 = this.b;
                ija2.D(4);
                r742.r(ija2.a, 0, 4, false);
                if (ija2.w() != ((long) 1718909296)) {
                    return false;
                }
                ija2.D(4);
                r742.r(ija2.a, 0, 4, false);
                return ija2.w() == ((long) 1751476579);
            default:
                ija ija3 = this.b;
                ija3.D(4);
                ((r74) g75).r(ija3.a, 0, 4, false);
                if (ija3.w() != 1380533830) {
                    return false;
                }
                r74 r743 = (r74) g75;
                r743.b(4, false);
                ija3.D(4);
                r743.r(ija3.a, 0, 4, false);
                return ija3.w() == 1464156752;
        }
    }

    public final void release() {
        int i = this.a;
    }
}
