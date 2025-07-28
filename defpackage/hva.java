package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: hva  reason: default package */
public final class hva extends ConstraintLayout implements mhe {
    public static final /* synthetic */ int R0 = 0;
    public final ImageView K0;
    public final TextView L0;
    public final TextView M0;
    public final hc3 N0;
    public final TextView O0;
    public final TextView P0;
    public s16 Q0 = new qga(15);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.constraintlayout.widget.ConstraintLayout} */
    /* JADX WARNING: type inference failed for: r14v5, types: [hc3, android.view.View, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hva(android.content.Context r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r16.<init>(r17)
            qga r2 = new qga
            r3 = 15
            r2.<init>(r3)
            r0.Q0 = r2
            nea r2 = new nea
            r3 = 6
            r2.<init>(r1, r3)
            int r4 = defpackage.mqb.oneme_settings_privacy_pin_code_toolbar
            r2.setId(r4)
            r4 = 0
            r2.setBackgroundColor(r4)
            fea r5 = defpackage.fea.a
            r2.setForm(r5)
            vda r5 = new vda
            e98 r6 = new e98
            r7 = 19
            r6.<init>(r7, r0)
            r5.<init>(r6)
            r2.setLeftActions(r5)
            re3 r5 = new re3
            r6 = -1
            r7 = -2
            r5.<init>(r6, r7)
            r2.setLayoutParams(r5)
            r0.addView(r2)
            android.widget.ImageView r5 = new android.widget.ImageView
            r5.<init>(r1)
            int r6 = defpackage.mqb.oneme_settings_privacy_setup_pin_code_lock
            r5.setId(r6)
            android.graphics.drawable.ShapeDrawable r6 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r8 = new android.graphics.drawable.shapes.OvalShape
            r8.<init>()
            r6.<init>(r8)
            s59 r8 = km4.y0
            pda r9 = r8.r(r5)
            nd0 r9 = r9.b()
            int r9 = r9.j
            r6.setTint(r9)
            r5.setBackground(r6)
            r6 = 16
            float r6 = (float) r6
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            defpackage.me4.o(r6, r9, r5)
            int r9 = defpackage.zhc.q0
            r5.setImageResource(r9)
            pda r9 = r8.r(r5)
            yn6 r9 = r9.getIcon()
            int r9 = r9.i
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            r5.setImageTintList(r9)
            re3 r9 = new re3
            r10 = 64
            float r10 = (float) r10
            android.content.res.Resources r11 = defpackage.dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = a24.X(r11)
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r10 = r10 * r12
            int r10 = a24.X(r10)
            r9.<init>(r11, r10)
            r5.setLayoutParams(r9)
            r0.addView(r5)
            r0.K0 = r5
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r1)
            int r10 = defpackage.mqb.oneme_settings_privacy_setup_pin_code_title
            r9.setId(r10)
            nge r10 = defpackage.nte.i
            r10.b(r9, defpackage.yq4.b)
            pda r11 = r8.r(r9)
            cfe r11 = r11.getText()
            int r11 = r11.e
            r9.setTextColor(r11)
            r11 = 1
            r9.setSingleLine(r11)
            re3 r12 = new re3
            r12.<init>(r7, r7)
            r9.setLayoutParams(r12)
            r0.addView(r9)
            r0.L0 = r9
            android.widget.TextView r12 = new android.widget.TextView
            r12.<init>(r1)
            int r13 = defpackage.mqb.oneme_settings_privacy_setup_pin_code_description
            r12.setId(r13)
            r13 = 8
            r12.setVisibility(r13)
            nge r14 = defpackage.nte.l
            r14.b(r12, defpackage.yq4.b)
            pda r14 = r8.r(r12)
            cfe r14 = r14.getText()
            int r14 = r14.f
            r12.setTextColor(r14)
            re3 r14 = new re3
            r14.<init>(r7, r7)
            r12.setGravity(r11)
            r12.setLayoutParams(r14)
            r0.addView(r12)
            r0.M0 = r12
            hc3 r14 = new hc3
            r15 = 0
            r14.<init>(r1, r15)
            int r15 = defpackage.mqb.oneme_settings_privacy_setup_pin_code_input
            r14.setId(r15)
            qga r15 = new qga
            r3 = 16
            r15.<init>(r3)
            r14.setKeyboardOpen(r15)
            r3 = 4
            r14.setCountCells(r3)
            re3 r15 = new re3
            r15.<init>(r7, r7)
            r14.setLayoutParams(r15)
            r14.setSecure(r11)
            r14.setDisableInputsForError(r4)
            eb3 r15 = new eb3
            r4 = 1
            r15.<init>(r14, r14, r4)
            afa.a(r14, r15)
            qk8 r4 = new qk8
            r15 = 28
            r4.<init>(r15, r14)
            r14.setKeyboardOpen(r4)
            r0.addView(r14)
            r0.N0 = r14
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r1)
            int r15 = defpackage.mqb.oneme_settings_privacy_setup_pin_code_error
            r4.setId(r15)
            r4.setVisibility(r13)
            r4.setTextAlignment(r3)
            nge r15 = defpackage.nte.o
            r15.b(r4, defpackage.yq4.b)
            r4.setSingleLine(r11)
            re3 r11 = new re3
            r11.<init>(r7, r7)
            r4.setLayoutParams(r11)
            r0.addView(r4)
            r0.O0 = r4
            android.widget.TextView r11 = new android.widget.TextView
            r11.<init>(r1)
            int r1 = defpackage.mqb.oneme_settings_privacy_setup_pin_code_forgot
            r11.setId(r1)
            r11.setVisibility(r13)
            int r1 = defpackage.oub.oneme_settings_privacy_forgot_pin_code
            r11.setText(r1)
            r11.isSingleLine()
            r10.b(r11, defpackage.yq4.b)
            r11.setTextAlignment(r3)
            re3 r1 = new re3
            r1.<init>(r7, r7)
            r11.setLayoutParams(r1)
            r0.addView(r11)
            r0.P0 = r11
            pda r1 = r8.r(r0)
            r0.onThemeChanged(r1)
            bf3 r1 = a06.p(r16)
            int r7 = r2.getId()
            r8 = 3
            r10 = 0
            r1.d(r7, r8, r10, r8)
            r13 = 6
            r1.d(r7, r13, r10, r13)
            r13 = 7
            r1.d(r7, r13, r10, r13)
            int r7 = r5.getId()
            int r2 = r2.getId()
            r1.d(r7, r8, r2, r3)
            hw9 r2 = new hw9
            r10 = 4
            r2.<init>(r1, r8, r7, r10)
            r10 = 24
            float r10 = (float) r10
            android.content.res.Resources r15 = defpackage.dh4.c()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            hr1.q(r10, r15, r2)
            r2 = 6
            r15 = 0
            r1.d(r7, r2, r15, r2)
            r1.d(r7, r13, r15, r13)
            int r2 = r9.getId()
            int r5 = r5.getId()
            r1.d(r2, r8, r5, r3)
            hw9 r5 = new hw9
            r7 = 4
            r5.<init>(r1, r8, r2, r7)
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            hr1.q(r10, r7, r5)
            r5 = 6
            r7 = 0
            r1.d(r2, r5, r7, r5)
            hw9 r7 = new hw9
            r15 = 4
            r7.<init>(r1, r5, r2, r15)
            r5 = 12
            float r5 = (float) r5
            android.content.res.Resources r15 = defpackage.dh4.c()
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()
            float r15 = r15.density
            hr1.q(r5, r15, r7)
            r7 = 0
            r1.d(r2, r13, r7, r13)
            hw9 r7 = new hw9
            r15 = 4
            r7.<init>(r1, r13, r2, r15)
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r5
            int r2 = a24.X(r2)
            r7.e(r2)
            int r2 = r12.getId()
            int r7 = r9.getId()
            r1.d(r2, r8, r7, r3)
            hw9 r7 = new hw9
            r12 = 4
            r7.<init>(r1, r8, r2, r12)
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            hr1.q(r5, r12, r7)
            r7 = 6
            r12 = 0
            r1.d(r2, r7, r12, r7)
            hw9 r15 = new hw9
            r3 = 4
            r15.<init>(r1, r7, r2, r3)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            hr1.q(r5, r3, r15)
            r1.d(r2, r13, r12, r13)
            hw9 r3 = new hw9
            r7 = 4
            r3.<init>(r1, r13, r2, r7)
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r5
            int r2 = a24.X(r2)
            r3.e(r2)
            int r2 = r14.getId()
            int r3 = r9.getId()
            r7 = 4
            r1.d(r2, r8, r3, r7)
            hw9 r3 = new hw9
            r7 = 4
            r3.<init>(r1, r8, r2, r7)
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            hr1.q(r6, r7, r3)
            r3 = 6
            r7 = 0
            r1.d(r2, r3, r7, r3)
            hw9 r9 = new hw9
            r12 = 4
            r9.<init>(r1, r3, r2, r12)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            hr1.q(r5, r3, r9)
            r1.d(r2, r13, r7, r13)
            hw9 r3 = new hw9
            r7 = 4
            r3.<init>(r1, r13, r2, r7)
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r5
            int r2 = a24.X(r2)
            r3.e(r2)
            int r2 = r4.getId()
            int r3 = r14.getId()
            r4 = 4
            r1.d(r2, r8, r3, r4)
            hw9 r3 = new hw9
            r4 = 4
            r3.<init>(r1, r8, r2, r4)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            hr1.q(r6, r4, r3)
            r3 = 6
            r4 = 0
            r1.d(r2, r3, r4, r3)
            hw9 r6 = new hw9
            r7 = 4
            r6.<init>(r1, r3, r2, r7)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            hr1.q(r5, r3, r6)
            r1.d(r2, r13, r4, r13)
            hw9 r3 = new hw9
            r4 = 4
            r3.<init>(r1, r13, r2, r4)
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r5
            int r2 = a24.X(r2)
            r3.e(r2)
            int r2 = r11.getId()
            r3 = 6
            r4 = 0
            r1.d(r2, r3, r4, r3)
            hw9 r6 = new hw9
            r7 = 4
            r6.<init>(r1, r3, r2, r7)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            hr1.q(r5, r3, r6)
            r1.d(r2, r13, r4, r13)
            hw9 r3 = new hw9
            r6 = 4
            r3.<init>(r1, r13, r2, r6)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            hr1.q(r5, r6, r3)
            r3 = 4
            r1.d(r2, r3, r4, r3)
            hw9 r4 = new hw9
            r5 = 4
            r4.<init>(r1, r3, r2, r5)
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r10 = r10 * r2
            int r2 = a24.X(r10)
            r4.e(r2)
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hva.<init>(android.content.Context):void");
    }

    public final s16 getOnBackPress() {
        return this.Q0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [hva, android.view.View] */
    public final void onThemeChanged(pda pda) {
        setBackgroundColor(pda.b().i);
        ImageView imageView = this.K0;
        imageView.getBackground().setTint(pda.b().j);
        imageView.setImageTintList(ColorStateList.valueOf(pda.getIcon().i));
        this.L0.setTextColor(pda.getText().e);
        this.M0.setTextColor(pda.getText().f);
        this.N0.onThemeChanged(pda);
        this.O0.setTextColor(pda.getText().b);
        this.P0.setTextColor(-16745729);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [hc3, android.view.View] */
    public final void setDescription(Integer num) {
        TextView textView = this.M0;
        if (num != null) {
            textView.setText(num.intValue());
            textView.setVisibility(0);
        } else {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        }
        int id = textView.getVisibility() == 0 ? textView.getId() : this.L0.getId();
        bf3 p = a06.p(this);
        new og0(this.N0.getId(), 4, p).E(id).e(a24.X(((float) 16) * dh4.c().getDisplayMetrics().density));
        p.a(this);
    }

    public final void setErrorText(CharSequence charSequence) {
        TextView textView = this.O0;
        textView.setText(charSequence);
        boolean z = !(charSequence == null || charSequence.length() == 0);
        float f = 0.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (!z) {
            f = 1.0f;
        }
        textView.setAlpha(f);
        textView.animate().setDuration(200).alpha(f2).withEndAction(new t50(this, z, 11)).start();
    }

    public final void setForgotPinCodeClickListener(s16 s16) {
        TextView textView = this.P0;
        if (s16 != null) {
            textView.setVisibility(0);
            a24.a0(textView, new q6(18, s16));
            return;
        }
        textView.setVisibility(8);
        textView.setOnClickListener((View.OnClickListener) null);
    }

    public final void setListener(dc3 dc3) {
        this.N0.setListener(dc3);
    }

    public final void setLocked(boolean z) {
        this.K0.setImageResource(z ? zhc.X : zhc.q0);
    }

    public final void setOnBackPress(s16 s16) {
        this.Q0 = s16;
    }

    public final void setState(ec3 ec3) {
        this.N0.setState(ec3);
    }

    public final void setTitle(int i) {
        this.L0.setText(i);
    }
}
