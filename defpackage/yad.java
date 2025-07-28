package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: yad  reason: default package */
public final class yad extends l5e implements i26 {
    public Object X;
    public int Y;
    public final /* synthetic */ zad Z;
    public final /* synthetic */ CharSequence w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yad(zad zad, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Z = zad;
        this.w0 = charSequence;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yad(this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        List list;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        CharSequence charSequence = this.w0;
        zad zad = this.Z;
        if (i == 0) {
            wx3.H(obj);
            List a = ((m86) zad.f.getValue()).a((i22) null, charSequence);
            this.X = a;
            this.Y = 1;
            Object F = zad.c.F(this);
            if (F == pu3) {
                return pu3;
            }
            List list2 = a;
            obj = F;
            list = list2;
        } else if (i == 1) {
            list = (List) this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kbd kbd = (kbd) zad.e.getValue();
        List s0 = o23.s0((Set) obj);
        if (charSequence == null) {
            charSequence = "";
        }
        kbd.b(zad.a, s0, charSequence.toString(), list);
        return jue.a;
    }
}
