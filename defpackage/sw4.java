package defpackage;

/* renamed from: sw4  reason: default package */
public final class sw4 implements uw4 {
    public final ktd a;

    public sw4(ktd ktd) {
        this.a = ktd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw4) && hhd.f(this.a, ((sw4) obj).a);
    }

    public final int hashCode() {
        ktd ktd = this.a;
        if (ktd == null) {
            return 0;
        }
        return ktd.hashCode();
    }

    public final String toString() {
        return "EmptyDialog(sticker=" + this.a + ")";
    }
}
