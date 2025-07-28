package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: my  reason: default package */
public final class my extends l5e implements i26 {
    public final /* synthetic */ boolean A0;
    public Integer X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ ny w0;
    public final /* synthetic */ vo8 x0;
    public final /* synthetic */ int y0;
    public final /* synthetic */ Long z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public my(ny nyVar, vo8 vo8, int i, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.w0 = nyVar;
        this.x0 = vo8;
        this.y0 = i;
        this.z0 = l;
        this.A0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        my myVar = new my(this.w0, this.x0, this.y0, this.z0, this.A0, continuation);
        myVar.Z = obj;
        return myVar;
    }

    public final Object o(Object obj) {
        String str;
        Object obj2;
        Integer num;
        Object obj3;
        yc4 yc4;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        Integer num2 = null;
        vo8 vo8 = this.x0;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Z;
            ny nyVar = this.w0;
            xm8 a = rp8.a((rp8) nyVar.e.getValue(), vo8);
            zc4 d = xs7.d(ou3, (ju3) null, new ly(this.w0, this.x0, this.z0, this.A0, (Continuation) null), 3);
            int i2 = this.y0;
            yc4 = xs7.d(ou3, (ju3) null, new ky(this.w0, a, this.z0, i2 == 0 ? ((w6a) nyVar.h.getValue()).f() : i2, (Continuation) null), 3);
            this.Z = yc4;
            this.Y = 1;
            obj3 = d.awaitInternal(this);
            if (obj3 == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            yc4 = (yc4) this.Z;
            wx3.H(obj);
            obj3 = obj;
        } else if (i == 2) {
            num = this.X;
            wx3.H(obj);
            str = (String) this.Z;
            obj2 = obj;
            CharSequence charSequence = (CharSequence) obj2;
            Integer num3 = new Integer(vo8.b());
            int intValue = num3.intValue();
            if (this.z0 == null && intValue > 1) {
                num2 = num3;
            }
            return new iy(charSequence, str, num, num2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wia wia = (wia) obj3;
        str = (String) wia.a;
        Integer num4 = (Integer) wia.b;
        this.Z = str;
        this.X = num4;
        this.Y = 2;
        obj2 = yc4.a(this);
        if (obj2 == pu3) {
            return pu3;
        }
        num = num4;
        CharSequence charSequence2 = (CharSequence) obj2;
        Integer num32 = new Integer(vo8.b());
        int intValue2 = num32.intValue();
        num2 = num32;
        return new iy(charSequence2, str, num, num2);
    }
}
