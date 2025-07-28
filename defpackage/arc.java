package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: arc  reason: default package */
public final /* synthetic */ class arc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchMessageBottomWidget b;

    public /* synthetic */ arc(SearchMessageBottomWidget searchMessageBottomWidget, int i) {
        this.a = i;
        this.b = searchMessageBottomWidget;
    }

    public final Object invoke() {
        s59 s59 = km4.y0;
        SearchMessageBottomWidget searchMessageBottomWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = SearchMessageBottomWidget.w0;
                AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), (AttributeSet) null);
                appCompatTextView.setId(j2a.d);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                nge.d(nte.m, appCompatTextView);
                appCompatTextView.setTextColor(ColorStateList.valueOf(s59.r(appCompatTextView).a().d().b.b));
                appCompatTextView.setText(k2a.g);
                appCompatTextView.setLayoutParams(new re3(-2, -2));
                return appCompatTextView;
            case 1:
                k77[] k77Arr2 = SearchMessageBottomWidget.w0;
                AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), (AttributeSet) null);
                appCompatImageView.setId(j2a.g);
                float f = (float) 32;
                appCompatImageView.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
                appCompatImageView.setImageResource(i2a.d);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(s59.r(appCompatImageView).a().d().b.b));
                appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(k2a.i));
                int X = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
                appCompatImageView.setPadding(X, X, X, X);
                a24.Z(appCompatImageView, 300, new brc(searchMessageBottomWidget, 1));
                int i = s59.r(appCompatImageView).c().a.f;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                return appCompatImageView;
            case 2:
                k77[] k77Arr3 = SearchMessageBottomWidget.w0;
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), (AttributeSet) null);
                appCompatImageView2.setId(j2a.e);
                float f2 = (float) 32;
                appCompatImageView2.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
                appCompatImageView2.setImageResource(i2a.c);
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(s59.r(appCompatImageView2).a().d().b.b));
                appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(k2a.f));
                int X2 = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
                appCompatImageView2.setPadding(X2, X2, X2, X2);
                a24.Z(appCompatImageView2, 300, new brc(searchMessageBottomWidget, 0));
                int i2 = s59.r(appCompatImageView2).c().a.f;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, shapeDrawable2));
                return appCompatImageView2;
            default:
                k77[] k77Arr4 = SearchMessageBottomWidget.w0;
                View view = new View(searchMessageBottomWidget.getContext());
                view.setId(j2a.f);
                view.setLayoutParams(new re3(a24.X(((float) 1) * dh4.c().getDisplayMetrics().density), a24.X(((float) 18) * dh4.c().getDisplayMetrics().density)));
                view.setBackgroundColor(s59.r(view).a().d().b.b);
                return view;
        }
    }
}
