package defpackage;

/* renamed from: yv4  reason: default package */
public final class yv4 implements jv6 {
    public final boolean a;

    public yv4(boolean z) {
        this.a = z;
    }

    public final ok9 b() {
        return null;
    }

    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return me4.l(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
