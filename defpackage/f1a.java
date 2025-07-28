package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: f1a  reason: default package */
public final class f1a extends ViewGroup {
    public static final /* synthetic */ k77[] D0;
    public int A0 = -1;
    public int B0 = -1;
    public int C0 = -1;
    public d1a a;
    public final e1a b = new e1a(this, 0);
    public final e1a c = new e1a(this, 1);
    public final e1a o = new e1a(this, 2);
    public final ec9 w0 = new ec9(4);
    public final ec9 x0 = new ec9(4);
    public final ec9 y0 = new ec9();
    public final Rect z0 = new Rect();

    static {
        Class<f1a> cls = f1a.class;
        D0 = new k77[]{new hc9(cls, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;"), c3d.g(m7c.a, cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;"), new hc9(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;")};
    }

    public f1a(Context context) {
        super(context);
    }

    public static b1a a(f1a f1a, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = f1a.getChildCount();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        b1a b1a = (b1a) f1a.getChildAt(i);
        if (b1a == null) {
            b1a = new b1a(f1a.getContext());
            if (z) {
                f1a.addViewInLayout(b1a, f1a.getChildCount(), new ViewGroup.LayoutParams(-2, -2));
            } else {
                f1a.addView(b1a);
            }
        }
        b1a.setId(wqb.oneme_buttonstack_more_btn);
        b1a.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        b1a.setMode(f1a.getMode());
        b1a.setAppearance(f1a.getAppearance());
        b1a.setCustomTheme(f1a.getCustomTheme());
        b1a.setText(xub.oneme_button_stack_more);
        b1a.setIcon(phc.p1);
        a24.a0(b1a, new eu5(19, f1a));
        return b1a;
    }

    public static final qgd c(c1a c1a) {
        int i = c1a.a;
        Integer num = c1a.b;
        return new qgd(i, num != null ? new hge(num.intValue()) : mge.a, c1a.c, c1a.d, c1a.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.List r9, java.util.List r10, boolean r11) {
        /*
            r8 = this;
            ec9 r0 = r8.w0
            java.lang.Object[] r1 = r0.a
            int r2 = r0.b
            r3 = 0
            r4 = 0
            java.util.Arrays.fill(r1, r3, r2, r4)
            r0.b = r3
            ec9 r1 = r8.y0
            java.lang.Object[] r2 = r1.a
            int r5 = r1.b
            java.util.Arrays.fill(r2, r3, r5, r4)
            r1.b = r3
            r2 = r3
        L_0x0019:
            r4 = 4
            if (r2 >= r4) goto L_0x0089
            java.lang.Object r5 = o23.Y(r2, r9)
            c1a r5 = (defpackage.c1a) r5
            if (r5 == 0) goto L_0x0089
            android.view.View r4 = r8.getChildAt(r2)
            b1a r4 = (defpackage.b1a) r4
            if (r4 != 0) goto L_0x0038
            b1a r4 = new b1a
            android.content.Context r6 = r8.getContext()
            r4.<init>(r6)
            r8.addView(r4)
        L_0x0038:
            int r6 = r5.a
            r4.setId(r6)
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            r4.setLayoutParams(r6)
            r4.setVisibility(r3)
            boolean r6 = r5.f
            r4.setEnabled(r6)
            y0a r6 = r8.getMode()
            r4.setMode(r6)
            x0a r6 = r8.getAppearance()
            r4.setAppearance(r6)
            pda r6 = r8.getCustomTheme()
            r4.setCustomTheme(r6)
            java.lang.Integer r6 = r5.b
            if (r6 == 0) goto L_0x006e
            int r6 = r6.intValue()
            r4.setText((int) r6)
        L_0x006e:
            java.lang.Integer r6 = r5.d
            if (r6 == 0) goto L_0x0079
            int r6 = r6.intValue()
            r4.setIcon((int) r6)
        L_0x0079:
            xv5 r6 = new xv5
            r7 = 19
            r6.<init>(r8, r7, r5)
            a24.a0(r4, r6)
            r0.b(r5)
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0089:
            r0 = 1
            if (r2 != r4) goto L_0x0094
            int r5 = r9.size()
            if (r5 <= r4) goto L_0x0094
            r4 = r0
            goto L_0x0095
        L_0x0094:
            r4 = r3
        L_0x0095:
            boolean r5 = r10.isEmpty()
            r0 = r0 ^ r5
            if (r4 != 0) goto L_0x00a3
            if (r0 == 0) goto L_0x009f
            goto L_0x00a3
        L_0x009f:
            r9 = -1
            r8.A0 = r9
            goto L_0x00d4
        L_0x00a3:
            int r0 = r9.size()
            r4 = r2
        L_0x00a8:
            if (r4 >= r0) goto L_0x00b4
            java.lang.Object r5 = r9.get(r4)
            r1.b(r5)
            int r4 = r4 + 1
            goto L_0x00a8
        L_0x00b4:
            int r9 = r10.size()
            r0 = r3
        L_0x00b9:
            if (r0 >= r9) goto L_0x00c5
            java.lang.Object r4 = r10.get(r0)
            r1.b(r4)
            int r0 = r0 + 1
            goto L_0x00b9
        L_0x00c5:
            r9 = 2
            b1a r9 = a(r8, r2, r3, r9)
            r9.setVisibility(r3)
            r9.setEnabled(r11)
            r8.A0 = r2
        L_0x00d2:
            int r2 = r2 + 1
        L_0x00d4:
            int r9 = r8.getChildCount()
            if (r2 >= r9) goto L_0x00e6
            android.view.View r9 = r8.getChildAt(r2)
            if (r9 == 0) goto L_0x00d2
            r10 = 8
            r9.setVisibility(r10)
            goto L_0x00d2
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1a.b(java.util.List, java.util.List, boolean):void");
    }

    public final x0a getAppearance() {
        k77 k77 = D0[1];
        return (x0a) this.c.b;
    }

    public final pda getCustomTheme() {
        k77 k77 = D0[2];
        return (pda) this.o.b;
    }

    public final d1a getListener() {
        return this.a;
    }

    public final y0a getMode() {
        k77 k77 = D0[0];
        return (y0a) this.b.b;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int i7 = this.B0;
            if (i6 > this.C0 || i7 > i6) {
                n1g.D(childAt, i5, 0, 0, 12);
                i5 = rf0.b((float) 8, dh4.c().getDisplayMetrics().density, childAt.getMeasuredWidth(), i5);
            } else {
                n1g.C(childAt, 0, 0, 0, 0);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int i3 = 0;
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            int childCount = getChildCount() - 1;
            while (true) {
                if (-1 >= childCount) {
                    childCount = -1;
                    break;
                }
                View childAt = getChildAt(childCount);
                if (childAt != null && childAt.getVisibility() == 0) {
                    break;
                }
                childCount--;
            }
            if (childCount == -1) {
                setMeasuredDimension(0, 0);
                return;
            }
            this.B0 = -1;
            this.C0 = -1;
            ec9 ec9 = this.x0;
            Arrays.fill(ec9.a, 0, ec9.b, (Object) null);
            ec9.b = 0;
            int i4 = childCount + 1;
            float f = (float) 8;
            int X = (size - (a24.X(dh4.c().getDisplayMetrics().density * f) * childCount)) / i4;
            while (X < a24.X(((float) 67) * dh4.c().getDisplayMetrics().density)) {
                int i5 = this.A0;
                boolean z = i5 == -1;
                if (i5 == -1) {
                    this.A0 = getChildCount();
                    a(this, 0, true, 1);
                }
                int i6 = this.C0;
                int i7 = 2;
                if (i6 == -1) {
                    int i8 = this.A0;
                    this.B0 = i8 - (z ? 2 : 1);
                    if (!z) {
                        i7 = 1;
                    }
                    this.C0 = i8 - i7;
                } else {
                    if (!z) {
                        i7 = 1;
                    }
                    this.B0 = i6 - i7;
                }
                ec9.a(0, this.w0.c(this.B0));
                int i9 = i4 - 1;
                int X2 = (size - (a24.X(dh4.c().getDisplayMetrics().density * f) * (i4 - 2))) / i9;
                i4 = i9;
                X = X2;
            }
            int childCount2 = getChildCount();
            int i10 = 0;
            while (i3 < childCount2) {
                int i11 = this.B0;
                if (i3 > this.C0 || i11 > i3) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(X, 1073741824);
                    View childAt2 = getChildAt(i3);
                    childAt2.measure(makeMeasureSpec, i2);
                    i10 = Math.max(i10, childAt2.getMeasuredHeight());
                }
                i3++;
            }
            setMeasuredDimension(size, Math.max(mode, i10));
            return;
        }
        int childCount3 = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (i3 < childCount3) {
            View childAt3 = getChildAt(i3);
            childAt3.measure(i, i2);
            i12 += childAt3.getMeasuredWidth();
            i13 = Math.max(i13, childAt3.getMeasuredHeight());
            i3++;
        }
        setMeasuredDimension((a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) * (getChildCount() - 1)) + i12, i13);
    }

    public final void setAppearance(x0a x0a) {
        this.c.o1(this, D0[1], x0a);
    }

    public final void setCustomTheme(pda pda) {
        this.o.o1(this, D0[2], pda);
    }

    public final void setListener(d1a d1a) {
        this.a = d1a;
    }

    public final void setMode(y0a y0a) {
        this.b.o1(this, D0[0], y0a);
    }
}
