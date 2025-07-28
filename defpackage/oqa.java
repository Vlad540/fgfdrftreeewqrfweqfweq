package defpackage;

import android.view.View;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: oqa  reason: default package */
public final /* synthetic */ class oqa implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ oqa(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        rr3 rr3 = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = PickSubscribersScreen.D0;
                ex9 onBackPressedDispatcher = rr3.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue;
            default:
                mpd mpd = (mpd) obj;
                mpd.a2();
                k77[] k77Arr2 = PickSubscribersScreen.D0;
                rr3.getClass();
                k77 k77 = PickSubscribersScreen.D0[1];
                mpd.R1(mpd.Z1(((Number) rr3.y0.a(rr3)).longValue()));
                return jue;
        }
    }
}
