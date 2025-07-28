package defpackage;

import java.util.Locale;

/* renamed from: vxa  reason: default package */
public final class vxa implements lt0 {
    public static final vxa o = new vxa(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    public vxa(float f, float f2) {
        boolean z = false;
        swb.e(f > 0.0f);
        swb.e(f2 > 0.0f ? true : z);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vxa.class != obj.getClass()) {
            return false;
        }
        vxa vxa = (vxa) obj;
        return this.a == vxa.a && this.b == vxa.b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = mze.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
