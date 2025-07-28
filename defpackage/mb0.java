package defpackage;

import android.util.Range;
import java.util.Arrays;

/* renamed from: mb0  reason: default package */
public final class mb0 {
    public static final Range e = new Range(0, Integer.MAX_VALUE);
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final v2b g;
    public final v2b a;
    public final Range b;
    public final Range c;
    public final int d;

    static {
        ma0 ma0 = ma0.f;
        g = v2b.j(Arrays.asList(new ma0[]{ma0, ma0.e, ma0.d}), new k90(ma0, 1));
    }

    public mb0(v2b v2b, Range range, Range range2, int i) {
        this.a = v2b;
        this.b = range;
        this.c = range2;
        this.d = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, lb0] */
    public static lb0 a() {
        ? obj = new Object();
        obj.b(g);
        Range range = e;
        if (range != null) {
            obj.b = range;
            Range range2 = f;
            if (range2 != null) {
                obj.c = range2;
                obj.d = -1;
                return obj;
            }
            throw new NullPointerException("Null bitrate");
        }
        throw new NullPointerException("Null frameRate");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mb0)) {
            return false;
        }
        mb0 mb0 = (mb0) obj;
        return this.a.equals(mb0.a) && this.b.equals(mb0.b) && this.c.equals(mb0.c) && this.d == mb0.d;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.a);
        sb.append(", frameRate=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", aspectRatio=");
        return wn6.j(sb, this.d, "}");
    }
}
