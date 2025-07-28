package defpackage;

import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: ri2  reason: default package */
public final class ri2 extends w9b {
    public final mda J0;
    public final t97 K0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ri2(android.content.Context r10) {
        /*
            r9 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r10)
            r9.<init>(r0)
            mda r1 = new mda
            r1.<init>(r10)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r1.setLayoutParams(r2)
            int r2 = defpackage.j9a.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setBackgroundColorAttr(r2)
            int r2 = defpackage.j9a.M
            r1.setHintColorAttr(r2)
            r2 = 1
            r1.setClipToOutline(r2)
            eu3 r5 = new eu3
            r6 = 16
            float r7 = (float) r6
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = a24.X(r7)
            float r7 = (float) r7
            r5.<init>(r7)
            r1.setOutlineProvider(r5)
            r9.J0 = r1
            b5 r5 = new b5
            r7 = 28
            r5.<init>((android.content.Context) r10, (int) r7)
            r10 = 3
            t97 r10 = ez3.O(r10, r5)
            r9.K0 = r10
            r0.setOrientation(r2)
            r0.setGravity(r6)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r3, r4)
            r0.setLayoutParams(r10)
            r0.addView(r1)
            r10 = 0
            r0.setBackground(r10)
            z9 r1 = new z9
            r2 = 3
            r1.<init>((java.lang.Object) r9, (kotlin.coroutines.Continuation) r10, (int) r2)
            urd.B(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri2.<init>(android.content.Context):void");
    }

    public final void A(pg7 pg7) {
        qi2 qi2 = (qi2) pg7;
        mge mge = qi2.b;
        mge.getClass();
        Object b = mge.b(this.a.getContext().getResources());
        if (b == null) {
            b = "";
        }
        String obj = b.toString();
        mda mda = this.J0;
        mda.setHint(obj);
        mda.setFilters(new InputFilter[]{new InputFilter.LengthFilter(qi2.o)});
        String str = qi2.a;
        if (str != null) {
            mda.setText(str);
        }
        F(qi2.c);
    }

    public final void F(r33 r33) {
        t97 t97 = this.K0;
        if (t97.a() || r33 != null) {
            TextView textView = (TextView) t97.getValue();
            textView.setVisibility(r33 != null ? 0 : 8);
            textView.setText(r33 != null ? r33.a(textView.getContext()) : null);
            jjd.g(textView, (ViewGroup) this.a);
        }
    }
}
