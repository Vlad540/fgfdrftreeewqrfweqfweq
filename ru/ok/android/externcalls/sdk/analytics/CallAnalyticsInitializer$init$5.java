package ru.ok.android.externcalls.sdk.analytics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallAnalyticsInitializer$init$5 extends b97 implements s16 {
    final /* synthetic */ s16 $uploadConfig;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAnalyticsInitializer$init$5(s16 s16) {
        super(0);
        this.$uploadConfig = s16;
    }

    public final Long invoke() {
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) this.$uploadConfig.invoke();
        if (conversationAnalyticsUploadConfig != null) {
            return conversationAnalyticsUploadConfig.getTimeToUploadNextFileMs();
        }
        return null;
    }
}
