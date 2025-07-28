package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: xu8  reason: default package */
public final class xu8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xu8(Continuation continuation, MessageWriteWidget messageWriteWidget, View view) {
        super(2, continuation);
        this.Y = messageWriteWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xu8 xu8 = new xu8(continuation, this.Y, this.Z);
        xu8.X = obj;
        return xu8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = MessageWriteWidget.J0;
        this.Y.p0().setInputHint(((mge) this.X).a(this.Z.getContext()));
        return jue.a;
    }
}
