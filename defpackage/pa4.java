package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* renamed from: pa4  reason: default package */
public final class pa4 implements Animation.AnimationListener {
    public final /* synthetic */ jmd a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ qa4 d;

    public pa4(jmd jmd, ViewGroup viewGroup, View view, qa4 qa4) {
        this.a = jmd;
        this.b = viewGroup;
        this.c = view;
        this.d = qa4;
    }

    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.b;
        viewGroup.post(new g5(viewGroup, this.c, this.d, 18));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }
}
