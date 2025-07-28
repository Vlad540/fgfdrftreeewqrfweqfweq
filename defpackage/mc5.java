package defpackage;

/* renamed from: mc5  reason: default package */
public final class mc5 implements oc5 {
    public final float a;

    public mc5(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc5) && Float.compare(this.a, ((mc5) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Downloading(progress=" + this.a + ")";
    }
}
