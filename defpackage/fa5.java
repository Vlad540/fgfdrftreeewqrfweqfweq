package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: fa5  reason: default package */
public final class fa5 {
    public final nj4 a;
    public final nj4 b;
    public final nj4 c;
    public final nj4 d;
    public final nj4 e;
    public final nj4 f;
    public final nj4 g;
    public final n83 h = new Object();
    public final ajb i = new ajb();
    public final jk0 j = jk0.z(Collections.emptyList());

    /* JADX WARNING: type inference failed for: r0v0, types: [n83, java.lang.Object] */
    public fa5(nj4 nj4, nj4 nj42, nj4 nj43, nj4 nj44, nj4 nj45, nj4 nj46, nj4 nj47) {
        this.a = nj4;
        this.b = nj42;
        this.c = nj43;
        this.d = nj44;
        this.e = nj45;
        this.f = nj46;
        this.g = nj47;
    }

    public final au9 a() {
        jk0 jk0 = this.j;
        jk0.getClass();
        return new au9(new it9(jk0, 0), new g95(24), 3);
    }

    public final void b(long j2) {
        udd.p("fa5", "loadFromMarker: marker=%d", new Object[]{Long.valueOf(j2)});
        aa5 aa5 = (aa5) this.g.get();
        aa5.getClass();
        yhd L = ((gy9) aa5.a).L(new dt(0, "FAVORITE_STICKERS", j2, 50, (String) null), aa5.c);
        lce lce = aa5.b;
        lce.getClass();
        f73 k = new w63(new mhd(L.j(new ice(lce, 1, 0)).h(new mb1(13, kt.class)).h(new g95(17)), new da5(this, 5), 2).h(new g95(25)), 2, new da5(this, 6)).k((qmc) this.d.get());
        pn1 pn1 = new pn1(new f00(j2, 22), 0, new f95(j2, 5));
        k.i(pn1);
        this.h.a(pn1);
    }

    public final void c() {
        udd.q("fa5", "reloadFavoritesFromServer: ");
        ((lqc) ((f03) this.e.get())).k("user.favoritesLastSync", 0L);
        aa5 aa5 = (aa5) this.g.get();
        aa5.getClass();
        udd.p("aa5", "assetsUpdate: request, sync=%d", new Object[]{0L});
        f73 k = new w63(aa5.e.a(p23.B(new una[]{una.TYPE_ASSETS_ADD, una.TYPE_ASSETS_REMOVE, una.TYPE_ASSETS_MOVE, una.TYPE_ASSETS_LIST_MODIFY})), 0, new y63(1, new l52(aa5))).k(aa5.c);
        pn1 pn1 = new pn1(new f00(), 0, new f95());
        k.i(pn1);
        aa5.g.a(pn1);
    }

    public final j73 d(List list) {
        udd.p("fa5", "removeFromFavorites: ids=%s", new Object[]{list});
        return new w63(new w63(((a95) this.a.get()).a(), 2, new d52(8, list)), 0, e(ek8.n(list))).f(new b95(3, list)).g(new d52(16, list));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [long[], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f73 e(long[] r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r1 = "fa5"
            java.lang.String r2 = "removeFromFavorites: stickerIds=%s"
            udd.p(r1, r2, r0)
            nj4 r3 = r3.g
            java.lang.Object r3 = r3.get()
            aa5 r3 = (defpackage.aa5) r3
            r3.getClass()
            u95 r0 = new u95
            r1 = 1
            r0.<init>(r3, r4, r1)
            jhd r4 = new jhd
            r1 = 0
            r4.<init>(r0, r1)
            mb1 r0 = new mb1
            java.lang.Class<tt> r1 = defpackage.tt.class
            r2 = 13
            r0.<init>(r2, r1)
            phd r4 = r4.h(r0)
            g95 r0 = new g95
            r1 = 18
            r0.<init>(r1)
            w63 r1 = new w63
            r2 = 2
            r1.<init>(r4, r2, r0)
            qmc r3 = r3.d
            f73 r3 = r1.k(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa5.e(long[]):f73");
    }

    public final void f(long j2) {
        udd.p("fa5", "setSectionUpdateTime: %d", new Object[]{Long.valueOf(j2)});
        ((lqc) ((f03) this.e.get())).k("user.favorites.stickers.updateTime", Long.valueOf(j2));
    }
}
