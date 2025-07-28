package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* renamed from: xg7  reason: default package */
public class xg7 implements ped {
    public int A0 = 0;
    public final int B0 = Integer.MAX_VALUE;
    public cx3 C0;
    public View D0;
    public AdapterView.OnItemClickListener E0;
    public AdapterView.OnItemSelectedListener F0;
    public final vg7 G0 = new vg7(this, 1);
    public final r85 H0 = new r85(1, this);
    public final wg7 I0 = new wg7(this);
    public final vg7 J0 = new vg7(this, 0);
    public final Handler K0;
    public final Rect L0 = new Rect();
    public Rect M0;
    public boolean N0;
    public final ln O0;
    public int X = -2;
    public int Y;
    public int Z;
    public final Context a;
    public ListAdapter b;
    public yo4 c;
    public final int o = -2;
    public final int w0 = 1002;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARNING: type inference failed for: r1v9, types: [ln, android.widget.PopupWindow] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0088, code lost:
        r8 = r6.getResourceId(r7, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xg7(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8) {
        /*
            r4 = this;
            r4.<init>()
            r0 = -2
            r4.o = r0
            r4.X = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r4.w0 = r0
            r0 = 0
            r4.A0 = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4.B0 = r1
            vg7 r1 = new vg7
            r2 = 1
            r1.<init>(r4, r2)
            r4.G0 = r1
            r85 r1 = new r85
            r1.<init>(r2, r4)
            r4.H0 = r1
            wg7 r1 = new wg7
            r1.<init>(r4)
            r4.I0 = r1
            vg7 r1 = new vg7
            r2 = 0
            r1.<init>(r4, r2)
            r4.J0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.L0 = r1
            r4.a = r5
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r5.getMainLooper()
            r1.<init>(r2)
            r4.K0 = r1
            int[] r1 = defpackage.nwb.ListPopupWindow
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1, r7, r8)
            int r2 = defpackage.nwb.ListPopupWindow_android_dropDownHorizontalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r4.Y = r2
            int r2 = defpackage.nwb.ListPopupWindow_android_dropDownVerticalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r4.Z = r2
            r3 = 1
            if (r2 == 0) goto L_0x0061
            r4.x0 = r3
        L_0x0061:
            r1.recycle()
            ln r1 = new ln
            r1.<init>(r5, r6, r7, r8)
            int[] r2 = defpackage.nwb.PopupWindow
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r2, r7, r8)
            int r7 = defpackage.nwb.PopupWindow_overlapAnchor
            boolean r7 = r6.hasValue(r7)
            if (r7 == 0) goto L_0x0080
            int r7 = defpackage.nwb.PopupWindow_overlapAnchor
            boolean r7 = r6.getBoolean(r7, r0)
            defpackage.c1b.c(r1, r7)
        L_0x0080:
            int r7 = defpackage.nwb.PopupWindow_android_popupBackground
            boolean r8 = r6.hasValue(r7)
            if (r8 == 0) goto L_0x0093
            int r8 = r6.getResourceId(r7, r0)
            if (r8 == 0) goto L_0x0093
            android.graphics.drawable.Drawable r5 = defpackage.am7.n(r5, r8)
            goto L_0x0097
        L_0x0093:
            android.graphics.drawable.Drawable r5 = r6.getDrawable(r7)
        L_0x0097:
            r1.setBackgroundDrawable(r5)
            r6.recycle()
            r4.O0 = r1
            r1.setInputMethodMode(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg7.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final boolean a() {
        return this.O0.isShowing();
    }

    public final Drawable b() {
        return this.O0.getBackground();
    }

    public final int c() {
        return this.Y;
    }

    public final void d(int i) {
        this.Y = i;
    }

    public final void dismiss() {
        ln lnVar = this.O0;
        lnVar.dismiss();
        lnVar.setContentView((View) null);
        this.c = null;
        this.K0.removeCallbacks(this.G0);
    }

    public final void g() {
        int i;
        int i2;
        yo4 yo4;
        yo4 yo42 = this.c;
        ln lnVar = this.O0;
        Context context = this.a;
        if (yo42 == null) {
            yo4 p = p(context, !this.N0);
            this.c = p;
            p.setAdapter(this.b);
            this.c.setOnItemClickListener(this.E0);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new sg7(0, this));
            this.c.setOnScrollListener(this.I0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.F0;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            lnVar.setContentView(this.c);
        } else {
            ViewGroup viewGroup = (ViewGroup) lnVar.getContentView();
        }
        Drawable background = lnVar.getBackground();
        int i3 = 0;
        Rect rect = this.L0;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.x0) {
                this.Z = -i4;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = tg7.a(lnVar, this.D0, this.Z, lnVar.getInputMethodMode() == 2);
        int i5 = this.o;
        if (i5 == -1) {
            i2 = a2 + i;
        } else {
            int i6 = this.X;
            int a3 = this.c.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            i2 = a3 + (a3 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = this.O0.getInputMethodMode() == 2;
        c1b.d(lnVar, this.w0);
        if (!lnVar.isShowing()) {
            int i7 = this.X;
            if (i7 == -1) {
                i7 = -1;
            } else if (i7 == -2) {
                i7 = this.D0.getWidth();
            }
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = i2;
            }
            lnVar.setWidth(i7);
            lnVar.setHeight(i5);
            ug7.b(lnVar, true);
            lnVar.setOutsideTouchable(true);
            lnVar.setTouchInterceptor(this.H0);
            if (this.z0) {
                c1b.c(lnVar, this.y0);
            }
            ug7.a(lnVar, this.M0);
            lnVar.showAsDropDown(this.D0, this.Y, this.Z, this.A0);
            this.c.setSelection(-1);
            if ((!this.N0 || this.c.isInTouchMode()) && (yo4 = this.c) != null) {
                yo4.setListSelectionHidden(true);
                yo4.requestLayout();
            }
            if (!this.N0) {
                this.K0.post(this.J0);
            }
        } else if (this.D0.isAttachedToWindow()) {
            int i8 = this.X;
            if (i8 == -1) {
                i8 = -1;
            } else if (i8 == -2) {
                i8 = this.D0.getWidth();
            }
            if (i5 == -1) {
                i5 = z ? i2 : -1;
                if (z) {
                    lnVar.setWidth(this.X == -1 ? -1 : 0);
                    lnVar.setHeight(0);
                } else {
                    if (this.X == -1) {
                        i3 = -1;
                    }
                    lnVar.setWidth(i3);
                    lnVar.setHeight(-1);
                }
            } else if (i5 == -2) {
                i5 = i2;
            }
            lnVar.setOutsideTouchable(true);
            View view = this.D0;
            int i9 = this.Y;
            int i10 = this.Z;
            if (i8 < 0) {
                i8 = -1;
            }
            lnVar.update(view, i9, i10, i8, i5 < 0 ? -1 : i5);
        }
    }

    public final void i(Drawable drawable) {
        this.O0.setBackgroundDrawable(drawable);
    }

    public final yo4 j() {
        return this.c;
    }

    public final void k(int i) {
        this.Z = i;
        this.x0 = true;
    }

    public final int n() {
        if (!this.x0) {
            return 0;
        }
        return this.Z;
    }

    public void o(ListAdapter listAdapter) {
        cx3 cx3 = this.C0;
        if (cx3 == null) {
            this.C0 = new cx3(1, this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(cx3);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.C0);
        }
        yo4 yo4 = this.c;
        if (yo4 != null) {
            yo4.setAdapter(this.b);
        }
    }

    public yo4 p(Context context, boolean z) {
        return new yo4(context, z);
    }

    public final void q(int i) {
        Drawable background = this.O0.getBackground();
        if (background != null) {
            Rect rect = this.L0;
            background.getPadding(rect);
            this.X = rect.left + rect.right + i;
            return;
        }
        this.X = i;
    }
}
