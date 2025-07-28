package defpackage;

import one.me.profileedit.ProfileEditScreen;

/* renamed from: t9b  reason: default package */
public final /* synthetic */ class t9b implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpf b;

    public /* synthetic */ t9b(cpf cpf, int i) {
        this.a = i;
        this.b = cpf;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((ProfileEditScreen) ((u9b) this.b.Y)).m0().b.a(64);
                return jue.a;
            case 1:
                ((ProfileEditScreen) ((u9b) this.b.Y)).m0().b.a(128);
                return jue.a;
            case 2:
                ((ProfileEditScreen) ((u9b) this.b.Y)).m0().b.a(256);
                return jue.a;
            default:
                ((ProfileEditScreen) ((u9b) this.b.Y)).m0().b.a(512);
                return jue.a;
        }
    }
}
