package defpackage;

import one.me.profile.ProfileScreen;

/* renamed from: geb  reason: default package */
public final /* synthetic */ class geb implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileScreen b;

    public /* synthetic */ geb(ProfileScreen profileScreen, int i) {
        this.a = i;
        this.b = profileScreen;
    }

    public final Object invoke() {
        ProfileScreen profileScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ProfileScreen.H0;
                return new we1(new r7e(new geb(profileScreen, 1)), new jrf(profileScreen, 0));
            default:
                k77[] k77Arr2 = ProfileScreen.H0;
                return profileScreen.getRouter();
        }
    }
}
