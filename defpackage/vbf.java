package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: vbf  reason: default package */
public final class vbf extends RecyclerView {
    public final /* synthetic */ ViewPager2 Z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vbf(ViewPager2 viewPager2, Context context) {
        super(context, (AttributeSet) null);
        this.Z1 = viewPager2;
    }

    public final CharSequence getAccessibilityClassName() {
        this.Z1.L0.getClass();
        return super.getAccessibilityClassName();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.Z1;
        accessibilityEvent.setFromIndex(viewPager2.o);
        accessibilityEvent.setToIndex(viewPager2.o);
        accessibilityEvent.setSource((ViewPager2) viewPager2.L0.o);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.Z1.J0 && super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.Z1.J0 && super.onTouchEvent(motionEvent);
    }
}
