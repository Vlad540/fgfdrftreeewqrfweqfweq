package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j01  reason: default package */
public final class j01 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j01(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        switch (this.X) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                j01 j01 = new j01(3, (Continuation) obj3, 0);
                j01.Y = booleanValue;
                j01.Z = booleanValue2;
                return j01.o(jue.a);
            case 1:
                boolean booleanValue3 = bool.booleanValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                j01 j012 = new j01(3, (Continuation) obj3, 1);
                j012.Y = booleanValue3;
                j012.Z = booleanValue4;
                return j012.o(jue.a);
            default:
                boolean booleanValue5 = bool.booleanValue();
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                j01 j013 = new j01(3, (Continuation) obj3, 2);
                j013.Y = booleanValue5;
                j013.Z = booleanValue6;
                return j013.o(jue.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                return Boolean.valueOf(this.Y && !this.Z);
            case 1:
                wx3.H(obj);
                return Boolean.valueOf(this.Y && !this.Z);
            default:
                wx3.H(obj);
                return Boolean.valueOf(this.Y || this.Z);
        }
    }
}
