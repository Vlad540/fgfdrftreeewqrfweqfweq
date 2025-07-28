package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: kw7  reason: default package */
public class kw7 extends Drawable.ConstantState {
    public ead a;
    public zs4 b;
    public ColorStateList c = null;
    public ColorStateList d = null;
    public final ColorStateList e = null;
    public ColorStateList f = null;
    public PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    public Rect h = null;
    public final float i = 1.0f;
    public float j = 1.0f;
    public float k;
    public int l = 255;
    public float m = 0.0f;
    public float n = 0.0f;
    public final float o = 0.0f;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public final int s = 0;
    public final boolean t = false;
    public final Paint.Style u = Paint.Style.FILL_AND_STROKE;

    public kw7(ead ead) {
        this.a = ead;
        this.b = null;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        lw7 lw7 = new lw7(this);
        lw7.X = true;
        return lw7;
    }

    public kw7(kw7 kw7) {
        this.a = kw7.a;
        this.b = kw7.b;
        this.k = kw7.k;
        this.c = kw7.c;
        this.d = kw7.d;
        this.g = kw7.g;
        this.f = kw7.f;
        this.l = kw7.l;
        this.i = kw7.i;
        this.r = kw7.r;
        this.p = kw7.p;
        this.t = kw7.t;
        this.j = kw7.j;
        this.m = kw7.m;
        this.n = kw7.n;
        this.o = kw7.o;
        this.q = kw7.q;
        this.s = kw7.s;
        this.e = kw7.e;
        this.u = kw7.u;
        if (kw7.h != null) {
            this.h = new Rect(kw7.h);
        }
    }
}
