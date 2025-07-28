package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* renamed from: mpc  reason: default package */
public abstract class mpc {
    public FastScroller a;
    public ns7 b;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, ru1] */
    public final ns7 a() {
        if (this.b == null) {
            View view = ((ka4) this).c;
            int i = klb.fastscroll__default_show;
            int i2 = klb.fastscroll__default_hide;
            ? obj = new Object();
            obj.c = view;
            obj.a = 1.0f;
            obj.b = 1.0f;
            AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
            animatorSet.setStartDelay((long) 1000);
            animatorSet.setTarget(view);
            ((AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i)).setTarget(view);
            animatorSet.addListener(new qs3(view));
            obj.a();
            this.b = new ns7(obj);
        }
        return this.b;
    }
}
