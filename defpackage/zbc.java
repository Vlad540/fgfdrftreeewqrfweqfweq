package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zbc  reason: default package */
public final class zbc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ acc Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zbc(acc acc, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = acc;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zbc) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zbc zbc = new zbc(this.Y, this.Z, continuation);
        zbc.X = obj;
        return zbc;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        String name = ou3.getClass().getName();
        long j = this.Z;
        fn6 fn6 = udd.e;
        CharSequence charSequence = null;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, us8.i(j, "start restore draft for chatId:"), (Throwable) null);
        }
        i22 i22 = (i22) ((bv2) this.Y.a.getValue()).m(this.Z).a.getValue();
        if (i22 == null) {
            udd.p(ou3.getClass().getName(), "can't restore draft because chat is null", new Object[0]);
            return null;
        }
        j4a j4a = i22.b.f0;
        if (!(j4a instanceof j4a)) {
            j4a = null;
        }
        if (j4a == null) {
            udd.p(ou3.getClass().getName(), "Draft empty in chat don't need restore", new Object[0]);
            return null;
        }
        acc acc = this.Y;
        h97 h97 = j4a.b;
        acc.getClass();
        if (!swb.B(h97)) {
            charSequence = ((w6a) acc.b.getValue()).j.e(((w6a) acc.b.getValue()).k(h97.a, h97.b));
        }
        return new ybc(charSequence, j4a.d, j4a.c);
    }
}
