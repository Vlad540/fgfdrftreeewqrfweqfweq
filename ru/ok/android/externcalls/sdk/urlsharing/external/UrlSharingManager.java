package ru.ok.android.externcalls.sdk.urlsharing.external;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\f\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0012\u0010\u0011ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingManager;", "", "", "url", "Lkotlin/Function0;", "Ljue;", "onSuccess", "Lkotlin/Function1;", "", "onError", "start", "(Ljava/lang/String;Ls16;Lu16;)V", "stop", "(Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;)V", "removeListener", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface UrlSharingManager {
    static /* synthetic */ void start$default(UrlSharingManager urlSharingManager, String str, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                s16 = null;
            }
            if ((i & 4) != 0) {
                u16 = null;
            }
            urlSharingManager.start(str, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
    }

    static /* synthetic */ void stop$default(UrlSharingManager urlSharingManager, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                s16 = null;
            }
            if ((i & 2) != 0) {
                u16 = null;
            }
            urlSharingManager.stop(s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
    }

    void addListener(UrlSharingListener urlSharingListener);

    void removeListener(UrlSharingListener urlSharingListener);

    void start(String str, s16 s16, u16 u16);

    void stop(s16 s16, u16 u16);
}
