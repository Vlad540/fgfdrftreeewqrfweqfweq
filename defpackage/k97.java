package defpackage;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: k97  reason: default package */
public final class k97 extends w9b {
    public final AppCompatEditText J0;
    public final t97 K0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k97(android.content.Context r12) {
        /*
            r11 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r12)
            r11.<init>(r0)
            androidx.appcompat.widget.AppCompatEditText r1 = new androidx.appcompat.widget.AppCompatEditText
            r2 = 0
            r1.<init>(r12, r2)
            int r3 = defpackage.tpb.profile_edit_last_name_field
            r1.setId(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r1.setLayoutParams(r3)
            r3 = 12
            float r3 = (float) r3
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r3
            int r6 = a24.X(r6)
            r7 = 16
            float r8 = (float) r7
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r8
            int r9 = a24.X(r9)
            android.content.res.Resources r10 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r3 = r3 * r10
            int r3 = a24.X(r3)
            android.content.res.Resources r10 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r8
            int r10 = a24.X(r10)
            r1.setPaddingRelative(r6, r9, r3, r10)
            r3 = 1
            r1.setSingleLine(r3)
            nge r6 = defpackage.nte.k
            r6.b(r1, defpackage.yq4.b)
            android.content.res.Resources r6 = r1.getResources()
            int r9 = defpackage.i8a.k0
            java.lang.CharSequence r6 = r6.getText(r9)
            r1.setHint(r6)
            r1.setClipToOutline(r3)
            eu3 r6 = new eu3
            android.content.res.Resources r9 = defpackage.dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = a24.X(r8)
            float r8 = (float) r8
            r6.<init>(r8)
            r1.setOutlineProvider(r6)
            int r6 = r1.getInputType()
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r1.setInputType(r6)
            r11.J0 = r1
            cc3 r6 = new cc3
            r8 = 13
            r6.<init>((android.content.Context) r12, (int) r8)
            r12 = 3
            t97 r12 = ez3.O(r12, r6)
            r11.K0 = r12
            r0.setOrientation(r3)
            r0.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r4, r5)
            r0.setLayoutParams(r12)
            r0.addView(r1)
            z9 r12 = new z9
            r1 = 17
            r12.<init>((java.lang.Object) r11, (kotlin.coroutines.Continuation) r2, (int) r1)
            urd.B(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k97.<init>(android.content.Context):void");
    }

    public final void A(pg7 pg7) {
        j97 j97 = (j97) pg7;
        String str = j97.a;
        if (str != null) {
            this.J0.setText(str);
        }
        F(j97.b);
    }

    public final void F(r33 r33) {
        t97 t97 = this.K0;
        if (t97.a() || r33 != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) t97.getValue();
            appCompatTextView.setVisibility(r33 != null ? 0 : 8);
            appCompatTextView.setText(r33 != null ? r33.a(appCompatTextView.getContext()) : null);
            jjd.f((ViewGroup) this.a, appCompatTextView, (Integer) null);
        }
    }
}
