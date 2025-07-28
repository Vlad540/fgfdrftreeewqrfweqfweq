package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: ah4  reason: default package */
public final class ah4 {
    public final long a;

    public /* synthetic */ ah4(long j) {
        this.a = j;
    }

    public static final /* synthetic */ ah4 a(long j) {
        return new ah4(j);
    }

    public static long b(int i, float f) {
        return ((long) Float.floatToIntBits(f)) + (((long) i) << 32);
    }

    public static final float c(long j, Context context) {
        return d(j, context.getResources().getDisplayMetrics());
    }

    public static final float d(long j, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension((int) (j >> 32), e(j), displayMetrics);
    }

    public static final float e(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ah4)) {
            return false;
        }
        return this.a == ((ah4) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("Dimension(encodedValue="), this.a, ")");
    }
}
