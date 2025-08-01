package ru.ok.android.externcalls.sdk.events.destroy;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/events/destroy/ConversationDestroyedInfo;", "", "reason", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "(Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;)V", "getReason", "()Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConversationDestroyedInfo {
    private final ConversationEndReason reason;

    public ConversationDestroyedInfo(ConversationEndReason conversationEndReason) {
        this.reason = conversationEndReason;
    }

    public static /* synthetic */ ConversationDestroyedInfo copy$default(ConversationDestroyedInfo conversationDestroyedInfo, ConversationEndReason conversationEndReason, int i, Object obj) {
        if ((i & 1) != 0) {
            conversationEndReason = conversationDestroyedInfo.reason;
        }
        return conversationDestroyedInfo.copy(conversationEndReason);
    }

    public final ConversationEndReason component1() {
        return this.reason;
    }

    public final ConversationDestroyedInfo copy(ConversationEndReason conversationEndReason) {
        return new ConversationDestroyedInfo(conversationEndReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConversationDestroyedInfo) && hhd.f(this.reason, ((ConversationDestroyedInfo) obj).reason);
    }

    public final ConversationEndReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public String toString() {
        ConversationEndReason conversationEndReason = this.reason;
        return "ConversationDestroyedInfo(reason=" + conversationEndReason + ")";
    }
}
