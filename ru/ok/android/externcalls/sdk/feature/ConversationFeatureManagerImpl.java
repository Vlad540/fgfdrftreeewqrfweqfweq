package ru.ok.android.externcalls.sdk.feature;

import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor;
import ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011JL\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManagerImpl;", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager;", "Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;", "commandExecutor", "featureListeners", "<init>", "(Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;)V", "Le51;", "feature", "Lkotlin/Function0;", "Ljue;", "onComplete", "Lkotlin/Function1;", "", "onError", "enableFeatureForAll", "(Le51;Ls16;Lu16;)V", "", "Lje1;", "roles", "enableFeatureForRoles", "(Le51;Ljava/util/Set;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "listener", "addFeatureListener", "(Le51;Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;)V", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "getFeatureRoles", "(Le51;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "", "isFeatureEnabled", "(Le51;)Z", "removeFeatureListener", "Lru/ok/android/externcalls/sdk/feature/internal/commands/ConversationFeatureCommandExecutor;", "Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ConversationFeatureManagerImpl implements ConversationFeatureManager, ConversationFeatureCommandExecutor, ConversationFeatureListeners {
    private final ConversationFeatureCommandExecutor commandExecutor;
    private final ConversationFeatureListeners featureListeners;

    public ConversationFeatureManagerImpl(ConversationFeatureCommandExecutor conversationFeatureCommandExecutor, ConversationFeatureListeners conversationFeatureListeners) {
        this.commandExecutor = conversationFeatureCommandExecutor;
        this.featureListeners = conversationFeatureListeners;
    }

    public void addFeatureListener(e51 e51, ConversationFeatureManager.FeatureListener featureListener) {
        this.featureListeners.addFeatureListener(e51, featureListener);
    }

    public void enableFeatureForAll(e51 e51, s16 s16, u16 u16) {
        this.commandExecutor.enableFeatureForAll(e51, s16, u16);
    }

    public void enableFeatureForRoles(e51 e51, Set<? extends je1> set, s16 s16, u16 u16) {
        this.commandExecutor.enableFeatureForRoles(e51, set, s16, u16);
    }

    public FeatureRoles getFeatureRoles(e51 e51) {
        return this.featureListeners.getFeatureRoles(e51);
    }

    public boolean isFeatureEnabled(e51 e51) {
        return this.featureListeners.isFeatureEnabled(e51);
    }

    public void removeFeatureListener(e51 e51, ConversationFeatureManager.FeatureListener featureListener) {
        this.featureListeners.removeFeatureListener(e51, featureListener);
    }
}
