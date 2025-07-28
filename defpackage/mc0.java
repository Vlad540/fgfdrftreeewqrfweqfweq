package defpackage;

/* renamed from: mc0  reason: default package */
public final class mc0 {
    public final ub0 a;
    public final String b;

    public mc0(ub0 ub0, String str) {
        this.a = ub0;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc0)) {
            return false;
        }
        mc0 mc0 = (mc0) obj;
        return hhd.f(this.a, mc0.a) && hhd.f(this.b, mc0.b);
    }

    public final int hashCode() {
        int i = 0;
        ub0 ub0 = this.a;
        int hashCode = (ub0 == null ? 0 : ub0.hashCode()) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AvatarInfo(abbreviationModel=" + this.a + ", url=" + this.b + ")";
    }
}
