package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ps  reason: default package */
public final /* synthetic */ class ps implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ s16 b;

    public /* synthetic */ ps(int i, s16 s16) {
        this.a = i;
        this.b = s16;
    }

    public final void k(JSONObject jSONObject) {
        int i = this.a;
        s16 s16 = this.b;
        switch (i) {
            case 0:
                AsrCommandsExecutorImpl.startRecord$lambda$0(s16, jSONObject);
                return;
            case 1:
                AsrCommandsExecutorImpl.stopRecord$lambda$2(s16, jSONObject);
                return;
            case 2:
                ChatCommandExecutorImpl.sendMessage$lambda$2(s16, jSONObject);
                return;
            case 3:
                ConversationFeatureCommandExecutorImpl.enableFeatureForRoles$lambda$0(s16, jSONObject);
                return;
            case 4:
                FeedbackCommandsExecutorImpl.sendFeedback$lambda$0(s16, jSONObject);
                return;
            case 5:
                MediaMuteCommandExecutorImpl.requestToEnableMedia$lambda$2(s16, jSONObject);
                return;
            case 6:
                MediaMuteCommandExecutorImpl.updateMediaOptions$lambda$0(s16, jSONObject);
                return;
            case 7:
                ParticipantStatesManagerImpl.lowerHandForAll$lambda$13(s16, jSONObject);
                return;
            case 8:
                RecordManagerImpl.stopRecord$lambda$2(s16, jSONObject);
                return;
            case 9:
                RecordManagerImpl.startRecord$lambda$0(s16, jSONObject);
                return;
            case 10:
                SessionRoomAdminCommandExecutorImpl.switchRoom$lambda$4(s16, jSONObject);
                return;
            case 11:
                SessionRoomAdminCommandExecutorImpl.updateRooms$lambda$6(s16, jSONObject);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                SessionRoomCommandExecutorImpl.joinRoom$lambda$2(s16, jSONObject);
                return;
            case 13:
                SessionRoomCommandExecutorImpl.leaveRoom$lambda$4(s16, jSONObject);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                SessionRoomCommandExecutorImpl.requestAttention$lambda$0(s16, jSONObject);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                StereoRoomCommandExecutorImpl.requestPromotion$lambda$2(s16, jSONObject);
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                StereoRoomCommandExecutorImpl.acceptPromotion$lambda$4(s16, jSONObject);
                return;
            case LangUtils.HASH_SEED:
                StereoRoomCommandExecutorImpl.promoteParticipant$lambda$0(s16, jSONObject);
                return;
            case 18:
                UrlSharingCommandsExecutorImpl.start$lambda$0(s16, jSONObject);
                return;
            case 19:
                UrlSharingCommandsExecutorImpl.stop$lambda$2(s16, jSONObject);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                WatchTogetherCommandExecutorImpl.resume$lambda$6(s16, jSONObject);
                return;
            case 21:
                WatchTogetherCommandExecutorImpl.setVolume_F2PwOSs$lambda$8(s16, jSONObject);
                return;
            case 22:
                WatchTogetherCommandExecutorImpl.pause$lambda$4(s16, jSONObject);
                return;
            case 23:
                WatchTogetherCommandExecutorImpl.setPosition$lambda$12(s16, jSONObject);
                return;
            case 24:
                WatchTogetherCommandExecutorImpl.play_yj_a6ag$lambda$0(s16, jSONObject);
                return;
            case 25:
                WatchTogetherCommandExecutorImpl.setMuted$lambda$10(s16, jSONObject);
                return;
            default:
                WatchTogetherCommandExecutorImpl.stop$lambda$2(s16, jSONObject);
                return;
        }
    }
}
