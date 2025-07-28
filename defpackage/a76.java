package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import java.util.Arrays;

/* renamed from: a76  reason: default package */
public abstract class a76 extends on4 {
    public a76(Context context) {
        super(context);
        i(context, (AttributeSet) null);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [ow5, android.graphics.drawable.Drawable, g80] */
    public final void i(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        int i3;
        int i4;
        int i5;
        boolean z5;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        n06.s();
        n06.s();
        z66 z66 = new z66(context.getResources());
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, uvb.GenericDraweeHierarchy);
            try {
                int indexCount = obtainStyledAttributes.getIndexCount();
                boolean z6 = true;
                int i6 = 0;
                boolean z7 = true;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                int i7 = 0;
                int i8 = 0;
                while (i6 < indexCount) {
                    try {
                        int index = obtainStyledAttributes.getIndex(i6);
                        if (index == uvb.GenericDraweeHierarchy_actualImageScaleType) {
                            z66.l = urd.x(obtainStyledAttributes, index);
                        } else if (index == uvb.GenericDraweeHierarchy_placeholderImage) {
                            z66.d = urd.t(context2, obtainStyledAttributes, index);
                        } else {
                            i3 = indexCount;
                            if (index == uvb.GenericDraweeHierarchy_pressedStateOverlayImage) {
                                Drawable t = urd.t(context2, obtainStyledAttributes, index);
                                if (t == null) {
                                    z66.o = null;
                                } else {
                                    StateListDrawable stateListDrawable = new StateListDrawable();
                                    stateListDrawable.addState(new int[]{16842919}, t);
                                    z66.o = stateListDrawable;
                                }
                            } else if (index == uvb.GenericDraweeHierarchy_progressBarImage) {
                                z66.j = urd.t(context2, obtainStyledAttributes, index);
                            } else if (index == uvb.GenericDraweeHierarchy_fadeDuration) {
                                z66.b = obtainStyledAttributes.getInt(index, 0);
                            } else if (index == uvb.GenericDraweeHierarchy_viewAspectRatio) {
                                z66.c = obtainStyledAttributes.getFloat(index, 0.0f);
                            } else if (index == uvb.GenericDraweeHierarchy_placeholderImageScaleType) {
                                z66.e = urd.x(obtainStyledAttributes, index);
                            } else if (index == uvb.GenericDraweeHierarchy_retryImage) {
                                z66.f = urd.t(context2, obtainStyledAttributes, index);
                            } else if (index == uvb.GenericDraweeHierarchy_retryImageScaleType) {
                                z66.g = urd.x(obtainStyledAttributes, index);
                            } else if (index == uvb.GenericDraweeHierarchy_failureImage) {
                                z66.h = urd.t(context2, obtainStyledAttributes, index);
                            } else if (index == uvb.GenericDraweeHierarchy_failureImageScaleType) {
                                z66.i = urd.x(obtainStyledAttributes, index);
                            } else if (index == uvb.GenericDraweeHierarchy_progressBarImageScaleType) {
                                z66.k = urd.x(obtainStyledAttributes, index);
                            } else {
                                if (index == uvb.GenericDraweeHierarchy_progressBarAutoRotateInterval) {
                                    i7 = obtainStyledAttributes.getInteger(index, i7);
                                } else {
                                    int i9 = i7;
                                    if (index == uvb.GenericDraweeHierarchy_backgroundImage) {
                                        z66.m = urd.t(context2, obtainStyledAttributes, index);
                                    } else if (index == uvb.GenericDraweeHierarchy_overlayImage) {
                                        Drawable t2 = urd.t(context2, obtainStyledAttributes, index);
                                        if (t2 == null) {
                                            z66.n = null;
                                        } else {
                                            z66.n = Arrays.asList(new Drawable[]{t2});
                                        }
                                    } else if (index == uvb.GenericDraweeHierarchy_roundAsCircle) {
                                        urd.w(z66).b = obtainStyledAttributes.getBoolean(index, false);
                                    } else {
                                        if (index == uvb.GenericDraweeHierarchy_roundedCornerRadius) {
                                            i8 = obtainStyledAttributes.getDimensionPixelSize(index, i8);
                                        } else {
                                            int i10 = i8;
                                            if (index == uvb.GenericDraweeHierarchy_roundTopLeft) {
                                                z7 = obtainStyledAttributes.getBoolean(index, z7);
                                            } else if (index == uvb.GenericDraweeHierarchy_roundTopRight) {
                                                z9 = obtainStyledAttributes.getBoolean(index, z9);
                                            } else if (index == uvb.GenericDraweeHierarchy_roundBottomLeft) {
                                                z13 = obtainStyledAttributes.getBoolean(index, z13);
                                            } else if (index == uvb.GenericDraweeHierarchy_roundBottomRight) {
                                                z11 = obtainStyledAttributes.getBoolean(index, z11);
                                            } else if (index == uvb.GenericDraweeHierarchy_roundTopStart) {
                                                z8 = obtainStyledAttributes.getBoolean(index, z8);
                                            } else if (index == uvb.GenericDraweeHierarchy_roundTopEnd) {
                                                z10 = obtainStyledAttributes.getBoolean(index, z10);
                                            } else if (index == uvb.GenericDraweeHierarchy_roundBottomStart) {
                                                z6 = obtainStyledAttributes.getBoolean(index, z6);
                                            } else if (index == uvb.GenericDraweeHierarchy_roundBottomEnd) {
                                                z12 = obtainStyledAttributes.getBoolean(index, z12);
                                            } else if (index == uvb.GenericDraweeHierarchy_roundWithOverlayColor) {
                                                pgc w = urd.w(z66);
                                                i5 = i10;
                                                w.d = obtainStyledAttributes.getColor(index, 0);
                                                w.a = 1;
                                                i4 = i9;
                                                int i11 = i4;
                                                i8 = i5;
                                                i7 = i11;
                                            } else {
                                                i5 = i10;
                                                if (index == uvb.GenericDraweeHierarchy_roundingBorderWidth) {
                                                    pgc w2 = urd.w(z66);
                                                    float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                    w2.getClass();
                                                    if (dimensionPixelSize >= 0.0f) {
                                                        i4 = i9;
                                                        z5 = true;
                                                    } else {
                                                        i4 = i9;
                                                        z5 = false;
                                                    }
                                                    ez3.k("the border width cannot be < 0", z5);
                                                    w2.e = dimensionPixelSize;
                                                } else {
                                                    i4 = i9;
                                                    if (index == uvb.GenericDraweeHierarchy_roundingBorderColor) {
                                                        urd.w(z66).f = obtainStyledAttributes.getColor(index, 0);
                                                    } else if (index == uvb.GenericDraweeHierarchy_roundingBorderPadding) {
                                                        pgc w3 = urd.w(z66);
                                                        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                        w3.getClass();
                                                        ez3.k("the padding cannot be < 0", dimensionPixelSize2 >= 0.0f);
                                                        w3.g = dimensionPixelSize2;
                                                    }
                                                }
                                                int i112 = i4;
                                                i8 = i5;
                                                i7 = i112;
                                            }
                                            i8 = i10;
                                        }
                                        i7 = i9;
                                    }
                                    i5 = i8;
                                    i4 = i9;
                                    int i1122 = i4;
                                    i8 = i5;
                                    i7 = i1122;
                                }
                                i6++;
                                context2 = context;
                                indexCount = i3;
                            }
                            int i12 = i8;
                            i4 = i7;
                            i5 = i12;
                            int i11222 = i4;
                            i8 = i5;
                            i7 = i11222;
                            i6++;
                            context2 = context;
                            indexCount = i3;
                        }
                        i3 = indexCount;
                        int i122 = i8;
                        i4 = i7;
                        i5 = i122;
                        int i112222 = i4;
                        i8 = i5;
                        i7 = i112222;
                        i6++;
                        context2 = context;
                        indexCount = i3;
                    } catch (Throwable th) {
                        th = th;
                        obtainStyledAttributes.recycle();
                        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                int i13 = i8;
                int i14 = i7;
                int i15 = i13;
                obtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z4 = z7 && z10;
                    z3 = z9 && z8;
                    z2 = z11 && z6;
                    z = z13 && z12;
                    i = i15;
                    i2 = i14;
                } else {
                    z4 = z7 && z8;
                    z3 = z9 && z10;
                    i = i15;
                    i2 = i14;
                    boolean z14 = z11 && z12;
                    z = z13 && z6;
                    z2 = z14;
                }
            } catch (Throwable th2) {
                th = th2;
                obtainStyledAttributes.recycle();
                int layoutDirection2 = context.getResources().getConfiguration().getLayoutDirection();
                throw th;
            }
        } else {
            z4 = true;
            z3 = true;
            z2 = true;
            z = true;
            i2 = 0;
            i = 0;
        }
        if (z66.j == null || i2 <= 0) {
            f = 0.0f;
        } else {
            Drawable drawable = z66.j;
            drawable.getClass();
            ? ow5 = new ow5(drawable);
            f = 0.0f;
            ow5.Z = 0.0f;
            ow5.w0 = false;
            ow5.X = i2;
            ow5.Y = true;
            z66.j = ow5;
        }
        if (i > 0) {
            urd.w(z66).c(z4 ? (float) i : f, z3 ? (float) i : f, z2 ? (float) i : f, z ? (float) i : f);
        }
        n06.s();
        setAspectRatio(z66.c);
        setHierarchy(z66.a());
        n06.s();
    }

    public a76(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i(context, attributeSet);
    }

    public a76(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i(context, attributeSet);
    }
}
