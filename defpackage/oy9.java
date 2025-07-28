package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* renamed from: oy9  reason: default package */
public final class oy9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ OneMeApplication Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oy9(OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeApplication;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oy9) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oy9(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            t97 t97 = mqc.a;
            ijb ijb = new ijb(nqc.a.getAccessor().d(f03.class));
            this.X = 1;
            ijb.a().i("app.chat.background.migrated", ud0.c.contains(js.m(ijb.a(), true)) && ud0.b.contains(js.m(ijb.a(), false)));
            if (ijb.a().g.getBoolean("app.chat.background.migrated", false)) {
                udd.p("SavedBackgroundThemeMigration", "Chat theme background already migrated.", new Object[0]);
            } else {
                ijb.b(true);
                ijb.b(false);
                ijb.a().i("app.chat.background.migrated", true);
            }
            if (jue == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t97 t972 = mqc.a;
        f2b f2b = new f2b(0);
        this.X = 2;
        Object U = xs7.U(((pae) ((t97) f2b.c).getValue()).b(), new e2b(f2b, this.Y, (Continuation) null), this);
        if (U != pu3) {
            U = jue;
        }
        return U == pu3 ? pu3 : jue;
    }
}
