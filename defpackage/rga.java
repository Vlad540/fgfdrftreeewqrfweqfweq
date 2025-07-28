package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: rga  reason: default package */
public final /* synthetic */ class rga implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OtherNotificationsSettingsScreen b;

    public /* synthetic */ rga(OtherNotificationsSettingsScreen otherNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = otherNotificationsSettingsScreen;
    }

    public final Object invoke() {
        OtherNotificationsSettingsScreen otherNotificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = OtherNotificationsSettingsScreen.Y;
                nea nea = new nea(otherNotificationsSettingsScreen.getContext(), 6);
                nea.setId(q7a.t);
                nea.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                nea.setForm(fea.a);
                nea.setTitle(r7a.o);
                nea.setLeftActions(new vda(new qq9(14)));
                return nea;
            default:
                k77[] k77Arr2 = OtherNotificationsSettingsScreen.Y;
                RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(otherNotificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(q7a.r);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                endlessRecyclerView2.setAdapter(otherNotificationsSettingsScreen.c);
                endlessRecyclerView2.j(new qtc(km4.y0.r(endlessRecyclerView2), new dd9(25), (o8) null, 12));
                endlessRecyclerView2.j(new vi2(1));
                return endlessRecyclerView2;
        }
    }
}
