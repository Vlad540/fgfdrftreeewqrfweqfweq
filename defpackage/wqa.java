package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: wqa  reason: default package */
public final class wqa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeButton Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wqa(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeButton;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((wqa) n((Set) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wqa wqa = new wqa(this.Y, continuation);
        wqa.X = obj;
        return wqa;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int size = ((Set) this.X).size();
        Integer num = new Integer(size);
        OneMeButton oneMeButton = this.Y;
        boolean z = true;
        oneMeButton.c(num, true);
        if (size <= 0) {
            z = false;
        }
        oneMeButton.setEnabled(z);
        return jue.a;
    }
}
