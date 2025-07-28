package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: n37  reason: default package */
public final class n37 implements m37 {
    public final /* synthetic */ int a;
    public final JobWorkItem b;
    public final /* synthetic */ JobServiceEngine c;

    public /* synthetic */ n37(JobServiceEngine jobServiceEngine, JobWorkItem jobWorkItem, int i) {
        this.a = i;
        this.c = jobServiceEngine;
        this.b = jobWorkItem;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                synchronized (((o37) this.c).c) {
                    try {
                        JobParameters jobParameters = ((o37) this.c).d;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (((o37) this.c).c) {
                    JobParameters jobParameters2 = ((o37) this.c).d;
                    if (jobParameters2 != null) {
                        try {
                            jobParameters2.completeWork(this.b);
                        } catch (IllegalArgumentException | SecurityException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
        }
    }

    public final Intent getIntent() {
        switch (this.a) {
            case 0:
                return this.b.getIntent();
            default:
                return this.b.getIntent();
        }
    }
}
