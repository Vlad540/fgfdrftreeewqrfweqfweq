package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: vq3  reason: default package */
public final class vq3 extends LinearLayout implements ade {
    public static final /* synthetic */ k77[] o;
    public static final int w0 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
    public final float a = getContext().getResources().getDimension(qmb.bottom_sheet_corner_radius);
    public final ArrayList b = new ArrayList();
    public final yj c = new yj(6, this);

    static {
        k77 hc9 = new hc9(vq3.class, "customTheme", "getCustomTheme()Lru/ok/tamtam/themes/TamTheme;");
        m7c.a.getClass();
        o = new k77[]{hc9};
        a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
    }

    public vq3(Context context) {
        super(context, (AttributeSet) null);
        setOrientation(1);
        E(this);
        setClipChildren(true);
        setClipToPadding(true);
        setClipToOutline(true);
        setOutlineProvider(new i32(this, 3));
        if (isInEditMode()) {
            a(p23.B(new oq3[]{new oq3(new hge(avb.tt_sms_invite_text), Integer.valueOf(eob.btn_radio_off_mtrl), new xd3(8), 12), new oq3(new hge(avb.tt_sms_invite_text), 17301582, new xd3(8), 12)}), (i26) null);
        }
    }

    private final wce getCurrentTheme() {
        wce customTheme = getCustomTheme();
        if (customTheme != null) {
            return customTheme;
        }
        if (isInEditMode()) {
            return db4.e0;
        }
        Context context = getContext();
        r7e r7e = wce.a0;
        return fja.E(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0038 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r12, i26 r13) {
        /*
            r11 = this;
            int r0 = r12.size()
            java.util.ArrayList r1 = r11.b
            r2 = 1
            r3 = 12
            r4 = 16
            if (r0 != r2) goto L_0x0024
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0024
            float r0 = (float) r4
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = a24.X(r0)
            goto L_0x0034
        L_0x0024:
            float r0 = (float) r3
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = a24.X(r0)
        L_0x0034:
            java.util.Iterator r12 = r12.iterator()
        L_0x0038:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0169
            java.lang.Object r2 = r12.next()
            oq3 r2 = (defpackage.oq3) r2
            androidx.appcompat.widget.AppCompatTextView r5 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r6 = r11.getContext()
            r7 = 0
            r5.<init>(r6, r7)
            r6 = 8388611(0x800003, float:1.1754948E-38)
            r5.setGravity(r6)
            mge r6 = r2.a
            android.content.Context r8 = r5.getContext()
            java.lang.CharSequence r6 = r6.a(r8)
            r5.setText(r6)
            wce r6 = r11.getCurrentTheme()
            vce r8 = r2.d
            if (r8 == 0) goto L_0x0080
            k33 r6 = r6.f
            t97 r6 = r6.T
            java.lang.Object r6 = r6.getValue()
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r6 = r6.get(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0083
            int r6 = r6.intValue()
            goto L_0x0089
        L_0x0080:
            r6.getClass()
        L_0x0083:
            wce r6 = r11.getCurrentTheme()
            int r6 = r6.F
        L_0x0089:
            r5.setTextColor(r6)
            r6 = 1097859072(0x41700000, float:15.0)
            r5.setTextSize(r6)
            java.lang.Integer r6 = r2.b
            if (r6 == 0) goto L_0x00d4
            android.content.Context r8 = r5.getContext()
            int r9 = r6.intValue()
            android.graphics.drawable.Drawable r8 = gq3.b(r8, r9)
            wce r9 = r11.getCurrentTheme()
            vce r10 = r2.c
            if (r10 == 0) goto L_0x00c0
            k33 r9 = r9.f
            t97 r9 = r9.T
            java.lang.Object r9 = r9.getValue()
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x00c3
            int r9 = r9.intValue()
            goto L_0x00c9
        L_0x00c0:
            r9.getClass()
        L_0x00c3:
            wce r9 = r11.getCurrentTheme()
            int r9 = r9.w
        L_0x00c9:
            js.D(r8, r9)
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r7, r7, r7)
            int r7 = w0
            r5.setCompoundDrawablePadding(r7)
        L_0x00d4:
            wce r7 = r11.getCurrentTheme()
            int r7 = r7.m
            wce r8 = r11.getCurrentTheme()
            int r8 = r8.i
            android.graphics.drawable.RippleDrawable r7 = defpackage.swb.C(r7, r8)
            r5.setBackground(r7)
            if (r6 == 0) goto L_0x011e
            float r6 = (float) r4
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = a24.X(r7)
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = a24.X(r6)
            r8 = 22
            float r8 = (float) r8
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = a24.X(r8)
            r5.setPaddingRelative(r7, r6, r8, r0)
            goto L_0x0150
        L_0x011e:
            float r6 = (float) r3
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = a24.X(r7)
            float r8 = (float) r4
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = a24.X(r8)
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r6 = r6 * r9
            int r6 = a24.X(r6)
            r5.setPaddingRelative(r7, r8, r6, r0)
        L_0x0150:
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -1
            r8 = -2
            r6.<init>(r7, r8)
            r11.addView(r5, r6)
            wia r6 = new wia
            r6.<init>(r2, r5)
            r1.add(r6)
            if (r13 == 0) goto L_0x0038
            r13.invoke(r2, r5)
            goto L_0x0038
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq3.a(java.util.List, i26):void");
    }

    public final ArrayList<wia> getActions() {
        return this.b;
    }

    public final wce getCustomTheme() {
        k77 k77 = o[0];
        return (wce) this.c.b;
    }

    public final void setCustomTheme(wce wce) {
        this.c.o1(this, o[0], wce);
    }

    public final void z(wce wce) {
        int i;
        int i2;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            wia wia = (wia) it.next();
            oq3 oq3 = (oq3) wia.a;
            AppCompatTextView appCompatTextView = (View) wia.b;
            if (oq3 instanceof oq3) {
                appCompatTextView.setBackground(swb.C(getCurrentTheme().m, getCurrentTheme().i));
                AppCompatTextView appCompatTextView2 = appCompatTextView;
                Drawable drawable = (Drawable) cs.Z(0, appCompatTextView2.getCompoundDrawables());
                if (drawable != null) {
                    wce currentTheme = getCurrentTheme();
                    vce vce = oq3.c;
                    if (vce != null) {
                        Integer num = (Integer) ((Map) currentTheme.f.T.getValue()).get(vce);
                        if (num != null) {
                            i2 = num.intValue();
                            js.D(drawable, i2);
                        }
                    } else {
                        currentTheme.getClass();
                    }
                    i2 = Integer.valueOf(getCurrentTheme().w).intValue();
                    js.D(drawable, i2);
                }
                wce currentTheme2 = getCurrentTheme();
                vce vce2 = oq3.d;
                if (vce2 != null) {
                    Integer num2 = (Integer) ((Map) currentTheme2.f.T.getValue()).get(vce2);
                    if (num2 != null) {
                        i = num2.intValue();
                        appCompatTextView2.setTextColor(i);
                    }
                } else {
                    currentTheme2.getClass();
                }
                i = Integer.valueOf(getCurrentTheme().F).intValue();
                appCompatTextView2.setTextColor(i);
            }
        }
    }
}
