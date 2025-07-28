package defpackage;

import kotlin.coroutines.Continuation;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: n63  reason: default package */
public final class n63 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ ComplaintBottomSheet w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n63(rn1 rn1, Continuation continuation, ComplaintBottomSheet complaintBottomSheet) {
        super(2, continuation);
        this.Z = rn1;
        this.w0 = complaintBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n63) n((rj5) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n63 n63 = new n63((rn1) this.Z, continuation, this.w0);
        n63.Y = obj;
        return n63;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [i7c, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            a40 a40 = new a40(new Object(), (rj5) this.Y, this.w0);
            this.X = 1;
            if (this.Z.c(a40, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
