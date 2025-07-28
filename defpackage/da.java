package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: da  reason: default package */
public final class da implements du3 {
    public final du3 a;
    public final float b;

    public da(float f, du3 du3) {
        while (du3 instanceof da) {
            du3 = ((da) du3).a;
            f += ((da) du3).b;
        }
        this.a = du3;
        this.b = f;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return this.a.equals(daVar.a) && this.b == daVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
