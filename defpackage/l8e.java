package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: l8e  reason: default package */
public final class l8e implements rmc {
    public static final String X = a24.e0("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final itf c;
    public final k8e o;

    public l8e(Context context, itf itf) {
        k8e k8e = new k8e(context);
        this.a = context;
        this.c = itf;
        this.b = (JobScheduler) context.getSystemService("jobscheduler");
        this.o = k8e;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            a24.B().y(X, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            a24.B().y(X, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static btf f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new btf(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final boolean c() {
        return true;
    }

    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList b2 = b(context, jobScheduler);
        if (b2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                btf f = f(jobInfo);
                if (f != null && str.equals(f.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a(jobScheduler, ((Integer) it2.next()).intValue());
            }
            j8e v = this.c.c.v();
            aec aec = (aec) v.a;
            aec.b();
            tdc tdc = (tdc) v.o;
            yz5 f2 = tdc.f();
            if (str == null) {
                f2.W(1);
            } else {
                f2.f(1, str);
            }
            aec.c();
            try {
                f2.n();
                aec.r();
            } finally {
                aec.l();
                tdc.u(f2);
            }
        }
    }

    public final void e(ztf... ztfArr) {
        int i;
        itf itf = this.c;
        WorkDatabase workDatabase = itf.c;
        e3 e3Var = new e3(workDatabase);
        int length = ztfArr.length;
        int i2 = 0;
        while (i2 < length) {
            ztf ztf = ztfArr[i2];
            workDatabase.c();
            try {
                ztf l = workDatabase.y().l(ztf.a);
                String str = X;
                String str2 = ztf.a;
                if (l == null) {
                    a24 B = a24.B();
                    B.k0(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.r();
                } else if (l.b != ctf.a) {
                    a24 B2 = a24.B();
                    B2.k0(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.r();
                } else {
                    btf o2 = vx3.o(ztf);
                    i8e r = workDatabase.v().r(o2);
                    if (r != null) {
                        i = r.c;
                    } else {
                        itf.b.getClass();
                        i = ((Number) ((WorkDatabase) e3Var.a).p(new ap6(e3Var, itf.b.g))).intValue();
                    }
                    if (r == null) {
                        itf.c.v().s(new i8e(o2.a, o2.b, i));
                    }
                    g(ztf, i);
                    workDatabase.r();
                }
                i2++;
            } finally {
                workDatabase.l();
            }
        }
    }

    public final void g(ztf ztf, int i) {
        int i2;
        JobScheduler jobScheduler = this.b;
        k8e k8e = this.o;
        k8e.getClass();
        if3 if3 = ztf.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = ztf.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", ztf.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", ztf.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, k8e.a).setRequiresCharging(if3.b);
        boolean z = if3.c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        int i3 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        int i4 = 0;
        int i5 = if3.a;
        if (i3 < 30 || i5 != 6) {
            int t = hr1.t(i5);
            if (t != 0) {
                if (t != 1) {
                    i2 = 2;
                    if (t != 2) {
                        i2 = 3;
                        if (t != 3) {
                            i2 = 4;
                            if (t != 4) {
                                a24.B().t(k8e.b, "API version too low. Cannot convert network type value ".concat(us8.u(i5)));
                            }
                        }
                    }
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z) {
            extras.setBackoffCriteria(ztf.m, ztf.l == he0.b ? 0 : 1);
        }
        long max = Math.max(ztf.a() - System.currentTimeMillis(), 0);
        int i6 = (max > 0 ? 1 : (max == 0 ? 0 : -1));
        if (i6 > 0) {
            extras.setMinimumLatency(max);
        } else if (!ztf.q) {
            extras.setImportantWhileForeground(true);
        }
        Set<hf3> set = if3.h;
        if (!set.isEmpty()) {
            for (hf3 hf3 : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(hf3.a, hf3.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(if3.f);
            extras.setTriggerContentMaxDelay(if3.g);
        }
        extras.setPersisted(false);
        int i7 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(if3.d);
        extras.setRequiresStorageNotLow(if3.e);
        boolean z3 = ztf.k > 0;
        if (i6 <= 0) {
            z2 = false;
        }
        if (i7 >= 31 && ztf.q && !z3 && !z2) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = X;
        a24.B().t(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            if (jobScheduler.schedule(build) == 0) {
                a24.B().k0(str2, "Unable to schedule work ID " + str);
                if (ztf.q && ztf.r == vga.a) {
                    ztf.q = false;
                    a24.B().t(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(ztf, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList b2 = b(this.a, jobScheduler);
            if (b2 != null) {
                i4 = b2.size();
            }
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(i4);
            itf itf = this.c;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{valueOf, Integer.valueOf(itf.c.y().i().size()), Integer.valueOf(itf.b.h)});
            a24.B().x(str2, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e);
            itf.b.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            a24.B().y(str2, "Unable to schedule " + ztf, th);
        }
    }
}
