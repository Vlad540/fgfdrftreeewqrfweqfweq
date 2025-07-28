package defpackage;

import android.content.Context;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: p22  reason: default package */
public final /* synthetic */ class p22 implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ p22(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<pk> cls = pk.class;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatAdminsScreen.A0;
                return mnc.CHAT_INFO_ADMINISTRATORS;
            case 1:
                k77[] k77Arr2 = ChatAdminsScreen.A0;
                return Boolean.valueOf(((kb5) ((jb5) i6b.a.g().getValue())).s());
            case 2:
                k77[] k77Arr3 = ChatAdminsScreen.A0;
                return Long.valueOf(((lqc) ((f03) i6b.a.d().getValue())).s());
            case 3:
                return new de4(i6b.a.getAccessor().d(cls));
            case 4:
                z7b z7b = z7b.a;
                return new rw2(z7b.getAccessor().d(d8a.class), z7b.getAccessor().d(g15.class));
            case 5:
                return (p8b) z7b.a.getAccessor().c(p8b.class);
            case 6:
                return new s6e(0);
            case 7:
                return new s6e(0);
            case 8:
                return new kc3(j8a.y, new hge(l8a.W), 3, false);
            case 9:
                return new pq3(j8a.d0, (mge) new hge(l8a.t1), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F));
            case 10:
                return new pq3(j8a.Z, (mge) new hge(l8a.B1), Integer.valueOf(phc.k1), (Integer) null, 20);
            case 11:
                return new s6e(0);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new s6e(0);
            case 13:
                k77[] k77Arr4 = ChatMediaDownloadBottomSheet.I0;
                obd obd = obd.a;
                Class<pae> cls2 = pae.class;
                return new zb2(obd.getAccessor().d(b29.class), obd.getAccessor().d(j5e.class), obd.getAccessor().d(cls), obd.getAccessor().d(bf5.class), obd.getAccessor().d(u98.class), (Context) obd.getAccessor().c(Context.class), (pae) obd.getAccessor().c(cls2), new ikc((knc) obd.getAccessor().c(knc.class), ((pae) obd.getAccessor().c(cls2)).b(), (cla) obd.getAccessor().c(cla.class)));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return i6b.a.h();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new gb2();
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                k77[] k77Arr5 = ChatMediaViewerScreen.O0;
                return mnc.CHAT_MEDIA_VIEWER;
            case LangUtils.HASH_SEED:
                return new pq3(j8a.s0, (mge) new hge(l8a.W1), Integer.valueOf(j9a.L), Integer.valueOf(phc.r), Integer.valueOf(j9a.G));
            case 18:
                return new pq3(j8a.r0, (mge) new hge(l8a.V1), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F));
            case 19:
                return new pq3(j8a.q0, (mge) new hge(l8a.U1), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new pq3(j8a.p0, (mge) new hge(l8a.T1), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F));
            case 21:
                k77[] k77Arr6 = ChatMembersScreen.y0;
                return mnc.CHAT_INFO_ALL_PARTICIPANTS;
            case 22:
                return new ee4(i6b.a.getAccessor().d(cls));
            case 23:
                k77[] k77Arr7 = ChatNotificationsSettingsScreen.Y;
                return new lj2();
            case 24:
                return new ee4(i6b.a.getAccessor().d(cls));
            case 25:
                return i6b.a.getAccessor().d(r59.class);
            case 26:
                return new l6b();
            case 27:
                return new q5b();
            case 28:
                k77[] k77Arr8 = ChatScreen.n1;
                return new nx8();
            default:
                k77[] k77Arr9 = ChatScreen.n1;
                return new vu7();
        }
    }
}
