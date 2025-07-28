package defpackage;

import android.text.InputFilter;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: xp5  reason: default package */
public final class xp5 extends chd {
    public final mda J0;
    public np5 K0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xp5(android.view.View r7) {
        /*
            r6 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r7 = r7.getContext()
            r0.<init>(r7)
            r6.<init>(r0)
            mda r7 = new mda
            android.content.Context r1 = r0.getContext()
            r7.<init>(r1)
            r6.J0 = r7
            int r1 = defpackage.fpb.oneme_folders_edit_folder_name_field
            r0.setId(r1)
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            int r1 = defpackage.f5a.j
            android.content.Context r4 = r7.getContext()
            java.lang.String r1 = defpackage.d8.u(r4, r1)
            r7.setHint(r1)
            gw2 r1 = new gw2
            r4 = 12
            r1.<init>(r4, r6)
            r7.b(r1)
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r4 = 20
            r1.<init>(r4)
            r4 = 1
            android.text.InputFilter[] r4 = new android.text.InputFilter[r4]
            r5 = 0
            r4[r5] = r1
            r7.setFilters(r4)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r4 = 17
            r1.<init>(r2, r3, r4)
            r0.addView(r7, r1)
            z9 r7 = new z9
            r1 = 0
            r2 = 13
            r7.<init>(r6, r1, r2)
            defpackage.urd.B(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp5.<init>(android.view.View):void");
    }

    public final void D() {
        this.K0 = null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [xp5, b7c] */
    /* renamed from: F */
    public final void A(wp5 wp5) {
        boolean z = wp5.b;
        mda mda = this.J0;
        mda.setEnabled(z);
        mda.setTextColorAttr(z ? j9a.L : j9a.I);
        if (mda.getText().length() == 0) {
            mge mge = wp5.a;
            CharSequence b = mge != null ? mge.b(this.a.getContext().getResources()) : null;
            if (b == null) {
                b = BuildConfig.FLAVOR;
            }
            mda.setText(b);
        }
        mda.setFilters(new InputFilter[]{new InputFilter.LengthFilter(wp5.c)});
        this.K0 = null;
    }
}
