package defpackage;

import java.util.List;

/* renamed from: qhe  reason: default package */
public final class qhe {
    public final phe a;
    public final ohe b;
    public final List c;

    public qhe(phe phe, ohe ohe, List list) {
        this.a = phe;
        this.b = ohe;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhe)) {
            return false;
        }
        qhe qhe = (qhe) obj;
        if (!hhd.f(this.a, qhe.a) || !hhd.f(this.b, qhe.b)) {
            return false;
        }
        qhe.getClass();
        return hhd.f((Object) null, (Object) null) && hhd.f(this.c, qhe.c);
    }

    public final int hashCode() {
        phe phe = this.a;
        int hashCode = (phe == null ? 0 : phe.a.hashCode()) * 31;
        ohe ohe = this.b;
        return this.c.hashCode() + ((((hashCode + (ohe == null ? 0 : ohe.hashCode())) * 31) + 0) * 31);
    }

    public final String toString() {
        return "ThemeBackgroundDrawModel(pattern=" + this.a + ", gradient=" + this.b + ", blur=" + null + ", colorEllipse=" + this.c + ")";
    }
}
