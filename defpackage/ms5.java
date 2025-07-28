package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;

/* renamed from: ms5  reason: default package */
public final class ms5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ os5 Y;
    public final /* synthetic */ ep5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ms5(os5 os5, ep5 ep5, Continuation continuation) {
        super(2, continuation);
        this.Y = os5;
        this.Z = ep5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ms5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ms5(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        int i;
        pu3 pu3 = pu3.a;
        int i2 = this.X;
        jue jue = jue.a;
        if (i2 == 0) {
            wx3.H(obj);
            os5 os5 = this.Y;
            List list = (List) os5.X.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((xye) listIterator.previous()).b == wye.b) {
                        i = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            ep5 a = ep5.a(this.Z, (String) null, i + 1, (List) null, 262135);
            this.X = 1;
            b92 b92 = os5.b;
            b92.getClass();
            Object U = xs7.U(b92.Y, new j82(b92, a, (s16) null, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i2 == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
