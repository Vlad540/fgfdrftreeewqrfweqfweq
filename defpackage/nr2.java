package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* renamed from: nr2  reason: default package */
public final class nr2 implements or2 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Map e;
    public final u16 f;
    public final Comparator g;

    public nr2(Set set, Set set2, Set set3, Set set4, Map map) {
        hd1 hd1 = lk9.c;
        yz yzVar = t52.I;
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = map;
        this.f = hd1;
        this.g = yzVar;
    }

    public final Comparator a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr2)) {
            return false;
        }
        nr2 nr2 = (nr2) obj;
        return hhd.f(this.a, nr2.a) && hhd.f(this.b, nr2.b) && hhd.f(this.c, nr2.c) && hhd.f(this.d, nr2.d) && hhd.f(this.e, nr2.e) && hhd.f(this.f, nr2.f) && hhd.f(this.g, nr2.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Filter(includedChats=" + this.a + ", includedFilters=" + this.b + ", excludedChats=" + this.c + ", excludedFilters=" + this.d + ", subjects=" + this.e + ", filterPredicate=" + this.f + ", comparator=" + this.g + ")";
    }
}
