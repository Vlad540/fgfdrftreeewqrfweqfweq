package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: yce  reason: default package */
public final class yce extends l5e implements i26 {
    public final /* synthetic */ View X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yce(View view, Continuation continuation) {
        super(2, continuation);
        this.X = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((rj5) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yce(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        View view = this.X;
        if (view.isInEditMode()) {
            db4 db4 = db4.e0;
        } else {
            Context context = view.getContext();
            r7e r7e = wce.a0;
            fja.E(context);
        }
        return jue.a;
    }
}
