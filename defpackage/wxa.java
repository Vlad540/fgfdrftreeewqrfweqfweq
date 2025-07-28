package defpackage;

import java.util.Locale;

/* renamed from: wxa  reason: default package */
public final class wxa {
    public static final wxa d = new wxa(1.0f);
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public final float a;
    public final float b;
    public final int c;

    static {
        int i = oze.a;
    }

    public wxa(float f2) {
        this(f2, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wxa.class != obj.getClass()) {
            return false;
        }
        wxa wxa = (wxa) obj;
        return this.a == wxa.a && this.b == wxa.b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = oze.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public wxa(float f2, float f3) {
        boolean z = false;
        oyb.d(f2 > 0.0f);
        oyb.d(f3 > 0.0f ? true : z);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }
}
