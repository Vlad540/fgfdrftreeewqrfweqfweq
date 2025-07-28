package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* renamed from: i9e  reason: default package */
public final class i9e extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public ValueAnimator a;
    public final /* synthetic */ TabLayout b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i9e(TabLayout tabLayout, Context context) {
        super(context);
        this.b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        TabLayout tabLayout = this.b;
        if (tabLayout.m1 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            j06 j06 = tabLayout.a1;
            Drawable drawable = tabLayout.G0;
            j06.getClass();
            RectF c2 = j06.c(tabLayout, childAt);
            drawable.setBounds((int) c2.left, drawable.getBounds().top, (int) c2.right, drawable.getBounds().bottom);
            tabLayout.a = i;
        }
    }

    public final void b(int i) {
        TabLayout tabLayout = this.b;
        Rect bounds = tabLayout.G0.getBounds();
        tabLayout.G0.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        TabLayout tabLayout = this.b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.G0;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.G0.getBounds().bottom);
        } else {
            tabLayout.a1.g(tabLayout, view, view2, f, tabLayout.G0);
        }
        WeakHashMap weakHashMap = eaf.a;
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i2, boolean z) {
        TabLayout tabLayout = this.b;
        if (tabLayout.a != i) {
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.a = i;
            zl zlVar = new zl(this, childAt, childAt2, 1);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.a = valueAnimator;
                valueAnimator.setInterpolator(tabLayout.b1);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(zlVar);
                valueAnimator.start();
                return;
            }
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(zlVar);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        TabLayout tabLayout = this.b;
        int height = tabLayout.G0.getBounds().height();
        if (height < 0) {
            height = tabLayout.G0.getIntrinsicHeight();
        }
        int i2 = tabLayout.T0;
        if (i2 == 0) {
            i = getHeight() - height;
            height = getHeight();
        } else if (i2 != 1) {
            i = 0;
            if (i2 != 2) {
                height = i2 != 3 ? 0 : getHeight();
            }
        } else {
            i = (getHeight() - height) / 2;
            height = (getHeight() + height) / 2;
        }
        if (tabLayout.G0.getBounds().width() > 0) {
            Rect bounds = tabLayout.G0.getBounds();
            tabLayout.G0.setBounds(bounds.left, i, bounds.right, height);
            tabLayout.G0.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        TabLayout tabLayout = this.b;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            if (tabLayout.a == -1) {
                tabLayout.a = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.a);
            return;
        }
        d(tabLayout.getSelectedTabPosition(), -1, false);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.b;
            boolean z = true;
            if (tabLayout.R0 == 1 || tabLayout.U0 == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (((int) gwf.m(getContext(), 16)) * 2)) {
                        boolean z2 = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                            if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i3;
                                layoutParams.weight = 0.0f;
                                z2 = true;
                            }
                        }
                        z = z2;
                    } else {
                        tabLayout.R0 = 0;
                        tabLayout.s(false);
                    }
                    if (z) {
                        super.onMeasure(i, i2);
                    }
                }
            }
        }
    }
}
