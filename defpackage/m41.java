package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: m41  reason: default package */
public final class m41 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ c41 Y;
    public final /* synthetic */ r41 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m41(c41 c41, r41 r41, Continuation continuation) {
        super(2, continuation);
        this.Y = c41;
        this.Z = r41;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m41) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new m41(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        pu3 pu3 = pu3.a;
        int i = this.X;
        c41 c41 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            long longValue = ((ndf) c41).b.longValue();
            this.X = 1;
            if (ek8.q(longValue, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        grd grd = this.Z.o;
        do {
            value = grd.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            linkedHashMap.remove(Integer.valueOf(c41.getPriority()));
        } while (!grd.b(value, ju7.W(linkedHashMap)));
        return jue.a;
    }
}
