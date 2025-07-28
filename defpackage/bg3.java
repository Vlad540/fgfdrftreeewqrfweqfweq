package defpackage;

import java.util.List;

/* renamed from: bg3  reason: default package */
public final class bg3 {
    public final long a;
    public final List b;

    public bg3(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg3)) {
            return false;
        }
        bg3 bg3 = (bg3) obj;
        return this.a == bg3.a && hhd.f(this.b, bg3.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ContactAvatarModel(id=" + this.a + ", urls=" + this.b + ")";
    }
}
