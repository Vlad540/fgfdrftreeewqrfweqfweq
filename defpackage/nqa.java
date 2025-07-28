package defpackage;

import android.util.AttributeSet;
import android.widget.LinearLayout;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: nqa  reason: default package */
public final /* synthetic */ class nqa implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ nqa(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    public final Object invoke() {
        rr3 rr3 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PickSubscribersScreen.D0;
                OneMeButton oneMeButton = new OneMeButton(rr3.getContext(), (AttributeSet) null);
                oneMeButton.setId(kca.l);
                oneMeButton.setSize(v0a.c);
                oneMeButton.setAppearance(s0a.o);
                oneMeButton.setMode(u0a.a);
                oneMeButton.setText(h2a.Q);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                layoutParams.setMargins(X, X, X, X);
                oneMeButton.setLayoutParams(layoutParams);
                return oneMeButton;
            default:
                k77[] k77Arr2 = PickSubscribersScreen.D0;
                int i = e87.a;
                if (e87.b(e87.c)) {
                    bm3.p(rr3);
                }
                return jue.a;
        }
    }
}
