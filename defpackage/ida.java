package defpackage;

/* renamed from: ida  reason: default package */
public final class ida {
    public final float a;
    public final int b;

    public ida(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ida)) {
            return false;
        }
        ida ida = (ida) obj;
        ida.getClass();
        return Float.compare(this.a, ida.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && this.b == ida.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + th2.e(th2.e(Integer.hashCode(-16745729) * 31, this.a, 31), 0.0f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndicatorConfig(color=-16745729, topCorners=");
        sb.append(this.a);
        sb.append(", bottomCorners=0.0, height=");
        return wn6.j(sb, this.b, ")");
    }
}
