package defpackage;

/* renamed from: gl9  reason: default package */
public final class gl9 {
    public final nj4 a;
    public final nj4 b;
    public final nj4 c;
    public final nj4 d;
    public final nj4 e;

    public gl9(nj4 nj4, nj4 nj42, nj4 nj43, nj4 nj44, nj4 nj45) {
        this.a = nj4;
        this.b = nj42;
        this.c = nj43;
        this.d = nj44;
        this.e = nj45;
    }

    public final void a(hl9 hl9) {
        long j = hl9.w0;
        if (j != 0) {
            udd.p("gl9", "setFavoritesSync: %d", new Object[]{Long.valueOf(j)});
            ((lqc) ((f03) this.c.get())).k("user.favoritesLastSync", Long.valueOf(hl9.w0));
        }
    }
}
