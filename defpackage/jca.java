package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: jca  reason: default package */
public final class jca extends ViewGroup {
    public int a = a24.X(((float) 28) * dh4.c().getDisplayMetrics().density);
    public int b = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
    public int c = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
    public final Paint o;
    public final t97 w0;
    public final pf x0;
    public final ArrayList y0;

    public jca(Context context) {
        super(context);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.o = paint;
        this.w0 = ez3.O(3, new t2a(context, 7));
        this.x0 = new pf(3, this);
        this.y0 = new ArrayList();
    }

    private final int getAvatarsWidth() {
        int i = this.a;
        ArrayList arrayList = this.y0;
        return (arrayList.size() * i) - ((arrayList.size() - 1) * this.b);
    }

    /* JADX INFO: finally extract failed */
    public final void dispatchDraw(Canvas canvas) {
        float f = ((float) this.a) / 2.0f;
        float measuredHeight = (((float) getMeasuredHeight()) / 2.0f) - f;
        float f2 = dh4.c().getDisplayMetrics().density * 0.0f;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null);
        ArrayList arrayList = this.y0;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                Drawable drawable = (Drawable) next;
                int save = canvas.save();
                canvas.translate(f2, measuredHeight);
                try {
                    int i3 = this.a;
                    int i4 = i3 - this.b;
                    float f3 = ((float) i3) / 2.0f;
                    float f4 = (float) i4;
                    f2 += f4;
                    drawable.draw(canvas);
                    if (i != p23.A(arrayList)) {
                        canvas.drawCircle(f4 + f, f3, ((float) this.c) + f, this.o);
                    }
                    canvas.restoreToCount(save);
                    i = i2;
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            } else {
                p23.G();
                throw null;
            }
        }
        canvas.restoreToCount(saveLayer);
        super.dispatchDraw(canvas);
    }

    public final int getAvatarOffset() {
        return this.b;
    }

    public final int getAvatarSize() {
        return this.a;
    }

    public final int getStrokeWidth() {
        return this.c;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View B = ek8.B(this.w0);
        if (B != null) {
            int c2 = me4.c((float) 8, dh4.c().getDisplayMetrics().density, getAvatarsWidth());
            B.layout(c2, (getMeasuredHeight() / 2) - (B.getMeasuredHeight() / 2), B.getMeasuredWidth() + c2, (B.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r8 = r6.getAvatarsWidth()
            int r0 = r6.a
            t97 r1 = r6.w0
            android.view.View r1 = defpackage.ek8.B(r1)
            if (r1 == 0) goto L_0x0077
            int r7 = r7 - r8
            r0 = 8
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r7 = defpackage.me4.p(r0, r2, r7)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            r4 = 0
            if (r3 == 0) goto L_0x0030
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            goto L_0x0031
        L_0x0030:
            r2 = r4
        L_0x0031:
            r3 = 0
            if (r2 == 0) goto L_0x0037
            int r2 = r2.leftMargin
            goto L_0x0038
        L_0x0037:
            r2 = r3
        L_0x0038:
            int r7 = r7 - r2
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            boolean r5 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0044
            r4 = r2
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x0044:
            if (r4 == 0) goto L_0x0049
            int r2 = r4.rightMargin
            goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            int r7 = r7 - r2
            if (r7 >= 0) goto L_0x004e
            r7 = r3
        L_0x004e:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r1.measure(r7, r2)
            int r7 = r1.getMeasuredWidth()
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r8 = defpackage.rf0.b(r0, r2, r7, r8)
            int r7 = r6.a
            int r0 = r1.getMeasuredHeight()
            int r0 = java.lang.Math.max(r7, r0)
        L_0x0077:
            r6.setMeasuredDimension(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jca.onMeasure(int, int):void");
    }

    public final void setAvatarOffset(int i) {
        this.b = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatarSize(int i) {
        this.a = i;
        requestLayout();
        invalidate();
    }

    public final void setAvatars(List<wia> list) {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        if (list == null) {
            requestLayout();
            invalidate();
            return;
        }
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                wia wia = (wia) next;
                az9 az9 = new az9(getContext());
                az9.setCallback(this.x0);
                int i3 = this.a;
                az9.setBounds(0, 0, i3, i3);
                Object obj = wia.b;
                if (obj == null) {
                    az9.b((ub0) wia.a);
                } else {
                    az9.c((String) obj);
                }
                arrayList.add(az9);
                i = i2;
            } else {
                p23.G();
                throw null;
            }
        }
        requestLayout();
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    public final void setTitle(mge mge) {
        t97 t97 = this.w0;
        if (mge == null) {
            ((TextView) t97.getValue()).setText((CharSequence) null);
            ((TextView) t97.getValue()).setVisibility(8);
            return;
        }
        jjd.g((View) t97.getValue(), this);
        ((TextView) t97.getValue()).setText(mge.a(getContext()));
        ((TextView) t97.getValue()).setVisibility(0);
    }
}
