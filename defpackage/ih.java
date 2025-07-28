package defpackage;

/* renamed from: ih  reason: default package */
public final class ih extends mh {
    public final float a;

    public ih(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih) && Float.compare(this.a, ((ih) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "FloatNumber(value=" + this.a + ")";
    }
}
