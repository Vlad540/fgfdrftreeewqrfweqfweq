package defpackage;

import android.graphics.BitmapFactory;
import android.net.Uri;

/* renamed from: sz3  reason: default package */
public final class sz3 implements wm0 {
    public static final p3e o = am7.v(new d93(1));
    public final rh7 a;
    public final nz3 b;
    public final BitmapFactory.Options c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sz3(android.content.Context r3) {
        /*
            r2 = this;
            p3e r0 = o
            java.lang.Object r0 = r0.get()
            rh7 r0 = (defpackage.rh7) r0
            defpackage.oyb.l(r0)
            f64 r1 = new f64
            r1.<init>(r3)
            r3 = 0
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz3.<init>(android.content.Context):void");
    }

    public final ch7 c(Uri uri) {
        return ((g69) this.a).a(new rz3(this, 1, uri));
    }

    public final ch7 n(byte[] bArr) {
        return ((g69) this.a).a(new rz3(this, 0, bArr));
    }

    public sz3(rh7 rh7, f64 f64, BitmapFactory.Options options) {
        this.a = rh7;
        this.b = f64;
        this.c = options;
    }
}
