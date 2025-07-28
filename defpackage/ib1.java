package defpackage;

import android.text.SpannableStringBuilder;
import kotlin.coroutines.Continuation;

/* renamed from: ib1  reason: default package */
public final class ib1 extends l5e implements i26 {
    public jb1 X;
    public int Y;
    public final /* synthetic */ jb1 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ib1(jb1 jb1, Continuation continuation) {
        super(2, continuation);
        this.Z = jb1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ib1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ib1(this.Z, continuation);
    }

    public final Object o(Object obj) {
        jb1 jb1;
        Object value;
        SpannableStringBuilder spannableStringBuilder;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            jb1 jb12 = this.Z;
            nxc nxc = jb12.o;
            this.X = jb12;
            this.Y = 1;
            Object U = xs7.U(((pae) ((t97) nxc.o).getValue()).b(), new tp1(nxc, (Continuation) null), this);
            if (U == pu3) {
                return pu3;
            }
            jb1 = jb12;
            obj = U;
        } else if (i == 1) {
            jb1 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jb1.Y = (Long) obj;
        jb1 jb13 = this.Z;
        grd grd = jb13.Z;
        do {
            value = grd.getValue();
            nu7 nu7 = jb13.c;
            nu7.getClass();
            spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new bi5((oj7) ((t97) nu7.b).getValue(), (vh5) null, 6), 0, 1, 17);
        } while (!grd.b(value, za1.a((za1) value, (ub0) null, (String) null, new wa1(new lge(spannableStringBuilder)), (mge) null, false, 499)));
        return jue.a;
    }
}
