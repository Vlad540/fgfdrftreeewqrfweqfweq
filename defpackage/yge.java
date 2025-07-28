package defpackage;

import android.util.TypedValue;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: yge  reason: default package */
public final class yge implements ou3 {
    public final /* synthetic */ ContextScope a;
    public final TextView b;
    public final yte c;
    public final float o;

    public yge(TextView textView, yte yte) {
        n3e c2 = x87.c();
        ha4 ha4 = oi4.a;
        this.a = new ContextScope(c2.plus(MainDispatcherLoader.dispatcher));
        this.b = textView;
        this.c = yte;
        this.o = textView.getTextSize();
        if (!textView.isAttachedToWindow()) {
            try {
                CancellationException cancellationException = new CancellationException("onDetach");
                cancellationException.initCause((Throwable) null);
                n1g.c(this, cancellationException);
            } catch (Throwable unused) {
            }
        } else {
            textView.addOnAttachStateChangeListener(new vge(textView, this, 1));
        }
    }

    public final void a() {
        ou3 ou3;
        yte yte = this.c;
        float floatValue = ((Number) yte.a.getValue()).floatValue();
        TextView textView = this.b;
        textView.getContext();
        textView.setTextSize(0, TypedValue.applyDimension(2, floatValue, dh4.c().getDisplayMetrics()) + this.o);
        if (textView.isAttachedToWindow()) {
            ck5 ck5 = new ck5(new w09(yte.a, this, 13), new wge(this, (Continuation) null), 5);
            try {
                ou3 = paf.b(textView);
            } catch (Throwable th) {
                ou3 = new kcc(th);
            }
            if (!(ou3 instanceof kcc)) {
                this = ou3;
            }
            ez3.N(ck5, this);
            return;
        }
        textView.addOnAttachStateChangeListener(new vge(textView, this, 0));
    }

    public final hu3 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
