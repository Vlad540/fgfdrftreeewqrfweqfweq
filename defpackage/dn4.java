package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* renamed from: dn4  reason: default package */
public abstract class dn4 extends Drawable implements Animatable {
    public static final py1 z0 = new py1(7, Float.class, "growFraction");
    public ValueAnimator X;
    public ArrayList Y;
    public boolean Z;
    public final Context a;
    public final oi0 b;
    public dh c;
    public ValueAnimator o;
    public float w0;
    public final Paint x0 = new Paint();
    public int y0;

    /* JADX WARNING: type inference failed for: r2v1, types: [dh, java.lang.Object] */
    public dn4(Context context, oi0 oi0) {
        this.a = context;
        this.b = oi0;
        this.c = new Object();
        setAlpha(255);
    }

    public final float b() {
        oi0 oi0 = this.b;
        if (oi0.e == 0 && oi0.f == 0) {
            return 1.0f;
        }
        return this.w0;
    }

    public final void c(ne neVar) {
        if (this.Y == null) {
            this.Y = new ArrayList();
        }
        if (!this.Y.contains(neVar)) {
            this.Y.add(neVar);
        }
    }

    public final boolean d(boolean z, boolean z2, boolean z3) {
        dh dhVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        dhVar.getClass();
        return e(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator = this.o;
        py1 py1 = z0;
        if (valueAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, py1, new float[]{0.0f, 1.0f});
            this.o = ofFloat;
            ofFloat.setDuration(500);
            this.o.setInterpolator(og.b);
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                this.o = valueAnimator2;
                valueAnimator2.addListener(new cn4(this, 0));
            } else {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
        }
        if (this.X == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, py1, new float[]{1.0f, 0.0f});
            this.X = ofFloat2;
            ofFloat2.setDuration(500);
            this.X.setInterpolator(og.b);
            ValueAnimator valueAnimator3 = this.X;
            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                this.X = valueAnimator3;
                valueAnimator3.addListener(new cn4(this, 1));
            } else {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
        }
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator4 = z ? this.o : this.X;
        ValueAnimator valueAnimator5 = z ? this.X : this.o;
        if (!z3) {
            if (valueAnimator5.isRunning()) {
                boolean z4 = this.Z;
                this.Z = true;
                new ValueAnimator[]{valueAnimator5}[0].cancel();
                this.Z = z4;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z5 = this.Z;
                this.Z = true;
                new ValueAnimator[]{valueAnimator4}[0].end();
                this.Z = z5;
            }
            return super.setVisible(z, false);
        } else if (valueAnimator4.isRunning()) {
            return false;
        } else {
            boolean z6 = !z || super.setVisible(z, false);
            oi0 oi0 = this.b;
            if (!z ? oi0.f == 0 : oi0.e == 0) {
                boolean z7 = this.Z;
                this.Z = true;
                new ValueAnimator[]{valueAnimator4}[0].end();
                this.Z = z7;
                return z6;
            }
            if (z2 || !valueAnimator4.isPaused()) {
                valueAnimator4.start();
            } else {
                valueAnimator4.resume();
            }
            return z6;
        }
    }

    public final void f(ne neVar) {
        ArrayList arrayList = this.Y;
        if (arrayList != null && arrayList.contains(neVar)) {
            this.Y.remove(neVar);
            if (this.Y.isEmpty()) {
                this.Y = null;
            }
        }
    }

    public final int getAlpha() {
        return this.y0;
    }

    public final int getOpacity() {
        return -3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = r1.X;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isRunning() {
        /*
            r1 = this;
            android.animation.ValueAnimator r0 = r1.o
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x0015
        L_0x000a:
            android.animation.ValueAnimator r1 = r1.X
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn4.isRunning():boolean");
    }

    public final void setAlpha(int i) {
        this.y0 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.x0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return d(z, z2, true);
    }

    public final void start() {
        e(true, true, false);
    }

    public final void stop() {
        e(false, true, false);
    }
}
