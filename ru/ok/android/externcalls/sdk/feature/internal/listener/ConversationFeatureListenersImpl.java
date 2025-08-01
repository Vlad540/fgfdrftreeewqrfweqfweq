package ru.ok.android.externcalls.sdk.feature.internal.listener;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160'0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListenersImpl;", "Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;", "<init>", "()V", "Li51;", "event", "", "Le51;", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "getFeaturesRolesMap", "(Li51;)Ljava/util/Map;", "", "oldFeatures", "newFeatures", "Ljue;", "notifyListenersWithNewEnabledFeatures", "(Ljava/util/Set;Ljava/util/Set;)V", "oldFeatureRolesMap", "newFeatureRolesMap", "notifyListenersWithNewFeaturesRoles", "(Ljava/util/Map;Ljava/util/Map;)V", "feature", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "listener", "notifyNewListener", "(Le51;Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;)V", "addFeatureListener", "removeFeatureListener", "", "isFeatureEnabled", "(Le51;)Z", "getFeatureRoles", "(Le51;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "Lh51;", "onFeatureSetChanged", "(Lh51;)V", "onFeaturesPerRoleChanged", "(Li51;)V", "Ljava/util/EnumMap;", "", "listenersMap", "Ljava/util/EnumMap;", "enabledFeatureSet", "Ljava/util/Set;", "featureRolesMap", "Ljava/util/Map;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ConversationFeatureListenersImpl implements ConversationFeatureListeners {
    private Set<? extends e51> enabledFeatureSet = qw4.a;
    private Map<e51, ? extends FeatureRoles> featureRolesMap = iw4.a;
    private final EnumMap<e51, Set<ConversationFeatureManager.FeatureListener>> listenersMap = new EnumMap<>(e51.class);

    private final Map<e51, FeatureRoles> getFeaturesRolesMap(i51 i51) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (e51 e51 : e51.values()) {
            Set set = (Set) i51.a.get(e51);
            if (set == null || set.isEmpty()) {
                linkedHashMap.put(e51, FeatureRoles.EnabledForAll.INSTANCE);
            } else {
                linkedHashMap.put(e51, new FeatureRoles.EnabledForRoles(set));
            }
        }
        return linkedHashMap;
    }

    private final void notifyListenersWithNewEnabledFeatures(Set<? extends e51> set, Set<? extends e51> set2) {
        for (e51 e51 : z3d.F(set2, set)) {
            Set<ConversationFeatureManager.FeatureListener> set3 = this.listenersMap.get(e51);
            if (set3 != null) {
                for (ConversationFeatureManager.FeatureListener onFeatureEnabledChanged : set3) {
                    onFeatureEnabledChanged.onFeatureEnabledChanged(e51, false);
                }
            }
        }
        for (e51 e512 : z3d.F(set, set2)) {
            Set<ConversationFeatureManager.FeatureListener> set4 = this.listenersMap.get(e512);
            if (set4 != null) {
                for (ConversationFeatureManager.FeatureListener onFeatureEnabledChanged2 : set4) {
                    onFeatureEnabledChanged2.onFeatureEnabledChanged(e512, true);
                }
            }
        }
    }

    private final void notifyListenersWithNewFeaturesRoles(Map<e51, ? extends FeatureRoles> map, Map<e51, ? extends FeatureRoles> map2) {
        Set<ConversationFeatureManager.FeatureListener> set;
        for (e51 e51 : z3d.I(map.keySet(), map2.keySet())) {
            if (!hhd.f(map.get(e51), map2.get(e51)) && (set = this.listenersMap.get(e51)) != null) {
                for (ConversationFeatureManager.FeatureListener featureListener : set) {
                    FeatureRoles.Companion companion = FeatureRoles.Companion;
                    Object obj = map2.get(e51);
                    if (obj == null) {
                        obj = companion.createDisabledForAll();
                    }
                    featureListener.onFeatureRolesChanged(e51, (FeatureRoles) obj);
                }
            }
        }
    }

    private final void notifyNewListener(e51 e51, ConversationFeatureManager.FeatureListener featureListener) {
        featureListener.onFeatureEnabledChanged(e51, isFeatureEnabled(e51));
        featureListener.onFeatureRolesChanged(e51, getFeatureRoles(e51));
    }

    public void addFeatureListener(e51 e51, ConversationFeatureManager.FeatureListener featureListener) {
        EnumMap<e51, Set<ConversationFeatureManager.FeatureListener>> enumMap = this.listenersMap;
        Set<ConversationFeatureManager.FeatureListener> set = enumMap.get(e51);
        if (set == null) {
            set = new HashSet<>();
            enumMap.put(e51, set);
        }
        set.add(featureListener);
        notifyNewListener(e51, featureListener);
    }

    public FeatureRoles getFeatureRoles(e51 e51) {
        Map<e51, ? extends FeatureRoles> map = this.featureRolesMap;
        FeatureRoles.Companion companion = FeatureRoles.Companion;
        Object obj = map.get(e51);
        if (obj == null) {
            obj = companion.createDisabledForAll();
        }
        return (FeatureRoles) obj;
    }

    public boolean isFeatureEnabled(e51 e51) {
        return this.enabledFeatureSet.contains(e51);
    }

    public final void onFeatureSetChanged(h51 h51) {
        Set<? extends e51> set = this.enabledFeatureSet;
        Set<? extends e51> set2 = h51.a;
        notifyListenersWithNewEnabledFeatures(set, set2);
        this.enabledFeatureSet = set2;
    }

    public final void onFeaturesPerRoleChanged(i51 i51) {
        Map<e51, FeatureRoles> featuresRolesMap = getFeaturesRolesMap(i51);
        notifyListenersWithNewFeaturesRoles(this.featureRolesMap, featuresRolesMap);
        this.featureRolesMap = featuresRolesMap;
    }

    public void removeFeatureListener(e51 e51, ConversationFeatureManager.FeatureListener featureListener) {
        Set set = this.listenersMap.get(e51);
        if (set != null) {
            set.remove(featureListener);
        }
    }
}
