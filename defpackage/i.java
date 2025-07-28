package defpackage;

import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.android.logout.LogoutScreen;
import one.me.appearancesettings.AppearanceSettingsScreen;
import one.me.appupdate.forceupdate.ForceUpdateScreen;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.devmenu.DevMenuScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.folders.list.FoldersListScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.login.LoginScreen;
import one.me.mediapicker.MediaPickerScreen;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.sdk.arch.activity.ActivityWrapperWidget;
import one.me.showroom.ShowroomScreen;
import ru.ok.messages.settings.ActSettings;

/* renamed from: i  reason: default package */
public final /* synthetic */ class i implements i34 {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new AboutAppSettingsScreen();
            case 1:
                return new ForceUpdateScreen();
            case 2:
                return new AppearanceSettingsScreen();
            case 3:
                return new PipScreen();
            case 4:
                return new CallOpponentsListWidget();
            case 5:
                return new CallAdminSettingsScreen();
            case 6:
                return new AdminWaitingRoomScreen();
            case 7:
                return new CallHistoryScreen();
            case 8:
                return new ChatsListSearchScreen();
            case 9:
                return new Object();
            case 10:
                return new ContactListWidget(ql3.a);
            case 11:
                return new DevMenuScreen();
            case 12:
                return new LogsViewerScreen();
            case 13:
                return new ServerHostBottomSheet();
            case 14:
                return new ServerPortBottomSheet();
            case 15:
                return new ShowroomScreen();
            case 16:
                return new ThreadsStateViewerScreen();
            case 17:
                return new FoldersListScreen();
            case 18:
                return new FakeInAppReviewBottomSheet();
            case 19:
                return new InviteByPhoneScreen();
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return new InviteByQrBottomSheet();
            case 21:
                return new LoginScreen();
            case 22:
                return new LogoutScreen();
            case 23:
                return new MediaPickerScreen(new q46(false, false, false, false, hw4.a, false, false));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new MessagesSettingsScreen();
            case 25:
                return new NotificationsSettingsScreen();
            case 26:
                return new ChatNotificationsSettingsScreen();
            case 27:
                return new DialogNotificationsSettingsScreen();
            case 28:
                return new OtherNotificationsSettingsScreen();
            default:
                String b = m7c.a(ActSettings.class).b();
                if (b != null) {
                    return new ActivityWrapperWidget(b, new u1c(7));
                }
                throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
