package defpackage;

import java.util.List;

/* renamed from: si9  reason: default package */
public final class si9 {
    public final String a;
    public final List b;

    public si9(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si9)) {
            return false;
        }
        si9 si9 = (si9) obj;
        return hhd.f(this.a, si9.a) && hhd.f(this.b, si9.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NeuroAvatarsPresetInfo(name=" + this.a + ", avatars=" + this.b + ")";
    }
}
