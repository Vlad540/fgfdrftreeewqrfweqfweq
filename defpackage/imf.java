package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: imf  reason: default package */
public final class imf extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kmf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public imf(kmf kmf, Continuation continuation) {
        super(2, continuation);
        this.Y = kmf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((akf) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        imf imf = new imf(this.Y, continuation);
        imf.X = obj;
        return imf;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        akf akf = (akf) this.X;
        kmf kmf = this.Y;
        e57 e57 = (e57) kmf.T0.get(new Long(akf.a()));
        jue jue = jue.a;
        if (e57 == null) {
            return jue;
        }
        boolean z = akf instanceof yjf;
        ConcurrentHashMap concurrentHashMap = kmf.T0;
        if (z) {
            e57.a(yif.SUCCESS);
            concurrentHashMap.remove(new Long(((yjf) akf).a));
        } else if (akf instanceof xjf) {
            e57.a(yif.CANCELLED);
            concurrentHashMap.remove(new Long(((xjf) akf).a));
        } else if (akf instanceof zjf) {
            e57.b(new Throwable());
            concurrentHashMap.remove(new Long(((zjf) akf).a));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue;
    }
}
