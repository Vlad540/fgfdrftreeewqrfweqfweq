package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* renamed from: gwa  reason: default package */
public final class gwa extends AnimatorListenerAdapter {
    public final /* synthetic */ hwa a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ RectF d;
    public final /* synthetic */ s16 e;

    public gwa(hwa hwa, View view, cf1 cf1, RectF rectF, k61 k61) {
        this.a = hwa;
        this.b = view;
        this.c = cf1;
        this.d = rectF;
        this.e = k61;
    }

    public final void onAnimationCancel(Animator animator) {
        hwa hwa = this.a;
        hwa.getClass();
        cf1 cf1 = (cf1) this.c;
        View view = this.b;
        hwa.a(hwa, view, cf1, this.d);
        this.e.invoke();
        if (hwa.b()) {
            view.setLayerType(0, (Paint) null);
            cf1.setLayerType(0, (Paint) null);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        hwa hwa = this.a;
        hwa.getClass();
        cf1 cf1 = (cf1) this.c;
        View view = this.b;
        hwa.a(hwa, view, cf1, this.d);
        this.e.invoke();
        if (hwa.b()) {
            view.setLayerType(0, (Paint) null);
            cf1.setLayerType(0, (Paint) null);
        }
    }
}
