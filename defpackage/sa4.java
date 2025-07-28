package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* renamed from: sa4  reason: default package */
public final class sa4 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jmd d;
    public final /* synthetic */ ta4 e;

    public sa4(ViewGroup viewGroup, View view, boolean z, jmd jmd, ta4 ta4) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = jmd;
        this.e = ta4;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        jmd jmd = this.d;
        if (z) {
            c3d.a(jmd.a, view, viewGroup);
        }
        ta4 ta4 = this.e;
        ((jmd) ta4.c.b).c(ta4);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(jmd);
        }
    }
}
