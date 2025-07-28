package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pu6  reason: default package */
public final class pu6 extends l5e implements i26 {
    public bv6 X;
    public int Y;
    public int Z;
    public final /* synthetic */ bv6 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pu6(bv6 bv6, Continuation continuation) {
        super(2, continuation);
        this.w0 = bv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pu6(this.w0, continuation);
    }

    public final Object o(Object obj) {
        int i;
        bv6 bv6;
        pu3 pu3 = pu3.a;
        int i2 = this.Z;
        if (i2 == 0) {
            wx3.H(obj);
            bv6 = this.w0;
            String str = bv6.I0;
            if (((qna) bv6.X.getValue()).c()) {
                j46 j46 = j46.a;
                this.X = bv6;
                this.Z = 1;
                obj = bv6.a(j46, bv6, this);
                if (obj == pu3) {
                    return pu3;
                }
            } else {
                throw new IllegalStateException("storage permissions not granted".toString());
            }
        } else if (i2 == 1) {
            bv6 = this.X;
            wx3.H(obj);
        } else if (i2 == 2) {
            i = this.Y;
            try {
                wx3.H(obj);
                return new lcc(new Integer(i + ((Number) obj).intValue()));
            } catch (Throwable th) {
                return new jcc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int intValue = ((Number) obj).intValue();
        l46 l46 = l46.a;
        this.X = null;
        this.Y = intValue;
        this.Z = 2;
        Object a = bv6.a(l46, bv6, this);
        if (a == pu3) {
            return pu3;
        }
        int i3 = intValue;
        obj = a;
        i = i3;
        return new lcc(new Integer(i + ((Number) obj).intValue()));
    }
}
