package defpackage;

import android.view.View;
import one.me.profileedit.ProfileEditScreen;

/* renamed from: m9b  reason: default package */
public final /* synthetic */ class m9b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ m9b(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    public final void onClick(View view) {
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ProfileEditScreen.C0;
                bs4 bs4 = profileEditScreen.m0().b;
                if (bs4.d()) {
                    bs4.k();
                    return;
                }
                return;
            default:
                k77[] k77Arr2 = ProfileEditScreen.C0;
                profileEditScreen.m0().u();
                return;
        }
    }
}
