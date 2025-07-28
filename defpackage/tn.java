package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: tn  reason: default package */
public final class tn implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                co coVar = (co) this.b;
                if (!coVar.getInternalPopup().a()) {
                    coVar.x0.m(coVar.getTextDirection(), coVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = coVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 1:
                zn znVar = (zn) this.b;
                co coVar2 = znVar.T0;
                znVar.getClass();
                if (!coVar2.isAttachedToWindow() || !coVar2.getGlobalVisibleRect(znVar.R0)) {
                    znVar.dismiss();
                    return;
                }
                znVar.r();
                znVar.g();
                return;
            case 2:
                dx1 dx1 = (dx1) this.b;
                if (dx1.a()) {
                    ArrayList arrayList = dx1.x0;
                    if (arrayList.size() > 0 && !((cx1) arrayList.get(0)).a.N0) {
                        View view = dx1.E0;
                        if (view == null || !view.isShown()) {
                            dx1.dismiss();
                            return;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((cx1) it.next()).a.g();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                d dVar = (d) this.b;
                dVar.S0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = dVar.V0;
                if (hashSet == null || hashSet.size() == 0) {
                    dVar.k(true);
                    return;
                }
                la8 la8 = new la8(0, dVar);
                int firstVisiblePosition = dVar.S0.getFirstVisiblePosition();
                boolean z = false;
                for (int i = 0; i < dVar.S0.getChildCount(); i++) {
                    View childAt = dVar.S0.getChildAt(i);
                    if (dVar.V0.contains((xb8) dVar.T0.getItem(firstVisiblePosition + i))) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration((long) dVar.w1);
                        alphaAnimation.setFillEnabled(true);
                        alphaAnimation.setFillAfter(true);
                        if (!z) {
                            alphaAnimation.setAnimationListener(la8);
                            z = true;
                        }
                        childAt.clearAnimation();
                        childAt.startAnimation(alphaAnimation);
                    }
                }
                return;
            default:
                tod tod = (tod) this.b;
                if (tod.a() && !tod.x0.N0) {
                    View view2 = tod.C0;
                    if (view2 == null || !view2.isShown()) {
                        tod.dismiss();
                        return;
                    } else {
                        tod.x0.g();
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
