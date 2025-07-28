package defpackage;

import java.util.Arrays;

/* renamed from: jma  reason: default package */
public final class jma extends zxb {
    public final float b;

    public jma() {
        this.b = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jma)) {
            return false;
        }
        return this.b == ((jma) obj).b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b)});
    }

    public jma(float f) {
        swb.d("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }
}
