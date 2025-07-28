package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* renamed from: r85  reason: default package */
public final class r85 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r85(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int width;
        int width2;
        ln lnVar;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                FastScroller fastScroller = (FastScroller) obj;
                fastScroller.requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    int i = FastScroller.F0;
                    fastScroller.getClass();
                    fastScroller.D0 = true;
                    if (fastScroller.c()) {
                        float rawY = motionEvent.getRawY();
                        View view2 = fastScroller.o;
                        int[] iArr = {0, (int) view2.getY()};
                        ((View) view2.getParent()).getLocationInWindow(iArr);
                        f = rawY - ((float) iArr[1]);
                        width = fastScroller.getHeight();
                        width2 = fastScroller.o.getHeight();
                    } else {
                        float rawX = motionEvent.getRawX();
                        View view3 = fastScroller.o;
                        int[] iArr2 = {(int) view3.getX(), 0};
                        ((View) view3.getParent()).getLocationInWindow(iArr2);
                        f = rawX - ((float) iArr2[0]);
                        width = fastScroller.getWidth();
                        width2 = fastScroller.o.getWidth();
                    }
                    float f2 = f / ((float) (width - width2));
                    fastScroller.setScrollerPosition(f2);
                    fastScroller.setRecyclerViewPosition(f2);
                    return true;
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    fastScroller.D0 = false;
                    fastScroller.getClass();
                    return true;
                }
            case 1:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                xg7 xg7 = (xg7) obj;
                if (action == 0 && (lnVar = xg7.O0) != null && lnVar.isShowing() && x >= 0 && x < xg7.O0.getWidth() && y >= 0 && y < xg7.O0.getHeight()) {
                    xg7.K0.postDelayed(xg7.G0, 250);
                } else if (action == 1) {
                    xg7.K0.removeCallbacks(xg7.G0);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
