package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: zce  reason: default package */
public final class zce extends l5e implements i26 {
    public final /* synthetic */ ade X;
    public final /* synthetic */ View Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zce(ade ade, View view, Continuation continuation) {
        super(2, continuation);
        this.X = ade;
        this.Y = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((wce) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zce(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wce wce;
        wx3.H(obj);
        View view = this.Y;
        if (view.isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context = view.getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context);
        }
        this.X.z(wce);
        return jue.a;
    }
}
