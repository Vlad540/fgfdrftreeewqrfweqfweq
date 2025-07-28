package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: a0  reason: default package */
public final class a0 implements du3 {
    public final float a;

    public a0(float f) {
        this.a = f;
    }

    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        return this.a == ((a0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
