package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: l8d  reason: default package */
public final class l8d extends t81 {
    public static final l8d e;
    public static final l8d f;
    public static final l8d g;
    public static final l8d h;
    public static final l8d i = new l8d(new hge(taa.x), p23.B(new k8d[]{new k8d(saa.v, new hge(taa.d)), new k8d(saa.x, new hge(taa.f)), new k8d(saa.w, new hge(taa.e))}));
    public final mge b;
    public final List c;
    public final Bundle d = null;

    static {
        hge hge = new hge(taa.q);
        int i2 = taa.a;
        k8d k8d = new k8d(saa.s, new hge(i2));
        int i3 = taa.g;
        k8d k8d2 = new k8d(saa.u, new hge(i3));
        int i4 = taa.c;
        e = new l8d(hge, p23.B(new k8d[]{k8d, k8d2, new k8d(saa.t, new hge(i4))}));
        f = new l8d(new hge(taa.n), p23.B(new k8d[]{new k8d(saa.g, new hge(i2)), new k8d(saa.i, new hge(i3)), new k8d(saa.h, new hge(i4))}));
        g = new l8d(new hge(taa.j), p23.B(new k8d[]{new k8d(saa.a, new hge(i2)), new k8d(saa.c, new hge(i3)), new k8d(saa.b, new hge(i4))}));
        h = new l8d(new hge(taa.y), p23.B(new k8d[]{new k8d(saa.d, new hge(i2)), new k8d(saa.f, new hge(i3)), new k8d(saa.e, new hge(taa.b))}));
    }

    public l8d(hge hge, List list) {
        super(13);
        this.b = hge;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8d)) {
            return false;
        }
        l8d l8d = (l8d) obj;
        return hhd.f(this.b, l8d.b) && hhd.f(this.c, l8d.c) && hhd.f(this.d, l8d.d);
    }

    public final int hashCode() {
        int f2 = c3d.f(this.c, this.b.hashCode() * 31, 31);
        Bundle bundle = this.d;
        return f2 + (bundle == null ? 0 : bundle.hashCode());
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
