package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: l6  reason: default package */
public final class l6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.O0 = null;
                actionBarOverlayLayout.B0 = false;
                return;
            case 11:
                ((bcf) this.b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.O0 = null;
                actionBarOverlayLayout.B0 = false;
                return;
            case 1:
                sf sfVar = (sf) this.b;
                ArrayList arrayList = new ArrayList(sfVar.X);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ne) arrayList.get(i)).a(sfVar);
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                xi0 xi0 = (xi0) this.b;
                vbe r = gwf.r(xi0);
                Iterator it = xi0.D0.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) r.a).remove((fme) it.next());
                }
                return;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                bottomSheetBehavior.L(5);
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.U.get()).requestLayout();
                    return;
                }
                return;
            case 4:
                kp4 kp4 = (kp4) this.b;
                kp4.q();
                kp4.r.start();
                return;
            case 5:
                lj5 lj5 = ((mj5) this.b).y0;
                if (lj5 != null) {
                    lj5.a();
                    return;
                }
                return;
            case 6:
                ((HideBottomViewOnScrollBehavior) this.b).h = null;
                return;
            case 8:
                wv7 wv7 = (wv7) this.b;
                wv7.b.setTranslationY(0.0f);
                wv7.b(0.0f);
                return;
            case 9:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                sideSheetBehavior.y(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    return;
                }
                return;
            case 10:
                ((cre) this.b).o();
                animator.removeListener(this);
                return;
            case 11:
                ((bcf) this.b).c();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 7:
                super.onAnimationRepeat(animator);
                xc7 xc7 = (xc7) this.b;
                xc7.Z = (xc7.Z + 1) % xc7.Y.c.length;
                xc7.w0 = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                sf sfVar = (sf) this.b;
                ArrayList arrayList = new ArrayList(sfVar.X);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ne) arrayList.get(i)).b(sfVar);
                }
                return;
            case 11:
                ((bcf) this.b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public l6(bcf bcf, View view) {
        this.a = 11;
        this.b = bcf;
    }
}
