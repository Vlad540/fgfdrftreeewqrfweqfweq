package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: ow2  reason: default package */
public final class ow2 extends g4d {
    public final /* synthetic */ int T0;
    public final View U0;
    public final View V0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ow2(View view, FrgBaseSettings frgBaseSettings, int i) {
        super(view, frgBaseSettings);
        this.T0 = i;
        switch (i) {
            case 3:
                super(view, frgBaseSettings);
                if (frgBaseSettings != null) {
                    at7.i(view, new uhe(this, 0));
                }
                Context context = view.getContext();
                r7e r7e = wce.a0;
                wce E = fja.E(context);
                ImageView imageView = (ImageView) view.findViewById(yqb.row_setting_theme__iv__selected);
                this.V0 = imageView;
                imageView.setColorFilter(E.k);
                ImageView imageView2 = (ImageView) view.findViewById(yqb.row_setting_theme__iv__forward);
                this.U0 = imageView2;
                imageView2.setColorFilter(E.k);
                imageView2.setBackground(E.a());
                if (frgBaseSettings != null) {
                    at7.i(imageView2, new uhe(this, 1));
                    return;
                }
                return;
            default:
                this.V0 = (TamAvatarView) view.findViewById(yqb.row_setting_contact__av_view);
                TextView textView = (TextView) view.findViewById(yqb.row_contact_base__tv_name);
                this.U0 = textView;
                new yge(textView, e07.a(textView.getContext())).a();
                textView.setTextColor(this.S0.F);
                ((TextView) view.findViewById(yqb.row_contact_base__tv_last_seen)).setTextColor(this.S0.M);
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(defpackage.e4d r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.T0
            switch(r0) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x00b5;
                case 2: goto L_0x008f;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A(r5, r6)
            java.lang.Object r5 = r5.X
            wce r5 = (defpackage.wce) r5
            android.view.View r0 = r4.a
            android.content.Context r0 = r0.getContext()
            boolean r1 = r5 instanceof defpackage.db4
            if (r1 == 0) goto L_0x0019
            int r1 = defpackage.cic.N2
            goto L_0x0034
        L_0x0019:
            boolean r1 = r5 instanceof defpackage.x04
            if (r1 == 0) goto L_0x0020
            int r1 = defpackage.cic.M2
            goto L_0x0034
        L_0x0020:
            boolean r1 = r5 instanceof defpackage.pb6
            if (r1 == 0) goto L_0x0027
            int r1 = defpackage.cic.O2
            goto L_0x0034
        L_0x0027:
            boolean r1 = r5 instanceof defpackage.wf8
            java.lang.String r2 = r5.a
            if (r1 == 0) goto L_0x002e
            goto L_0x0038
        L_0x002e:
            boolean r1 = r5 instanceof defpackage.ck9
            if (r1 == 0) goto L_0x0038
            int r1 = defpackage.cic.P2
        L_0x0034:
            java.lang.String r2 = r0.getString(r1)
        L_0x0038:
            android.widget.TextView r0 = r4.L0
            r0.setText(r2)
            vl r0 = defpackage.vl.o
            j2b r0 = r0.a()
            kp r0 = r0.c
            r0.getClass()
            db4 r1 = defpackage.db4.e0
            java.lang.String r1 = r1.e
            x97 r0 = r0.g
            java.lang.String r2 = "app.theme"
            java.lang.String r0 = r0.getString(r2, r1)
            java.lang.String r1 = r5.e
            boolean r0 = r1.equals(r0)
            r1 = 4
            android.view.View r2 = r4.V0
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 0
            if (r0 == 0) goto L_0x0066
            r2.setVisibility(r3)
            goto L_0x0069
        L_0x0066:
            r2.setVisibility(r1)
        L_0x0069:
            r7e r0 = defpackage.wce.a0
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r5 = r0.contains(r5)
            android.view.View r0 = r4.U0
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r5 == 0) goto L_0x007f
            r0.setVisibility(r1)
            goto L_0x0082
        L_0x007f:
            r0.setVisibility(r3)
        L_0x0082:
            if (r6 == 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            zg4 r5 = r4.J0
            int r3 = r5.B
        L_0x0089:
            android.view.View r4 = r4.P0
            at7.D(r4, r3)
            return
        L_0x008f:
            super.A(r5, r6)
            java.lang.Object r5 = r5.X
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r6 = r1g.p(r5)
            android.view.View r0 = r4.U0
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.view.View r4 = r4.V0
            if (r6 != 0) goto L_0x00ab
            r6 = 8
            r4.setVisibility(r6)
            r0.setText(r5)
            goto L_0x00b4
        L_0x00ab:
            r5 = 0
            r4.setVisibility(r5)
            int r4 = defpackage.cic.L1
            r0.setText(r4)
        L_0x00b4:
            return
        L_0x00b5:
            super.A(r5, r6)
            java.lang.Object r5 = r5.X
            tf3 r5 = (defpackage.tf3) r5
            android.view.View r6 = r4.V0
            ru.ok.messages.views.widgets.TamAvatarView r6 = (ru.ok.messages.views.widgets.TamAvatarView) r6
            r0 = 1
            r6.a(r5, r0)
            android.view.View r6 = r4.U0
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r5 = r5.d()
            r6.setText(r5)
            android.view.View r4 = r4.a
            r4.setEnabled(r0)
            return
        L_0x00d5:
            super.A(r5, r6)
            android.view.View r6 = r4.V0
            androidx.appcompat.widget.SwitchCompat r6 = (androidx.appcompat.widget.SwitchCompat) r6
            r0 = 0
            r6.setOnCheckedChangeListener(r0)
            java.lang.Object r5 = r5.X
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6.setChecked(r5)
            nw2 r5 = new nw2
            r1 = 0
            r5.<init>(r1, r4)
            r6.setOnCheckedChangeListener(r5)
            r5 = 1
            r6.setEnabled(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            android.view.View r1 = r4.U0
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r5 == 0) goto L_0x0108
            r5 = 8
            r1.setVisibility(r5)
            goto L_0x010f
        L_0x0108:
            r1.setText(r0)
            r5 = 0
            r1.setVisibility(r5)
        L_0x010f:
            e4d r5 = r4.Q0
            r5.getClass()
            r5 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r5)
            android.widget.TextView r4 = r4.L0
            r4.setAlpha(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow2.A(e4d, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ow2(ViewGroup viewGroup, LayoutInflater layoutInflater, FrgBaseSettings frgBaseSettings, int i) {
        super(viewGroup, frgBaseSettings);
        this.T0 = i;
        switch (i) {
            case 2:
                super(viewGroup, frgBaseSettings);
                View inflate = layoutInflater.inflate(zrb.row_setting_online, viewGroup, false);
                View findViewById = inflate.findViewById(yqb.row_setting_online__circle);
                this.V0 = findViewById;
                findViewById.setBackground(swb.H(Integer.valueOf(this.S0.k), (Integer) null, (Integer) null));
                TextView textView = (TextView) inflate.findViewById(yqb.row_setting_online__tv);
                this.U0 = textView;
                Context context = textView.getContext();
                r7e r7e = wce.a0;
                textView.setTextColor(fja.E(context).F);
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(yqb.row_setting__fl_value);
                frameLayout.addView(inflate);
                frameLayout.setVisibility(0);
                return;
            default:
                Context context2 = viewGroup.getContext();
                r7e r7e2 = wce.a0;
                wce E = fja.E(context2);
                View inflate2 = layoutInflater.inflate(zrb.row_setting_checkbox, viewGroup, false);
                FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(yqb.row_setting__fl_value);
                frameLayout2.addView(inflate2);
                frameLayout2.setVisibility(0);
                SwitchCompat findViewById2 = inflate2.findViewById(yqb.row_checkbox_setting__cb_check);
                this.V0 = findViewById2;
                js.c(E, findViewById2);
                TextView textView2 = (TextView) inflate2.findViewById(yqb.row_checkbox_setting__tv_value);
                this.U0 = textView2;
                textView2.setTextColor(E.M);
                at7.C(this.M0, this.J0.C);
                viewGroup.setOnClickListener(new d5(19, (Object) this));
                return;
        }
    }
}
