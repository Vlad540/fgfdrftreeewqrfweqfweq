package defpackage;

import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: be1  reason: default package */
public final class be1 {
    public static final be1 g;
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final CharSequence e;
    public final boolean f;

    static {
        hw4 hw4 = hw4.a;
        g = new be1(hw4, hw4, hw4, true, BuildConfig.FLAVOR, false);
    }

    public be1(List list, List list2, List list3, boolean z, CharSequence charSequence, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
        this.e = charSequence;
        this.f = z2;
    }

    public static be1 a(be1 be1, List list, lg7 lg7, List list2, boolean z, CharSequence charSequence, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = be1.a;
        }
        List list3 = list;
        List list4 = lg7;
        if ((i & 2) != 0) {
            list4 = be1.b;
        }
        List list5 = list4;
        if ((i & 4) != 0) {
            list2 = be1.c;
        }
        List list6 = list2;
        if ((i & 8) != 0) {
            z = be1.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            charSequence = be1.e;
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 32) != 0) {
            z2 = be1.f;
        }
        be1.getClass();
        return new be1(list3, list5, list6, z3, charSequence2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be1)) {
            return false;
        }
        be1 be1 = (be1) obj;
        return hhd.f(this.a, be1.a) && hhd.f(this.b, be1.b) && hhd.f(this.c, be1.c) && this.d == be1.d && hhd.f(this.e, be1.e) && this.f == be1.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + me4.f(this.e, th2.f(c3d.f(this.c, c3d.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }

    public final String toString() {
        return "CallOpponentsState(opponents=" + this.a + ", buttons=" + this.b + ", contextMenuButtons=" + this.c + ", isMoreButtonEnabled=" + this.d + ", title=" + this.e + ", canOpenSettings=" + this.f + ")";
    }
}
