package ru.ok.android.externcalls.analytics.config;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "", "Lkotlin/Function0;", "", "appName", "<init>", "(Ls16;)V", "Ls16;", "getAppName", "()Ls16;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
public final class EventMetaParamsConfig {
    private final s16 appName;

    public EventMetaParamsConfig() {
        this((s16) null, 1, (x54) null);
    }

    public final s16 getAppName() {
        return this.appName;
    }

    public EventMetaParamsConfig(s16 s16) {
        this.appName = s16;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventMetaParamsConfig(AnonymousClass1 r1, int i, x54 x54) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : r1);
    }
}
