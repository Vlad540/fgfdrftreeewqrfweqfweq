package defpackage;

/* renamed from: f3f  reason: default package */
public final class f3f {
    public final qjb a;
    public final float b;
    public final float c;
    public final boolean d;

    public f3f(l10 l10) {
        this.a = l10.a;
        this.b = l10.b;
        this.c = l10.c;
        this.d = l10.d;
    }

    public final l10 a() {
        l10 l10 = new l10(1);
        l10.a = this.a;
        l10.b = this.b;
        l10.c = this.c;
        l10.d = this.d;
        return l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f3f.class != obj.getClass()) {
            return false;
        }
        f3f f3f = (f3f) obj;
        if (Float.compare(f3f.b, this.b) == 0 && Float.compare(f3f.c, this.c) == 0 && this.d == f3f.d) {
            return this.a == f3f.a;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        qjb qjb = this.a;
        int hashCode = (qjb != null ? qjb.hashCode() : 0) * 31;
        float f = this.b;
        int floatToIntBits = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.c;
        if (f2 != 0.0f) {
            i = Float.floatToIntBits(f2);
        }
        return ((floatToIntBits + i) * 31) + (this.d ? 1 : 0);
    }

    public final String toString() {
        return "VideoConvertOptions{quality=" + this.a + ", startTrimPosition=" + this.b + ", endTrimPosition=" + this.c + ", mute=" + this.d + '}';
    }
}
