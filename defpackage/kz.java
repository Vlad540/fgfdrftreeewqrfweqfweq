package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kz  reason: default package */
public final class kz extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lz Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kz(lz lzVar, Continuation continuation) {
        super(2, continuation);
        this.Y = lzVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((nyb) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kz kzVar = new kz(this.Y, continuation);
        kzVar.X = obj;
        return kzVar;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        lz lzVar = this.Y;
        lzVar.e.m((Object) null, lzVar.a((nyb) this.X));
        return jue.a;
    }
}
