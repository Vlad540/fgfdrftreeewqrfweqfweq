package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: sc0  reason: default package */
public abstract class sc0 extends View {
    public boolean A0;
    public boolean B0;
    public mn4 a;
    public Drawable b;
    public lc0 c;
    public w6a o;
    public t52 w0;
    public pc0 x0;
    public i03 y0;
    public o2b z0;

    static {
        Math.round(Resources.getSystem().getDisplayMetrics().density * 40.0f);
    }

    public final void a(tf3 tf3, boolean z) {
        Drawable drawable;
        tr6 tr6;
        this.A0 = z;
        int i = this.z0.b(tf3.n()).a;
        int i2 = (i == 10 || i == 20 || i == 40) ? ((TamAvatarView) this).B0 ? zhc.y0 : zhc.x0 : 0;
        if (i2 == 0) {
            drawable = null;
        } else {
            drawable = gq3.b(getContext(), i2);
            if (i == 40) {
                c(drawable);
            }
        }
        this.b = drawable;
        lc0 lc0 = new lc0(this.o, this.w0, this.x0, tf3);
        this.c = lc0;
        mn4 mn4 = this.a;
        if (mn4 != null) {
            y66 y66 = mn4.o;
            y66.getClass();
            y66.i(lc0.c(getContext()), 1);
        }
        i03 i03 = this.y0;
        mn4 mn42 = this.a;
        Uri b2 = this.c.b(i03.p());
        rr6 rr6 = rr6.a;
        if (b2 == null || r1g.p(b2.getPath())) {
            tr6 = null;
        } else {
            ur6 d = ur6.d(b2);
            d.g = rr6;
            d.l = getPostprocessor();
            tr6 = d.a();
            a06.u().f(tr6, (m18) null);
        }
        ywa a2 = a06.a.a();
        a2.l = mn42.X;
        a2.k = true;
        if (tr6 != null) {
            a2.e = tr6;
        }
        if (tr6 == null) {
            mn42.i((gn4) null);
        } else {
            mn42.i(a2.a());
        }
    }

    public final void b(Canvas canvas) {
        if (this.A0 && this.b != null) {
            int width = (int) ((((float) getWidth()) / 2.0f) - (getContext().getResources().getDisplayMetrics().density * 0.5f));
            double d = (double) width;
            canvas.save();
            canvas.translate(((float) (((int) (-0.6946583704589973d * d)) + width)) - (((float) this.b.getIntrinsicWidth()) / 2.0f), ((float) (width + (-((int) (d * -0.7193398003386512d))))) - (((float) this.b.getIntrinsicHeight()) / 2.0f));
            Drawable drawable = this.b;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.b.getIntrinsicHeight());
            this.b.draw(canvas);
            canvas.restore();
        }
    }

    public abstract void c(Drawable drawable);

    public mn4 getDraweeHolder() {
        return this.a;
    }

    public Drawable getForegroundCompat() {
        return getForeground();
    }

    public k1b getPostprocessor() {
        return new pha();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mn4 mn4 = this.a;
        if (mn4 != null) {
            mn4.g();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mn4 mn4 = this.a;
        if (mn4 != null) {
            mn4.h();
        }
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        lfc e = this.a.e();
        try {
            e.setBounds(0, 0, width, height);
            e.draw(canvas);
        } catch (Throwable th) {
            udd.s("sc0", "failure to onDraw", th);
        }
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
            canvas.restore();
        }
    }

    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        b(canvas);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        mn4 mn4 = this.a;
        if (mn4 != null) {
            mn4.g();
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        mn4 mn4 = this.a;
        if (mn4 != null) {
            mn4.h();
        }
    }

    public void setForegroundCompat(Drawable drawable) {
        setForeground(drawable);
    }

    public void setSmallOnlineImage(boolean z) {
        this.B0 = z;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        mn4 mn4 = this.a;
        if (mn4 == null || mn4.e() != drawable) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
