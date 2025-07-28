package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* renamed from: i37  reason: default package */
public final class i37 {
    public final Context a;
    public final a15 b;
    public final pa0 c;

    public i37(Context context, a15 a15, pa0 pa0) {
        this.a = context;
        this.b = a15;
        this.c = pa0;
    }

    /* JADX INFO: finally extract failed */
    public final void a(hb0 hb0, int i, boolean z) {
        hb0 hb02 = hb0;
        int i2 = i;
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(hb02.a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        t3b t3b = hb02.c;
        adler32.update(allocate.putInt(w3b.a(t3b)).array());
        byte[] bArr = hb02.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        n1g.h("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", hb02);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase m = ((xic) this.b).m();
        String valueOf = String.valueOf(w3b.a(t3b));
        String str = hb02.a;
        Cursor rawQuery = m.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Long valueOf2 = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            pa0 pa0 = this.c;
            JobScheduler jobScheduler2 = jobScheduler;
            int i4 = value;
            builder.setMinimumLatency(pa0.a(t3b, longValue, i2));
            Set set = ((qa0) pa0.b.get(t3b)).c;
            if (set.contains(tmc.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(tmc.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(tmc.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", w3b.a(t3b));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {hb02, Integer.valueOf(i4), Long.valueOf(pa0.a(t3b, longValue, i2)), valueOf2, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler2.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
