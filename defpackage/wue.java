package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: wue  reason: default package */
public final class wue extends l6c implements mhe {
    public final Rect X = new Rect();
    public FrameLayout Y;
    public yq4 Z = yq4.b;
    public final uw8 a;
    public final RecyclerView b;
    public long c;
    public final x3a o = new x3a(16);

    public wue(uw8 uw8, EndlessRecyclerView2 endlessRecyclerView2) {
        this.a = uw8;
        this.b = endlessRecyclerView2;
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, x6c x6c) {
        wue.super.f(rect, view, recyclerView, x6c);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        x3a x3a = this.o;
        if (R >= 0) {
            uw8 uw8 = this.a;
            if (R < uw8.o.f.size()) {
                long j = this.c;
                if (j != 0) {
                    int J = uw8.J(j);
                    MessageModel K = uw8.K(J);
                    Long valueOf = K != null ? Long.valueOf(K.c) : null;
                    if (J == R && (valueOf == null || valueOf.longValue() != j)) {
                        rect.top = i().getMeasuredHeight() + rect.top;
                    }
                }
                x3a.E(rect, view, recyclerView);
                return;
            }
        }
        x3a.E(rect, view, recyclerView);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int J;
        MessageModel K;
        if (recyclerView.getChildCount() > 0) {
            uw8 uw8 = this.a;
            if (uw8.j() > 0) {
                long j = this.c;
                if (j != 0 && (J = uw8.J(j)) != -1) {
                    int i = 0;
                    while (true) {
                        if (i < recyclerView.getChildCount()) {
                            int i2 = i + 1;
                            View childAt = recyclerView.getChildAt(i);
                            if (childAt != null) {
                                int R = RecyclerView.R(childAt);
                                if (R == J && (K = uw8.K(R)) != null) {
                                    if (K.c != this.c) {
                                        View i3 = i();
                                        x3a x3a = this.o;
                                        Rect rect = this.X;
                                        x3a.x(rect, childAt, R);
                                        int i4 = rect.top;
                                        ViewGroup.LayoutParams layoutParams = i3.getLayoutParams();
                                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                                        int i5 = ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) / 2) + i4;
                                        canvas.save();
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) i3.getLayoutParams();
                                        int i6 = marginLayoutParams2.leftMargin;
                                        xy6.z(i6, marginLayoutParams2.topMargin, (i3.getMeasuredWidth() + i6) - marginLayoutParams2.rightMargin, (i3.getMeasuredHeight() + marginLayoutParams2.topMargin) - marginLayoutParams2.bottomMargin, i3, this.b);
                                        canvas.translate(0.0f, (float) i5);
                                        i3.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                                i = i2;
                            } else {
                                throw new IndexOutOfBoundsException();
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final View i() {
        FrameLayout frameLayout = this.Y;
        if (frameLayout != null) {
            return frameLayout;
        }
        RecyclerView recyclerView = this.b;
        int measuredWidth = recyclerView.getMeasuredWidth();
        int measuredHeight = recyclerView.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return new Space(recyclerView.getContext());
        }
        FrameLayout frameLayout2 = new FrameLayout(recyclerView.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = (float) 8;
        int X2 = a24.X(dh4.c().getDisplayMetrics().density * f);
        layoutParams.topMargin = X2;
        layoutParams.bottomMargin = X2;
        frameLayout2.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        s59 s59 = km4.y0;
        gradientDrawable.setColors(s59.r(frameLayout2).a().o().a.k);
        frameLayout2.setBackground(gradientDrawable);
        TextView textView = new TextView(recyclerView.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 17);
        int X3 = a24.X(f * dh4.c().getDisplayMetrics().density);
        layoutParams2.topMargin = X3;
        layoutParams2.bottomMargin = X3;
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setTextColor(s59.r(textView).a().o().b.b);
        textView.setText(textView.getContext().getString(c7a.k0));
        jp2.f.b(textView, this.Z);
        frameLayout2.addView(textView);
        frameLayout2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredHeight(), 0, frameLayout2.getLayoutParams().height));
        this.Y = frameLayout2;
        return frameLayout2;
    }

    public final void onThemeChanged(pda pda) {
        FrameLayout frameLayout = this.Y;
        if (frameLayout != null) {
            Drawable background = frameLayout.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(pda.a().o().a.k);
            }
            ((TextView) frameLayout.getChildAt(0)).setTextColor(pda.a().o().b.b);
        }
    }
}
