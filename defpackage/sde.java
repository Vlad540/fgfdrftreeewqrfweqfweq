package defpackage;

/* renamed from: sde  reason: default package */
public abstract class sde implements Runnable {
    public long submissionTime;
    public xde taskContext;

    public sde(long j, xde xde) {
        this.submissionTime = j;
        this.taskContext = xde;
    }

    public final int getMode$kotlinx_coroutines_core() {
        return ((ii5) this.taskContext).b;
    }
}
