package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: q9  reason: default package */
public final class q9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeButton Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q9(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeButton;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((Set) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q9 q9Var = new q9(this.Y, continuation);
        q9Var.X = obj;
        return q9Var;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int size = ((Set) this.X).size();
        OneMeButton oneMeButton = this.Y;
        if (size == 0) {
            oneMeButton.setVisibility(8);
        } else {
            oneMeButton.setVisibility(0);
            oneMeButton.c(new Integer(size), true);
        }
        return jue.a;
    }
}
