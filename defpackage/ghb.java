package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: ghb  reason: default package */
public final class ghb {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;
    public Object h;

    public ghb(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.g = constraintLayout2;
    }

    public static boolean a(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    public static boolean b(fhb fhb) {
        wx[] wxVarArr = fhb.a.a;
        if (wxVarArr.length != 1 || wxVarArr[0].a != 0) {
            return false;
        }
        wx[] wxVarArr2 = fhb.b.a;
        return wxVarArr2.length == 1 && wxVarArr2[0].a == 0;
    }

    public void c(ff3 ff3, sj0 sj0) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        ff3 ff32 = ff3;
        sj0 sj02 = sj0;
        if (ff32 != null) {
            if (ff32.g0 == 8) {
                sj02.g = 0;
                sj02.h = 0;
                sj02.i = 0;
            } else if (ff32.T != null) {
                int i9 = sj02.b;
                int i10 = sj02.d;
                int i11 = sj02.e;
                int i12 = sj02.f;
                int i13 = this.a + this.b;
                int i14 = this.c;
                View view = (View) ff32.f0;
                int t = hr1.t(i9);
                me3 me3 = ff32.K;
                me3 me32 = ff32.I;
                if (t == 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                } else if (t == 1) {
                    i2 = ViewGroup.getChildMeasureSpec(this.e, i14, -2);
                } else if (t == 2) {
                    i2 = ViewGroup.getChildMeasureSpec(this.e, i14, -2);
                    boolean z2 = ff32.r == 1;
                    int i15 = sj02.j;
                    if (i15 == 1 || i15 == 2) {
                        boolean z3 = view.getMeasuredHeight() == ff3.k();
                        if (sj02.j == 2 || !z2 || ((z2 && z3) || ff3.A())) {
                            i2 = View.MeasureSpec.makeMeasureSpec(ff3.q(), 1073741824);
                        }
                    }
                } else if (t != 3) {
                    i2 = 0;
                } else {
                    int i16 = this.e;
                    int i17 = me32 != null ? me32.g : 0;
                    if (me3 != null) {
                        i17 += me3.g;
                    }
                    i2 = ViewGroup.getChildMeasureSpec(i16, i14 + i17, -1);
                }
                int t2 = hr1.t(i10);
                if (t2 == 0) {
                    i3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else if (t2 == 1) {
                    i3 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
                } else if (t2 == 2) {
                    i3 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
                    boolean z4 = ff32.s == 1;
                    int i18 = sj02.j;
                    if (i18 == 1 || i18 == 2) {
                        boolean z5 = view.getMeasuredWidth() == ff3.q();
                        if (sj02.j == 2 || !z4 || ((z4 && z5) || ff3.B())) {
                            i3 = View.MeasureSpec.makeMeasureSpec(ff3.k(), 1073741824);
                        }
                    }
                } else if (t2 != 3) {
                    i3 = 0;
                } else {
                    int i19 = this.f;
                    int i20 = me32 != null ? ff32.J.g : 0;
                    if (me3 != null) {
                        i20 += ff32.L.g;
                    }
                    i3 = ViewGroup.getChildMeasureSpec(i19, i13 + i20, -1);
                }
                gf3 gf3 = (gf3) ff32.T;
                ConstraintLayout constraintLayout = (ConstraintLayout) this.h;
                if (gf3 == null || !udd.v(constraintLayout.A0, 256) || view.getMeasuredWidth() != ff3.q() || view.getMeasuredWidth() >= gf3.q() || view.getMeasuredHeight() != ff3.k() || view.getMeasuredHeight() >= gf3.k() || view.getBaseline() != ff32.a0 || ff3.z() || !a(ff32.G, i2, ff3.q()) || !a(ff32.H, i3, ff3.k())) {
                    boolean z6 = i9 == 3;
                    boolean z7 = i10 == 3;
                    boolean z8 = i10 == 4 || i10 == 1;
                    boolean z9 = i9 == 4 || i9 == 1;
                    boolean z10 = z6 && ff32.W > 0.0f;
                    boolean z11 = z7 && ff32.W > 0.0f;
                    if (view != null) {
                        re3 re3 = (re3) view.getLayoutParams();
                        int i21 = sj02.j;
                        if (i21 == 1 || i21 == 2 || !z6 || ff32.r != 0 || !z7 || ff32.s != 0) {
                            if (!(view instanceof bdf) || !(ff32 instanceof qj5)) {
                                view.measure(i2, i3);
                            } else {
                                ((bdf) view).l((qj5) ff32, i2, i3);
                            }
                            ff32.G = i2;
                            ff32.H = i3;
                            ff32.g = false;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            int baseline = view.getBaseline();
                            int i22 = ff32.u;
                            i4 = i22 > 0 ? Math.max(i22, measuredWidth) : measuredWidth;
                            int i23 = ff32.v;
                            if (i23 > 0) {
                                i4 = Math.min(i23, i4);
                            }
                            int i24 = ff32.x;
                            if (i24 > 0) {
                                i5 = Math.max(i24, measuredHeight);
                                i8 = i2;
                            } else {
                                i8 = i2;
                                i5 = measuredHeight;
                            }
                            int i25 = ff32.y;
                            if (i25 > 0) {
                                i5 = Math.min(i25, i5);
                            }
                            if (!udd.v(constraintLayout.A0, 1)) {
                                if (z10 && z8) {
                                    i4 = (int) ((((float) i5) * ff32.W) + 0.5f);
                                } else if (z11 && z9) {
                                    i5 = (int) ((((float) i4) / ff32.W) + 0.5f);
                                }
                            }
                            if (measuredWidth == i4 && measuredHeight == i5) {
                                i6 = baseline;
                                i7 = -1;
                                z = false;
                            } else {
                                int makeMeasureSpec = measuredWidth != i4 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : i8;
                                if (measuredHeight != i5) {
                                    i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                }
                                view.measure(makeMeasureSpec, i3);
                                ff32.G = makeMeasureSpec;
                                ff32.H = i3;
                                z = false;
                                ff32.g = false;
                                int measuredWidth2 = view.getMeasuredWidth();
                                int measuredHeight2 = view.getMeasuredHeight();
                                i6 = view.getBaseline();
                                i4 = measuredWidth2;
                                i5 = measuredHeight2;
                                i7 = -1;
                            }
                        } else {
                            i7 = -1;
                            i6 = 0;
                            z = false;
                            i5 = 0;
                            i4 = 0;
                        }
                        boolean z12 = i6 != i7 ? true : z;
                        if (!(i4 == sj02.e && i5 == sj02.f)) {
                            z = true;
                        }
                        sj02.k = z;
                        boolean z13 = re3.c0 ? true : z12;
                        if (!(!z13 || i6 == -1 || ff32.a0 == i6)) {
                            sj02.k = true;
                        }
                        sj02.g = i4;
                        sj02.h = i5;
                        sj02.c = z13;
                        sj02.i = i6;
                        return;
                    }
                    return;
                }
                sj02.g = ff3.q();
                sj02.h = ff3.k();
                sj02.i = ff32.a0;
            }
        }
    }
}
