package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: vaf  reason: default package */
public final class vaf extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ waf Z;
    public final /* synthetic */ i26 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vaf(waf waf, i26 i26, Continuation continuation) {
        super(2, continuation);
        this.Z = waf;
        this.w0 = i26;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vaf vaf = new vaf(this.Z, this.w0, continuation);
        vaf.Y = obj;
        return vaf;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        waf waf = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            if (((ed3) waf.b.getValue()).f()) {
                i26 i26 = this.w0;
                this.X = 1;
                if (i26.invoke(ou3, this) == pu3) {
                    return pu3;
                }
            } else {
                throw new TamErrorException(new uae("io.exception", "io connection error", (String) null));
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (TamErrorException e) {
                hcd hcd = waf.c;
                Object invoke = waf.a.invoke(e);
                this.X = 2;
                if (hcd.a(invoke, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
