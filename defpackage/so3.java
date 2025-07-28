package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: so3  reason: default package */
public final class so3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeButton Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public so3(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeButton;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((so3) n((Set) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        so3 so3 = new so3(this.Y, continuation);
        so3.X = obj;
        return so3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int size = ((Set) this.X).size();
        OneMeButton oneMeButton = this.Y;
        if (size == 0) {
            oneMeButton.setVisibility(8);
            oneMeButton.c((Integer) null, true);
        } else {
            oneMeButton.setVisibility(0);
            oneMeButton.setText(h2a.I);
            oneMeButton.c(new Integer(size), true);
        }
        return jue.a;
    }
}
