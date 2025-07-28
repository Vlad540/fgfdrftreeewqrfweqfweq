package defpackage;

import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* renamed from: fy0  reason: default package */
public final /* synthetic */ class fy0 implements ParticipantStatesManager.Listener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk1 b;

    public /* synthetic */ fy0(qk1 qk1, int i) {
        this.a = i;
        this.b = qk1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$ParticipantStateChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$ParticipantStateChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$ParticipantStateChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$ParticipantStateChange} */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r4 = r4.getMe();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onParticipantStateChanged(ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager r4, ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.StateChangedEvent r5) {
        /*
            r3 = this;
            int r4 = r3.a
            switch(r4) {
                case 0: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            qk1 r3 = r3.b
            oka r3 = (defpackage.oka) r3
            r3.d()
            return
        L_0x000d:
            qk1 r3 = r3.b
            py0 r3 = (defpackage.py0) r3
            bt3 r4 = r3.d()
            ru.ok.android.externcalls.sdk.Conversation r4 = r4.a()
            r0 = 0
            if (r4 == 0) goto L_0x0027
            ru.ok.android.externcalls.sdk.ConversationParticipant r4 = r4.getMe()
            if (r4 == 0) goto L_0x0027
            ru.ok.android.externcalls.sdk.id.ParticipantId r4 = r4.getExternalId()
            goto L_0x0028
        L_0x0027:
            r4 = r0
        L_0x0028:
            java.util.Collection r5 = r5.getChanges()
            java.util.Iterator r5 = r5.iterator()
        L_0x0030:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0048
            java.lang.Object r1 = r5.next()
            r2 = r1
            ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$ParticipantStateChange r2 = (ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.ParticipantStateChange) r2
            ru.ok.android.externcalls.sdk.id.ParticipantId r2 = r2.getParticipantId()
            boolean r2 = defpackage.hhd.f(r2, r4)
            if (r2 == 0) goto L_0x0030
            r0 = r1
        L_0x0048:
            ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$ParticipantStateChange r0 = (ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.ParticipantStateChange) r0
            if (r0 == 0) goto L_0x0065
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.x0
            boolean r5 = r0.isOn()
            r5 = r5 ^ 1
            boolean r0 = r0.isOn()
            boolean r4 = r4.compareAndSet(r5, r0)
            if (r4 == 0) goto L_0x0065
            hcd r3 = r3.C0
            va r4 = defpackage.va.a
            r3.g(r4)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy0.onParticipantStateChanged(ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager, ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$StateChangedEvent):void");
    }
}
