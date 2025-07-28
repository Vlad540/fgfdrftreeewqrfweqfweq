package defpackage;

import one.me.profileedit.ProfileEditScreen;

/* renamed from: s9b  reason: default package */
public final /* synthetic */ class s9b implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpf b;

    public /* synthetic */ s9b(cpf cpf, int i) {
        this.a = i;
        this.b = cpf;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                ((ProfileEditScreen) ((u9b) this.b.Y)).m0().b.m(1, str);
                return jue.a;
            case 1:
                ((ProfileEditScreen) ((u9b) this.b.Y)).m0().b.m(2, str);
                return jue.a;
            case 2:
                ((ProfileEditScreen) ((u9b) this.b.Y)).m0().b.m(131072, str);
                return jue.a;
            default:
                ((ProfileEditScreen) ((u9b) this.b.Y)).m0().b.m(4, str);
                return jue.a;
        }
    }
}
