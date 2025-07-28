package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: s5b  reason: default package */
public final /* synthetic */ class s5b implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpf b;

    public /* synthetic */ s5b(cpf cpf, int i) {
        this.a = i;
        this.b = cpf;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((ProfileChangeLinkScreen) ((t5b) this.b.Y)).o0().b.a();
                return jue.a;
            case 1:
                pz1 o0 = ((ProfileChangeLinkScreen) ((t5b) this.b.Y)).o0();
                xs7.E(o0.a, (hu3) null, (ru3) null, new nz1(o0, (Continuation) null), 3);
                return jue.a;
            default:
                ((ProfileChangeLinkScreen) ((t5b) this.b.Y)).o0().b.e();
                return jue.a;
        }
    }
}
