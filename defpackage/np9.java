package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: np9  reason: default package */
public final class np9 extends ViewGroup implements mhe {
    public final ou7 A0;
    public final t3a B0;
    public final Path a = new Path();
    public final Rect b = new Rect();
    public final LinkedHashMap c = new LinkedHashMap();
    public mp9 o = new mp9(0, false, false, false);
    public final BitSet w0;
    public final int x0;
    public final int y0;
    public final ou7 z0;

    public np9(Context context) {
        super(context, (AttributeSet) null);
        BitSet bitSet = new BitSet(3);
        this.w0 = bitSet;
        this.x0 = 1;
        this.y0 = 2;
        ou7 ou7 = new ou7(context);
        ou7.setId(qhc.j0);
        ou7.setIcon(phc.j1);
        ou7.setFocusable(0);
        this.z0 = ou7;
        ou7 ou72 = new ou7(context);
        ou72.setId(qhc.k0);
        ou72.setIcon(phc.U);
        ou72.setFocusable(0);
        float f = (float) 20;
        ou72.setLayoutParams(new ViewGroup.MarginLayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        this.A0 = ou72;
        t3a t3a = new t3a(context);
        t3a.setId(qhc.i0);
        t3a.setFocusable(0);
        this.B0 = t3a;
        addView(t3a);
        addView(ou7);
        addView(ou72);
        bitSet.set(0, bitSet.size(), false);
    }

    private final void setupMention(boolean z) {
        BitSet bitSet = this.w0;
        boolean z2 = false;
        bitSet.set(0, z);
        if (!z && this.o.b) {
            z2 = true;
        }
        bitSet.set(this.x0, z2);
        s59 s59 = km4.y0;
        ou7 ou7 = this.z0;
        s59.r(ou7).b().a.getClass();
        ou7.setBackgroundColor(-16745729);
        s59.r(ou7);
        ou7.setIconColor(-1);
        requestLayout();
    }

    private final void setupReaction(boolean z) {
        this.w0.set(this.x0, z && !this.o.c);
        boolean z2 = this.o.d;
        s59 s59 = km4.y0;
        ou7 ou7 = this.A0;
        int i = z2 ? s59.r(ou7).getIcon().i : -1;
        boolean z3 = this.o.d;
        pda r = s59.r(ou7);
        ou7.setBackgroundColor(z3 ? r.b().a.g : r.e().a);
        ou7.setIconColor(i);
        requestLayout();
    }

    public final void a(View view) {
        Path path = this.a;
        path.reset();
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.b;
        rect.set(left, top, right, bottom);
        if (view instanceof ou7) {
            path.addCircle(rect.exactCenterX(), rect.exactCenterY(), ((float) Math.min(rect.width(), rect.height())) / 2.0f, Path.Direction.CCW);
        } else if (view instanceof t3a) {
            float f = (float) rect.left;
            float f2 = (float) rect.top;
            float f3 = (float) rect.right;
            float f4 = (float) rect.bottom;
            Path.Direction direction = Path.Direction.CCW;
            path.addRect(f, f2, f3, f4, direction);
            BitSet bitSet = this.w0;
            ou7 ou7 = bitSet.get(0) ? this.z0 : bitSet.get(this.x0) ? this.A0 : null;
            if (ou7 != null) {
                Rect rect2 = new Rect(ou7.getLeft(), ou7.getTop(), ou7.getRight(), ou7.getBottom());
                Path path2 = new Path();
                path2.addCircle(rect2.exactCenterX(), rect2.exactCenterY(), (((float) Math.min(rect2.width(), rect2.height())) / 2.0f) + ((float) a24.X(((float) 2) * dh4.c().getDisplayMetrics().density)), direction);
                path.op(path2, Path.Op.DIFFERENCE);
            }
        }
        Path path3 = (Path) this.c.get(view);
        if (path3 != null) {
            path3.set(path);
        }
    }

    public final void b(boolean z, pda pda) {
        int i;
        if (z) {
            i = pda.getIcon().i;
        } else {
            pda.getIcon();
            i = -1;
        }
        int i2 = z ? pda.b().a.g : pda.e().a;
        ou7 ou7 = this.A0;
        ou7.setBackgroundColor(i2);
        ou7.setIconColor(i);
        pda.b().a.getClass();
        ou7 ou72 = this.z0;
        ou72.setBackgroundColor(-16745729);
        ou72.setIconColor(-1);
        this.B0.setAppearance(z ? o3a.c : o3a.a);
        invalidate();
    }

    public final void c(boolean z) {
        mp9 mp9 = this.o;
        boolean z2 = mp9.c;
        this.o = mp9.a(mp9, 0, false, z, false, 11);
        if (z2 != z) {
            setupMention(z);
        }
    }

    public final void d(boolean z) {
        mp9 mp9 = this.o;
        boolean z2 = mp9.b;
        this.o = mp9.a(mp9, 0, z, false, false, 13);
        if (z2 != z) {
            setupReaction(z);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        Object obj = this.c.get(view);
        if (obj != null) {
            int save = canvas.save();
            canvas.clipPath((Path) obj);
            try {
                return super.drawChild(canvas, view, j);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        BitSet bitSet = this.w0;
        if (bitSet.get(this.x0)) {
            int paddingStart2 = getPaddingStart();
            int paddingTop = getPaddingTop();
            int paddingStart3 = getPaddingStart();
            ou7 ou7 = this.A0;
            xy6.z(paddingStart2, paddingTop, ou7.getMeasuredWidth() + paddingStart3, ou7.getMeasuredHeight() + getPaddingTop(), this.A0, this);
            a(ou7);
            paddingStart += ou7.getMeasuredWidth();
        }
        if (bitSet.get(0)) {
            int paddingStart4 = getPaddingStart();
            int paddingTop2 = getPaddingTop();
            int paddingStart5 = getPaddingStart();
            ou7 ou72 = this.z0;
            xy6.z(paddingStart4, paddingTop2, ou72.getMeasuredWidth() + paddingStart5, ou72.getMeasuredHeight() + getPaddingTop(), this.z0, this);
            a(ou72);
            paddingStart += ou72.getMeasuredWidth();
        }
        int i5 = paddingStart;
        if (bitSet.get(this.y0)) {
            int measuredWidth = getMeasuredWidth() - getPaddingEnd();
            int paddingTop3 = getPaddingTop();
            int paddingTop4 = getPaddingTop();
            t3a t3a = this.B0;
            xy6.z(i5, paddingTop3, measuredWidth, t3a.getMeasuredHeight() + paddingTop4, this.B0, this);
            a(t3a);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        BitSet bitSet = this.w0;
        int i4 = 8;
        int i5 = bitSet.get(0) ? 0 : 8;
        ou7 ou7 = this.z0;
        ou7.setVisibility(i5);
        int i6 = bitSet.get(this.x0) ? 0 : 8;
        ou7 ou72 = this.A0;
        ou72.setVisibility(i6);
        int i7 = this.y0;
        if (bitSet.get(i7)) {
            i4 = 0;
        }
        t3a t3a = this.B0;
        t3a.setVisibility(i4);
        float f = (float) 20;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        if (bitSet.get(0)) {
            ou7.measure(View.MeasureSpec.makeMeasureSpec(a24.X(dh4.c().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(a24.X(dh4.c().getDisplayMetrics().density * f), 1073741824));
            i3 = ou7.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        if (ou72.getVisibility() == 0) {
            ou72.measure(View.MeasureSpec.makeMeasureSpec(a24.X(dh4.c().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(a24.X(dh4.c().getDisplayMetrics().density * f), 1073741824));
            i3 += ou72.getMeasuredWidth();
        }
        if (bitSet.get(i7)) {
            t3a.measure(0, View.MeasureSpec.makeMeasureSpec(a24.X(f * dh4.c().getDisplayMetrics().density), 1073741824));
            i3 += t3a.getMeasuredWidth();
        }
        setMeasuredDimension(i3, X);
    }

    public final void onThemeChanged(pda pda) {
        b(this.o.d, pda);
        this.B0.f(pda);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.c.put(view, new Path());
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
