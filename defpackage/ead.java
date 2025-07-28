package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: ead  reason: default package */
public final class ead {
    public udd a = new kgc();
    public udd b = new kgc();
    public udd c = new kgc();
    public udd d = new kgc();
    public du3 e = new a0(0.0f);
    public du3 f = new a0(0.0f);
    public du3 g = new a0(0.0f);
    public du3 h = new a0(0.0f);
    public qr4 i = new qr4(0);
    public qr4 j = new qr4(0);
    public qr4 k = new qr4(0);
    public qr4 l = new qr4(0);

    public static buf a(Context context, int i2, int i3, a0 a0Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(xvb.ShapeAppearance);
        try {
            int i4 = obtainStyledAttributes.getInt(xvb.ShapeAppearance_cornerFamily, 0);
            int i5 = obtainStyledAttributes.getInt(xvb.ShapeAppearance_cornerFamilyTopLeft, i4);
            int i6 = obtainStyledAttributes.getInt(xvb.ShapeAppearance_cornerFamilyTopRight, i4);
            int i7 = obtainStyledAttributes.getInt(xvb.ShapeAppearance_cornerFamilyBottomRight, i4);
            int i8 = obtainStyledAttributes.getInt(xvb.ShapeAppearance_cornerFamilyBottomLeft, i4);
            du3 c2 = c(obtainStyledAttributes, xvb.ShapeAppearance_cornerSize, a0Var);
            du3 c3 = c(obtainStyledAttributes, xvb.ShapeAppearance_cornerSizeTopLeft, c2);
            du3 c4 = c(obtainStyledAttributes, xvb.ShapeAppearance_cornerSizeTopRight, c2);
            du3 c5 = c(obtainStyledAttributes, xvb.ShapeAppearance_cornerSizeBottomRight, c2);
            du3 c6 = c(obtainStyledAttributes, xvb.ShapeAppearance_cornerSizeBottomLeft, c2);
            buf buf = new buf();
            udd t = ez3.t(i5);
            buf.a = t;
            buf.d(t);
            buf.e = c3;
            udd t2 = ez3.t(i6);
            buf.b = t2;
            buf.d(t2);
            buf.f = c4;
            udd t3 = ez3.t(i7);
            buf.c = t3;
            buf.d(t3);
            buf.g = c5;
            udd t4 = ez3.t(i8);
            buf.d = t4;
            buf.d(t4);
            buf.h = c6;
            return buf;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static buf b(Context context, AttributeSet attributeSet, int i2, int i3) {
        a0 a0Var = new a0((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xvb.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(xvb.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(xvb.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, a0Var);
    }

    public static du3 c(TypedArray typedArray, int i2, du3 du3) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return du3;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new a0((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new m8c(peekValue.getFraction(1.0f, 1.0f)) : du3;
    }

    public final boolean d(RectF rectF) {
        Class<qr4> cls = qr4.class;
        boolean z = this.l.getClass().equals(cls) && this.j.getClass().equals(cls) && this.i.getClass().equals(cls) && this.k.getClass().equals(cls);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof kgc) && (this.a instanceof kgc) && (this.c instanceof kgc) && (this.d instanceof kgc));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [buf, java.lang.Object] */
    public final buf e() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        return obj;
    }
}
