package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.animated.gif.GifImage;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: ye  reason: default package */
public final class ye implements iq6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ye(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [df, java.lang.Object] */
    public final b13 a(ax4 ax4, int i, tjb tjb, gq6 gq6) {
        ColorSpace colorSpace;
        b13 a2;
        switch (this.a) {
            case 0:
                AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
                if (animatedFactoryV2Impl.e == null) {
                    animatedFactoryV2Impl.e = new Object();
                }
                df dfVar = animatedFactoryV2Impl.e;
                Bitmap.Config config = gq6.b;
                dfVar.getClass();
                if (df.a != null) {
                    e13 o = e13.o(ax4.a);
                    o.getClass();
                    try {
                        jl8 jl8 = (jl8) o.e0();
                        z03 a3 = df.a(ax4.z0, gq6, jl8.r() != null ? GifImage.a(jl8.r(), gq6) : GifImage.b(jl8.n(), jl8.U(), gq6));
                        e13.S(o);
                        return a3;
                    } catch (Throwable th) {
                        e13.S(o);
                        throw th;
                    }
                } else {
                    throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
                }
            default:
                ax4.n0();
                lq6 lq6 = ax4.c;
                m84 m84 = (m84) this.b;
                m84.getClass();
                Boolean bool = Boolean.FALSE;
                if (bool.booleanValue()) {
                    gq6.getClass();
                    ax4.n0();
                    colorSpace = ax4.y0;
                } else {
                    gq6.getClass();
                    colorSpace = null;
                }
                if (lq6 == o84.a) {
                    e13 e = m84.c.e(ax4, gq6.a, i, colorSpace);
                    try {
                        e.getClass();
                        ax4.n0();
                        int i2 = ax4.o;
                        ax4.n0();
                        CloseableStaticBitmap of = CloseableStaticBitmap.of(e, tjb, i2, ax4.X);
                        of.putExtra(HasExtraData.KEY_IS_ROUNDED, bool);
                        return of;
                    } finally {
                        e13.S(e);
                    }
                } else {
                    if (lq6 == o84.c) {
                        ax4.n0();
                        if (ax4.Y != -1) {
                            ax4.n0();
                            if (ax4.Z != -1) {
                                gq6.getClass();
                                iq6 iq6 = m84.a;
                                a2 = iq6 != null ? iq6.a(ax4, i, tjb, gq6) : m84.b(ax4, gq6);
                            }
                        }
                        throw new DecodeException("image width or height is incorrect", ax4);
                    } else if (lq6 == o84.j) {
                        gq6.getClass();
                        iq6 iq62 = m84.b;
                        a2 = iq62 != null ? iq62.a(ax4, i, tjb, gq6) : m84.b(ax4, gq6);
                    } else if (lq6 == o84.m) {
                        return null;
                    } else {
                        if (lq6 != lq6.c) {
                            return m84.b(ax4, gq6);
                        }
                        throw new DecodeException("unknown image format", ax4);
                    }
                    return a2;
                }
        }
    }
}
