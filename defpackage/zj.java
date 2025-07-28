package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.rlottie.RLottieDrawable;

/* renamed from: zj  reason: default package */
public final class zj extends Drawable implements Animatable {
    public static final lu7 D0 = new Object();
    public static final /* synthetic */ k77[] E0;
    public static final ThreadLocal F0 = ThreadLocal.withInitial(new tj(0));
    public static final t97 G0 = ez3.O(3, new m(6));
    public final r7e A0;
    public RLottieDrawable B0;
    public ContextScope C0;
    public final boolean X;
    public final zr7 Y;
    public final yj Z;
    public final int a;
    public final pj5 b;
    public final mi c;
    public final fi o;
    public final String w0;
    public final pf x0;
    public final t97 y0;
    public final Drawable z0;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, lu7] */
    static {
        k77 hc9 = new hc9(zj.class, "state", "getState()Lone/me/sdk/animoji/AnimojiStateDrawable$State;");
        m7c.a.getClass();
        E0 = new k77[]{hc9};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zj(Context context, int i, grd grd, mi miVar, fi fiVar) {
        this(context, i, grd, miVar, fiVar, true, MainDispatcherLoader.dispatcher);
        ha4 ha4 = oi4.a;
    }

    public final void a(Canvas canvas, float f, float f2, float f3, Paint paint) {
        Canvas canvas2;
        Drawable b2 = b();
        canvas.save();
        float f4 = f3 - f2;
        canvas.translate(f, f4 > ((float) b2.getBounds().height()) ? (f4 / ((float) 2)) - ((float) (b2.getBounds().height() / 2)) : f3 - ((float) b2.getBounds().height()));
        if (this.X && paint.getAlpha() != 255) {
            paint.setAlpha(255);
        }
        RLottieDrawable rLottieDrawable = this.B0;
        Class<zj> cls = zj.class;
        if (b2 == rLottieDrawable) {
            Picture picture = (Picture) F0.get();
            if (picture != null) {
                try {
                    canvas2 = picture.beginRecording(((RLottieDrawable) b2).getBounds().width(), ((RLottieDrawable) b2).getBounds().height());
                } catch (IllegalStateException unused) {
                    picture.endRecording();
                    RLottieDrawable rLottieDrawable2 = (RLottieDrawable) b2;
                    canvas2 = picture.beginRecording(rLottieDrawable2.getBounds().width(), rLottieDrawable2.getBounds().height());
                }
            } else {
                canvas2 = null;
            }
            try {
                ((RLottieDrawable) b2).draw(canvas2, paint);
            } catch (IllegalStateException e) {
                udd.s(cls.getName(), "fail to draw drawable", e);
                if (h0e.R(e.toString(), "Underflow in restore", false) && isRunning()) {
                    d();
                }
            }
            if (picture != null) {
                picture.endRecording();
            }
        } else {
            b2.setAlpha(paint.getAlpha());
            b2.draw(canvas);
        }
        canvas.restore();
        if (rLottieDrawable != null && b2 == rLottieDrawable) {
            Bitmap renderingBitmap = rLottieDrawable.getRenderingBitmap();
            if (renderingBitmap == null) {
                String name = cls.getName();
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.Z, name, rf0.h("Can't draw lottie because bitmap is null. Draw static, url:", rLottieDrawable.getCurrentUrl()), (Throwable) null);
                }
                r7e r7e = this.A0;
                (r7e.a() ? (Drawable) r7e.getValue() : this.z0).draw(canvas);
                d();
                return;
            }
            canvas.save();
            canvas.translate(f, f3 - ((float) rLottieDrawable.getBounds().height()));
            canvas.scale(((float) rLottieDrawable.getBounds().width()) / ((float) rLottieDrawable.getIntrinsicWidth()), ((float) rLottieDrawable.getBounds().height()) / ((float) rLottieDrawable.getIntrinsicHeight()));
            canvas.drawBitmap(renderingBitmap, 0.0f, 0.0f, paint);
            canvas.restore();
        }
    }

    public final Drawable b() {
        k77 k77 = E0[0];
        int ordinal = ((uj) this.Z.b).ordinal();
        Drawable drawable = this.z0;
        if (ordinal == 0) {
            return drawable;
        }
        if (ordinal == 1) {
            return (Drawable) this.A0.getValue();
        }
        if (ordinal == 2) {
            RLottieDrawable rLottieDrawable = this.B0;
            if (rLottieDrawable == null) {
                return drawable;
            }
            if (!(!rLottieDrawable.isLoadingFailed())) {
                rLottieDrawable = null;
            }
            return rLottieDrawable != null ? rLottieDrawable : drawable;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void c(String str) {
        gye gye = (gye) this.A0.getValue();
        gye.c((Uri) null, str);
        y66 y66 = gye.a.o;
        y66.getClass();
        y66.i(this.z0, 1);
        gye.invalidateSelf();
        gye.c = new ka(this, 1, gye);
        e(uj.b);
    }

    public final void d() {
        Drawable b2 = b();
        RLottieDrawable rLottieDrawable = this.B0;
        if (b2 != rLottieDrawable) {
            b().invalidateSelf();
        } else if (rLottieDrawable != null) {
            rLottieDrawable.invalidateInternal();
        }
    }

    public final void draw(Canvas canvas) {
        float height = (float) getBounds().height();
        D0.getClass();
        a(canvas, 0.0f, 0.0f, height, (Paint) G0.getValue());
    }

    public final void e(uj ujVar) {
        this.Z.o1(this, E0[0], ujVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj)) {
            return false;
        }
        return hhd.f(this.b, ((zj) obj).b);
    }

    public final int getIntrinsicHeight() {
        return b().getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return b().getIntrinsicWidth();
    }

    public final int getOpacity() {
        return b().getOpacity();
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + zj.class.hashCode();
    }

    public final void invalidateSelf() {
        d();
    }

    public final boolean isRunning() {
        Drawable b2 = b();
        RLottieDrawable rLottieDrawable = this.B0;
        return b2 == rLottieDrawable && rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    public final void setAlpha(int i) {
        b().setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        r7e r7e = this.A0;
        if (r7e.a()) {
            ((gye) r7e.getValue()).setBounds(i, i2, i3, i4);
        }
        this.z0.setBounds(i, i2, i3, i4);
        RLottieDrawable rLottieDrawable = this.B0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(i, i2, i3, i4);
        }
        super.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        b().setColorFilter(colorFilter);
    }

    public final void start() {
        udd.q(zj.class.getName(), "start");
        if (!n1g.A(this.C0)) {
            this.C0 = n1g.a(x87.c().plus(this.Y));
            ez3.N(new ck5(new ik5(this.b, 2), new xj(this, (Continuation) null), 5), this.C0);
        }
        Drawable drawable = this.z0;
        pf pfVar = this.x0;
        drawable.setCallback(pfVar);
        RLottieDrawable rLottieDrawable = this.B0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(pfVar);
        }
        r7e r7e = this.A0;
        if (r7e.a()) {
            ((gye) r7e.getValue()).setCallback(pfVar);
        }
        RLottieDrawable rLottieDrawable2 = this.B0;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.invalidateInternal();
        }
        Drawable b2 = b();
        RLottieDrawable rLottieDrawable3 = this.B0;
        if (b2 == rLottieDrawable3 && rLottieDrawable3 != null) {
            rLottieDrawable3.start();
        }
    }

    public final void stop() {
        udd.q(zj.class.getName(), "stop");
        n1g.c(this.C0, (CancellationException) null);
        this.z0.setCallback((Drawable.Callback) null);
        RLottieDrawable rLottieDrawable = this.B0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback((Drawable.Callback) null);
        }
        r7e r7e = this.A0;
        if (r7e.a()) {
            ((gye) r7e.getValue()).setCallback((Drawable.Callback) null);
        }
        RLottieDrawable rLottieDrawable2 = this.B0;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.stop();
        }
    }

    public zj(Context context, int i, pj5 pj5, mi miVar, fi fiVar, boolean z, zr7 zr7) {
        Drawable drawable;
        this.a = i;
        this.b = pj5;
        this.c = miVar;
        this.o = fiVar;
        this.X = z;
        this.Y = zr7;
        this.Z = new yj(this);
        this.w0 = zj.class.getName();
        this.x0 = new pf(1, this);
        t97 O = ez3.O(3, new c6(6, this));
        this.y0 = O;
        if (miVar instanceof ki) {
            drawable = ((ki) miVar).a;
        } else if (miVar instanceof li) {
            drawable = (dw4) O.getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.z0 = drawable;
        this.A0 = new r7e(new x2(context, 1, this));
        this.C0 = n1g.a(x87.c().plus(zr7));
        ez3.N(new ck5(new ik5(pj5, 2), new xj(this, (Continuation) null), 5), this.C0);
    }

    public final void setBounds(Rect rect) {
        r7e r7e = this.A0;
        if (r7e.a()) {
            ((gye) r7e.getValue()).setBounds(rect);
        }
        this.z0.setBounds(rect);
        RLottieDrawable rLottieDrawable = this.B0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(rect);
        }
        super.setBounds(b().getBounds());
    }
}
