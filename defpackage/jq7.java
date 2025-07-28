package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.coroutines.Continuation;

/* renamed from: jq7  reason: default package */
public final class jq7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kq7 Y;
    public final /* synthetic */ CharSequence Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jq7(kq7 kq7, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = kq7;
        this.Z = charSequence;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jq7) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jq7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        CharSequence charSequence = this.Z;
        kq7 kq7 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            v11 v11 = new v11(new ArrayList(), new nl5(new ik5(ez3.H(new ik5(new tj5(1, kq7.b.g()), 16), new fq7(charSequence, (Continuation) null)), 17), 2), new vp7(3, (Continuation) null, 1));
            xp7 xp7 = new xp7(kq7, 1);
            this.X = 1;
            Object c = v11.c(new sc5(xp7, 21), this);
            if (c != pu3) {
                c = jue;
            }
            if (c == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (kq7.Z.isEmpty()) {
            LinkedBlockingQueue linkedBlockingQueue = kq7.Z;
            linkedBlockingQueue.put(Collections.singletonList("По запросу \"" + charSequence + "\" ничего не найдено!"));
        }
        return jue;
    }
}
