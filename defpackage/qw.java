package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: qw  reason: default package */
public final class qw extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ tw Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qw(tw twVar, Continuation continuation) {
        super(2, continuation);
        this.Y = twVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((Throwable) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qw qwVar = new qw(this.Y, continuation);
        qwVar.X = obj;
        return qwVar;
    }

    public final Object o(Object obj) {
        boolean z;
        wx3.H(obj);
        Throwable th = (Throwable) this.X;
        boolean z2 = th instanceof TamErrorException;
        tw twVar = this.Y;
        if (!z2 || !iu7.F(((TamErrorException) th).a.b)) {
            String str = twVar.i;
            udd.s(str, "request failed with " + th + ". Couldn't recover", (Throwable) null);
            z = false;
        } else {
            String str2 = twVar.i;
            udd.s(str2, "request failed with " + th + ". Retrying", (Throwable) null);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
