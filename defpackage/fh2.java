package defpackage;

import java.util.function.Consumer;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.contactlist.ContactListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.ok.tamtam.nano.Protos;

/* renamed from: fh2  reason: default package */
public final /* synthetic */ class fh2 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ u16 b;

    public /* synthetic */ fh2(z8 z8Var, int i) {
        this.a = i;
        this.b = (u16) z8Var;
    }

    public final void accept(Object obj) {
        u16 u16 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatMembersCompactWidget.Z;
                u16.invoke(obj);
                return;
            case 1:
                k77[] k77Arr2 = ChatsListSearchScreen.N0;
                u16.invoke(obj);
                return;
            case 2:
                k77[] k77Arr3 = ChatsListWidget.O0;
                u16.invoke(obj);
                return;
            case 3:
                k77[] k77Arr4 = ChatsListWidget.O0;
                u16.invoke(obj);
                return;
            case 4:
                k77[] k77Arr5 = ContactListWidget.S0;
                u16.invoke(obj);
                return;
            case 5:
                k77[] k77Arr6 = MessagesListWidget.b1;
                u16.invoke(obj);
                return;
            case 6:
                k77[] k77Arr7 = MessagesListWidget.b1;
                u16.invoke(obj);
                return;
            case 7:
                u16.invoke(obj);
                return;
            case 8:
                u16.invoke(obj);
                return;
            case 9:
                u16.invoke(obj);
                return;
            case 10:
                k77[] k77Arr8 = StickersScreen.z0;
                u16.invoke(obj);
                return;
            case 11:
                k77[] k77Arr9 = StickersSettingsScreen.Y;
                u16.invoke(obj);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                k77[] k77Arr10 = WebAppRootScreen.K0;
                u16.invoke(obj);
                return;
            default:
                k77[] k77Arr11 = WebAppRootScreen.K0;
                u16.invoke(obj);
                return;
        }
    }
}
