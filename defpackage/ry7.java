package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: ry7  reason: default package */
public final class ry7 extends OneMeDraweeView {
    public static final /* synthetic */ k77[] O0;
    public final qy7 G0 = new qy7(this, 0);
    public final t97 H0;
    public int I0;
    public final qy7 J0;
    public final qy7 K0;
    public s16 L0;
    public boolean M0;
    public boolean N0;

    static {
        Class<ry7> cls = ry7.class;
        O0 = new k77[]{new hc9(cls, "imageInfo", "getImageInfo()Lcom/facebook/imagepipeline/image/ImageInfo;"), c3d.g(m7c.a, cls, "imageAttach", "getImageAttach()Lone/me/messages/list/loader/model/ImageAttachConfig;"), new hc9(cls, "overlayDrawable", "getOverlayDrawable()Landroid/graphics/drawable/Drawable;")};
    }

    public ry7(Context context) {
        super(context);
        this.H0 = ez3.O(3, new cc3(context, 14));
        this.J0 = new qy7((Object) tp6.m, this);
        this.K0 = new qy7(this, 2);
        this.L0 = new ib7(12);
        r75 r75 = getHierarchy().e;
        r75.A0 = 0;
        if (r75.z0 == 1) {
            r75.z0 = 0;
        }
    }

    private final sxa getDownloadDrawable() {
        return (sxa) this.H0.getValue();
    }

    private final oq6 getImageInfo() {
        k77 k77 = O0[0];
        return (oq6) this.G0.b;
    }

    private final void setImageInfo(oq6 oq6) {
        this.G0.o1(this, O0[0], oq6);
    }

    /* access modifiers changed from: private */
    public final void setup(tp6 tp6) {
        tr6 tr6;
        y66 hierarchy = getHierarchy();
        hierarchy.h(tp6.i);
        boolean z = tp6.j;
        hierarchy.k(z ? getDownloadDrawable() : getOverlayDrawable());
        tr6 tr62 = null;
        hbc hbc = tp6.h;
        if (z) {
            tr6 = null;
        } else {
            ur6 d = ur6.d(tp6.b);
            d.d = hbc;
            tr6 = d.a();
        }
        Uri uri = tp6.g;
        if (uri != null) {
            ur6 d2 = ur6.d(uri);
            d2.d = hbc;
            tr62 = d2.a();
        }
        o(tr6, tr62);
    }

    public final int getBlurOffset() {
        return Math.abs(this.I0);
    }

    public final boolean getIgnoreCropCriteria() {
        return this.N0;
    }

    public final tp6 getImageAttach() {
        k77 k77 = O0[1];
        return (tp6) this.J0.b;
    }

    public final s16 getOnFinalImageSetCallback() {
        return this.L0;
    }

    public final Drawable getOverlayDrawable() {
        k77 k77 = O0[2];
        return (Drawable) this.K0.b;
    }

    public final boolean getUseMaxDimensionsOnMeasure() {
        return this.M0;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [ry7, android.view.View] */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        float f = ((float) getImageAttach().c) / ((float) getImageAttach().d);
        this.I0 = 0;
        float f2 = 1.0f;
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i3 == 0) {
            if (this.M0 || getImageAttach().c > 291) {
                setMeasuredDimension(size, size);
            } else if (getImageAttach().c > 140) {
                float f3 = (float) 256;
                setMeasuredDimension(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
            } else {
                float f4 = (float) 140;
                setMeasuredDimension(a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f4 * dh4.c().getDisplayMetrics().density));
            }
        } else if (i3 < 0) {
            if (f < 0.42857143f) {
                int X = a24.X(((float) 165) * dh4.c().getDisplayMetrics().density);
                float f5 = (float) 384;
                int X2 = (int) (((float) a24.X(dh4.c().getDisplayMetrics().density * f5)) * f);
                if (this.N0 || ((float) (X - X2)) > ((float) X) * 0.25f) {
                    this.I0 = (X - X2) / 2;
                    setMeasuredDimension(X2, a24.X(f5 * dh4.c().getDisplayMetrics().density));
                    return;
                }
                setMeasuredDimension(X, a24.X(f5 * dh4.c().getDisplayMetrics().density));
            } else if (this.M0 || getImageAttach().c > 291) {
                float f6 = (float) 384;
                int X3 = (int) (((float) a24.X(dh4.c().getDisplayMetrics().density * f6)) * f);
                if (X3 > size) {
                    f2 = ((float) size) / ((float) X3);
                }
                setMeasuredDimension((int) (((float) X3) * f2), (int) (f2 * ((float) a24.X(f6 * dh4.c().getDisplayMetrics().density))));
            } else if (getImageAttach().c > 120) {
                float f7 = (float) 345;
                int X4 = (int) (((float) a24.X(dh4.c().getDisplayMetrics().density * f7)) * f);
                if (X4 > size) {
                    f2 = ((float) size) / ((float) X4);
                }
                setMeasuredDimension((int) (((float) X4) * f2), (int) (f2 * ((float) a24.X(f7 * dh4.c().getDisplayMetrics().density))));
            } else {
                float f8 = (float) 280;
                setMeasuredDimension((int) (((float) a24.X(dh4.c().getDisplayMetrics().density * f8)) * f), a24.X(f8 * dh4.c().getDisplayMetrics().density));
            }
        } else if (f <= 1.0f) {
        } else {
            if (f > 2.3333333f) {
                int X5 = a24.X(((float) 72) * dh4.c().getDisplayMetrics().density);
                int i4 = (int) (((float) size) / f);
                int i5 = X5 - i4;
                if (((float) i5) > ((float) X5) * 0.25f) {
                    this.I0 = (i5 * -1) / 2;
                    setMeasuredDimension(size, i4);
                    return;
                }
                setMeasuredDimension(size, X5);
            } else if (this.M0 || getImageAttach().c > 291) {
                setMeasuredDimension(size, (int) (((float) size) / f));
            } else if (getImageAttach().c > 212) {
                float f9 = (float) 256;
                setMeasuredDimension(a24.X(dh4.c().getDisplayMetrics().density * f9), (int) (((float) a24.X(f9 * dh4.c().getDisplayMetrics().density)) / f));
            } else {
                float f10 = (float) 212;
                setMeasuredDimension(a24.X(dh4.c().getDisplayMetrics().density * f10), (int) (((float) a24.X(f10 * dh4.c().getDisplayMetrics().density)) / f));
            }
        }
    }

    public final void p(oq6 oq6, Animatable animatable) {
        if (getImageAttach().e && animatable != null) {
            animatable.start();
        }
        setImageInfo(oq6);
        this.L0.invoke();
    }

    public final boolean r() {
        return this.I0 < 0;
    }

    public final void setIgnoreCropCriteria(boolean z) {
        this.N0 = z;
    }

    public final void setImageAttach(tp6 tp6) {
        this.J0.o1(this, O0[1], tp6);
    }

    public final void setOnFinalImageSetCallback(s16 s16) {
        this.L0 = s16;
    }

    public final void setOverlayDrawable(Drawable drawable) {
        this.K0.o1(this, O0[2], drawable);
    }

    public final void setUseMaxDimensionsOnMeasure(boolean z) {
        this.M0 = z;
    }
}
