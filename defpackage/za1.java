package defpackage;

import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: za1  reason: default package */
public final class za1 {
    public static final za1 j = new za1((String) null, (ub0) null, (CharSequence) null, new wa1(new lge(BuildConfig.FLAVOR)), new hge(j1a.k), new hge(j1a.f), p23.B(qa1.a, ra1.a, sa1.a), ta1.a, true);
    public final String a;
    public final ub0 b;
    public final CharSequence c;
    public final ya1 d;
    public final mge e;
    public final mge f;
    public final List g;
    public final ua1 h;
    public final boolean i;

    public za1(String str, ub0 ub0, CharSequence charSequence, ya1 ya1, mge mge, mge mge2, List list, ua1 ua1, boolean z) {
        this.a = str;
        this.b = ub0;
        this.c = charSequence;
        this.d = ya1;
        this.e = mge;
        this.f = mge2;
        this.g = list;
        this.h = ua1;
        this.i = z;
    }

    public static za1 a(za1 za1, ub0 ub0, String str, ya1 ya1, mge mge, boolean z, int i2) {
        za1 za12 = za1;
        int i3 = i2;
        String str2 = za12.a;
        ub0 ub02 = (i3 & 2) != 0 ? za12.b : ub0;
        mge mge2 = (i3 & 16) != 0 ? za12.e : mge;
        mge mge3 = za12.f;
        List list = za12.g;
        ua1 ua1 = za12.h;
        boolean z2 = (i3 & 256) != 0 ? za12.i : z;
        za1.getClass();
        return new za1(str2, ub02, str, ya1, mge2, mge3, list, ua1, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za1)) {
            return false;
        }
        za1 za1 = (za1) obj;
        return hhd.f(this.a, za1.a) && hhd.f(this.b, za1.b) && hhd.f(this.c, za1.c) && hhd.f(this.d, za1.d) && hhd.f(this.e, za1.e) && hhd.f(this.f, za1.f) && hhd.f(this.g, za1.g) && hhd.f(this.h, za1.h) && this.i == za1.i;
    }

    public final int hashCode() {
        int i2 = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ub0 ub0 = this.b;
        int hashCode2 = (hashCode + (ub0 == null ? 0 : ub0.hashCode())) * 31;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            i2 = charSequence.hashCode();
        }
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + c3d.f(this.g, c3d.e(c3d.e((this.d.hashCode() + ((hashCode2 + i2) * 31)) * 31, 31, this.e), 31, this.f), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallLinkInfo(icon=");
        sb.append(this.a);
        sb.append(", avatarAbbreviationModel=");
        sb.append(this.b);
        sb.append(", callLink=");
        sb.append(this.c);
        sb.append(", linkInfo=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", action=");
        sb.append(this.g);
        sb.append(", button=");
        sb.append(this.h);
        sb.append(", isNew=");
        return hr1.j(sb, this.i, ")");
    }
}
