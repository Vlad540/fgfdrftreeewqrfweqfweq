package defpackage;

/* renamed from: d56  reason: default package */
public final class d56 implements e56 {
    public final float a;

    public d56(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d56) && Float.compare(this.a, ((d56) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "UpdateCameraTranslation(translationY=" + this.a + ")";
    }
}
