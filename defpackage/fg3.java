package defpackage;

import one.me.profile.screens.avatars.ContactAvatarsScreen;

/* renamed from: fg3  reason: default package */
public final /* synthetic */ class fg3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactAvatarsScreen b;

    public /* synthetic */ fg3(ContactAvatarsScreen contactAvatarsScreen, int i) {
        this.a = i;
        this.b = contactAvatarsScreen;
    }

    public final Object invoke() {
        ContactAvatarsScreen contactAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ContactAvatarsScreen.D0;
                im requireActivity = contactAvatarsScreen.requireActivity();
                return new qsf(requireActivity.getWindow(), requireActivity.getWindow().getDecorView());
            default:
                k77[] k77Arr2 = ContactAvatarsScreen.D0;
                return contactAvatarsScreen.requireResources().getString(avb.tt_of);
        }
    }
}
