package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: fq7  reason: default package */
public final class fq7 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CharSequence Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fq7(CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = charSequence;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fq7) n((File) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fq7 fq7 = new fq7(this.Y, continuation);
        fq7.X = obj;
        return fq7;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        s5c s5c = new s5c(((File) this.X).getAbsolutePath());
        return new we7(new djc(new v9e(s5c, (Continuation) null)), this.Y.toString(), 2);
    }
}
