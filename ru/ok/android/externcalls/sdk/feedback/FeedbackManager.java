package ru.ok.android.externcalls.sdk.feedback;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0019\u0010\u0018ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/FeedbackManager;", "", "", "key", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "source", "Lkotlin/Function1;", "", "Ljue;", "onError", "Lkotlin/Function0;", "onSuccess", "sendFeedback", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;Lu16;Ls16;)V", "", "millis", "setTimeout", "(J)V", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "getOwnCurrentFeedback", "()Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;)V", "removeListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface FeedbackManager {
    static /* synthetic */ void sendFeedback$default(FeedbackManager feedbackManager, String str, ParticipantFeedbackSource participantFeedbackSource, u16 u16, s16 s16, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                u16 = null;
            }
            if ((i & 8) != 0) {
                s16 = null;
            }
            feedbackManager.sendFeedback(str, participantFeedbackSource, u16, s16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFeedback");
    }

    void addListener(FeedbackListener feedbackListener);

    ParticipantFeedback getOwnCurrentFeedback();

    void removeListener(FeedbackListener feedbackListener);

    void sendFeedback(String str, ParticipantFeedbackSource participantFeedbackSource, u16 u16, s16 s16);

    void setTimeout(long j);
}
