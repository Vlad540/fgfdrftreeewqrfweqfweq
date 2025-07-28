package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: pg  reason: default package */
public final /* synthetic */ class pg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ hg c;

    public /* synthetic */ pg(View view, hg hgVar, int i) {
        this.a = i;
        this.b = view;
        this.c = hgVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                Drawable background = this.b.getBackground();
                if (background != null) {
                    background.setAlpha(this.c.a);
                    return;
                }
                return;
            case 1:
                View view = this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.height = this.c.a;
                view.setLayoutParams(marginLayoutParams);
                return;
            default:
                View view2 = this.b;
                kjd.j(view2, new Rect(0, -((int) (dh4.c().getDisplayMetrics().density * 16.0f)), view2.getWidth(), this.c.a), dh4.c().getDisplayMetrics().density * 16.0f);
                return;
        }
    }
}
