package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: v5d  reason: default package */
public final class v5d extends t81 {
    public static final v5d f;
    public static final v5d g = new v5d(new hge(xaa.u), p23.B(new u5d[]{new u5d(new hge(xaa.s), vaa.n, false), new u5d(new hge(xaa.t), vaa.o, false)}), (mnc) null, (Bundle) null, 12);
    public static final v5d h;
    public static final v5d i;
    public static final v5d j;
    public static final v5d k = new v5d(new hge(xaa.r), p23.B(new u5d[]{new u5d(new hge(xaa.q), vaa.k, true), new u5d(new hge(xaa.p), vaa.j, false)}), (mnc) null, (Bundle) null, 12);
    public final mge b;
    public final List c;
    public final mnc d;
    public final Bundle e;

    static {
        hge hge = new hge(xaa.v);
        mnc mnc = mnc.SETTINGS_PRIVACY_SAFE_MODE_ONLINE;
        int i2 = cic.O;
        f = new v5d(hge, p23.B(new u5d[]{new u5d(new hge(i2), vaa.l, false), new u5d(new hge(cic.E1), vaa.m, false)}), mnc, (Bundle) null, 8);
        hge hge2 = new hge(xaa.o);
        mnc mnc2 = mnc.SETTINGS_PRIVACY_SAFE_MODE_CALLS;
        int i3 = cic.b;
        h = new v5d(hge2, p23.B(new u5d[]{new u5d(new hge(i3), vaa.h, false), new u5d(new hge(i2), vaa.i, false)}), mnc2, (Bundle) null, 8);
        i = new v5d(new hge(xaa.w), p23.B(new u5d[]{new u5d(new hge(i3), vaa.p, false), new u5d(new hge(i2), vaa.q, false)}), mnc.SETTINGS_PRIVACY_SAFE_MODE_SEARCH_BY_PHONE, (Bundle) null, 8);
        j = new v5d(new hge(xaa.n), p23.B(new u5d[]{new u5d(new hge(i3), vaa.f, false), new u5d(new hge(i2), vaa.g, false)}), mnc.SETTINGS_PRIVACY_SAFE_MODE_INVITE, (Bundle) null, 8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v5d(mge mge, List list, mnc mnc, Bundle bundle, int i2) {
        super(12);
        mnc = (i2 & 4) != 0 ? null : mnc;
        bundle = (i2 & 8) != 0 ? null : bundle;
        this.b = mge;
        this.c = list;
        this.d = mnc;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5d)) {
            return false;
        }
        v5d v5d = (v5d) obj;
        return hhd.f(this.b, v5d.b) && hhd.f(this.c, v5d.c) && this.d == v5d.d && hhd.f(this.e, v5d.e);
    }

    public final int hashCode() {
        int f2 = c3d.f(this.c, this.b.hashCode() * 31, 31);
        int i2 = 0;
        mnc mnc = this.d;
        int hashCode = (f2 + (mnc == null ? 0 : mnc.hashCode())) * 31;
        Bundle bundle = this.e;
        if (bundle != null) {
            i2 = bundle.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", statScreen=" + this.d + ", payload=" + this.e + ")";
    }
}
