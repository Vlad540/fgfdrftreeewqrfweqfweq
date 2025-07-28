package defpackage;

/* renamed from: sy6  reason: default package */
public final class sy6 {
    public static final sy6 c = new sy6(0, (up0) null, 3);
    public static final sy6 d = new sy6(3, new up0(3, 3, false));
    public final int a;
    public final up0 b;

    public sy6(int i, up0 up0) {
        this.a = i;
        this.b = up0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy6)) {
            return false;
        }
        sy6 sy6 = (sy6) obj;
        int i = sy6.a;
        int i2 = this.a;
        if (i2 != 0 ? i != 0 && i2 == i : i == 0) {
            return hhd.f(this.b, sy6.b);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = this.a;
        int t = (i2 == 0 ? 0 : hr1.t(i2)) * 31;
        up0 up0 = this.b;
        if (up0 != null) {
            i = up0.hashCode();
        }
        return t + i;
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i == 0) {
            str = "null";
        } else {
            str = "TopInsetConfig(persistentType=" + us8.p(i) + ")";
        }
        StringBuilder m = hr1.m("InsetsConfig(topConfig=", str, ", bottomConfig=");
        m.append(this.b);
        m.append(")");
        return m.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sy6(int i, up0 up0, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : up0);
    }
}
