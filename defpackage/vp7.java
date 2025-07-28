package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vp7  reason: default package */
public final class vp7 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ List Y;
    public /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp7(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                vp7 vp7 = new vp7(3, continuation, 0);
                vp7.Y = list;
                vp7.Z = list2;
                return vp7.o(jue.a);
            case 1:
                vp7 vp72 = new vp7(3, continuation, 1);
                vp72.Y = list;
                vp72.Z = list2;
                return vp72.o(jue.a);
            case 2:
                vp7 vp73 = new vp7(3, continuation, 2);
                vp73.Y = list;
                vp73.Z = list2;
                return vp73.o(jue.a);
            default:
                vp7 vp74 = new vp7(3, continuation, 3);
                vp74.Y = list;
                vp74.Z = list2;
                return vp74.o(jue.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                List list = this.Y;
                list.addAll(this.Z);
                return list;
            case 1:
                wx3.H(obj);
                List list2 = this.Y;
                list2.addAll(this.Z);
                return list2;
            case 2:
                wx3.H(obj);
                List list3 = this.Y;
                return list3.isEmpty() ? this.Z : list3;
            default:
                wx3.H(obj);
                return o23.i0(this.Y, this.Z);
        }
    }
}
