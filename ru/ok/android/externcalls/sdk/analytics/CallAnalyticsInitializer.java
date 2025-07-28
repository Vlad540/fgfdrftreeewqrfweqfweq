package ru.ok.android.externcalls.sdk.analytics;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/CallAnalyticsInitializer;", "", "<init>", "()V", "Lru/ok/android/externcalls/analytics/CallAnalyticsSender;", "callAnalyticsSender", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;", "analyticsConfiguration", "Lmw9;", "api", "Lkotlin/Function0;", "Lxwb;", "logger", "Ljue;", "init", "(Lru/ok/android/externcalls/analytics/CallAnalyticsSender;Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;Lmw9;Ls16;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class CallAnalyticsInitializer {
    public final void init(CallAnalyticsSender callAnalyticsSender, ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl, mw9 mw9, s16 s16) {
        ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl2 = conversationAnalyticsConfigurationImpl;
        CallAnalyticsInitializer$init$uploadConfig$1 callAnalyticsInitializer$init$uploadConfig$1 = new CallAnalyticsInitializer$init$uploadConfig$1(conversationAnalyticsConfigurationImpl2);
        EventMetaParamsConfig eventMetaParamsConfig = new EventMetaParamsConfig(new CallAnalyticsInitializer$init$1(conversationAnalyticsConfigurationImpl2));
        CallAnalyticsLoggerImpl callAnalyticsLoggerImpl = new CallAnalyticsLoggerImpl(s16);
        CallAnalyticsInitializer$init$2 callAnalyticsInitializer$init$2 = new CallAnalyticsInitializer$init$2(callAnalyticsInitializer$init$uploadConfig$1);
        CallAnalyticsInitializer$init$3 callAnalyticsInitializer$init$3 = new CallAnalyticsInitializer$init$3(callAnalyticsInitializer$init$uploadConfig$1);
        CallAnalyticsInitializer$init$4 callAnalyticsInitializer$init$4 = new CallAnalyticsInitializer$init$4(callAnalyticsInitializer$init$uploadConfig$1);
        CallAnalyticsInitializer$init$5 callAnalyticsInitializer$init$5 = new CallAnalyticsInitializer$init$5(callAnalyticsInitializer$init$uploadConfig$1);
        s16 callAnalyticsInitializer$init$6 = new CallAnalyticsInitializer$init$6(callAnalyticsInitializer$init$uploadConfig$1);
        UploadConfig uploadConfig = r4;
        s16 s162 = callAnalyticsInitializer$init$6;
        UploadConfig uploadConfig2 = new UploadConfig(0, (Executor) null, 0, 0, callAnalyticsInitializer$init$2, callAnalyticsInitializer$init$3, callAnalyticsInitializer$init$4, callAnalyticsInitializer$init$5, s162, new CallAnalyticsInitializer$init$7(callAnalyticsInitializer$init$uploadConfig$1), 15, (x54) null);
        callAnalyticsSender.initialize(new CallAnalyticsConfig(mw9, eventMetaParamsConfig, callAnalyticsLoggerImpl, uploadConfig));
    }
}
