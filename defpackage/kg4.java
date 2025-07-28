package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: kg4  reason: default package */
public final /* synthetic */ class kg4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogNotificationsSettingsScreen b;

    public /* synthetic */ kg4(DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = dialogNotificationsSettingsScreen;
    }

    public final Object invoke() {
        DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = DialogNotificationsSettingsScreen.Y;
                nea nea = new nea(dialogNotificationsSettingsScreen.getContext(), 6);
                nea.setId(q7a.l);
                nea.setForm(fea.a);
                nea.setTitle(r7a.i);
                nea.setLeftActions(new vda(new t13(13)));
                return nea;
            default:
                k77[] k77Arr2 = DialogNotificationsSettingsScreen.Y;
                RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(dialogNotificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(q7a.j);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                endlessRecyclerView2.setAdapter(dialogNotificationsSettingsScreen.c);
                endlessRecyclerView2.j(new qtc(km4.y0.r(endlessRecyclerView2), new i74(6), (o8) null, 12));
                endlessRecyclerView2.j(new vi2(1));
                return endlessRecyclerView2;
        }
    }
}
