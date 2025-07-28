package defpackage;

import android.app.job.JobParameters;
import android.net.Network;

/* renamed from: n8e  reason: default package */
public abstract class n8e {
    public static Network a(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }
}
