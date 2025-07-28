package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: pw1  reason: default package */
public final class pw1 {
    public static final z80 i = new z80(Integer.TYPE, (Object) null, "camerax.core.captureConfig.rotation");
    public static final z80 j = new z80(Integer.class, (Object) null, "camerax.core.captureConfig.jpegQuality");
    public static final z80 k = new z80(Range.class, (Object) null, "camerax.core.captureConfig.resolvedFrameRate");
    public final List a;
    public final ia3 b;
    public final int c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final s9e g;
    public final ws1 h;

    public pw1(ArrayList arrayList, hga hga, int i2, boolean z, ArrayList arrayList2, boolean z2, s9e s9e, ws1 ws1) {
        this.a = arrayList;
        this.b = hga;
        this.c = i2;
        this.e = Collections.unmodifiableList(arrayList2);
        this.f = z2;
        this.g = s9e;
        this.h = ws1;
        this.d = z;
    }

    public final int a() {
        Object obj = this.g.a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int b() {
        Integer num = (Integer) this.b.d(pye.t0, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Integer num = (Integer) this.b.d(pye.u0, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
