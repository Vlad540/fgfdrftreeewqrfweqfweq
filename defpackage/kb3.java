package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: kb3  reason: default package */
public final class kb3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ rb3 Y;
    public final /* synthetic */ t97 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kb3(rb3 rb3, t97 t97, Continuation continuation) {
        super(2, continuation);
        this.Y = rb3;
        this.Z = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((nkd) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kb3 kb3 = new kb3(this.Y, this.Z, continuation);
        kb3.X = obj;
        return kb3;
    }

    public final Object o(Object obj) {
        String str;
        wx3.H(obj);
        nkd nkd = (nkd) this.X;
        if (nkd instanceof lkd) {
            try {
                String str2 = this.Y.X;
                StringBuilder sb = new StringBuilder();
                int length = str2.length();
                for (int i = 0; i < length; i++) {
                    char charAt = (char) str2.charAt(i);
                    if (Character.isDigit((char) charAt)) {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                int length2 = sb2.length() - 3;
                if (length2 < 3) {
                    length2 = 3;
                }
                str = "+" + h0e.m0(sb2, 3, length2, p0e.O(length2 - 3, "*")).toString();
            } catch (Throwable th) {
                str = new kcc(th);
            }
            String str3 = this.Y.X;
            if (str instanceof kcc) {
                str = str3;
            }
            String str4 = str;
            lkd lkd = (lkd) nkd;
            so7 so7 = lkd.a;
            if (so7 instanceof no7) {
                ((pv3) this.Z.getValue()).a((String) null, new vo7(c3d.i("Code: '", this.Y.G0, "', Phone: '", str4, "'"), lkd.a.b));
            } else if (so7 instanceof oo7) {
                ((pv3) this.Z.getValue()).a((String) null, new vo7(str4, 0));
            } else if (so7 instanceof po7) {
                ((pv3) this.Z.getValue()).a((String) null, new vo7(str4, 1));
            } else if (!(so7 instanceof ro7)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.Y.G0 = null;
        return jue.a;
    }
}
