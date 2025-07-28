package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: nd1  reason: default package */
public final class nd1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ td1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nd1(td1 td1, Continuation continuation) {
        super(2, continuation);
        this.Y = td1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((nd1) n((k11) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nd1 nd1 = new nd1(this.Y, continuation);
        nd1.X = obj;
        return nd1;
    }

    public final Object o(Object obj) {
        Object value;
        be1 be1;
        CharSequence charSequence;
        wx3.H(obj);
        k11 k11 = (k11) this.X;
        grd grd = this.Y.B0;
        do {
            value = grd.getValue();
            be1 = (be1) value;
            charSequence = k11.b;
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
        } while (!grd.b(value, be1.a(be1, (List) null, (lg7) null, (List) null, false, charSequence, false, 47)));
        return jue.a;
    }
}
