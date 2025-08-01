package ru.ok.android.externcalls.sdk.analytics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsSender;", "", "Ljue;", "forceSendScheduledEvents", "()V", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfiguration;", "getConfiguration", "()Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfiguration;", "configuration", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface ConversationAnalyticsSender {
    void forceSendScheduledEvents();

    ConversationAnalyticsConfiguration getConfiguration();
}
