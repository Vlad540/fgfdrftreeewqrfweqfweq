package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        tre.b(getApplicationContext());
        ydc a2 = hb0.a();
        a2.I(string);
        a2.o = w3b.b(i);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        vxe vxe = tre.a().d;
        hb0 r = a2.r();
        zo5 zo5 = new zo5(this, 9, jobParameters);
        vxe.getClass();
        vxe.e.execute(new nx4(vxe, r, i2, zo5));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
