package ru.ok.android.externcalls.sdk.urlsharing.external.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingListener;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutor;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0012\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/UrlSharingManagerImpl;", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingManager;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutor;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManager;", "commandsExecutor", "listenerManager", "<init>", "(Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutor;Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManager;)V", "", "url", "Lkotlin/Function0;", "Ljue;", "onSuccess", "Lkotlin/Function1;", "", "onError", "start", "(Ljava/lang/String;Ls16;Lu16;)V", "stop", "(Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/commands/UrlSharingCommandsExecutor;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManager;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class UrlSharingManagerImpl implements UrlSharingManager, UrlSharingCommandsExecutor, UrlSharingListenerManager {
    private final UrlSharingCommandsExecutor commandsExecutor;
    private final UrlSharingListenerManager listenerManager;

    public UrlSharingManagerImpl(UrlSharingCommandsExecutor urlSharingCommandsExecutor, UrlSharingListenerManager urlSharingListenerManager) {
        this.commandsExecutor = urlSharingCommandsExecutor;
        this.listenerManager = urlSharingListenerManager;
    }

    public void addListener(UrlSharingListener urlSharingListener) {
        this.listenerManager.addListener(urlSharingListener);
    }

    public void removeListener(UrlSharingListener urlSharingListener) {
        this.listenerManager.removeListener(urlSharingListener);
    }

    public void start(String str, s16 s16, u16 u16) {
        this.commandsExecutor.start(str, s16, u16);
    }

    public void stop(s16 s16, u16 u16) {
        this.commandsExecutor.stop(s16, u16);
    }
}
