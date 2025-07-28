package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: j1f  reason: default package */
public final class j1f extends ch {
    public j1f() {
        super(0);
    }

    public final wr3 b() {
        return new ch(this.o, this.y0);
    }

    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z && view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{(float) view2.getHeight(), 0.0f}));
        } else if (!z && view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{(float) view.getHeight()}));
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    public final void n(View view) {
    }

    public j1f(long j) {
        super(j, 2);
    }
}
