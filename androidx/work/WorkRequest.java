package androidx.work;

import android.annotation.SuppressLint;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0013\b&\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/work/WorkRequest;", "", "Ljava/util/UUID;", "id", "Lztf;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Lztf;Ljava/util/Set;)V", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Lztf;", "getWorkSpec", "()Lztf;", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "getStringId", "()Ljava/lang/String;", "stringId", "Companion", "Builder", "vtf", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class WorkRequest {
    public static final vtf Companion = new Object();
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    @SuppressLint({"MinMaxConstant"})
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final UUID id;
    private final Set<String> tags;
    private final ztf workSpec;

    public WorkRequest(UUID uuid, ztf ztf, Set<String> set) {
        this.id = uuid;
        this.workSpec = ztf;
        this.tags = set;
    }

    public UUID getId() {
        return this.id;
    }

    public final String getStringId() {
        return getId().toString();
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public final ztf getWorkSpec() {
        return this.workSpec;
    }

    @Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0014\u0010\u0018J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u0017\u0010%\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b%\u0010'J\u001f\u0010(\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010&J\u0017\u0010(\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b(\u0010'J\u0017\u0010+\u001a\u00028\u00002\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00028\u0001¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00028\u0001H ¢\u0006\u0004\b/\u0010.J\u0017\u00103\u001a\u00028\u00002\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00028\u00002\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00028\u00002\u0006\u00109\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b:\u0010&J\u001f\u0010<\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b<\u0010&R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR \u0010T\u001a\b\u0012\u0004\u0012\u00020!0S8\u0000X\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Landroidx/work/WorkRequest$Builder;", "B", "Landroidx/work/WorkRequest;", "W", "", "Ljava/lang/Class;", "Lhh7;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "setId", "(Ljava/util/UUID;)Landroidx/work/WorkRequest$Builder;", "Lhe0;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setBackoffCriteria", "(Lhe0;JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "Ljava/time/Duration;", "duration", "(Lhe0;Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "Lif3;", "constraints", "setConstraints", "(Lif3;)Landroidx/work/WorkRequest$Builder;", "Lzy3;", "inputData", "setInputData", "(Lzy3;)Landroidx/work/WorkRequest$Builder;", "", "tag", "addTag", "(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;", "keepResultsForAtLeast", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "(Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "setInitialDelay", "Lvga;", "policy", "setExpedited", "(Lvga;)Landroidx/work/WorkRequest$Builder;", "build", "()Landroidx/work/WorkRequest;", "buildInternal$work_runtime_release", "buildInternal", "Lctf;", "state", "setInitialState", "(Lctf;)Landroidx/work/WorkRequest$Builder;", "", "runAttemptCount", "setInitialRunAttemptCount", "(I)Landroidx/work/WorkRequest$Builder;", "periodStartTime", "setLastEnqueueTime", "scheduleRequestedAt", "setScheduleRequestedAt", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "backoffCriteriaSet", "Z", "getBackoffCriteriaSet$work_runtime_release", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "Ljava/util/UUID;", "getId$work_runtime_release", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Lztf;", "workSpec", "Lztf;", "getWorkSpec$work_runtime_release", "()Lztf;", "setWorkSpec$work_runtime_release", "(Lztf;)V", "", "tags", "Ljava/util/Set;", "getTags$work_runtime_release", "()Ljava/util/Set;", "getThisObject$work_runtime_release", "()Landroidx/work/WorkRequest$Builder;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;
        private UUID id = UUID.randomUUID();
        private final Set<String> tags;
        private ztf workSpec;
        private final Class<? extends hh7> workerClass;

        public Builder(Class<? extends hh7> cls) {
            this.workerClass = cls;
            this.workSpec = new ztf(this.id.toString(), (ctf) null, cls.getName(), (String) null, (zy3) null, (zy3) null, 0, 0, 0, (if3) null, 0, (he0) null, 0, 0, 0, 0, false, (vga) null, 0, 1048570, 0);
            LinkedHashSet linkedHashSet = new LinkedHashSet(ju7.S(1));
            cs.e0(new String[]{cls.getName()}, linkedHashSet);
            this.tags = linkedHashSet;
        }

        public final B addTag(String str) {
            this.tags.add(str);
            return getThisObject$work_runtime_release();
        }

        public final W build() {
            W buildInternal$work_runtime_release = buildInternal$work_runtime_release();
            if3 if3 = this.workSpec.j;
            boolean z = (if3.h.isEmpty() ^ true) || if3.d || if3.b || if3.c;
            ztf ztf = this.workSpec;
            if (ztf.q) {
                if (!(!z)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                } else if (ztf.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            setId(UUID.randomUUID());
            return buildInternal$work_runtime_release;
        }

        public abstract W buildInternal$work_runtime_release();

        public final boolean getBackoffCriteriaSet$work_runtime_release() {
            return this.backoffCriteriaSet;
        }

        public final UUID getId$work_runtime_release() {
            return this.id;
        }

        public final Set<String> getTags$work_runtime_release() {
            return this.tags;
        }

        public abstract B getThisObject$work_runtime_release();

        public final ztf getWorkSpec$work_runtime_release() {
            return this.workSpec;
        }

        public final Class<? extends hh7> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        public final B keepResultsForAtLeast(long j, TimeUnit timeUnit) {
            this.workSpec.o = timeUnit.toMillis(j);
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(he0 he0, long j, TimeUnit timeUnit) {
            this.backoffCriteriaSet = true;
            ztf ztf = this.workSpec;
            ztf.l = he0;
            ztf.e(timeUnit.toMillis(j));
            return getThisObject$work_runtime_release();
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z) {
            this.backoffCriteriaSet = z;
        }

        public final B setConstraints(if3 if3) {
            this.workSpec.j = if3;
            return getThisObject$work_runtime_release();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B setExpedited(vga vga) {
            ztf ztf = this.workSpec;
            ztf.q = true;
            ztf.r = vga;
            return getThisObject$work_runtime_release();
        }

        public final B setId(UUID uuid) {
            this.id = uuid;
            String uuid2 = uuid.toString();
            ztf ztf = this.workSpec;
            String str = ztf.c;
            ctf ctf = ztf.b;
            String str2 = ztf.d;
            zy3 zy3 = new zy3(ztf.e);
            zy3 zy32 = new zy3(ztf.f);
            long j = ztf.g;
            long j2 = ztf.h;
            long j3 = ztf.i;
            if3 if3 = ztf.j;
            boolean z = if3.b;
            long j4 = j3;
            long j5 = if3.f;
            long j6 = j2;
            long j7 = if3.g;
            long j8 = j;
            int i = if3.a;
            boolean z2 = if3.c;
            zy3 zy33 = zy32;
            boolean z3 = if3.d;
            ztf ztf2 = r1;
            ztf ztf3 = new ztf(uuid2, ctf, str, str2, zy3, zy33, j8, j6, j4, new if3(i, z, z2, z3, if3.e, j5, j7, if3.h), ztf.k, ztf.l, ztf.m, ztf.n, ztf.o, ztf.p, ztf.q, ztf.r, ztf.s, 524288, 0);
            this.workSpec = ztf2;
            return getThisObject$work_runtime_release();
        }

        public final void setId$work_runtime_release(UUID uuid) {
            this.id = uuid;
        }

        public B setInitialDelay(long j, TimeUnit timeUnit) {
            this.workSpec.g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.g) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        public final B setInitialRunAttemptCount(int i) {
            this.workSpec.k = i;
            return getThisObject$work_runtime_release();
        }

        public final B setInitialState(ctf ctf) {
            this.workSpec.b = ctf;
            return getThisObject$work_runtime_release();
        }

        public final B setInputData(zy3 zy3) {
            this.workSpec.e = zy3;
            return getThisObject$work_runtime_release();
        }

        public final B setLastEnqueueTime(long j, TimeUnit timeUnit) {
            this.workSpec.n = timeUnit.toMillis(j);
            return getThisObject$work_runtime_release();
        }

        public final B setScheduleRequestedAt(long j, TimeUnit timeUnit) {
            this.workSpec.p = timeUnit.toMillis(j);
            return getThisObject$work_runtime_release();
        }

        public final void setWorkSpec$work_runtime_release(ztf ztf) {
            this.workSpec = ztf;
        }

        public final B keepResultsForAtLeast(Duration duration) {
            this.workSpec.o = aq4.a(duration);
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(he0 he0, Duration duration) {
            this.backoffCriteriaSet = true;
            ztf ztf = this.workSpec;
            ztf.l = he0;
            ztf.e(aq4.a(duration));
            return getThisObject$work_runtime_release();
        }

        public B setInitialDelay(Duration duration) {
            this.workSpec.g = aq4.a(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.g) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }
    }
}
