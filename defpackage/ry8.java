package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: ry8  reason: default package */
public final class ry8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ry8(zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ry8(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        zz8 zz8 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ArrayList c = ((tw8) zz8.s1.getValue()).c();
            ArrayList arrayList = new ArrayList(q23.H(c, 10));
            Iterator it = c.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((MessageModel) it.next()).a));
            }
            long j = zz8.b.a;
            this.X = 1;
            obj = ((e29) zz8.M0.getValue()).b(j, arrayList, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((Boolean) obj).booleanValue()) {
            zr7 c2 = zz8.Y.c();
            qy8 qy8 = new qy8(zz8, (Continuation) null);
            this.X = 2;
            if (xs7.U(c2, qy8, this) == pu3) {
                return pu3;
            }
        }
        return jue.a;
    }
}
