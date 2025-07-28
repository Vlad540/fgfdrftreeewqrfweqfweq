package defpackage;

import android.content.Context;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chats.picker.PickerChatController;
import one.me.chats.picker.PickerChatsTabWidget;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.chats.picker.chats.PickerChatsTabWidget2;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.startconversation.channel.PickSubscribersScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: qga  reason: default package */
public final /* synthetic */ class qga implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ qga(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<g5a> cls = g5a.class;
        Class<c5a> cls2 = c5a.class;
        Class<pae> cls3 = pae.class;
        Class<f03> cls4 = f03.class;
        jue jue = jue.a;
        Class<w6a> cls5 = w6a.class;
        switch (this.a) {
            case 0:
                k77[] k77Arr = OtherNotificationsSettingsScreen.Y;
                return new uga();
            case 1:
                k77[] k77Arr2 = PickChatMembers.B0;
                return mnc.CREATE_CHAT_MEMBERS_PICKER;
            case 2:
                k77[] k77Arr3 = PickSubscribersScreen.D0;
                return ipd.a.b();
            case 3:
                k77[] k77Arr4 = PickerChatController.F0;
                return new u68((f87) null, 15);
            case 4:
                k77[] k77Arr5 = PickerChatController.F0;
                return Boolean.FALSE;
            case 5:
                return new bhd(false);
            case 6:
                return new bhd(true);
            case 7:
                k77[] k77Arr6 = PickerChatsListWidget2.G0;
                return Boolean.FALSE;
            case 8:
                k77[] k77Arr7 = PickerChatsListWidget2.G0;
                tp2 tp2 = tp2.a;
                return new mta(tp2.getAccessor().d(cls4), tp2.getAccessor().d(q2b.class), tp2.getAccessor().d(o2b.class));
            case 9:
                k77[] k77Arr8 = PickerChatsTabWidget.z0;
                t97 t97 = mqc.a;
                nqc nqc = nqc.a;
                return new bta((c5a) tp2.a.getAccessor().c(cls2), nqc.s(), (g5a) nqc.getAccessor().c(cls));
            case 10:
                k77[] k77Arr9 = PickerChatsTabWidget2.C0;
                t97 t972 = mqc.a;
                nqc nqc2 = nqc.a;
                return new ata((c5a) tp2.a.getAccessor().c(cls2), nqc2.s(), (g5a) nqc2.getAccessor().c(cls));
            case 11:
                k77[] k77Arr10 = PickerContactsListWidget.C0;
                tp2 tp22 = tp2.a;
                return new wta((ok3) tp22.getAccessor().c(ok3.class), tp22.getAccessor().d(cls3), tp22.getAccessor().d(gsc.class));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                k77[] k77Arr11 = PickerContactsListWidget.C0;
                return new xf0(zf0.a.getAccessor().d(kp3.class), true, (ll3) null, 46);
            case 13:
                tp2 tp23 = tp2.a;
                r7e d = tp23.getAccessor().d(ip.class);
                r7e d2 = tp23.getAccessor().d(dhe.class);
                r7e d3 = tp23.getAccessor().d(cls4);
                r7e d4 = tp23.getAccessor().d(cls3);
                r7e d5 = tp23.getAccessor().d(Context.class);
                r7e d6 = tp23.getAccessor().d(rp8.class);
                tp23.getAccessor().d(bv2.class);
                return new ny(d, d2, d3, d4, d5, d6, tp23.getAccessor().d(zf3.class), tp23.getAccessor().d(cls5));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                int i = PinBarsWidget.x0;
                return new rua((zqd) null, (Long) null, 1);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                int i2 = hva.R0;
                return jue;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                int i3 = e87.a;
                return Boolean.valueOf(e87.b(e87.c));
            case LangUtils.HASH_SEED:
                return new f5f(z11.a.getAccessor().d(so1.class));
            case 18:
                k77[] k77Arr12 = PipScreen.o;
                return oed.a;
            case 19:
                return PmsKey.keys_delegate$lambda$1();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                int i4 = z0b.A0;
                return jue;
            case 21:
                return new gu0(i6b.a.d());
            case 22:
                i6b i6b = i6b.a;
                return new ntc(i6b.getAccessor().d(cls5), i6b.getAccessor().d(loa.class), i6b.d(), i6b.getAccessor().d(xzc.class));
            case 23:
                return new kc3(j8a.y, new hge(l8a.W), 3, false);
            case 24:
                return new c1a(j8a.G0, Integer.valueOf(l8a.p), (Integer) null, Integer.valueOf(phc.c), (Integer) null, 52);
            case 25:
                return new c1a(j8a.N0, Integer.valueOf(l8a.w), Integer.valueOf(j9a.J), Integer.valueOf(phc.D), Integer.valueOf(j9a.F), 32);
            case 26:
                return new c1a(j8a.M0, Integer.valueOf(l8a.v), Integer.valueOf(j9a.J), Integer.valueOf(phc.D), Integer.valueOf(j9a.F), 32);
            case 27:
                return new pq3(j8a.r0, (mge) new hge(l8a.V1), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F));
            case 28:
                lg7 c = hwf.c();
                c.add(new pq3(j8a.Z0, (mge) new hge(l8a.C2), Integer.valueOf(phc.A1), (Integer) null, 20));
                c.add(new pq3(j8a.Y0, (mge) new hge(l8a.B2), Integer.valueOf(phc.n2), (Integer) null, 20));
                c.add(new pq3(j8a.a1, (mge) new hge(l8a.D2), Integer.valueOf(phc.z1), (Integer) null, 20));
                c.add(new pq3(j8a.X0, (mge) new hge(l8a.A2), Integer.valueOf(phc.r), (Integer) null, 20));
                return hwf.a(c);
            default:
                return new c1a(j8a.I0, Integer.valueOf(l8a.r), (Integer) null, Integer.valueOf(phc.C0), (Integer) null, 52);
        }
    }
}
