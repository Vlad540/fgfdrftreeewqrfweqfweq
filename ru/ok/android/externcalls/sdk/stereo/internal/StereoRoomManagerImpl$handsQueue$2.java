package ru.ok.android.externcalls.sdk.stereo.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class StereoRoomManagerImpl$handsQueue$2 extends x26 implements u16 {
    public StereoRoomManagerImpl$handsQueue$2(Object obj) {
        super(1, 0, StereoRoomManagerImpl.class, obj, "getExternalId", "getExternalId(Lru/ok/android/webrtc/participant/CallParticipant$ParticipantId;)Lru/ok/android/externcalls/sdk/id/ParticipantId;");
    }

    public final ParticipantId invoke(ge1 ge1) {
        return ((StereoRoomManagerImpl) this.receiver).getExternalId(ge1);
    }
}
