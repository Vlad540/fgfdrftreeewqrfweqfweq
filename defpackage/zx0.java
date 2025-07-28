package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: zx0  reason: default package */
public final /* synthetic */ class zx0 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zx0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, ru.ok.android.externcalls.sdk.audio.CallsAudioManager$DisabledAudioDeviceUsagePolicy] */
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                bs bsVar = (bs) obj;
                if (bsVar.isEmpty()) {
                    return bsVar;
                }
                List<ConversationParticipant> list = (List) this.b;
                ArrayList arrayList = new ArrayList(q23.H(list, 10));
                for (ConversationParticipant externalId : list) {
                    arrayList.add(Long.valueOf(xja.b(externalId.getExternalId()).a));
                }
                bs bsVar2 = new bs(0);
                ur urVar = new ur(bsVar);
                while (urVar.hasNext()) {
                    Object next = urVar.next();
                    if (!arrayList.contains(Long.valueOf(((Number) next).longValue()))) {
                        bsVar2.add(next);
                    }
                }
                return bsVar2;
            case 1:
                WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = (WaitingRoomParticipantsUpdate) this.b;
                bs bsVar3 = (bs) obj;
                List<ParticipantId> list2 = waitingRoomParticipantsUpdate.participantsIds;
                bs bsVar4 = new bs(0);
                for (ParticipantId b2 : list2) {
                    bsVar4.add(Long.valueOf(xja.b(b2).a));
                }
                if (waitingRoomParticipantsUpdate.hasAdded) {
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        tn7 tn7 = tn7.X;
                        fn6.d(tn7, "CallAdminSettingsController", "Waiting room added new users=" + bsVar4, (Throwable) null);
                    }
                } else if (waitingRoomParticipantsUpdate.hasRemoved) {
                    fn6 fn62 = udd.e;
                    if (fn62 != null && fn62.c()) {
                        tn7 tn72 = tn7.X;
                        fn62.d(tn72, "CallAdminSettingsController", "Waiting room remove users=" + bsVar4, (Throwable) null);
                    }
                } else {
                    fn6 fn63 = udd.e;
                    if (fn63 != null && fn63.c()) {
                        tn7 tn73 = tn7.X;
                        fn63.d(tn73, "CallAdminSettingsController", "Waiting room update users=" + bsVar4, (Throwable) null);
                    }
                }
                return new bs((Collection) bsVar4);
            case 2:
                bs bsVar5 = (bs) obj;
                bsVar5.remove(Long.valueOf(((le1) this.b).a));
                return bsVar5;
            case 3:
                CallsAudioManager callsAudioManager = (CallsAudioManager) obj;
                if (callsAudioManager != null) {
                    return callsAudioManager;
                }
                bo1 bo1 = ((rz0) this.b).a;
                bo1.getClass();
                CallsAudioManager.Builder disabledAudioDeviceUsagePolicy = new CallsAudioManager.Builder().setContext((Context) bo1.a.getValue()).setProximityTracker(bo1.c).setVideoTracker(new rgc(20, new zn1(0, 0, d11.class, bo1.b.getValue(), "isVideoEnabled", "isVideoEnabled()Z"))).setDisabledAudioDeviceUsagePolicy(new Object());
                ((q0a) bo1.d.getValue()).getClass();
                vqc vqc = (xzc) bo1.e.getValue();
                vqc.getClass();
                if (((int) vqc.o(PmsKey.debug-mode, (long) 0)) == 3) {
                    disabledAudioDeviceUsagePolicy.setLogger((yn1) bo1.f.getValue());
                }
                return disabledAudioDeviceUsagePolicy.build();
            case 4:
                eb2 eb2 = (eb2) obj;
                return (eb2) this.b;
            case 5:
                String str = (String) obj;
                return ((k68) this.b).x();
            case 6:
                s78 s78 = (s78) obj;
                return (s78) this.b;
            case 7:
                gsd gsd = (gsd) obj;
                return (gsd) this.b;
            case 8:
                ln7 ln7 = (ln7) obj;
                return (ln7) this.b;
            case 9:
                eja eja = (eja) obj;
                return (eja) this.b;
            case 10:
                Set v0 = o23.v0((Set) obj);
                v0.add((zta) this.b);
                return v0;
            default:
                Long l = (Long) obj;
                return Long.valueOf(((wsc) this.b).o);
        }
    }
}
