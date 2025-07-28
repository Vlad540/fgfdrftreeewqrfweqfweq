package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l01  reason: default package */
public final class l01 extends l5e implements o26 {
    public /* synthetic */ boolean X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ boolean w0;
    public final /* synthetic */ t97 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l01(t97 t97, Continuation continuation) {
        super(5, continuation);
        this.x0 = t97;
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        boolean booleanValue4 = ((Boolean) obj4).booleanValue();
        l01 l01 = new l01(this.x0, (Continuation) obj5);
        l01.X = booleanValue;
        l01.Y = booleanValue2;
        l01.Z = booleanValue3;
        l01.w0 = booleanValue4;
        return l01.o(jue.a);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean z = this.X;
        boolean z2 = this.Y;
        boolean z3 = this.Z;
        boolean z4 = this.w0;
        boolean z5 = false;
        if (((jb5) this.x0.getValue()).p() && z4 && !z3 && z2 && z) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }
}
