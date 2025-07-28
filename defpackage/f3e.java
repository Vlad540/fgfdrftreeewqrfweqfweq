package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* renamed from: f3e  reason: default package */
public final /* synthetic */ class f3e implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuggestionsWidget b;

    public /* synthetic */ f3e(SuggestionsWidget suggestionsWidget, int i) {
        this.a = i;
        this.b = suggestionsWidget;
    }

    public final Object invoke() {
        s59 s59 = km4.y0;
        SuggestionsWidget suggestionsWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = SuggestionsWidget.F0;
                return new v2e(suggestionsWidget, ((x4a) xuf.a.getAccessor().d(x4a.class).getValue()).b());
            case 1:
                k77[] k77Arr2 = SuggestionsWidget.F0;
                FrameLayout frameLayout = new FrameLayout(suggestionsWidget.getContext());
                frameLayout.setId(y9a.D);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(((float) 36) * dh4.c().getDisplayMetrics().density), a24.X(((float) 5) * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 49;
                layoutParams.topMargin = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 40.0f));
                frameLayout.setBackgroundColor(s59.r(frameLayout).getIcon().g);
                return frameLayout;
            case 2:
                k77[] k77Arr3 = SuggestionsWidget.F0;
                RecyclerView ty4 = new ty4(suggestionsWidget.getContext(), (AttributeSet) null);
                ty4.setId(y9a.F);
                ty4.setClipToPadding(false);
                ty4.setLayoutParams(new re3(-1, -2));
                ty4.getContext();
                ty4.setLayoutManager(new LinearLayoutManager());
                ty4.setPager(new t61(suggestionsWidget, 11));
                ty4.setThreshold(3);
                return ty4;
            case 3:
                k77[] k77Arr4 = SuggestionsWidget.F0;
                AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), (AttributeSet) null);
                appCompatImageView.setId(y9a.z);
                float f = (float) 44;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                layoutParams2.gravity = 19;
                appCompatImageView.setLayoutParams(layoutParams2);
                int X = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                appCompatImageView.setPadding(X, X, X, X);
                appCompatImageView.setImageResource(l9a.c);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(s59.r(appCompatImageView).getIcon().f));
                a24.a0(appCompatImageView, new wfc(8, suggestionsWidget));
                int i = s59.r(appCompatImageView).c().a.f;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                return appCompatImageView;
            case 4:
                k77[] k77Arr5 = SuggestionsWidget.F0;
                AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), (AttributeSet) null);
                appCompatTextView.setId(y9a.G);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, a24.X(((float) 44) * dh4.c().getDisplayMetrics().density));
                layoutParams3.gravity = 17;
                appCompatTextView.setLayoutParams(layoutParams3);
                nte.z.b(appCompatTextView, yq4.b);
                appCompatTextView.setGravity(17);
                appCompatTextView.setTextColor(s59.r(appCompatTextView).getText().e);
                appCompatTextView.setText(z9a.r);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                return appCompatTextView;
            case 5:
                k77[] k77Arr6 = SuggestionsWidget.F0;
                FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                frameLayout2.setId(y9a.A);
                k77[] k77Arr7 = SuggestionsWidget.F0;
                k77 k77 = k77Arr7[4];
                frameLayout2.addView((AppCompatImageView) suggestionsWidget.B0.getValue());
                k77 k772 = k77Arr7[5];
                frameLayout2.addView((AppCompatTextView) suggestionsWidget.C0.getValue());
                frameLayout2.setVisibility(8);
                ek8.h(frameLayout2);
                return frameLayout2;
            default:
                k77[] k77Arr8 = SuggestionsWidget.F0;
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), (AttributeSet) null);
                appCompatTextView2.setId(y9a.C);
                appCompatTextView2.setLayoutParams(new re3(-2, -2));
                nte.m.b(appCompatTextView2, yq4.b);
                appCompatTextView2.setTextColor(s59.r(appCompatTextView2).getText().g);
                appCompatTextView2.setText(z9a.q);
                appCompatTextView2.setMaxLines(1);
                appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView2.setVisibility(8);
                float f2 = (float) 16;
                appCompatTextView2.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), 0, a24.X(f2 * dh4.c().getDisplayMetrics().density), 0);
                ek8.h(appCompatTextView2);
                return appCompatTextView2;
        }
    }
}
