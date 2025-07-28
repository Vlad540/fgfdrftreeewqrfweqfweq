package defpackage;

import java.util.List;

/* renamed from: wmf  reason: default package */
public final class wmf {
    public final String a;
    public final List b;

    public wmf(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmf)) {
            return false;
        }
        wmf wmf = (wmf) obj;
        return hhd.f(this.a, wmf.a) && hhd.f(this.b, wmf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSettingsState(title=" + this.a + ", sections=" + this.b + ")";
    }
}
