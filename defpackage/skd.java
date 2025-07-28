package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: skd  reason: default package */
public final class skd extends l5e implements i26 {
    public s16 X;
    public int Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ s16 w0;
    public final /* synthetic */ vkd x0;
    public final /* synthetic */ u16 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public skd(ArrayList arrayList, gc3 gc3, vkd vkd, okd okd, Continuation continuation) {
        super(2, continuation);
        this.Z = arrayList;
        this.w0 = gc3;
        this.x0 = vkd;
        this.y0 = okd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new skd((ArrayList) this.Z, this.w0, this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        s16 s16;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            List list = this.Z;
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    xs7.E(this.x0.a, (hu3) null, (ru3) null, new rkd(i2, this.y0, (hx6) next, (Continuation) null), 3);
                    i2 = i3;
                } else {
                    p23.G();
                    throw null;
                }
            }
            s16 s162 = this.w0;
            if (s162 != null) {
                this.X = s162;
                this.Y = 1;
                if (ek8.q(((long) list.size()) * 100, this) == pu3) {
                    return pu3;
                }
                s16 = s162;
            }
            return jue.a;
        } else if (i == 1) {
            s16 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s16.invoke();
        return jue.a;
    }
}
