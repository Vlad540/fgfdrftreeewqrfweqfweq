package defpackage;

import android.graphics.Bitmap;

/* renamed from: c6f  reason: default package */
public final /* synthetic */ class c6f implements s16 {
    public final /* synthetic */ h6f a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c6f(h6f h6f, Bitmap bitmap, boolean z) {
        this.a = h6f;
        this.b = bitmap;
        this.c = z;
    }

    public final Object invoke() {
        h6f h6f = this.a;
        Bitmap bitmap = this.b;
        boolean z = this.c;
        s6f s6f = h6f.y0;
        if (s6f != null) {
            String str = s6f.p;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                String B = bitmap != null ? fja.B(bitmap) : null;
                fn6.d(tn7, str, "setStencilBitmap, " + B + ", recycle_after_consume=" + z, (Throwable) null);
            }
            msd msd = s6f.q;
            if (msd == null) {
                msd = new msd(s6f.o);
                s6f.q = msd;
            }
            String str2 = msd.d;
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                tn7 tn72 = tn7.X;
                String B2 = bitmap != null ? fja.B(bitmap) : null;
                fn62.d(tn72, str2, "setBitmap, " + B2 + ", recycle_after_consume=" + z, (Throwable) null);
            }
            if (bitmap != null) {
                msd.e.setStencilBitmap(bitmap, z);
            }
            return jue.a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
