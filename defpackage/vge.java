package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: vge  reason: default package */
public final class vge implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ yge c;

    public /* synthetic */ vge(View view, yge yge, int i) {
        this.a = i;
        this.b = view;
        this.c = yge;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        ac7 ac7;
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                ac7 ac72 = this.c;
                ck5 ck5 = new ck5(new w09(ac72.c.a, ac72, 13), new wge(ac72, (Continuation) null), 5);
                try {
                    ac7 = paf.b(ac72.b);
                } catch (Throwable th) {
                    ac7 = new kcc(th);
                }
                if (!(ac7 instanceof kcc)) {
                    ac72 = ac7;
                }
                ez3.N(ck5, (ou3) ac72);
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                yge yge = this.c;
                try {
                    CancellationException cancellationException = new CancellationException("onDetach");
                    cancellationException.initCause((Throwable) null);
                    n1g.c(yge, cancellationException);
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
