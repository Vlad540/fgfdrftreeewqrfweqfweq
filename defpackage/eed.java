package defpackage;

import java.util.List;

/* renamed from: eed  reason: default package */
public final class eed extends oq2 {
    public final long a;
    public final mge b;
    public final mge c;
    public final List d;

    public eed(long j, mge mge, mge mge2, List list) {
        this.a = j;
        this.b = mge;
        this.c = mge2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eed)) {
            return false;
        }
        eed eed = (eed) obj;
        return this.a == eed.a && hhd.f(this.b, eed.b) && hhd.f(this.c, eed.c) && hhd.f(this.d, eed.d);
    }

    public final int hashCode() {
        int e = c3d.e(Long.hashCode(this.a) * 31, 31, this.b);
        mge mge = this.c;
        return this.d.hashCode() + ((e + (mge == null ? 0 : mge.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(chatId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
