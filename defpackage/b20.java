package defpackage;

import android.os.Bundle;
import android.view.View;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.avatars.ContactAvatarsScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.audio.AudioListenView;

/* renamed from: b20  reason: default package */
public final /* synthetic */ class b20 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ b20(int i) {
        this.a = i;
    }

    private final void a(View view) {
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i = AudioAttachView.A0;
                return;
            case 1:
                int i2 = AudioListenView.F0;
                return;
            case 2:
                k77[] k77Arr = CallHistoryScreen.G0;
                j61.c.P1().b(":call-contact", (Bundle) null);
                return;
            case 3:
                k77[] k77Arr2 = CallHistoryScreen.G0;
                j61.c.P1().b(":call-contact", (Bundle) null);
                return;
            case 4:
                k77[] k77Arr3 = ContactAvatarsScreen.D0;
                return;
            case 5:
                k77[] k77Arr4 = MediaKeyboardWidget.G0;
                b87.c.P1().b(":stickers/settings", (Bundle) null);
                return;
            case 6:
                return;
            default:
                int i3 = SafeModeOnboardingScreen.c;
                c9d.c.P1().b(":settings/privacy/pincode?mode=setup&replace_top=true", (Bundle) null);
                return;
        }
    }
}
