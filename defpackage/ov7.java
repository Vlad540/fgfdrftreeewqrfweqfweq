package defpackage;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* renamed from: ov7  reason: default package */
public final class ov7 extends tc {
    public static final int e = wlb.alertDialogStyle;
    public static final int f = kvb.MaterialAlertDialog_MaterialComponents;
    public static final int g = wlb.materialAlertDialogTheme;
    public final lw7 c;
    public final Rect d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ov7(android.content.Context r14) {
        /*
            r13 = this;
            int r0 = g
            android.util.TypedValue r1 = bm3.D(r14, r0)
            r2 = 0
            if (r1 != 0) goto L_0x000b
            r1 = r2
            goto L_0x000d
        L_0x000b:
            int r1 = r1.data
        L_0x000d:
            r3 = 0
            int r10 = e
            int r11 = f
            android.content.Context r4 = defpackage.tw7.a(r14, r3, r10, r11)
            if (r1 != 0) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            ar3 r5 = new ar3
            r5.<init>(r4, r1)
            r4 = r5
        L_0x001f:
            android.util.TypedValue r14 = bm3.D(r14, r0)
            if (r14 != 0) goto L_0x0027
            r14 = r2
            goto L_0x0029
        L_0x0027:
            int r14 = r14.data
        L_0x0029:
            r13.<init>(r4, r14)
            android.content.Context r14 = r13.getContext()
            android.content.res.Resources$Theme r0 = r14.getTheme()
            int[] r1 = defpackage.xvb.MaterialAlertDialog
            int[] r9 = new int[r2]
            r2 = 0
            defpackage.she.a(r14, r2, r10, r11)
            r4 = r14
            r5 = r2
            r6 = r1
            r7 = r10
            r8 = r11
            defpackage.she.b(r4, r5, r6, r7, r8, r9)
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r2, r1, r10, r11)
            int r2 = defpackage.xvb.MaterialAlertDialog_backgroundInsetStart
            android.content.res.Resources r4 = r14.getResources()
            int r5 = defpackage.vmb.mtrl_alert_dialog_background_inset_start
            int r4 = r4.getDimensionPixelSize(r5)
            int r2 = r1.getDimensionPixelSize(r2, r4)
            int r4 = defpackage.xvb.MaterialAlertDialog_backgroundInsetTop
            android.content.res.Resources r5 = r14.getResources()
            int r6 = defpackage.vmb.mtrl_alert_dialog_background_inset_top
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r1.getDimensionPixelSize(r4, r5)
            int r5 = defpackage.xvb.MaterialAlertDialog_backgroundInsetEnd
            android.content.res.Resources r6 = r14.getResources()
            int r7 = defpackage.vmb.mtrl_alert_dialog_background_inset_end
            int r6 = r6.getDimensionPixelSize(r7)
            int r5 = r1.getDimensionPixelSize(r5, r6)
            int r6 = defpackage.xvb.MaterialAlertDialog_backgroundInsetBottom
            android.content.res.Resources r7 = r14.getResources()
            int r8 = defpackage.vmb.mtrl_alert_dialog_background_inset_bottom
            int r7 = r7.getDimensionPixelSize(r8)
            int r6 = r1.getDimensionPixelSize(r6, r7)
            r1.recycle()
            android.content.res.Resources r1 = r14.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r7 = 1
            if (r1 != r7) goto L_0x009d
            r12 = r5
            r5 = r2
            r2 = r12
        L_0x009d:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r2, r4, r5, r6)
            r13.d = r1
            int r1 = defpackage.wlb.colorSurface
            java.lang.Class<ov7> r2 = defpackage.ov7.class
            java.lang.String r2 = r2.getCanonicalName()
            int r1 = defpackage.vx3.q(r1, r14, r2)
            int[] r2 = defpackage.xvb.MaterialAlertDialog
            android.content.res.TypedArray r2 = r14.obtainStyledAttributes(r3, r2, r10, r11)
            int r4 = defpackage.xvb.MaterialAlertDialog_backgroundTint
            int r1 = r2.getColor(r4, r1)
            r2.recycle()
            lw7 r2 = new lw7
            r2.<init>(r14, r3, r10, r11)
            r2.j(r14)
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r1)
            r2.l(r14)
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            r1 = 16844145(0x1010571, float:2.3697462E-38)
            r0.resolveAttribute(r1, r14, r7)
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r14.getDimension(r0)
            int r14 = r14.type
            r1 = 5
            if (r14 != r1) goto L_0x011e
            r14 = 0
            int r14 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r14 < 0) goto L_0x011e
            kw7 r14 = r2.a
            ead r14 = r14.a
            buf r14 = r14.e()
            a0 r1 = new a0
            r1.<init>(r0)
            r14.e = r1
            a0 r1 = new a0
            r1.<init>(r0)
            r14.f = r1
            a0 r1 = new a0
            r1.<init>(r0)
            r14.g = r1
            a0 r1 = new a0
            r1.<init>(r0)
            r14.h = r1
            ead r14 = r14.c()
            r2.setShapeAppearanceModel(r14)
        L_0x011e:
            r13.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov7.<init>(android.content.Context):void");
    }

    public final void b(int i) {
        pc pcVar = this.a;
        pcVar.f = pcVar.a.getText(i);
    }

    public final ov7 c(int i, x06 x06) {
        return (ov7) super.setNegativeButton(i, x06);
    }

    public final uc create() {
        uc create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        lw7 lw7 = this.c;
        if (lw7 instanceof lw7) {
            WeakHashMap weakHashMap = eaf.a;
            lw7.k(t9f.i(decorView));
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable(lw7, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new oy6(create, rect));
        return create;
    }

    public final ov7 d(int i, DialogInterface.OnClickListener onClickListener) {
        return (ov7) super.setPositiveButton(i, onClickListener);
    }

    public final ov7 e(CharSequence charSequence) {
        return (ov7) super.setTitle(charSequence);
    }

    public final ov7 f(View view) {
        return (ov7) super.setView(view);
    }

    public final tc setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (ov7) super.setNegativeButton(i, onClickListener);
    }

    public final tc setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (ov7) super.setPositiveButton(i, onClickListener);
    }

    public final tc setTitle(CharSequence charSequence) {
        return (ov7) super.setTitle(charSequence);
    }

    public final tc setView(View view) {
        return (ov7) super.setView(view);
    }
}
