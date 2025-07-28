package defpackage;

import android.os.Build;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: eg0  reason: default package */
public final class eg0 extends l5e implements i26 {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ fg0 y0;
    public final /* synthetic */ sf0 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eg0(fg0 fg0, sf0 sf0, Continuation continuation) {
        super(2, continuation);
        this.y0 = fg0;
        this.z0 = sf0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eg0) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eg0 eg0 = new eg0(this.y0, this.z0, continuation);
        eg0.x0 = obj;
        return eg0;
    }

    public final Object o(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        pu3 pu3 = pu3.a;
        int i = this.w0;
        fg0 fg0 = this.y0;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.x0;
            boolean z5 = !((qna) fg0.a.getValue()).b(qna.f);
            t97 t97 = fg0.a;
            qna qna = (qna) t97.getValue();
            if (Build.VERSION.SDK_INT >= 33) {
                z4 = qna.b(qna.k);
            } else {
                qna.getClass();
                z4 = true;
            }
            boolean z6 = !z4;
            boolean z7 = !((qna) t97.getValue()).b(qna.h);
            t97 t972 = fg0.d;
            this.X = z5;
            this.Y = z6;
            this.Z = z7;
            this.w0 = 1;
            obj = new dd0(new yc4[]{xs7.d(ou3, ((pae) t972.getValue()).b(), new bg0(fg0, (Continuation) null), 2), xs7.d(ou3, ((pae) t972.getValue()).b(), new cg0(fg0, (Continuation) null), 2), xs7.d(ou3, ((pae) t972.getValue()).a(), new dg0(this.z0, (Continuation) null), 2)}).a(this);
            if (obj == pu3) {
                return pu3;
            }
            z = z5;
            z3 = z7;
            z2 = z6;
        } else if (i == 1) {
            z3 = this.Z;
            z2 = this.Y;
            z = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
        boolean booleanValue3 = ((Boolean) list.get(2)).booleanValue();
        fg0.e = z;
        fg0.g = z2;
        fg0.f = z3;
        return jue.a;
    }
}
