package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.login.welcome.WelcomeScreen;

/* renamed from: arf  reason: default package */
public final class arf extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ WelcomeScreen b;

    public /* synthetic */ arf(WelcomeScreen welcomeScreen, int i) {
        this.a = i;
        this.b = welcomeScreen;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                WelcomeScreen welcomeScreen = this.b;
                ((bd) welcomeScreen.c.getValue()).g("MESSAGE_LINK_OPEN", "text");
                WelcomeScreen.l0(welcomeScreen, d8.u(welcomeScreen.getContext(), cic.J1));
                return;
            default:
                WelcomeScreen welcomeScreen2 = this.b;
                ((bd) welcomeScreen2.c.getValue()).g("MESSAGE_LINK_OPEN", "text");
                WelcomeScreen.l0(welcomeScreen2, d8.u(welcomeScreen2.getContext(), cic.K1));
                return;
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
        }
    }
}
