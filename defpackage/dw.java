package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: dw  reason: default package */
public final class dw extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fw Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw(fw fwVar, Continuation continuation) {
        super(2, continuation);
        this.Y = fwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dw(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            fw fwVar = this.Y;
            if (fwVar.e.a()) {
                ((wxc) fwVar.e.getValue()).c();
            }
            t97 t97 = fwVar.f;
            if (t97.a()) {
                ((wxc) t97.getValue()).c();
            }
            List<MessageModel> list = ((tw8) fwVar.A.getValue()).a;
            ArrayList arrayList = new ArrayList(q23.H(list, 10));
            for (MessageModel messageModel : list) {
                arrayList.add(new Long(messageModel.a));
            }
            pp8 pp8 = new pp8(arrayList);
            this.X = 1;
            if (fwVar.n(pp8, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
