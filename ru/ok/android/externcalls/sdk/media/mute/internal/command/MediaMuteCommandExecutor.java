package ru.ok.android.externcalls.sdk.media.mute.internal.command;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J_\u0010\u0011\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012JS\u0010\u0013\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH&¢\u0006\u0004\b\u0013\u0010\u0014JY\u0010\u0017\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH&¢\u0006\u0004\b\u0017\u0010\u0018JM\u0010\u0019\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/media/mute/internal/command/MediaMuteCommandExecutor;", "", "", "Lj88;", "Lk88;", "statesToUpdate", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Lw2d;", "roomId", "Lkotlin/Function0;", "Ljue;", "onSuccess", "Lkotlin/Function1;", "", "onError", "updateMediaOptionsForParticipant", "(Ljava/util/Map;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lw2d;Ls16;Lu16;)V", "updateMediaOptionsForAll", "(Ljava/util/Map;Lw2d;Ls16;Lu16;)V", "", "mediaOptions", "requestToEnableMediaForParticipant", "(Ljava/util/Set;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lw2d;Ls16;Lu16;)V", "requestToEnableMediaForAll", "(Ljava/util/Set;Lw2d;Ls16;Lu16;)V", "Ll88;", "getMediaOptionsForCall", "(Lw2d;)Ll88;", "getMediaOptionsForCurrentUser", "()Ll88;", "", "mute", "setAudioPlayoutMuted", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface MediaMuteCommandExecutor {
    l88 getMediaOptionsForCall(w2d w2d);

    l88 getMediaOptionsForCurrentUser();

    void requestToEnableMediaForAll(Set<? extends j88> set, w2d w2d, s16 s16, u16 u16);

    void requestToEnableMediaForParticipant(Set<? extends j88> set, ParticipantId participantId, w2d w2d, s16 s16, u16 u16);

    void setAudioPlayoutMuted(boolean z);

    void updateMediaOptionsForAll(Map<j88, ? extends k88> map, w2d w2d, s16 s16, u16 u16);

    void updateMediaOptionsForParticipant(Map<j88, ? extends k88> map, ParticipantId participantId, w2d w2d, s16 s16, u16 u16);
}
