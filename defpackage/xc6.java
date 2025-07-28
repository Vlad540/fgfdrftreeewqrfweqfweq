package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: xc6  reason: default package */
public final class xc6 extends ConstraintLayout implements mhe {
    public final jca K0;
    public final TextView L0;
    public final TextView M0;
    public final OneMeButton N0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.constraintlayout.widget.ConstraintLayout} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xc6(android.content.Context r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r17.<init>(r18)
            jca r2 = new jca
            r2.<init>(r1)
            int r3 = defpackage.z7a.c
            r2.setId(r3)
            r0.K0 = r2
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r1)
            int r4 = defpackage.z7a.e
            r3.setId(r4)
            int r4 = defpackage.b8a.c
            java.lang.String r4 = r1.getString(r4)
            r3.setText(r4)
            nge r4 = defpackage.nte.n
            r4.b(r3, defpackage.yq4.b)
            r0.L0 = r3
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r1)
            int r5 = defpackage.z7a.d
            r4.setId(r5)
            nge r5 = defpackage.nte.r
            r5.b(r4, defpackage.yq4.b)
            r0.M0 = r4
            one.me.sdk.uikit.common.button.OneMeButton r5 = new one.me.sdk.uikit.common.button.OneMeButton
            r6 = 0
            r5.<init>(r1, r6)
            int r1 = defpackage.z7a.b
            r5.setId(r1)
            v0a r1 = defpackage.v0a.a
            r5.setSize(r1)
            u0a r1 = defpackage.u0a.a
            r5.setMode(r1)
            s0a r1 = defpackage.s0a.c
            r5.setAppearance(r1)
            int r1 = defpackage.b8a.b
            r5.setText((int) r1)
            r0.N0 = r5
            re3 r1 = new re3
            r6 = -1
            r7 = -2
            r1.<init>(r6, r7)
            r0.setLayoutParams(r1)
            r1 = 0
            r0.addView(r2, r1, r7)
            r0.addView(r5, r1, r7)
            r0.addView(r3, r1, r7)
            r0.addView(r4, r1, r7)
            s59 r6 = km4.y0
            pda r6 = r6.r(r0)
            r0.onThemeChanged(r6)
            bf3 r6 = a06.p(r17)
            int r7 = r2.getId()
            r8 = 6
            r6.d(r7, r8, r1, r8)
            hw9 r9 = new hw9
            r10 = 4
            r9.<init>(r6, r8, r7, r10)
            r10 = 12
            float r10 = (float) r10
            android.content.res.Resources r11 = defpackage.dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            hr1.q(r10, r11, r9)
            r9 = 3
            r6.d(r7, r9, r1, r9)
            r11 = 4
            r6.d(r7, r11, r1, r11)
            we3 r7 = r6.g(r7)
            xe3 r7 = r7.d
            r12 = 1
            r7.l0 = r12
            int r7 = r3.getId()
            int r13 = r2.getId()
            r14 = 7
            r6.d(r7, r8, r13, r14)
            hw9 r13 = new hw9
            r15 = 4
            r13.<init>(r6, r8, r7, r15)
            android.content.res.Resources r15 = defpackage.dh4.c()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            hr1.q(r10, r15, r13)
            r6.d(r7, r9, r1, r9)
            int r13 = r4.getId()
            r6.d(r7, r11, r13, r11)
            int r13 = r5.getId()
            r6.d(r7, r14, r13, r8)
            hw9 r13 = new hw9
            r15 = 4
            r13.<init>(r6, r14, r7, r15)
            r15 = 9
            float r15 = (float) r15
            android.content.res.Resources r16 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r16.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r15
            int r1 = a24.X(r1)
            r13.e(r1)
            we3 r1 = r6.g(r7)
            xe3 r1 = r1.d
            r1.l0 = r12
            we3 r1 = r6.g(r7)
            xe3 r1 = r1.d
            r7 = 2
            r1.W = r7
            int r1 = r4.getId()
            int r2 = r2.getId()
            r6.d(r1, r8, r2, r14)
            hw9 r2 = new hw9
            r4 = 4
            r2.<init>(r6, r8, r1, r4)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r10
            int r4 = a24.X(r4)
            r2.e(r4)
            int r2 = r3.getId()
            r6.d(r1, r9, r2, r9)
            r2 = 0
            r6.d(r1, r11, r2, r11)
            int r2 = r5.getId()
            r6.d(r1, r14, r2, r8)
            hw9 r2 = new hw9
            r3 = 4
            r2.<init>(r6, r14, r1, r3)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r15 = r15 * r3
            int r3 = a24.X(r15)
            r2.e(r3)
            we3 r1 = r6.g(r1)
            xe3 r1 = r1.d
            r1.l0 = r12
            int r1 = r5.getId()
            r2 = 0
            r6.d(r1, r14, r2, r14)
            hw9 r3 = new hw9
            r4 = 4
            r3.<init>(r6, r14, r1, r4)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            hr1.q(r10, r4, r3)
            r6.d(r1, r9, r2, r9)
            hw9 r3 = new hw9
            r4 = 4
            r3.<init>(r6, r9, r1, r4)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            hr1.q(r10, r4, r3)
            r6.d(r1, r11, r2, r11)
            hw9 r2 = new hw9
            r3 = 4
            r2.<init>(r6, r11, r1, r3)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r10 = r10 * r3
            int r3 = a24.X(r10)
            r2.e(r3)
            we3 r1 = r6.g(r1)
            xe3 r1 = r1.d
            r1.l0 = r12
            r6.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc6.<init>(android.content.Context):void");
    }

    public final void onThemeChanged(pda pda) {
        this.L0.setTextColor(pda.getText().e);
        this.M0.setTextColor(pda.getText().f);
        this.N0.e();
    }

    public final void setJoinAction(s16 s16) {
        OneMeButton oneMeButton = this.N0;
        if (s16 == null) {
            oneMeButton.setOnClickListener((View.OnClickListener) null);
        } else {
            a24.a0(oneMeButton, new q6(11, s16));
        }
    }
}
