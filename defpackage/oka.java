package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* renamed from: oka  reason: default package */
public final class oka implements aka, qk1 {
    public final t0c A0;
    public final t97 X;
    public final t97 Y;
    public final r7e Z = new r7e(new qk8(19, this));
    public final ro1 a;
    public final km1 b;
    public final rb1 c;
    public final t97 o;
    public final AtomicReference w0;
    public final hcd x0;
    public qod y0;
    public qod z0;

    public oka(t97 t97, t97 t972, ro1 ro1, km1 km1, rb1 rb1, t97 t973, t97 t974) {
        this.a = ro1;
        this.b = km1;
        this.c = rb1;
        this.o = t97;
        this.X = t974;
        this.Y = t972;
        AtomicReference atomicReference = new AtomicReference(new bka(qja.c));
        this.w0 = atomicReference;
        hcd a2 = icd.a(1, 1, 2);
        this.x0 = a2;
        ((vp1) t973.getValue()).d(this);
        this.A0 = ez3.d0(new gka(ez3.z(new gka(new u09(new ik5(ez3.h0(a2, new ox2(3, (Continuation) null, 6)), 2), 11), this, 1)), this, 2), ro1, ucd.b, atomicReference.get());
    }

    public final void b() {
        Conversation a2 = ((bt3) this.o.getValue()).a();
        ParticipantStatesManager participantStatesManager = a2 != null ? a2.getParticipantStatesManager() : null;
        if (participantStatesManager != null) {
            participantStatesManager.removeHandListener((ParticipantStatesManager.Listener) this.Z.getValue());
        }
        qod qod = this.y0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        this.y0 = null;
        qod qod2 = this.z0;
        if (qod2 != null) {
            qod2.cancel((CancellationException) null);
        }
        this.z0 = null;
        if (this.w0.get() != null) {
            e(new bka(c()));
        }
    }

    public final qja c() {
        return ((bka) this.w0.get()).a;
    }

    public final void d() {
        this.x0.g(((bt3) this.o.getValue()).a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0006 A[LOOP:0: B:1:0x0006->B:4:0x0011, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.bka r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r2 = r2.w0
            java.lang.Object r0 = r2.get()
        L_0x0006:
            boolean r1 = r2.compareAndSet(r0, r3)
            if (r1 == 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            java.lang.Object r1 = r2.get()
            if (r1 == r0) goto L_0x0006
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oka.e(bka):void");
    }

    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        b();
    }

    public final void onCallParticipantsNetworkStatusChanged(List list) {
        d();
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        b();
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (connectedInfo.isFirstConnection()) {
            d();
        }
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    public final void onParticipantsAdded(List list) {
        d();
    }

    public final void onParticipantsChanged(List list) {
        d();
    }

    public final void onParticipantsRemoved(List list) {
        d();
    }

    public final void onParticipantsUpdated(Collection collection) {
        d();
    }

    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        d();
    }
}
