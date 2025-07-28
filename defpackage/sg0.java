package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: sg0  reason: default package */
public abstract class sg0 extends gh0 {
    public final void f(g0 g0Var) {
        if (g0Var.h()) {
            e13 e13 = (e13) g0Var.e();
            try {
                g((e13 == null || !(e13.e0() instanceof CloseableStaticBitmap)) ? null : ((CloseableStaticBitmap) e13.e0()).getUnderlyingBitmap());
            } finally {
                e13.S(e13);
            }
        }
    }

    public abstract void g(Bitmap bitmap);
}
