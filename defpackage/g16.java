package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.messages.settings.FrgMessagesSettings;

/* renamed from: g16  reason: default package */
public final class g16 extends l5e implements i26 {
    public final /* synthetic */ FrgMessagesSettings X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g16(FrgMessagesSettings frgMessagesSettings, Continuation continuation) {
        super(2, continuation);
        this.X = frgMessagesSettings;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g16(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        FrgMessagesSettings frgMessagesSettings = this.X;
        ((n1b) frgMessagesSettings.u1.getAccessor().c(n1b.class)).d();
        frgMessagesSettings.u1.f().O();
        return jue.a;
    }
}
