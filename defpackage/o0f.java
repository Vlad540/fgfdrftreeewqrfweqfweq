package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o0f  reason: default package */
public final class o0f extends f0f {
    public static final PorterDuff.Mode y0 = PorterDuff.Mode.SRC_IN;
    public boolean X;
    public boolean Y = true;
    public final float[] Z = new float[9];
    public m0f b;
    public PorterDuffColorFilter c;
    public ColorFilter o;
    public final Matrix w0 = new Matrix();
    public final Rect x0 = new Rect();

    /* JADX WARNING: type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, m0f] */
    public o0f() {
        ? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = y0;
        constantState.b = new l0f();
        this.b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        um4.b(drawable);
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas2);
            return;
        }
        Rect rect = this.x0;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.o;
            if (colorFilter == null) {
                colorFilter = this.c;
            }
            Matrix matrix = this.w0;
            canvas2.getMatrix(matrix);
            float[] fArr = this.Z;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas2.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && vm4.a(this) == 1) {
                    canvas2.translate((float) rect.width(), 0.0f);
                    canvas2.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                m0f m0f = this.b;
                Bitmap bitmap = m0f.f;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == m0f.f.getHeight())) {
                    m0f.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    m0f.k = true;
                }
                if (!this.Y) {
                    m0f m0f2 = this.b;
                    m0f2.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(m0f2.f);
                    l0f l0f = m0f2.b;
                    l0f.a(l0f.g, l0f.p, canvas3, min, min2);
                } else {
                    m0f m0f3 = this.b;
                    if (!(!m0f3.k && m0f3.g == m0f3.c && m0f3.h == m0f3.d && m0f3.j == m0f3.e && m0f3.i == m0f3.b.getRootAlpha())) {
                        m0f m0f4 = this.b;
                        m0f4.f.eraseColor(0);
                        Canvas canvas4 = new Canvas(m0f4.f);
                        l0f l0f2 = m0f4.b;
                        l0f2.a(l0f2.g, l0f.p, canvas4, min, min2);
                        m0f m0f5 = this.b;
                        m0f5.g = m0f5.c;
                        m0f5.h = m0f5.d;
                        m0f5.i = m0f5.b.getRootAlpha();
                        m0f5.j = m0f5.e;
                        m0f5.k = false;
                    }
                }
                m0f m0f6 = this.b;
                if (m0f6.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (m0f6.l == null) {
                        Paint paint2 = new Paint();
                        m0f6.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    m0f6.l.setAlpha(m0f6.b.getRootAlpha());
                    m0f6.l.setColorFilter(colorFilter);
                    paint = m0f6.l;
                }
                canvas2.drawBitmap(m0f6.f, (Rect) null, rect, paint);
                canvas2.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? um4.c(drawable) : this.o;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new n0f(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            m0f m0f = this.b;
            if (m0f != null) {
                l0f l0f = m0f.b;
                if (l0f.n == null) {
                    l0f.n = Boolean.valueOf(l0f.g.a());
                }
                if (l0f.n.booleanValue() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, m0f] */
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.X && super.mutate() == this) {
            m0f m0f = this.b;
            ? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = y0;
            if (m0f != null) {
                constantState.a = m0f.a;
                l0f l0f = new l0f(m0f.b);
                constantState.b = l0f;
                if (m0f.b.e != null) {
                    l0f.e = new Paint(m0f.b.e);
                }
                if (m0f.b.d != null) {
                    constantState.b.d = new Paint(m0f.b.d);
                }
                constantState.c = m0f.c;
                constantState.d = m0f.d;
                constantState.e = m0f.e;
            }
            this.b = constantState;
            this.X = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m0f m0f = this.b;
        ColorStateList colorStateList = m0f.c;
        if (colorStateList == null || (mode = m0f.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        l0f l0f = m0f.b;
        if (l0f.n == null) {
            l0f.n = Boolean.valueOf(l0f.g.a());
        }
        if (l0f.n.booleanValue()) {
            boolean b2 = m0f.b.g.b(iArr);
            m0f.k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.o = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            h2g.z(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            um4.h(drawable, colorStateList);
            return;
        }
        m0f m0f = this.b;
        if (m0f.c != colorStateList) {
            m0f.c = colorStateList;
            this.c = a(colorStateList, m0f.d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            um4.i(drawable, mode);
            return;
        }
        m0f m0f = this.b;
        if (m0f.d != mode) {
            m0f.d = mode;
            this.c = a(m0f.c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARNING: type inference failed for: r9v39, types: [k0f, java.lang.Object, h0f] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        l0f l0f;
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Paint.Join join;
        Paint.Cap cap;
        int i7;
        Paint.Join join2;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.a;
        if (drawable != null) {
            um4.d(drawable, resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        m0f m0f = this.b;
        m0f.b = new l0f();
        TypedArray o2 = hwf.o(resources2, theme2, attributeSet2, mt0.a);
        m0f m0f2 = this.b;
        l0f l0f2 = m0f2.b;
        if (!hwf.i(xmlPullParser2, "tintMode")) {
            i = -1;
        } else {
            i = o2.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i8 = 3;
        if (i == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i != 5) {
            if (i != 9) {
                switch (i) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        m0f2.d = mode;
        int i9 = 1;
        ColorStateList colorStateList = null;
        boolean z3 = false;
        if (hwf.i(xmlPullParser2, "tint")) {
            TypedValue typedValue = new TypedValue();
            o2.getValue(1, typedValue);
            int i10 = typedValue.type;
            if (i10 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i10 < 28 || i10 > 31) {
                Resources resources3 = o2.getResources();
                int resourceId = o2.getResourceId(1, 0);
                ThreadLocal threadLocal = i33.a;
                try {
                    colorStateList = i33.a(resources3, resources3.getXml(resourceId), theme2);
                } catch (Exception unused) {
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            m0f2.c = colorStateList2;
        }
        boolean z4 = m0f2.e;
        if (hwf.i(xmlPullParser2, "autoMirrored")) {
            z4 = o2.getBoolean(5, z4);
        }
        m0f2.e = z4;
        float f = l0f2.j;
        if (hwf.i(xmlPullParser2, "viewportWidth")) {
            f = o2.getFloat(7, f);
        }
        l0f2.j = f;
        float f2 = l0f2.k;
        if (hwf.i(xmlPullParser2, "viewportHeight")) {
            f2 = o2.getFloat(8, f2);
        }
        l0f2.k = f2;
        if (l0f2.j <= 0.0f) {
            throw new XmlPullParserException(o2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > 0.0f) {
            l0f2.h = o2.getDimension(3, l0f2.h);
            float dimension = o2.getDimension(2, l0f2.i);
            l0f2.i = dimension;
            if (l0f2.h <= 0.0f) {
                throw new XmlPullParserException(o2.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = l0f2.getAlpha();
                if (hwf.i(xmlPullParser2, "alpha")) {
                    alpha = o2.getFloat(4, alpha);
                }
                l0f2.setAlpha(alpha);
                String string = o2.getString(0);
                if (string != null) {
                    l0f2.m = string;
                    l0f2.o.put(string, l0f2);
                }
                o2.recycle();
                m0f.a = getChangingConfigurations();
                m0f.k = true;
                m0f m0f3 = this.b;
                l0f l0f3 = m0f3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(l0f3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z5 = true;
                while (eventType != i9 && (xmlPullParser.getDepth() >= depth || eventType != i8)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        i0f i0f = (i0f) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i2 = depth;
                        yr yrVar = l0f3.o;
                        if (equals) {
                            ? k0f = new k0f();
                            k0f.f = 0.0f;
                            k0f.h = 1.0f;
                            k0f.i = 1.0f;
                            k0f.j = 0.0f;
                            k0f.k = 1.0f;
                            k0f.l = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            k0f.m = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            k0f.n = join3;
                            l0f = l0f3;
                            k0f.o = 4.0f;
                            TypedArray o3 = hwf.o(resources2, theme2, attributeSet2, mt0.c);
                            if (hwf.i(xmlPullParser2, "pathData")) {
                                Paint.Cap cap3 = cap2;
                                String string2 = o3.getString(0);
                                if (string2 != null) {
                                    k0f.b = string2;
                                }
                                String string3 = o3.getString(2);
                                if (string3 != null) {
                                    k0f.a = h2g.e(string3);
                                }
                                k0f.g = hwf.g(o3, xmlPullParser2, theme2, "fillColor", 1);
                                float f3 = k0f.i;
                                if (hwf.i(xmlPullParser2, "fillAlpha")) {
                                    f3 = o3.getFloat(12, f3);
                                }
                                k0f.i = f3;
                                if (!hwf.i(xmlPullParser2, "strokeLineCap")) {
                                    i6 = -1;
                                } else {
                                    i6 = o3.getInt(8, -1);
                                }
                                Paint.Cap cap4 = k0f.m;
                                if (i6 != 0) {
                                    join = join3;
                                    cap = i6 != 1 ? i6 != 2 ? cap4 : Paint.Cap.SQUARE : Paint.Cap.ROUND;
                                } else {
                                    join = join3;
                                    cap = cap3;
                                }
                                k0f.m = cap;
                                if (!hwf.i(xmlPullParser2, "strokeLineJoin")) {
                                    i7 = -1;
                                } else {
                                    i7 = o3.getInt(9, -1);
                                }
                                Paint.Join join4 = k0f.n;
                                if (i7 != 0) {
                                    join2 = i7 != 1 ? i7 != 2 ? join4 : Paint.Join.BEVEL : Paint.Join.ROUND;
                                } else {
                                    join2 = join;
                                }
                                k0f.n = join2;
                                float f4 = k0f.o;
                                if (hwf.i(xmlPullParser2, "strokeMiterLimit")) {
                                    f4 = o3.getFloat(10, f4);
                                }
                                k0f.o = f4;
                                k0f.e = hwf.g(o3, xmlPullParser2, theme2, "strokeColor", 3);
                                float f5 = k0f.h;
                                if (hwf.i(xmlPullParser2, "strokeAlpha")) {
                                    f5 = o3.getFloat(11, f5);
                                }
                                k0f.h = f5;
                                float f6 = k0f.f;
                                if (hwf.i(xmlPullParser2, "strokeWidth")) {
                                    f6 = o3.getFloat(4, f6);
                                }
                                k0f.f = f6;
                                float f7 = k0f.k;
                                if (hwf.i(xmlPullParser2, "trimPathEnd")) {
                                    f7 = o3.getFloat(6, f7);
                                }
                                k0f.k = f7;
                                float f8 = k0f.l;
                                if (hwf.i(xmlPullParser2, "trimPathOffset")) {
                                    f8 = o3.getFloat(7, f8);
                                }
                                k0f.l = f8;
                                float f9 = k0f.j;
                                if (hwf.i(xmlPullParser2, "trimPathStart")) {
                                    f9 = o3.getFloat(5, f9);
                                }
                                k0f.j = f9;
                                int i11 = k0f.c;
                                if (hwf.i(xmlPullParser2, "fillType")) {
                                    i11 = o3.getInt(13, i11);
                                }
                                k0f.c = i11;
                            }
                            o3.recycle();
                            i0f.b.add(k0f);
                            if (k0f.getPathName() != null) {
                                yrVar.put(k0f.getPathName(), k0f);
                            }
                            m0f3.a |= k0f.d;
                            z2 = false;
                            i3 = 1;
                            z5 = false;
                        } else {
                            l0f = l0f3;
                            if ("clip-path".equals(name)) {
                                k0f k0f2 = new k0f();
                                if (hwf.i(xmlPullParser2, "pathData")) {
                                    TypedArray o4 = hwf.o(resources2, theme2, attributeSet2, mt0.d);
                                    String string4 = o4.getString(0);
                                    if (string4 != null) {
                                        k0f2.b = string4;
                                    }
                                    String string5 = o4.getString(1);
                                    if (string5 != null) {
                                        k0f2.a = h2g.e(string5);
                                    }
                                    if (!hwf.i(xmlPullParser2, "fillType")) {
                                        i5 = 0;
                                    } else {
                                        i5 = o4.getInt(2, 0);
                                    }
                                    k0f2.c = i5;
                                    o4.recycle();
                                }
                                i0f.b.add(k0f2);
                                if (k0f2.getPathName() != null) {
                                    yrVar.put(k0f2.getPathName(), k0f2);
                                }
                                m0f3.a = k0f2.d | m0f3.a;
                            } else if ("group".equals(name)) {
                                i0f i0f2 = new i0f();
                                TypedArray o5 = hwf.o(resources2, theme2, attributeSet2, mt0.b);
                                float f10 = i0f2.c;
                                if (hwf.i(xmlPullParser2, "rotation")) {
                                    f10 = o5.getFloat(5, f10);
                                }
                                i0f2.c = f10;
                                i3 = 1;
                                i0f2.d = o5.getFloat(1, i0f2.d);
                                i0f2.e = o5.getFloat(2, i0f2.e);
                                float f11 = i0f2.f;
                                if (hwf.i(xmlPullParser2, "scaleX")) {
                                    f11 = o5.getFloat(3, f11);
                                }
                                i0f2.f = f11;
                                float f12 = i0f2.g;
                                if (hwf.i(xmlPullParser2, "scaleY")) {
                                    f12 = o5.getFloat(4, f12);
                                }
                                i0f2.g = f12;
                                float f13 = i0f2.h;
                                if (hwf.i(xmlPullParser2, "translateX")) {
                                    f13 = o5.getFloat(6, f13);
                                }
                                i0f2.h = f13;
                                float f14 = i0f2.i;
                                if (hwf.i(xmlPullParser2, "translateY")) {
                                    f14 = o5.getFloat(7, f14);
                                }
                                i0f2.i = f14;
                                z2 = false;
                                String string6 = o5.getString(0);
                                if (string6 != null) {
                                    i0f2.l = string6;
                                }
                                i0f2.c();
                                o5.recycle();
                                i0f.b.add(i0f2);
                                arrayDeque.push(i0f2);
                                if (i0f2.getGroupName() != null) {
                                    yrVar.put(i0f2.getGroupName(), i0f2);
                                }
                                m0f3.a = i0f2.k | m0f3.a;
                            }
                            z2 = false;
                            i3 = 1;
                        }
                        z = z2;
                        i4 = 3;
                    } else {
                        l0f = l0f3;
                        i2 = depth;
                        i3 = i9;
                        z = z3;
                        i4 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i8 = i4;
                    z3 = z;
                    i9 = i3;
                    depth = i2;
                    l0f3 = l0f;
                }
                if (!z5) {
                    this.c = a(m0f.c, m0f.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(o2.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(o2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public o0f(m0f m0f) {
        this.b = m0f;
        this.c = a(m0f.c, m0f.d);
    }
}
