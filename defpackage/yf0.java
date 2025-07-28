package defpackage;

import java.util.List;

/* renamed from: yf0  reason: default package */
public final class yf0 implements pg7 {
    public final long a;
    public final List b;

    public yf0(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf0)) {
            return false;
        }
        yf0 yf0 = (yf0) obj;
        return this.a == yf0.a && hhd.f(this.b, yf0.b);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final int l() {
        return 0;
    }

    public final String toString() {
        return "BannerViewPagerListItem(itemId=" + this.a + ", items=" + this.b + ")";
    }
}
