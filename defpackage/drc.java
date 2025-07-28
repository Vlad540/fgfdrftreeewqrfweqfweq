package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: drc  reason: default package */
public final class drc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SearchMessageBottomWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public drc(SearchMessageBottomWidget searchMessageBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = searchMessageBottomWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((drc) n((a34) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        drc drc = new drc(this.Y, continuation);
        drc.X = obj;
        return drc;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        orc.c.R1((a34) this.X);
        return jue.a;
    }
}
