package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: y91  reason: default package */
public final class y91 {
    public final mc0 a;
    public final hy7 b;
    public final hy7 c;
    public final boolean d;
    public final mge e;
    public final List f;
    public final mge g;

    public y91(mc0 mc0, hy7 hy7, hy7 hy72, boolean z, mge mge, List list, mge mge2) {
        this.a = mc0;
        this.b = hy7;
        this.c = hy72;
        this.d = z;
        this.e = mge;
        this.f = list;
        this.g = mge2;
    }

    public static y91 a(y91 y91, mc0 mc0, hy7 hy7, hy7 hy72, boolean z, mge mge, ArrayList arrayList, mge mge2, int i) {
        y91 y912 = y91;
        mc0 mc02 = (i & 1) != 0 ? y912.a : mc0;
        hy7 hy73 = (i & 2) != 0 ? y912.b : hy7;
        hy7 hy74 = (i & 4) != 0 ? y912.c : hy72;
        boolean z2 = (i & 8) != 0 ? y912.d : z;
        mge mge3 = (i & 16) != 0 ? y912.e : mge;
        List list = (i & 32) != 0 ? y912.f : arrayList;
        mge mge4 = (i & 64) != 0 ? y912.g : mge2;
        y91.getClass();
        return new y91(mc02, hy73, hy74, z2, mge3, list, mge4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y91)) {
            return false;
        }
        y91 y91 = (y91) obj;
        return hhd.f(this.a, y91.a) && this.b == y91.b && this.c == y91.c && this.d == y91.d && hhd.f(this.e, y91.e) && hhd.f(this.f, y91.f) && hhd.f(this.g, y91.g);
    }

    public final int hashCode() {
        int i = 0;
        mc0 mc0 = this.a;
        int e2 = c3d.e(th2.f((this.c.hashCode() + ((this.b.hashCode() + ((mc0 == null ? 0 : mc0.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        int hashCode = (e2 + (list == null ? 0 : list.hashCode())) * 31;
        mge mge = this.g;
        if (mge != null) {
            i = mge.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UserPreviewState(avatar=" + this.a + ", microphoneState=" + this.b + ", videoState=" + this.c + ", isFrontCamera=" + this.d + ", title=" + this.e + ", avatarInfo=" + this.f + ", participantsTitle=" + this.g + ")";
    }
}
