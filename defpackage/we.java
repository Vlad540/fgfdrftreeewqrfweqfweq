package defpackage;

import android.graphics.Bitmap;
import com.facebook.animated.gif.GifImage;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* renamed from: we  reason: default package */
public final /* synthetic */ class we implements iq6 {
    public final /* synthetic */ AnimatedFactoryV2Impl a;

    public /* synthetic */ we(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        this.a = animatedFactoryV2Impl;
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [df, java.lang.Object] */
    public final b13 a(ax4 ax4, int i, tjb tjb, gq6 gq6) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = this.a;
        if (animatedFactoryV2Impl.e == null) {
            animatedFactoryV2Impl.e = new Object();
        }
        df dfVar = animatedFactoryV2Impl.e;
        Bitmap.Config config = gq6.b;
        dfVar.getClass();
        if (df.b != null) {
            e13 o = e13.o(ax4.a);
            o.getClass();
            try {
                jl8 jl8 = (jl8) o.e0();
                z03 a2 = df.a(ax4.z0, gq6, jl8.r() != null ? GifImage.a(jl8.r(), gq6) : GifImage.b(jl8.n(), jl8.U(), gq6));
                e13.S(o);
                return a2;
            } catch (Throwable th) {
                e13.S(o);
                throw th;
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }
}
