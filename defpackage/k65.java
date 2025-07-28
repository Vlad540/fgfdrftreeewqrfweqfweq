package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: k65  reason: default package */
public final class k65 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ou3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k65(ou3 ou3, Continuation continuation) {
        super(2, continuation);
        this.Y = ou3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k65) n((Throwable) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k65 k65 = new k65(this.Y, continuation);
        k65.X = obj;
        return k65;
    }

    public final Object o(Object obj) {
        boolean z;
        wx3.H(obj);
        TamErrorException tamErrorException = (Throwable) this.X;
        if (!(tamErrorException instanceof TamErrorException) || !iu7.F(tamErrorException.a.b)) {
            String name = this.Y.getClass().getName();
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.w0;
                fn6.d(tn7, name, "ExternalCallback request failed with " + tamErrorException + ". Couldn't recover", (Throwable) null);
            }
            z = false;
        } else {
            String name2 = this.Y.getClass().getName();
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                tn7 tn72 = tn7.w0;
                fn62.d(tn72, name2, "ExternalCallback request failed with " + tamErrorException + ". Retrying", (Throwable) null);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
