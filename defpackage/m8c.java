package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: m8c  reason: default package */
public final class m8c implements du3 {
    public final float a;

    public m8c(float f) {
        this.a = f;
    }

    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8c)) {
            return false;
        }
        return this.a == ((m8c) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
