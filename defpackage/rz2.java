package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: rz2  reason: default package */
public final class rz2 extends LinearLayout implements mhe {
    public final AppCompatTextView a;
    public final OneMeButton b;
    public final OneMeButton c;

    public rz2(FrameLayout frameLayout, ClearRecentSearchBottomSheet clearRecentSearchBottomSheet, Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(appCompatTextView.getContext().getString(h2a.w));
        nge.d(nte.c, appCompatTextView);
        appCompatTextView.setTextColor(km4.y0.r(appCompatTextView).getText().e);
        this.a = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(View.generateViewId());
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        v0a v0a = v0a.c;
        oneMeButton.setSize(v0a);
        u0a u0a = u0a.o;
        oneMeButton.setMode(u0a);
        oneMeButton.setAppearance(s0a.b);
        oneMeButton.setText(h2a.v);
        a24.Z(oneMeButton, 300, new qz2(clearRecentSearchBottomSheet, 0));
        this.b = oneMeButton;
        OneMeButton oneMeButton2 = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton2.setId(View.generateViewId());
        oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton2.setSize(v0a);
        oneMeButton2.setMode(u0a);
        oneMeButton2.setAppearance(s0a.o);
        oneMeButton2.setText(h2a.u);
        a24.Z(oneMeButton2, 300, new qz2(clearRecentSearchBottomSheet, 1));
        this.c = oneMeButton2;
        setOrientation(1);
        addView(appCompatTextView);
        addView(oneMeButton);
        addView(oneMeButton2);
        float f = (float) 12;
        frameLayout.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 26) * dh4.c().getDisplayMetrics().density), a24.X(f * dh4.c().getDisplayMetrics().density), 0);
    }

    public final OneMeButton getCancel() {
        return this.c;
    }

    public final OneMeButton getConfirm() {
        return this.b;
    }

    public final AppCompatTextView getTitle() {
        return this.a;
    }

    public final void onThemeChanged(pda pda) {
        this.a.setTextColor(pda.getText().e);
        this.b.e();
        this.c.e();
    }
}
