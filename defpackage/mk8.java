package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mk8  reason: default package */
public final class mk8 extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ pk8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mk8(Object obj, Continuation continuation, pk8 pk8) {
        super(2, continuation);
        this.X = obj;
        this.Y = pk8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mk8) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mk8(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        i22 i22 = (i22) this.X;
        if (i22.J()) {
            tf3 k = i22.k();
            if (k != null) {
                return ((mta) this.Y.e.getValue()).a(k, false);
            }
            throw new IllegalArgumentException("Dialog contact is not found".toString());
        }
        throw new IllegalArgumentException("Only dialogs are supported".toString());
    }
}
