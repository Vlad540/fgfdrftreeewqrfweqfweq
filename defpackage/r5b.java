package defpackage;

import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: r5b  reason: default package */
public final /* synthetic */ class r5b implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpf b;

    public /* synthetic */ r5b(cpf cpf, int i) {
        this.a = i;
        this.b = cpf;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ProfileChangeLinkScreen) ((t5b) this.b.Y)).o0().b.l(((Integer) obj).intValue());
                return jue.a;
            default:
                ((ProfileChangeLinkScreen) ((t5b) this.b.Y)).o0().b.k((String) obj);
                return jue.a;
        }
    }
}
