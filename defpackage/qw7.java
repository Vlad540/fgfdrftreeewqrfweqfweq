package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: qw7  reason: default package */
public final class qw7 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ rw7 c;

    public qw7(rw7 rw7, boolean z, int i) {
        this.c = rw7;
        this.a = z;
        this.b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        rw7 rw7 = this.c;
        rw7.b.setTranslationX(0.0f);
        rw7.a(0.0f, this.a, this.b);
    }
}
