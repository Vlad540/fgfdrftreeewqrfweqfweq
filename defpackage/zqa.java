package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: zqa  reason: default package */
public final class zqa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeButton Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zqa(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeButton;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((zqa) n((Set) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zqa zqa = new zqa(this.Y, continuation);
        zqa.X = obj;
        return zqa;
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
