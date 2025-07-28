package defpackage;

import java.util.List;

/* renamed from: dp0  reason: default package */
public final class dp0 extends lbe {
    public final List c;
    public final uj3 o;

    public dp0(List list, uj3 uj3) {
        this.c = list;
        this.o = uj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp0)) {
            return false;
        }
        dp0 dp0 = (dp0) obj;
        return hhd.f(this.c, dp0.c) && hhd.f(this.o, dp0.o);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        uj3 uj3 = this.o;
        return hashCode + (uj3 == null ? 0 : uj3.hashCode());
    }

    public final String toString() {
        return "Response(botCommands=" + this.c + ", contact=" + this.o + ")";
    }
}
