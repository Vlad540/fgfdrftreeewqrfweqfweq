package defpackage;

import one.me.android.root.RootController;
import one.me.chats.picker.ActChatPickerCompat;
import one.me.chats.picker.PickerChatController;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.arch.Widget;

/* renamed from: u5  reason: default package */
public final class u5 implements vr3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void c(rr3 rr3, rr3 rr32, boolean z) {
    }

    private final void d(rr3 rr3, rr3 rr32, boolean z) {
    }

    private final void e(rr3 rr3, rr3 rr32, boolean z) {
    }

    public final void a(rr3 rr3, rr3 rr32, boolean z) {
        switch (this.a) {
            case 0:
                if (!z && rr3 == null && (rr32 instanceof PickerChatController)) {
                    ((ActChatPickerCompat) this.b).finish();
                    return;
                }
                return;
            case 1:
                if (rr3 instanceof rg9) {
                    ChatScreen chatScreen = (ChatScreen) this.b;
                    if (!hhd.f(rr3, chatScreen)) {
                        xg9.g(chatScreen.X, ((rg9) rr3).o());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (rr32 != null) {
                    RootController rootController = (RootController) this.b;
                    if (rootController.S().a.a.size() > 0 && (rr3 instanceof Widget) && !((Widget) rr3).isDialog()) {
                        rootController.S().C();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void b(rr3 rr3, rr3 rr32, boolean z) {
        int i = this.a;
    }
}
