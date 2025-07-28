package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* renamed from: rb1  reason: default package */
public final class rb1 {
    public final t97 a;

    public rb1(t97 t97) {
        this.a = t97;
    }

    public final me1 a(Conversation conversation, ConversationParticipant conversationParticipant, boolean z, boolean z2) {
        int i;
        boolean z3 = z;
        le1 b = xja.b(conversationParticipant.getExternalId());
        k88 audioOptionState = conversationParticipant.getAudioOptionState();
        k88 videoOptionState = conversationParticipant.getVideoOptionState();
        k88 screenshareOptionState = conversationParticipant.getScreenshareOptionState();
        boolean isAudioEnabled = conversationParticipant.isAudioEnabled();
        boolean booleanValue = (!z3 || !conversationParticipant.isScreenCaptureEnabled()) ? false : ((Boolean) ((nnc) this.a.getValue()).b.getValue()).booleanValue();
        t8f t8f = new t8f(conversationParticipant.isVideoEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(w8f.a).build(), z3);
        t8f t8f2 = new t8f(conversationParticipant.isScreenCaptureEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(w8f.b).build(), false);
        boolean isCallAccepted = conversationParticipant.isCallAccepted();
        long acceptCallEpochMs = conversationParticipant.getAcceptCallEpochMs();
        boolean isConnected = conversationParticipant.isConnected();
        boolean isPrimarySpeaker = conversationParticipant.isPrimarySpeaker();
        boolean isTalking = conversationParticipant.isTalking();
        boolean isHandRaised = conversation.getParticipantStatesManager().isHandRaised(conversationParticipant.getExternalId());
        boolean isCreator = conversationParticipant.isCreator();
        boolean isAdmin = conversationParticipant.isAdmin();
        List movies = conversationParticipant.getMovies();
        boolean hasRegisteredPeers = conversationParticipant.hasRegisteredPeers();
        boolean z4 = conversation.getParticipantMediaStat(conversationParticipant) != null;
        int ordinal = conversationParticipant.getNetworkStatus().ordinal();
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal == 1) {
            i = 2;
        } else if (ordinal == 2) {
            i = 3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new me1(b, audioOptionState, videoOptionState, screenshareOptionState, isAudioEnabled, booleanValue, t8f, t8f2, isCreator, isAdmin, z2, isConnected, isCallAccepted, acceptCallEpochMs, z, isPrimarySpeaker, isTalking, isHandRaised, hasRegisteredPeers, z4, movies, i);
    }
}
