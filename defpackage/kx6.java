package defpackage;

/* renamed from: kx6  reason: default package */
public final class kx6 extends sg9 {
    public final z7c b;

    public kx6(z7c z7c) {
        super(jue.a);
        this.b = z7c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kx6) && hhd.f(this.b, ((kx6) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NeuroAvatarScreen(registrationData=" + this.b + ")";
    }
}
