package defpackage;

import android.view.View;

/* renamed from: kc7  reason: default package */
public final class kc7 implements nc7, View.OnAttachStateChangeListener {
    public pc7 a;

    public final pc7 R() {
        return this.a;
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.a.d == ob7.a) {
            this.a = new pc7(this);
        }
        this.a.d(nb7.ON_START);
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.a.d.a(ob7.c)) {
            this.a.d(nb7.ON_DESTROY);
        }
    }
}
