package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.settings.SettingsAvatarBottomSheet;

/* renamed from: b6d  reason: default package */
public final class b6d extends LinearLayout implements mhe {
    public final AppCompatTextView a;
    public final AppCompatTextView b;
    public final LinkedHashMap c;

    public b6d(SettingsAvatarBottomSheet settingsAvatarBottomSheet, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, Context context) {
        super(context);
        AppCompatTextView appCompatTextView;
        k77[] k77Arr = SettingsAvatarBottomSheet.G0;
        settingsAvatarBottomSheet.getClass();
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), (AttributeSet) null);
        nte.c.b(appCompatTextView2, yq4.b);
        appCompatTextView2.setText(charSequence);
        appCompatTextView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        k77 k77 = SettingsAvatarBottomSheet.G0[1];
        int i = 16;
        layoutParams.bottomMargin = a24.X((((mge) settingsAvatarBottomSheet.D0.a(settingsAvatarBottomSheet)) == null ? (float) 16 : (float) 12) * dh4.c().getDisplayMetrics().density);
        addView(appCompatTextView2, layoutParams);
        this.a = appCompatTextView2;
        if (charSequence2 != null) {
            appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
            nte.m.b(appCompatTextView, yq4.b);
            appCompatTextView.setText(charSequence2);
            appCompatTextView.setGravity(17);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.bottomMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
            addView(appCompatTextView, layoutParams2);
        } else {
            appCompatTextView = null;
        }
        this.b = appCompatTextView;
        int S = ju7.S(q23.H(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(S >= 16 ? S : i);
        for (Object next : arrayList) {
            a6d a6d = (a6d) next;
            int i2 = a6d.a;
            CharSequence a2 = a6d.b.a(getContext());
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
            nte.A.b(appCompatTextView3, yq4.b);
            appCompatTextView3.setText(a2);
            appCompatTextView3.setGravity(17);
            a24.a0(appCompatTextView3, new wfc(settingsAvatarBottomSheet, i2));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            float f = (float) 15;
            layoutParams3.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
            layoutParams3.bottomMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
            addView(appCompatTextView3, layoutParams3);
            linkedHashMap.put(appCompatTextView3, next);
        }
        this.c = linkedHashMap;
        setOrientation(1);
        setGravity(17);
        onThemeChanged(km4.y0.r(this));
    }

    public final Map<TextView, a6d> getButtonViews() {
        return this.c;
    }

    public final TextView getDescriptionView() {
        return this.b;
    }

    public final TextView getTitleView() {
        return this.a;
    }

    public final void onThemeChanged(pda pda) {
        int i;
        this.a.setTextColor(pda.getText().e);
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(pda.getText().f);
        }
        for (Map.Entry entry : this.c.entrySet()) {
            TextView textView = (TextView) entry.getKey();
            int t = hr1.t(((a6d) entry.getValue()).c);
            if (t == 0) {
                i = -16745729;
            } else if (t == 1) {
                i = pda.getText().g;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            textView.setTextColor(i);
        }
    }
}
