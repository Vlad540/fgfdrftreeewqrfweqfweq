package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* renamed from: he2  reason: default package */
public final class he2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public he2(Continuation continuation, ChatMediaTabWidget chatMediaTabWidget) {
        super(2, continuation);
        this.Y = chatMediaTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        he2 he2 = new he2(continuation, this.Y);
        he2.X = obj;
        return he2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        de2 de2 = (de2) this.X;
        k77[] k77Arr = ChatMediaTabWidget.A0;
        ChatMediaTabWidget chatMediaTabWidget = this.Y;
        chatMediaTabWidget.getClass();
        k77 k77 = ChatMediaTabWidget.A0[0];
        nea nea = (nea) chatMediaTabWidget.X.getValue();
        nea.setTitle(de2.b);
        nea.setAvatar(de2.a);
        return jue.a;
    }
}
