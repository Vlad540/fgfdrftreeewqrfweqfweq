package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;

/* renamed from: wo1  reason: default package */
public final class wo1 implements qk1 {
    public final /* synthetic */ t97 X;
    public final /* synthetic */ ep1 a;
    public final /* synthetic */ t97 b;
    public final /* synthetic */ t97 c;
    public final /* synthetic */ t97 o;

    public wo1(ep1 ep1, t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = ep1;
        this.b = t97;
        this.c = t972;
        this.o = t973;
        this.X = t974;
    }

    public final void onCallAccepted() {
        Object value;
        zw3 j;
        wo1.super.onCallAccepted();
        ((fdc) this.b.getValue()).c();
        ((rz0) ((qz0) this.c.getValue())).a(CallsAudioManager.State.CONVERSATION);
        ep1 ep1 = this.a;
        grd grd = ep1.H;
        do {
            value = grd.getValue();
            zw3 zw3 = (zw3) value;
            j = ep1.j();
            if (!j.f) {
                ep1.B(true);
            }
        } while (!grd.b(value, zw3.a(j, (ete) null, System.currentTimeMillis(), (String) null, (String) null, false, false, false, (o3b) null, (b65) null, 1021)));
        if (ep1.k().f) {
            for (vj1 onCallAccepted : ep1.G) {
                onCallAccepted.onCallAccepted();
            }
            ((dj1) this.o.getValue()).getClass();
            dj1.d((Context) this.X.getValue());
        }
    }

    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        ep1.b(this.a, conversationEndInfo.getReason());
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        ep1 ep1 = this.a;
        b65 b65 = ep1.j().j;
        if (!(b65 instanceof v55) && !(b65 instanceof u55) && !(b65 instanceof w55)) {
            ep1.b(ep1, conversationDestroyedInfo.getReason());
        }
        ep1.z();
        for (vj1 j : ep1.G) {
            j.j();
        }
    }

    public final void onJoinLinkUpdated(String str) {
        Object value;
        Object value2;
        ep1 ep1 = this.a;
        ete ete = ep1.j().a;
        if (ete != null) {
            boolean z = ete instanceof uk1;
            grd grd = ep1.H;
            if (z) {
                do {
                    value2 = grd.getValue();
                    zw3 zw3 = (zw3) value2;
                } while (!grd.b(value2, zw3.a(ep1.j(), new uk1(str, ((uk1) ete).d), 0, (String) null, str, false, false, false, (o3b) null, (b65) null, 1014)));
                return;
            }
            do {
                value = grd.getValue();
                zw3 zw32 = (zw3) value;
            } while (!grd.b(value, zw3.a(ep1.j(), (ete) null, 0, (String) null, str, false, false, false, (o3b) null, (b65) null, 1015)));
        }
    }

    public final void onMeInWaitingRoomChanged(boolean z) {
        Object value;
        zw3 j;
        boolean z2 = z;
        wo1.super.onMeInWaitingRoomChanged(z);
        udd.p("CallEngineTag", "me waiting room changed: isMeInWaitingRoom=" + z2, new Object[0]);
        ep1 ep1 = this.a;
        grd grd = ep1.H;
        do {
            value = grd.getValue();
            zw3 zw3 = (zw3) value;
            j = ep1.j();
        } while (!grd.b(value, z2 ? zw3.a(j, (ete) null, 0, (String) null, (String) null, false, false, false, (o3b) null, a65.b, 511) : zw3.a(j, (ete) null, 0, (String) null, (String) null, false, false, false, (o3b) null, y55.b, 511)));
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        String str;
        boolean isFirstConnection = connectedInfo.isFirstConnection();
        ep1 ep1 = this.a;
        ep1.B(isFirstConnection);
        if (!connectedInfo.isFirstConnection() && (str = ep1.j().c) != null) {
            iq1 m = ep1.m();
            boolean z = ep1.j().h;
            m.getClass();
            iq1.c(m, "BAD_CONNECTION_ALERT", str, "RECONNECT", (Integer) null, (String) null, (String) null, z, 56);
        }
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        Object value;
        ep1 ep1 = this.a;
        grd grd = ep1.H;
        do {
            value = grd.getValue();
            zw3 zw3 = (zw3) value;
        } while (!grd.b(value, zw3.a(ep1.j(), (ete) null, 0, (String) null, (String) null, false, false, false, (o3b) null, z55.b, 511)));
        if (!ep1.j().h) {
            fdc u = ep1.u();
            u.getClass();
            u.c = edc.CONNECTING;
            cg1 a2 = u.a();
            if (((Boolean) a2.f.getValue()).booleanValue()) {
                a2.a(a2.b.d, true);
            }
        }
    }

    public final void onParticipantsAdded(List list) {
        ep1.c(this.a);
    }

    public final void onParticipantsChanged(List list) {
        ep1.c(this.a);
    }

    public final void onParticipantsRemoved(List list) {
        ep1.c(this.a);
    }

    public final void onParticipantsUpdated(Collection collection) {
        ep1.c(this.a);
    }
}
