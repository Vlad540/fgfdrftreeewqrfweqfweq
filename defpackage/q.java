package defpackage;

import kotlin.coroutines.Continuation;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.sdk.arch.Widget;

/* renamed from: q  reason: default package */
public final class q extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AboutAppSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Continuation continuation, AboutAppSettingsScreen aboutAppSettingsScreen) {
        super(2, continuation);
        this.Y = aboutAppSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((q) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q qVar = new q(continuation, this.Y);
        qVar.X = obj;
        return qVar;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        u uVar = (sg9) this.X;
        boolean f = hhd.f(uVar, v03.b);
        Widget widget = this.Y;
        if (f) {
            widget.getRouter().C();
        } else if (uVar instanceof u) {
            hhd.q(widget.getContext(), uVar.b);
        }
        return jue.a;
    }
}
