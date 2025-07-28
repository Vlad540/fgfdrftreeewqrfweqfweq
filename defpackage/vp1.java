package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.webrtc.SignalingErrors;

/* renamed from: vp1  reason: default package */
public final class vp1 implements ConversationEventsListener, mk1, MediaConnectionListener {
    public final r7e a = new r7e(new di1(21));
    public final r7e b = new r7e(new di1(22));

    public final void a(String str) {
        for (mk1 a2 : (CopyOnWriteArraySet) this.b.getValue()) {
            a2.a(str);
        }
    }

    public final CopyOnWriteArraySet b() {
        return (CopyOnWriteArraySet) this.a.getValue();
    }

    public final void c(qk1 qk1) {
        b().remove(qk1);
    }

    public final void d(qk1 qk1) {
        b().add(qk1);
    }

    public final void onAnonJoinForbiddenChanged(boolean z) {
        for (qk1 onAnonJoinForbiddenChanged : b()) {
            onAnonJoinForbiddenChanged.onAnonJoinForbiddenChanged(z);
        }
    }

    public final void onCallAccepted() {
        for (qk1 onCallAccepted : b()) {
            onCallAccepted.onCallAccepted();
        }
    }

    public final void onCallAcceptedForAll() {
        for (qk1 onCallAcceptedForAll : b()) {
            onCallAcceptedForAll.onCallAcceptedForAll();
        }
    }

    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        for (qk1 onCallEnded : b()) {
            onCallEnded.onCallEnded(conversationEndInfo);
        }
    }

    public final void onCallIsUnfeasibleError(SignalingErrors.CallIsUnfeasibleError callIsUnfeasibleError) {
        for (qk1 onCallIsUnfeasibleError : b()) {
            onCallIsUnfeasibleError.onCallIsUnfeasibleError(callIsUnfeasibleError);
        }
    }

    public final void onCallParticipantsNetworkStatusChanged(List list) {
        for (qk1 onCallParticipantsNetworkStatusChanged : b()) {
            onCallParticipantsNetworkStatusChanged.onCallParticipantsNetworkStatusChanged(list);
        }
    }

    public final void onCallSignalingConnected() {
        for (qk1 onCallSignalingConnected : b()) {
            onCallSignalingConnected.onCallSignalingConnected();
        }
    }

    public final void onCallStartResolutionFailed(List list) {
        for (qk1 onCallStartResolutionFailed : b()) {
            onCallStartResolutionFailed.onCallStartResolutionFailed(list);
        }
    }

    public final void onCameraBusy() {
        for (qk1 onCameraBusy : b()) {
            onCameraBusy.onCameraBusy();
        }
    }

    public final void onCameraChanged() {
        for (qk1 onCameraChanged : b()) {
            onCameraChanged.onCameraChanged();
        }
    }

    public final void onCustomData(JSONObject jSONObject) {
        for (qk1 onCustomData : b()) {
            onCustomData.onCustomData(jSONObject);
        }
    }

    public final void onDestroyed() {
        for (qk1 onDestroyed : b()) {
            onDestroyed.onDestroyed();
        }
    }

    public final void onJoinLinkUpdated(String str) {
        for (qk1 onJoinLinkUpdated : b()) {
            onJoinLinkUpdated.onJoinLinkUpdated(str);
        }
    }

    public final void onLocalMediaChanged() {
        for (qk1 onLocalMediaChanged : b()) {
            onLocalMediaChanged.onLocalMediaChanged();
        }
    }

    public final void onMeInWaitingRoomChanged(boolean z) {
        for (qk1 onMeInWaitingRoomChanged : b()) {
            onMeInWaitingRoomChanged.onMeInWaitingRoomChanged(z);
        }
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        for (qk1 onMediaConnected : b()) {
            onMediaConnected.onMediaConnected(connectedInfo);
        }
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        for (qk1 onMediaDisconnected : b()) {
            onMediaDisconnected.onMediaDisconnected(disconnectedInfo);
        }
    }

    public final void onMicChanged(boolean z) {
        for (qk1 onMicChanged : b()) {
            onMicChanged.onMicChanged(z);
        }
    }

    public final void onMicrophoneForciblyMuted() {
        for (qk1 onMicrophoneForciblyMuted : b()) {
            onMicrophoneForciblyMuted.onMicrophoneForciblyMuted();
        }
    }

    public final void onMigratedToServerTopology() {
        for (qk1 onMigratedToServerTopology : b()) {
            onMigratedToServerTopology.onMigratedToServerTopology();
        }
    }

    public final void onMuteChanged(oc9 oc9) {
        for (qk1 onMuteChanged : b()) {
            onMuteChanged.onMuteChanged(oc9);
        }
    }

    public final void onMuteStateInitialized(oc9 oc9) {
        for (qk1 onMuteStateInitialized : b()) {
            onMuteStateInitialized.onMuteStateInitialized(oc9);
        }
    }

    public final void onOpponentFingerprintChanged(long j) {
        for (qk1 onOpponentFingerprintChanged : b()) {
            onOpponentFingerprintChanged.onOpponentFingerprintChanged(j);
        }
    }

    public final void onOpponentMediaChanged() {
        for (qk1 onOpponentMediaChanged : b()) {
            onOpponentMediaChanged.onOpponentMediaChanged();
        }
    }

    public final void onOpponentRegistered() {
        for (qk1 onOpponentRegistered : b()) {
            onOpponentRegistered.onOpponentRegistered();
        }
    }

    public final void onParticipantsAdded(List list) {
        for (qk1 onParticipantsAdded : b()) {
            onParticipantsAdded.onParticipantsAdded(list);
        }
    }

    public final void onParticipantsChanged(List list) {
        for (qk1 onParticipantsChanged : b()) {
            onParticipantsChanged.onParticipantsChanged(list);
        }
    }

    public final void onParticipantsDeAnonymized(List list, Map map) {
        for (qk1 onParticipantsDeAnonymized : b()) {
            onParticipantsDeAnonymized.onParticipantsDeAnonymized(list, map);
        }
    }

    public final void onParticipantsRemoved(List list) {
        for (qk1 onParticipantsRemoved : b()) {
            onParticipantsRemoved.onParticipantsRemoved(list);
        }
    }

    public final void onParticipantsUpdated(Collection collection) {
        for (qk1 onParticipantsUpdated : b()) {
            onParticipantsUpdated.onParticipantsUpdated(collection);
        }
    }

    public final void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
        for (qk1 onPinChanged : b()) {
            onPinChanged.onPinChanged(conversationParticipant, z);
        }
    }

    public final void onRateCall(RateCallData rateCallData) {
        for (qk1 onRateCall : b()) {
            onRateCall.onRateCall(rateCallData);
        }
    }

    public final void onRecurringChanged(boolean z) {
        for (qk1 onRecurringChanged : b()) {
            onRecurringChanged.onRecurringChanged(z);
        }
    }

    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        for (qk1 onRolesChanged : b()) {
            onRolesChanged.onRolesChanged(conversationParticipant);
        }
    }

    public final void onStateChanged(ConversationParticipant conversationParticipant, ie1 ie1) {
        for (qk1 onStateChanged : b()) {
            onStateChanged.onStateChanged(conversationParticipant, ie1);
        }
    }

    public final void onWaitingRoomEnabledChanged(boolean z) {
        for (qk1 onWaitingRoomEnabledChanged : b()) {
            onWaitingRoomEnabledChanged.onWaitingRoomEnabledChanged(z);
        }
    }

    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        for (qk1 onWaitingRoomParticipantsChanged : b()) {
            onWaitingRoomParticipantsChanged.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        }
    }

    public final void onDestroyed(String str) {
        for (qk1 onDestroyed : b()) {
            onDestroyed.onDestroyed(str);
        }
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        for (qk1 onDestroyed : b()) {
            onDestroyed.onDestroyed(conversationDestroyedInfo);
        }
    }
}
