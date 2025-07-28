package defpackage;

import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: pq9  reason: default package */
public final /* synthetic */ class pq9 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsSettingsScreen b;

    public /* synthetic */ pq9(NotificationsSettingsScreen notificationsSettingsScreen, int i) {
        this.a = i;
        this.b = notificationsSettingsScreen;
    }

    public final Object invoke() {
        NotificationsSettingsScreen notificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = NotificationsSettingsScreen.z0;
                nea nea = new nea(notificationsSettingsScreen.getContext(), 6);
                nea.setId(q7a.x);
                nea.setForm(fea.a);
                nea.setTitle(r7a.r);
                nea.setLeftActions(new vda(new qq9(0)));
                return nea;
            case 1:
                k77[] k77Arr2 = NotificationsSettingsScreen.z0;
                RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(notificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(q7a.u);
                endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setAdapter(new t93(new f6c[]{notificationsSettingsScreen.Z, notificationsSettingsScreen.X}));
                endlessRecyclerView2.setOverScrollMode(2);
                endlessRecyclerView2.j(new qtc(km4.y0.r(endlessRecyclerView2), new w48(endlessRecyclerView2, 14, notificationsSettingsScreen), (o8) null, 12));
                endlessRecyclerView2.j(new ix0(3));
                return endlessRecyclerView2;
            default:
                k77[] k77Arr3 = NotificationsSettingsScreen.z0;
                OneMeButton oneMeButton = new OneMeButton(notificationsSettingsScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(q7a.v);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                float f = (float) 12;
                layoutParams.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(a24.X(f * dh4.c().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setAppearance(s0a.b);
                oneMeButton.setSize(v0a.b);
                oneMeButton.setMode(u0a.c);
                oneMeButton.setText(r7a.p);
                a24.a0(oneMeButton, new eu5(18, notificationsSettingsScreen));
                return oneMeButton;
        }
    }
}
