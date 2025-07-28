package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: ef  reason: default package */
public final class ef implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ef(View view, int i) {
        this.a = i;
        this.b = view;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        View view2 = this.b;
        switch (this.a) {
            case 0:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = eaf.a;
                r9f.c(view);
                return;
            default:
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = eaf.a;
                r9f.c(view2);
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
    }
}
