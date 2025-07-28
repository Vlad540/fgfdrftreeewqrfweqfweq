package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: l95  reason: default package */
public final class l95 implements pp7 {
    public final t97 X;
    public final t97 Y;
    public final ajb Z = new ajb();
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final jk0 w0 = jk0.z(Collections.emptyList());
    public final n83 x0 = new Object();

    /* JADX WARNING: type inference failed for: r0v3, types: [n83, java.lang.Object] */
    public l95(t97 t97, t97 t972, t97 t973, r7e r7e, r7e r7e2, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.Y = t973;
        this.c = r7e;
        this.o = r7e2;
        this.X = t974;
    }

    public final void a() {
        udd.q("l95", "clear: ");
        w95 w95 = (w95) this.Y.getValue();
        w95.getClass();
        udd.q("w95", "cancelRequests: ");
        w95.f.clear();
        w95.g.d();
        this.x0.d();
        iu7.a0(new w63(b(), 2, new g95(5)).l(), z3d.j, new g95(6), new d74(2));
        this.w0.c(Collections.emptyList());
    }

    public final mv9 b() {
        t97 t97 = this.a;
        Objects.requireNonNull(t97);
        return new mv9(2, new m5(4, t97));
    }

    public final void c(long j) {
        udd.p("l95", "loadFromMarker: marker=%d", new Object[]{Long.valueOf(j)});
        w95 w95 = (w95) this.Y.getValue();
        w95.getClass();
        yhd L = ((gy9) w95.a).L(new dt(0, "FAVORITE_STICKER_SETS", j, 50, (String) null), w95.c);
        lce lce = w95.b;
        lce.getClass();
        f73 k = new w63(new mhd(L.j(new ice(lce, 1, 0)).h(new mb1(13, kt.class)).h(new g95(13)), new d95(this, 5), 2).h(new g95(7)), 2, new d95(this, 6)).k((qmc) this.o.getValue());
        pn1 pn1 = new pn1(new f00(j, 17), 0, new f95(j, 1));
        k.i(pn1);
        this.x0.a(pn1);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [long[], java.io.Serializable] */
    public final j73 d(long j, boolean z) {
        f73 f73;
        udd.p("l95", "markAsFavorite: setId=%d, favorite=%b", new Object[]{Long.valueOf(j), Boolean.valueOf(z)});
        w63 w63 = new w63(z ? new w63(new phd(b(), new g95(4), 0), 2, new d95(this, 4)) : c73.a, 0, new w63(b(), 2, new u85(1, j, z)));
        t97 t97 = this.Y;
        if (z) {
            w95 w95 = (w95) t97.getValue();
            w95.getClass();
            f73 = new w63(new jhd(new s95(w95, j, 0), 0).h(new mb1(13, ft.class)), 2, new g95(14)).k(w95.d);
        } else {
            w95 w952 = (w95) t97.getValue();
            w952.getClass();
            f73 = new w63(new jhd(new u95(w952, new long[]{j}, 0), 0).h(new mb1(13, tt.class)), 2, new g95(16)).k(w952.d);
        }
        return new w63(w63, 0, f73).f(new h95(0, j, z)).g(new u85(2, j, z));
    }

    public final void e(ArrayList arrayList) {
        List list;
        List<xtd> list2 = (List) this.w0.A();
        if (!ek8.J(list2)) {
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object next : list2) {
                    try {
                        if (arrayList.contains(Long.valueOf(((xtd) next).a))) {
                            arrayList2.add(next);
                        }
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                list = arrayList2;
            } else {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(list2.size());
                for (xtd xtd : list2) {
                    try {
                        arrayList3.add(Long.valueOf(xtd.a));
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
                this.Z.c(arrayList3);
            }
        }
    }

    public final void f() {
        udd.q("l95", "reloadFavoritesFromServer: ");
        ((lqc) ((ece) this.X.getValue()).a).k("user.favoritesLastSync", 0L);
        h(0);
    }

    public final void g(long j) {
        udd.p("l95", "setSectionUpdateTime: %d", new Object[]{Long.valueOf(j)});
        ((lqc) ((ece) this.X.getValue()).a).k("user.favorites.stickerSets.updateTime", Long.valueOf(j));
    }

    public final void h(long j) {
        w95 w95 = (w95) this.Y.getValue();
        w95.getClass();
        udd.p("w95", "assetsUpdate: request, sync=%d", new Object[]{Long.valueOf(j)});
        f73 k = new w63(w95.e.a(p23.B(new una[]{una.TYPE_ASSETS_ADD, una.TYPE_ASSETS_REMOVE, una.TYPE_ASSETS_MOVE, una.TYPE_ASSETS_LIST_MODIFY})), 0, new y63(1, new l52(w95, j, 2))).k(w95.c);
        pn1 pn1 = new pn1(new f00(j, 18), 0, new f95(j, 2));
        k.i(pn1);
        w95.g.a(pn1);
    }

    public final void i() {
        long j = ((lqc) ((ece) this.X.getValue()).a).g.getLong("user.favoritesLastSync", 0);
        udd.p("l95", "updateFavoritesFromServerFromLastSync: last sync =%d", new Object[]{Long.valueOf(j)});
        h(j);
    }
}
