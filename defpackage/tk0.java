package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: tk0  reason: default package */
public final class tk0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ vk0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tk0(vk0 vk0, Continuation continuation) {
        super(2, continuation);
        this.Y = vk0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tk0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        grd grd;
        Object value;
        pu3 pu3 = pu3.a;
        int i = this.X;
        vk0 vk0 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            long j = vk0.l.get();
            this.X = 1;
            obj = vk0.f(vk0, (String) null, j, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wia wia = (wia) obj;
        jue jue = jue.a;
        if (wia == null) {
            return jue;
        }
        long longValue = ((Number) wia.a).longValue();
        List list = (List) wia.b;
        vk0.l.set(longValue);
        do {
            grd = vk0.h;
            value = grd.getValue();
        } while (!grd.b(value, o23.i0((List) value, list)));
        return jue;
    }
}
