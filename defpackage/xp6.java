package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: xp6  reason: default package */
public final class xp6 extends OneMeDraweeView {
    public static final /* synthetic */ k77[] N0;
    public static final nv4 O0 = new nv4();
    public final wp6 G0 = new wp6((xp6) this, 1);
    public final wp6 H0 = new wp6((Object) tp6.m, (xp6) this);
    public s16 I0 = new fs5(12);
    public final wp6 J0 = new wp6((xp6) this, 0);
    public int K0;
    public int L0;
    public final t97 M0;

    static {
        Class<xp6> cls = xp6.class;
        N0 = new k77[]{new hc9(cls, "overlayDrawable", "getOverlayDrawable()Landroid/graphics/drawable/Drawable;"), c3d.g(m7c.a, cls, "imageAttach", "getImageAttach()Lone/me/messages/list/loader/model/ImageAttachConfig;"), new hc9(cls, "imageInfo", "getImageInfo()Lcom/facebook/imagepipeline/image/ImageInfo;")};
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [on4, android.view.View, xp6] */
    public xp6(Context context) {
        super(context);
        this.M0 = ez3.O(3, new cc3(context, 9));
        setId(a7a.M);
        r75 r75 = getHierarchy().e;
        r75.A0 = 0;
        if (r75.z0 == 1) {
            r75.z0 = 0;
        }
    }

    /* access modifiers changed from: private */
    public final void setup(tp6 tp6) {
        tr6 tr6;
        y66 hierarchy = getHierarchy();
        hierarchy.h(tp6.i);
        boolean z = tp6.j;
        hierarchy.k(z ? (Drawable) this.M0.getValue() : getOverlayDrawable());
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

    public final tp6 getImageAttach() {
        k77 k77 = N0[1];
        return (tp6) this.H0.b;
    }

    public final oq6 getImageInfo() {
        k77 k77 = N0[2];
        return (oq6) this.J0.b;
    }

    public final int getMeasuredLayoutHeight() {
        return this.K0;
    }

    public final int getMeasuredLayoutWidth() {
        return this.L0;
    }

    public final s16 getOnFinalImageSetCallback() {
        return this.I0;
    }

    public final Drawable getOverlayDrawable() {
        k77 k77 = N0[0];
        return (Drawable) this.G0.b;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.view.View, xp6] */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        int i3 = getImageAttach().c;
        int i4 = getImageAttach().d;
        if (i3 <= 0 || i4 <= 0) {
            i4 = size / 2;
            i3 = size;
        }
        int i5 = getImageAttach().f;
        int X = a24.X(((float) 120) * dh4.c().getDisplayMetrics().density);
        int min = Math.min(size, size);
        int i6 = min / 2;
        float f = (float) i4;
        float f2 = (float) i3;
        int i7 = (int) ((f / f2) * ((float) min));
        nv4 nv4 = O0;
        if (min >= i6 && i7 >= X && i7 <= i5) {
            urd.E(min, i7, i3, i4, nv4);
        } else if (i7 < X) {
            urd.E(min, X, i3, i4, nv4);
        } else {
            int i8 = (int) ((f2 / f) * ((float) i5));
            if (i8 < i6 || i5 < X) {
                urd.E(i6, i5, i3, i4, nv4);
            } else {
                urd.E(i8, i5, i3, i4, nv4);
            }
        }
        this.K0 = nv4.c;
        this.L0 = nv4.b;
        setMeasuredDimension(nv4.d, nv4.e);
    }

    public final void p(oq6 oq6, Animatable animatable) {
        if (getImageAttach().e && animatable != null) {
            animatable.start();
        }
        setImageInfo(oq6);
        this.I0.invoke();
    }

    public final void setImageAttach(tp6 tp6) {
        this.H0.o1(this, N0[1], tp6);
    }

    public final void setImageInfo(oq6 oq6) {
        this.J0.o1(this, N0[2], oq6);
    }

    public final void setOnFinalImageSetCallback(s16 s16) {
        this.I0 = s16;
    }

    public final void setOverlayDrawable(Drawable drawable) {
        this.G0.o1(this, N0[0], drawable);
    }
}
