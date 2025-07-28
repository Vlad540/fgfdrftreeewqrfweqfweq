package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: cy6  reason: default package */
public final class cy6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ly6 Y;
    public final /* synthetic */ t97 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cy6(ly6 ly6, t97 t97, Continuation continuation) {
        super(2, continuation);
        this.Y = ly6;
        this.Z = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((so7) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cy6 cy6 = new cy6(this.Y, this.Z, continuation);
        cy6.X = obj;
        return cy6;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        so7 so7 = (so7) this.X;
        ly6 ly6 = this.Y;
        int i = ((v3a) ly6.A0.getValue()).b;
        String O = p0e.O(6, "*");
        String str = (String) ly6.C0.getValue();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = (char) str.charAt(i2);
            if (Character.isDigit((char) charAt)) {
                sb.append(charAt);
            }
        }
        String str2 = "'+" + i + O + h0e.z0(4, sb.toString()) + "'";
        boolean z = so7 instanceof no7;
        t97 t97 = this.Z;
        if (z) {
            ((pv3) t97.getValue()).a((String) null, new vo7(rf0.h("Phone: ", str2), ((no7) so7).b));
        } else if (so7 instanceof oo7) {
            ((pv3) t97.getValue()).a((String) null, new vo7(str2, 0));
        } else if (so7 instanceof po7) {
            ((pv3) t97.getValue()).a((String) null, new vo7(str2, 1));
        } else if (so7 != null && !(so7 instanceof ro7)) {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
