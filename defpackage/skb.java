package defpackage;

import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: skb  reason: default package */
public final class skb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vkb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public skb(Continuation continuation, vkb vkb) {
        super(2, continuation);
        this.Y = vkb;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        skb skb = new skb(continuation, this.Y);
        skb.X = obj;
        return skb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        fkb fkb = (fkb) this.X;
        float f = vkb.L0;
        vkb vkb = this.Y;
        vkb.getClass();
        if (fkb instanceof ekb) {
            os1 cameraApi = vkb.getCameraApi();
            ExecutorService executorService = vkb.w0;
            if (executorService == null) {
                executorService = null;
            }
            cameraApi.d(executorService);
        } else if (fkb instanceof ckb) {
            vkb.getCameraApi().a(((ckb) fkb).a);
        } else if (fkb instanceof dkb) {
            vkb.getCameraApi().g();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
