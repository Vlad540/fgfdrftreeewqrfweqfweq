package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: ij2  reason: default package */
public final /* synthetic */ class ij2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatNotificationsSettingsScreen b;

    public /* synthetic */ ij2(ChatNotificationsSettingsScreen chatNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = chatNotificationsSettingsScreen;
    }

    public final Object invoke() {
        ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatNotificationsSettingsScreen.Y;
                nea nea = new nea(chatNotificationsSettingsScreen.getContext(), 6);
                nea.setId(q7a.e);
                nea.setForm(fea.a);
                nea.setTitle(r7a.d);
                nea.setLeftActions(new vda(new hd1(19)));
                return nea;
            default:
                k77[] k77Arr2 = ChatNotificationsSettingsScreen.Y;
                RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(chatNotificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(q7a.c);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                g7d g7d = chatNotificationsSettingsScreen.c;
                endlessRecyclerView2.setAdapter(g7d);
                endlessRecyclerView2.j(new qtc(km4.y0.r(endlessRecyclerView2), new zx1(12, chatNotificationsSettingsScreen), (o8) null, 12));
                endlessRecyclerView2.j(new vi2(0));
                ryd ryd = new ryd(endlessRecyclerView2, g7d, new hj2(0, new ka(chatNotificationsSettingsScreen, 5, endlessRecyclerView2)));
                endlessRecyclerView2.j(ryd);
                urd.B(new jj2(ryd, (Continuation) null, 0), endlessRecyclerView2);
                return endlessRecyclerView2;
        }
    }
}
