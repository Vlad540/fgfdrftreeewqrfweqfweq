package defpackage;

import java.util.List;

/* renamed from: h97  reason: default package */
public final class h97 {
    public final String a;
    public final List b;

    public h97(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h97)) {
            return false;
        }
        h97 h97 = (h97) obj;
        return hhd.f(this.a, h97.a) && hhd.f(this.b, h97.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "LastInputText(text=" + this.a + ", messageElementsData=" + this.b + ")";
    }
}
