package defpackage;

import android.animation.ValueAnimator;

/* renamed from: jt1  reason: default package */
public final /* synthetic */ class jt1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ lt1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;
    public final /* synthetic */ int w0;
    public final /* synthetic */ int x0;
    public final /* synthetic */ int y0;
    public final /* synthetic */ int z0;

    public /* synthetic */ jt1(lt1 lt1, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8) {
        this.a = lt1;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = i4;
        this.Y = f;
        this.Z = f2;
        this.w0 = i5;
        this.x0 = i6;
        this.y0 = i7;
        this.z0 = i8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        lt1.b(this.a, this.b, this.c, this.o, this.X, this.Y, this.Z, this.w0, this.x0, this.y0, this.z0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
