package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: m2e  reason: default package */
public final class m2e extends l5e implements i26 {
    public int X;
    public final /* synthetic */ yha Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m2e(yha yha, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = yha;
        this.Z = str;
        this.w0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new m2e(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        Integer num;
        pu3 pu3 = pu3.a;
        int i = this.X;
        yha yha = this.Y;
        if (i == 0) {
            wx3.H(obj);
            List list = (List) yha.w0;
            String str = this.Z;
            boolean f = hhd.f(str, (String) yha.X);
            int i2 = this.w0;
            if (f && (num = (Integer) yha.Y) != null && num.intValue() == i2 && list != null) {
                return list;
            }
            this.X = 1;
            jp3 jp3 = (jp3) yha.o;
            obj = xs7.U(jp3.b.a(), new hp3(jp3, str, i2, (Continuation) null), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yha.w0 = (List) obj;
        return obj;
    }
}
