package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: on4  reason: default package */
public abstract class on4 extends ImageView {
    public static boolean y0 = false;
    public final ms a = new ms(0);
    public float b = 0.0f;
    public mn4 c;
    public boolean o = false;
    public boolean w0 = false;
    public Object x0 = null;

    public on4(Context context) {
        super(context);
        g(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        y0 = z;
    }

    public final void g(Context context) {
        try {
            n06.s();
            if (this.o) {
                n06.s();
                return;
            }
            boolean z = true;
            this.o = true;
            this.c = new mn4((y66) null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                n06.s();
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!y0 || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.w0 = z;
            n06.s();
        } catch (Throwable th) {
            n06.s();
            throw th;
        }
    }

    public float getAspectRatio() {
        return this.b;
    }

    public gn4 getController() {
        return this.c.X;
    }

    public Object getExtraData() {
        return this.x0;
    }

    public ln4 getHierarchy() {
        ln4 ln4 = this.c.o;
        ln4.getClass();
        return ln4;
    }

    public Drawable getTopLevelDrawable() {
        return this.c.e();
    }

    public final void h() {
        Drawable drawable;
        if (this.w0 && (drawable = getDrawable()) != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public void j() {
        invalidate();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
        this.c.g();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
        this.c.h();
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        h();
        this.c.g();
    }

    public void onMeasure(int i, int i2) {
        ms msVar = this.a;
        msVar.b = i;
        msVar.c = i2;
        float f = this.b;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                msVar.c = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(msVar.b) - paddingRight)) / f) + ((float) paddingBottom)), msVar.c), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    msVar.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(msVar.c) - paddingBottom)) * f) + ((float) paddingRight)), msVar.b), 1073741824);
                }
            }
        }
        super.onMeasure(msVar.b, msVar.c);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        h();
        this.c.h();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        f76 f76;
        mn4 mn4 = this.c;
        if (mn4.f()) {
            k0 k0Var = (k0) mn4.X;
            k0Var.getClass();
            boolean i = m75.a.i(2);
            Class cls = k0.x;
            if (i) {
                m75.f(cls, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(k0Var)), k0Var.j, motionEvent);
            }
            g76 g76 = k0Var.e;
            if (g76 != null && (g76.c || k0Var.q())) {
                g76 g762 = k0Var.e;
                g762.getClass();
                int action = motionEvent.getAction();
                if (action != 0) {
                    float f = g762.b;
                    if (action == 1) {
                        g762.c = false;
                        if (Math.abs(motionEvent.getX() - g762.f) > f || Math.abs(motionEvent.getY() - g762.g) > f) {
                            g762.d = false;
                        }
                        if (g762.d && motionEvent.getEventTime() - g762.e <= ((long) ViewConfiguration.getLongPressTimeout()) && (f76 = g762.a) != null) {
                            k0 k0Var2 = (k0) f76;
                            if (m75.a.i(2)) {
                                m75.e(cls, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(k0Var2)), k0Var2.j);
                            }
                            if (k0Var2.q()) {
                                k0Var2.d.c++;
                                y66 y66 = k0Var2.h;
                                y66.f.o(y66.a);
                                y66.g();
                                k0Var2.r();
                            }
                        }
                        g762.d = false;
                    } else if (action != 2) {
                        if (action == 3) {
                            g762.c = false;
                            g762.d = false;
                        }
                    } else if (Math.abs(motionEvent.getX() - g762.f) > f || Math.abs(motionEvent.getY() - g762.g) > f) {
                        g762.d = false;
                    }
                } else {
                    g762.c = true;
                    g762.d = true;
                    g762.e = motionEvent.getEventTime();
                    g762.f = motionEvent.getX();
                    g762.g = motionEvent.getY();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        h();
    }

    public void setAspectRatio(float f) {
        if (f != this.b) {
            this.b = f;
            requestLayout();
        }
    }

    public void setController(gn4 gn4) {
        this.c.i(gn4);
        super.setImageDrawable(this.c.e());
    }

    public void setExtraData(Object obj) {
        this.x0 = obj;
    }

    public void setHierarchy(ln4 ln4) {
        this.c.j(ln4);
        super.setImageDrawable(this.c.e());
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        g(getContext());
        this.c.i((gn4) null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        g(getContext());
        this.c.i((gn4) null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        g(getContext());
        this.c.i((gn4) null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        g(getContext());
        this.c.i((gn4) null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.w0 = z;
    }

    public final String toString() {
        jg8 X = at7.X(this);
        mn4 mn4 = this.c;
        X.h(mn4 != null ? mn4.toString() : "<no holder set>", "holder");
        return X.toString();
    }

    public on4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context);
    }

    public on4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g(context);
    }
}
