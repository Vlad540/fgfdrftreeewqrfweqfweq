package defpackage;

/* renamed from: s53  reason: default package */
public final class s53 {
    public final r53 a;
    public final t53 b;
    public final u53 c;

    public s53(r53 r53, t53 t53, u53 u53) {
        this.a = r53;
        this.b = t53;
        this.c = u53;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s53)) {
            return false;
        }
        s53 s53 = (s53) obj;
        return hhd.f(this.a, s53.a) && hhd.f(this.b, s53.b) && hhd.f(this.c, s53.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CommonStatesColors(backgroundActive=" + this.a + ", iconDisabled=" + this.b + ", textDisabled=" + this.c + ")";
    }
}
