package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vm3  reason: default package */
public final class vm3 extends l5e implements m26 {
    public final /* synthetic */ int X = 1;
    public /* synthetic */ List Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object w0;

    public /* synthetic */ vm3(int i, Continuation continuation) {
        super(i, continuation);
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.X) {
            case 0:
                l2b l2b = (l2b) obj2;
                vm3 vm3 = new vm3((ym3) this.w0, (Continuation) obj4);
                vm3.Z = (tf3) obj;
                vm3.Y = (List) obj3;
                return vm3.o(jue.a);
            default:
                vm3 vm32 = new vm3(4, (Continuation) obj4);
                vm32.Y = (List) obj;
                vm32.Z = (List) obj2;
                vm32.w0 = (List) obj3;
                return vm32.o(jue.a);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, cxd] */
    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                List list = this.Y;
                wia E = ((ym3) this.w0).E((tf3) this.Z);
                return new g5b((l5b) E.a, (List) E.b, list);
            default:
                wx3.H(obj);
                List list2 = this.Y;
                ? obj2 = new Object();
                obj2.a = list2;
                obj2.b = (List) this.Z;
                obj2.c = (List) this.w0;
                return obj2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vm3(ym3 ym3, Continuation continuation) {
        super(4, continuation);
        this.w0 = ym3;
    }
}
