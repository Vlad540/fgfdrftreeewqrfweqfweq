package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: d6a  reason: default package */
public final class d6a {
    public final Collection a;
    public final t97 b;
    public final s16 c;
    public final s16 d;

    public d6a(List list, t97 t97, jq2 jq2, jq2 jq22) {
        this.a = list;
        this.b = t97;
        this.c = jq2;
        this.d = jq22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6a)) {
            return false;
        }
        d6a d6a = (d6a) obj;
        return hhd.f(this.a, d6a.a) && hhd.f(this.b, d6a.b) && hhd.f(this.c, d6a.c) && hhd.f(this.d, d6a.d);
    }

    public final int hashCode() {
        int f = th2.f(th2.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, true), 31, false);
        return this.d.hashCode() + ((this.c.hashCode() + f) * 31);
    }

    public final String toString() {
        return "Config(targets=" + this.a + ", fileSystem=" + this.b + ", isBuildObfuscated=true, isBuildDebugOrBeta=false, debugModeProvider=" + this.c + ", dispatcherProvider=" + this.d + ")";
    }
}
