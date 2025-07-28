package defpackage;

/* renamed from: qu1  reason: default package */
public final class qu1 {
    public final int a;

    public qu1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu1) && this.a == ((qu1) obj).a;
    }

    public final int hashCode() {
        return hr1.t(this.a);
    }

    public final String toString() {
        return "CameraParams(facing=" + rf0.r(this.a) + ")";
    }
}
