package defpackage;

import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* renamed from: gs5  reason: default package */
public final class gs5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs5(Continuation continuation, FoldersListScreen foldersListScreen) {
        super(2, continuation);
        this.Y = foldersListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((gs5) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gs5 gs5 = new gs5(continuation, this.Y);
        gs5.X = obj;
        return gs5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof a34) {
            er5.c.R1(a34);
        }
        return jue.a;
    }
}
