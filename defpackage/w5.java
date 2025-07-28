package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.ActChatPickerCompat;

/* renamed from: w5  reason: default package */
public final class w5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ List Y = hw4.a;
    public final /* synthetic */ ActChatPickerCompat Z;
    public final /* synthetic */ t52 w0;
    public final /* synthetic */ ArrayList x0;
    public final /* synthetic */ ArrayList y0;
    public final /* synthetic */ String z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w5(ActChatPickerCompat actChatPickerCompat, t52 t52, ArrayList arrayList, ArrayList arrayList2, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = actChatPickerCompat;
        this.w0 = t52;
        this.x0 = arrayList;
        this.y0 = arrayList2;
        this.z0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w5(this.Z, this.w0, this.x0, this.y0, this.z0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            for (tf3 tf3 : this.Y) {
                long n = tf3.n();
                t52 t52 = this.w0;
                i22 E = t52.E(n);
                ArrayList arrayList = this.x0;
                ArrayList arrayList2 = this.y0;
                if (E != null) {
                    arrayList.add(new Long(E.a));
                    arrayList2.add(new Long(E.b.a));
                } else {
                    i22 b = t52.b(n62.a, hr1.o(tf3.n()), (String) null, (String) null);
                    arrayList.add(new Long(b.a));
                    arrayList2.add(new Long(b.b.a));
                }
            }
            int i2 = ActChatPickerCompat.P0;
            zr7 immediate = ((pae) this.Z.O0.getValue()).c().getImmediate();
            v5 v5Var = new v5(this.Z, this.x0, this.z0, this.y0, (Continuation) null);
            this.X = 1;
            if (xs7.U(immediate, v5Var, this) == pu3) {
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
