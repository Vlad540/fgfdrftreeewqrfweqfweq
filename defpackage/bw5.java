package defpackage;

import one.me.chats.forward.ForwardPickerScreen;
import one.me.chats.picker.PickerChatController;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.arch.Widget;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: bw5  reason: default package */
public final class bw5 implements d87 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ bw5(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final void m() {
        ShareDataPickerScreen shareDataPickerScreen = this.b;
        switch (this.a) {
            case 0:
                nl0 nl0 = ((ForwardPickerScreen) shareDataPickerScreen).E0;
                if (nl0.a()) {
                    ((jq8) nl0.getValue()).e(false);
                    return;
                }
                return;
            case 1:
                k77[] k77Arr = MediaBarWidget.h1;
                ((MediaBarWidget) shareDataPickerScreen).v0().e(false);
                return;
            case 2:
                nl0 nl02 = ((PickerChatController) shareDataPickerScreen).y0;
                if (nl02.a()) {
                    ((jq8) nl02.getValue()).e(false);
                    return;
                }
                return;
            default:
                nl0 nl03 = shareDataPickerScreen.B0;
                if (nl03.a()) {
                    ((jq8) nl03.getValue()).e(false);
                    return;
                }
                return;
        }
    }
}
