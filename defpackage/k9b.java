package defpackage;

import android.util.AttributeSet;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: k9b  reason: default package */
public final /* synthetic */ class k9b implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ k9b(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    public final Object invoke() {
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ProfileEditScreen.C0;
                return profileEditScreen.a == ((lqc) ((f03) z7b.a.getAccessor().d(f03.class).getValue())).s() ? mnc.SETTINGS_PROFILE_EDITING : mnc.CHAT_INFO_EDITING;
            default:
                k77[] k77Arr2 = ProfileEditScreen.C0;
                OneMeButton oneMeButton = new OneMeButton(profileEditScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(f8a.d0);
                oneMeButton.setSize(v0a.c);
                oneMeButton.setMode(u0a.a);
                oneMeButton.setAppearance(s0a.o);
                nt3 nt3 = new nt3(-1, -2);
                nt3.c = 80;
                float f = (float) 16;
                nt3.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(nt3);
                oneMeButton.setText(i8a.V);
                a24.a0(oneMeButton, new m9b(profileEditScreen, 1));
                return oneMeButton;
        }
    }
}
