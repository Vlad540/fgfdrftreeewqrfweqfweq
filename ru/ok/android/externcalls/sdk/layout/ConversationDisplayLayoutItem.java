package ru.ok.android.externcalls.sdk.layout;

public final class ConversationDisplayLayoutItem {
    private final o3f layout;
    private final ConversationVideoTrackParticipantKey videoTrackParticipantKey;

    public ConversationDisplayLayoutItem(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, o3f o3f) {
        this.videoTrackParticipantKey = conversationVideoTrackParticipantKey;
        this.layout = o3f;
    }

    public o3f getLayout() {
        return this.layout;
    }

    public ConversationVideoTrackParticipantKey getVideoTrackParticipantKey() {
        return this.videoTrackParticipantKey;
    }
}
