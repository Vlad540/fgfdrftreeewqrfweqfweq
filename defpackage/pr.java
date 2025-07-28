package defpackage;

import java.util.List;

/* renamed from: pr  reason: default package */
public final class pr implements syc {
    public final syc a;
    public final int b = 1;

    public pr(syc syc) {
        this.a = syc;
    }

    public final String a() {
        return "kotlin.collections.ArrayList";
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        Integer G = o0e.G(str);
        if (G != null) {
            return G.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    public final d8 e() {
        return t0e.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr)) {
            return false;
        }
        pr prVar = (pr) obj;
        return hhd.f(this.a, prVar.a) && hhd.f(a(), prVar.a());
    }

    public final int f() {
        return this.b;
    }

    public final String g(int i) {
        return String.valueOf(i);
    }

    public final List getAnnotations() {
        return hw4.a;
    }

    public final List h(int i) {
        if (i >= 0) {
            return hw4.a;
        }
        StringBuilder m = me4.m(i, "Illegal index ", ", ");
        m.append(a());
        m.append(" expects only non-negative indices");
        throw new IllegalArgumentException(m.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    public final syc i(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder m = me4.m(i, "Illegal index ", ", ");
        m.append(a());
        m.append(" expects only non-negative indices");
        throw new IllegalArgumentException(m.toString().toString());
    }

    public final boolean isInline() {
        return false;
    }

    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder m = me4.m(i, "Illegal index ", ", ");
        m.append(a());
        m.append(" expects only non-negative indices");
        throw new IllegalArgumentException(m.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
