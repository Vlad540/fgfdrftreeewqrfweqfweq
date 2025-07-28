package defpackage;

import one.me.settings.privacy.ui.SettingMediaScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.startconversation.chat.PickChatMembers;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import one.me.webview.FaqWebViewWidget;

/* renamed from: g8d  reason: default package */
public final /* synthetic */ class g8d implements i34 {
    public final /* synthetic */ int a;

    public /* synthetic */ g8d(int i) {
        this.a = i;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new SettingMediaScreen();
            case 1:
                return new StartConversationScreen();
            case 2:
                return new PickChatMembers();
            case 3:
                return new ChatTitleIconScreen((long[]) null, kpd.CHANNEL);
            case 4:
                return new StickersSettingsScreen();
            case 5:
                return new StickersScreen(mvd.RECENT, 0, 2, (x54) null);
            case 6:
                return new StickersScreen(mvd.FAVORITE, 0, 2, (x54) null);
            case 7:
                return new WebAppsSettingScreen();
            default:
                return new FaqWebViewWidget();
        }
    }
}
