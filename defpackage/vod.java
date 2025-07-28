package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: vod  reason: default package */
public final class vod extends ayb {
    public static final String d = Integer.toString(1, 36);
    public static final String e = Integer.toString(2, 36);
    public final int b;
    public final float c;

    static {
        int i = oze.a;
    }

    public vod(int i) {
        oyb.c("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }

    public final boolean b() {
        return this.c != -1.0f;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(ayb.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.vod) r4;
        r0 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.vod
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            vod r4 = (defpackage.vod) r4
            int r0 = r4.b
            int r2 = r3.b
            if (r2 != r0) goto L_0x0017
            float r3 = r3.c
            float r4 = r4.c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0017
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vod.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Float.valueOf(this.c)});
    }

    public vod(int i, float f) {
        boolean z = false;
        oyb.c("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= ((float) i)) {
            z = true;
        }
        oyb.c("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }
}
