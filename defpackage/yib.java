package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: yib  reason: default package */
public final class yib implements Serializable {
    public final j22 a;
    public final List b;
    public final gn3 c;

    public yib(j22 j22, zy zyVar, gn3 gn3) {
        this.a = j22;
        this.b = zyVar;
        this.c = gn3;
    }

    public final String toString() {
        int p = ete.p(this.b);
        return "{chat=" + this.a + ", highlights=" + p + ", contactSearchResult=" + this.c + "}";
    }
}
