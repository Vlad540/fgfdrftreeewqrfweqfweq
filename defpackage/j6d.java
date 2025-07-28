package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: j6d  reason: default package */
public final class j6d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ k6d Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j6d(k6d k6d, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = k6d;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j6d(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        long j;
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        k6d k6d = this.Y;
        if (i == 0) {
            wx3.H(obj);
            grd grd = k6d.x0;
            do {
                value = grd.getValue();
                linkedHashMap = new LinkedHashMap((Map) value);
                j = this.Z;
                linkedHashMap.remove(new Long(j));
            } while (!grd.b(value, linkedHashMap));
            this.X = 1;
            ((mn3) k6d.Z.getValue()).a(j);
            if (jue2 == jue) {
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        taf.o(k6d.C0, new x5d(new hge(xaa.f)));
        return jue2;
    }
}
