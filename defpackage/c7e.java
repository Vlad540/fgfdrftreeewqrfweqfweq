package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: c7e  reason: default package */
public final class c7e extends n27 implements mhe {
    public boolean A0 = true;
    public final RectF B0 = new RectF();
    public final Paint C0;
    public final Paint D0;
    public PorterDuffColorFilter E0;
    public final t97 F0;
    public final WeakReference Y;
    public final Context Z;
    public final s16 w0;
    public final u16 x0;
    public final t97 y0;
    public boolean z0 = true;

    public c7e(t97 t97, WeakReference weakReference, im imVar, a09 a09, b09 b09) {
        super(0, 4);
        this.Y = weakReference;
        this.Z = imVar;
        this.w0 = a09;
        this.x0 = b09;
        this.y0 = t97;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.C0 = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.D0 = paint2;
        km4.y0.n(imVar).g();
        this.E0 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.F0 = ez3.O(3, new nya(t97, 24, this));
    }

    public final void a(RecyclerView recyclerView, b7c b7c) {
        c7e.super.a(recyclerView, b7c);
        this.A0 = true;
        this.z0 = true;
    }

    public final float d(float f) {
        return Float.MAX_VALUE;
    }

    public final float e() {
        return 1.0f;
    }

    public final boolean g() {
        return ((Boolean) this.w0.invoke()).booleanValue();
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, b7c b7c, float f, float f2, int i, boolean z) {
        float f3;
        Canvas canvas2 = canvas;
        b7c b7c2 = b7c;
        if (b7c2 instanceof ao8) {
            ao8 ao8 = (ao8) b7c2;
            dcf dcf = ao8.O0;
            dcf.getClass();
            if (dcf == dcf.Send || dcf == dcf.Seen || dcf == dcf.None) {
                float i2 = gwf.i(f, -(dh4.c().getDisplayMetrics().density * 96.0f), 0.0f);
                c7e.super.h(canvas, recyclerView, b7c, i2, f2, i, z);
                float abs = Math.abs(i2) / (dh4.c().getDisplayMetrics().density * 96.0f);
                Paint paint = this.C0;
                paint.setAlpha((int) (((float) 255) * abs));
                paint.setColorFilter(this.E0);
                s59 s59 = km4.y0;
                Context context = this.Z;
                int alpha = Color.alpha(s59.n(context).g().a().o().a.g);
                Paint paint2 = this.D0;
                paint2.setColor(s59.n(context).g().a().o().a.g);
                paint2.setAlpha((int) (((float) alpha) * abs));
                View view = ao8.M0;
                float right = (dh4.c().getDisplayMetrics().density * 8.0f) + ((float) view.getRight()) + i2 + ((((float) 1) - abs) * dh4.c().getDisplayMetrics().density * 32.0f) + (dh4.c().getDisplayMetrics().density * 20.0f);
                View view2 = b7c2.a;
                int bottom = view2.getParent().getBottom();
                float f4 = (dh4.c().getDisplayMetrics().density * 20.0f) + (dh4.c().getDisplayMetrics().density * 8.0f);
                float f5 = (dh4.c().getDisplayMetrics().density * 20.0f) + f4;
                if (((float) view.getHeight()) < f5 || ((float) (bottom - view2.getTop())) < f5) {
                    float top = (dh4.c().getDisplayMetrics().density * 20.0f) + ((float) view2.getTop());
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    f3 = top + ((float) (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
                } else if (view2.getBottom() < bottom) {
                    float bottom2 = (float) view2.getBottom();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    f3 = bottom2 - (((float) (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)) + f4);
                } else {
                    f3 = ((float) bottom) - f4;
                }
                canvas2.drawCircle(right, f3, dh4.c().getDisplayMetrics().density * 20.0f, paint2);
                RectF rectF = this.B0;
                float f6 = (dh4.c().getDisplayMetrics().density * 20.0f) / 2.0f;
                rectF.set(right - f6, f3 - f6, right + f6, f3 + f6);
                canvas2.drawBitmap((Bitmap) this.F0.getValue(), (Rect) null, rectF, paint);
                boolean z2 = i2 < (-(dh4.c().getDisplayMetrics().density * 70.0f));
                WeakReference weakReference = this.Y;
                if (z2 && this.z0) {
                    View view3 = (View) weakReference.get();
                    if (view3 != null) {
                        lp.K(view3, ie6.CONFIRM);
                    }
                    this.z0 = false;
                } else if (!z2) {
                    this.z0 = true;
                }
                if (!z && i2 < (-(dh4.c().getDisplayMetrics().density * 70.0f)) && this.A0) {
                    this.A0 = false;
                    View view4 = (View) weakReference.get();
                    if (view4 != null) {
                        view4.post(new zo5(view4, 10, view4));
                    }
                    this.x0.invoke(Integer.valueOf(ao8.h()));
                }
            }
        }
    }

    public final boolean i(b7c b7c, b7c b7c2) {
        return false;
    }

    public final void onThemeChanged(pda pda) {
        this.E0 = new PorterDuffColorFilter(pda.getIcon().f, PorterDuff.Mode.SRC_IN);
    }
}
