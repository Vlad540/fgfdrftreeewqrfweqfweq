package ru.ok.android.externcalls.sdk.id.mapping;

import android.net.Uri;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ExternalIdsResponse;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00110\u00102\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00112\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u001a\u0010\u001b\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010!\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050 2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdsMapper;", "Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lmw9;", "okApi", "Lfe1;", "callParams", "Lxwb;", "logger", "<init>", "(Lmw9;Lfe1;Lxwb;)V", "", "resolutionCandidates", "", "Lnj0;", "Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;", "kotlin.jvm.PlatformType", "getBatchedExternalsRequest", "(Ljava/util/Collection;)Ljava/util/List;", "candidates", "getResolveExternalRequestForCandidates", "(Ljava/util/List;)Lnj0;", "response", "", "idsMap", "Ljue;", "applyExternals", "(Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;Ljava/util/Map;)V", "from", "", "map", "(Ljava/util/Collection;)Ljava/util/Map;", "Lmw9;", "Lfe1;", "Lxwb;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class InternalToExternalIdsMapper implements IdsMapper<ge1, ParticipantId> {
    public static final Companion Companion = new Companion((x54) null);
    private static final int MAX_RESOLUTION_CANDIDATES_PER_REQUEST = 200;
    private final fe1 callParams;
    private final xwb logger;
    private final mw9 okApi;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper$Companion;", "", "()V", "MAX_RESOLUTION_CANDIDATES_PER_REQUEST", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    public InternalToExternalIdsMapper(mw9 mw9, fe1 fe1, xwb xwb) {
        this.okApi = mw9;
        this.callParams = fe1;
        this.logger = xwb;
    }

    private final void applyExternals(ExternalIdsResponse externalIdsResponse, Map<ge1, ParticipantId> map) {
        if (externalIdsResponse != null) {
            Map<ge1, ParticipantId> mapping = externalIdsResponse.getMapping();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : mapping.entrySet()) {
                if (!(next.getKey() == null || next.getValue() == null)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            map.putAll(linkedHashMap);
        }
    }

    private final List<nj0> getBatchedExternalsRequest(Collection<ge1> collection) {
        ArrayList x0 = o23.x0(collection, 200, 200);
        ArrayList arrayList = new ArrayList(q23.H(x0, 10));
        Iterator it = x0.iterator();
        while (it.hasNext()) {
            arrayList.add(getResolveExternalRequestForCandidates((List) it.next()));
        }
        return arrayList;
    }

    private final nj0 getResolveExternalRequestForCandidates(List<ge1> list) {
        mj0 R = ez3.R("vchat.getExternalIdsByOkIds");
        R.b = kl.c;
        R.c.a(new f0e(ApiProtocol.PARAM_UIDS, o23.c0(list, ",", (String) null, (String) null, InternalToExternalIdsMapper$getResolveExternalRequestForCandidates$1.INSTANCE, 30)));
        return R.a(ExternalIdsResponse.INSTANCE);
    }

    public Map<ge1, ParticipantId> map(Collection<ge1> collection) {
        boolean z = d59.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Background thread expected");
        } else if (collection.isEmpty()) {
            return iw4.a;
        } else {
            List<nj0> batchedExternalsRequest = getBatchedExternalsRequest(collection);
            Uri uri = wj0.X;
            ArrayList arrayList = new ArrayList();
            for (nj0 next : batchedExternalsRequest) {
                arrayList.add(new il(next, next));
            }
            xj0 xj0 = (xj0) RetryKt.retryApiCallForFastWorkRequired(this.okApi.c().a(new wj0((String) null, (il[]) arrayList.toArray(new il[0]), 0)), this.callParams.B.h, this.logger).e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (nj0 a : batchedExternalsRequest) {
                applyExternals((ExternalIdsResponse) xj0.a(a), linkedHashMap);
            }
            return linkedHashMap;
        }
    }
}
