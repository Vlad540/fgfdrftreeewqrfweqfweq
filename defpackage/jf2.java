package defpackage;

import android.view.View;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: jf2  reason: default package */
public final /* synthetic */ class jf2 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    public /* synthetic */ jf2(ChatMediaViewerScreen chatMediaViewerScreen, int i) {
        this.a = i;
        this.b = chatMediaViewerScreen;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final Object invoke(Object obj) {
        jue jue = jue.a;
        ? r1 = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatMediaViewerScreen.O0;
                ex9 onBackPressedDispatcher = r1.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue;
            default:
                k77[] k77Arr2 = ChatMediaViewerScreen.O0;
                r1.B0().E(a2a.l);
                return jue;
        }
    }
}
