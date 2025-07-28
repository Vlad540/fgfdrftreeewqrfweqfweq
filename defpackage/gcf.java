package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: gcf  reason: default package */
public final class gcf implements View.OnAttachStateChangeListener {
    public qod a;
    public final /* synthetic */ k26 b;
    public final /* synthetic */ View c;

    public gcf(k26 k26, View view) {
        this.b = k26;
        this.c = view;
    }

    public final void onViewAttachedToWindow(View view) {
        qod qod = this.a;
        if (qod == null || !qod.isActive()) {
            this.a = ez3.N(new ck5((t0c) km4.y0.n(view.getContext()).x0, new fcf(this.b, this.c, (Continuation) null), 5), paf.b(view));
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        qod qod = this.a;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        this.a = null;
    }
}
