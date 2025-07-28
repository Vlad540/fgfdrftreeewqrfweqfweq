package defpackage;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: ay6  reason: default package */
public final class ay6 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ay6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onClick(View view) {
        Layout layout;
        Layout layout2;
        switch (this.a) {
            case 0:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.b;
                ((bd) inputPhoneScreen.Z.getValue()).g("MESSAGE_LINK_OPEN", "text");
                InputPhoneScreen.l0(inputPhoneScreen, d8.u(inputPhoneScreen.getContext(), cic.J1));
                return;
            case 1:
                InputPhoneScreen inputPhoneScreen2 = (InputPhoneScreen) this.b;
                ((bd) inputPhoneScreen2.Z.getValue()).g("MESSAGE_LINK_OPEN", "text");
                InputPhoneScreen.l0(inputPhoneScreen2, d8.u(inputPhoneScreen2.getContext(), cic.K1));
                return;
            default:
                i55 i55 = (i55) this.b;
                if (!i55.C0) {
                    i55.D0 = true;
                    i55.y0 = i55.A0;
                    i55.requestLayout();
                    return;
                } else if (!i55.D0 && (layout = i55.A0) != null && (layout2 = i55.z0) != null) {
                    i55.D0 = true;
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{layout2.getHeight(), layout.getHeight()});
                    ofInt.setInterpolator(new p85());
                    ofInt.setDuration(200);
                    ofInt.addUpdateListener(new c00(8, i55));
                    ofInt.addListener(new lf(i55, 1, layout));
                    ofInt.addListener(new mf(2, i55));
                    ofInt.start();
                    return;
                } else {
                    return;
                }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                km4.y0.r((i55) this.b);
                textPaint.setColor(-16745729);
                return;
        }
    }
}
