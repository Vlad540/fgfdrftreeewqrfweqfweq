package defpackage;

/* renamed from: eee  reason: default package */
public final class eee extends sde {
    public final Runnable a;

    public eee(Runnable runnable, long j, xde xde) {
        super(j, xde);
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
        } finally {
            this.taskContext.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.a;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(a24.F(runnable));
        sb.append(", ");
        sb.append(this.submissionTime);
        sb.append(", ");
        sb.append(this.taskContext);
        sb.append(']');
        return sb.toString();
    }
}
