package defpackage;

import android.util.Range;

/* renamed from: n80  reason: default package */
public final class n80 {
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final Range g = new Range(0, Integer.MAX_VALUE);
    public final Range a;
    public final int b;
    public final int c;
    public final Range d;
    public final int e;

    static {
        s86 a2 = a();
        a2.X = 0;
        a2.h();
    }

    public n80(Range range, int i, int i2, Range range2, int i3) {
        this.a = range;
        this.b = i;
        this.c = i2;
        this.d = range2;
        this.e = i3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [s86, java.lang.Object] */
    public static s86 a() {
        ? obj = new Object();
        obj.b = -1;
        obj.c = -1;
        obj.X = -1;
        Range range = f;
        if (range != null) {
            obj.a = range;
            Range range2 = g;
            if (range2 != null) {
                obj.o = range2;
                return obj;
            }
            throw new NullPointerException("Null sampleRate");
        }
        throw new NullPointerException("Null bitrate");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n80)) {
            return false;
        }
        n80 n80 = (n80) obj;
        return this.a.equals(n80.a) && this.b == n80.b && this.c == n80.c && this.d.equals(n80.d) && this.e == n80.e;
    }

    public final int hashCode() {
        return this.e ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.a);
        sb.append(", sourceFormat=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channelCount=");
        return wn6.j(sb, this.e, "}");
    }
}
