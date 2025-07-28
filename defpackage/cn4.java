package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cn4  reason: default package */
public final class cn4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn4 b;

    public /* synthetic */ cn4(dn4 dn4, int i) {
        this.a = i;
        this.b = dn4;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                dn4 dn4 = this.b;
                cn4.super.setVisible(false, false);
                ArrayList arrayList = dn4.Y;
                if (arrayList != null && !dn4.Z) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ne) it.next()).a(dn4);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                dn4 dn4 = this.b;
                ArrayList arrayList = dn4.Y;
                if (arrayList != null && !dn4.Z) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ne) it.next()).b(dn4);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
