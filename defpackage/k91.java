package defpackage;

/* renamed from: k91  reason: default package */
public final class k91 extends r91 {
    public final mc0 a;

    public k91(mc0 mc0) {
        this.a = mc0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k91) && hhd.f(this.a, ((k91) obj).a);
    }

    public final int hashCode() {
        mc0 mc0 = this.a;
        if (mc0 == null) {
            return 0;
        }
        return mc0.hashCode();
    }

    public final String toString() {
        return "Avatar(avatarInfo=" + this.a + ")";
    }
}
