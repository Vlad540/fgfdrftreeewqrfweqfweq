package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final gh7 b() {
        pec pec;
        j8e j8e;
        duf duf;
        otf otf;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        WorkDatabase workDatabase = itf.d(getApplicationContext()).c;
        buf y = workDatabase.y();
        otf w = workDatabase.w();
        duf z6 = workDatabase.z();
        j8e v = workDatabase.v();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1);
        y.getClass();
        pec a = pec.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        a.j(1, currentTimeMillis);
        aec aec = (aec) y.a;
        aec.b();
        Cursor o = aec.o(a, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, HasExtraData.KEY_ID);
            int o3 = gp0.o(o, "state");
            int o4 = gp0.o(o, "worker_class_name");
            int o5 = gp0.o(o, "input_merger_class_name");
            int o6 = gp0.o(o, "input");
            int o7 = gp0.o(o, "output");
            int o8 = gp0.o(o, "initial_delay");
            int o9 = gp0.o(o, "interval_duration");
            int o10 = gp0.o(o, "flex_duration");
            int o11 = gp0.o(o, "run_attempt_count");
            j8e j8e2 = v;
            int o12 = gp0.o(o, "backoff_policy");
            otf otf2 = w;
            int o13 = gp0.o(o, "backoff_delay_duration");
            duf duf2 = z6;
            int o14 = gp0.o(o, "last_enqueue_time");
            buf buf = y;
            int o15 = gp0.o(o, "minimum_retention_duration");
            pec = a;
            try {
                int o16 = gp0.o(o, "schedule_requested_at");
                int o17 = gp0.o(o, "run_in_foreground");
                int o18 = gp0.o(o, "out_of_quota_policy");
                int o19 = gp0.o(o, "period_count");
                int o20 = gp0.o(o, "generation");
                int o21 = gp0.o(o, "required_network_type");
                int o22 = gp0.o(o, "requires_charging");
                int o23 = gp0.o(o, "requires_device_idle");
                int o24 = gp0.o(o, "requires_battery_not_low");
                int o25 = gp0.o(o, "requires_storage_not_low");
                int o26 = gp0.o(o, "trigger_content_update_delay");
                int o27 = gp0.o(o, "trigger_max_content_delay");
                int o28 = gp0.o(o, "content_uri_triggers");
                int i6 = o15;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(o2) ? null : o.getString(o2);
                    ctf t = wx3.t(o.getInt(o3));
                    String string2 = o.isNull(o4) ? null : o.getString(o4);
                    String string3 = o.isNull(o5) ? null : o.getString(o5);
                    zy3 a2 = zy3.a(o.isNull(o6) ? null : o.getBlob(o6));
                    zy3 a3 = zy3.a(o.isNull(o7) ? null : o.getBlob(o7));
                    long j = o.getLong(o8);
                    long j2 = o.getLong(o9);
                    long j3 = o.getLong(o10);
                    int i7 = o.getInt(o11);
                    he0 q = wx3.q(o.getInt(o12));
                    long j4 = o.getLong(o13);
                    long j5 = o.getLong(o14);
                    int i8 = i6;
                    long j6 = o.getLong(i8);
                    int i9 = o12;
                    int i10 = o16;
                    long j7 = o.getLong(i10);
                    o16 = i10;
                    int i11 = o17;
                    if (o.getInt(i11) != 0) {
                        o17 = i11;
                        i = o18;
                        z = true;
                    } else {
                        o17 = i11;
                        i = o18;
                        z = false;
                    }
                    vga s = wx3.s(o.getInt(i));
                    o18 = i;
                    int i12 = o19;
                    int i13 = o.getInt(i12);
                    o19 = i12;
                    int i14 = o20;
                    int i15 = o.getInt(i14);
                    o20 = i14;
                    int i16 = o21;
                    int r = wx3.r(o.getInt(i16));
                    o21 = i16;
                    int i17 = o22;
                    if (o.getInt(i17) != 0) {
                        o22 = i17;
                        i2 = o23;
                        z2 = true;
                    } else {
                        o22 = i17;
                        i2 = o23;
                        z2 = false;
                    }
                    if (o.getInt(i2) != 0) {
                        o23 = i2;
                        i3 = o24;
                        z3 = true;
                    } else {
                        o23 = i2;
                        i3 = o24;
                        z3 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        o24 = i3;
                        i4 = o25;
                        z4 = true;
                    } else {
                        o24 = i3;
                        i4 = o25;
                        z4 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        o25 = i4;
                        i5 = o26;
                        z5 = true;
                    } else {
                        o25 = i4;
                        i5 = o26;
                        z5 = false;
                    }
                    long j8 = o.getLong(i5);
                    o26 = i5;
                    int i18 = o27;
                    long j9 = o.getLong(i18);
                    o27 = i18;
                    int i19 = o28;
                    o28 = i19;
                    arrayList.add(new ztf(string, t, string2, string3, a2, a3, j, j2, j3, new if3(r, z2, z3, z4, z5, j8, j9, wx3.b(o.isNull(i19) ? null : o.getBlob(i19))), i7, q, j4, j5, j6, j7, z, s, i13, i15));
                    o12 = i9;
                    i6 = i8;
                }
                o.close();
                pec.m();
                ArrayList h = buf.h();
                ArrayList f = buf.f();
                if (!arrayList.isEmpty()) {
                    a24 B = a24.B();
                    String str = fg4.a;
                    B.P(str, "Recently completed work:\n\n");
                    j8e = j8e2;
                    otf = otf2;
                    duf = duf2;
                    a24.B().P(str, fg4.a(otf, duf, j8e, arrayList));
                } else {
                    j8e = j8e2;
                    otf = otf2;
                    duf = duf2;
                }
                if (!h.isEmpty()) {
                    a24 B2 = a24.B();
                    String str2 = fg4.a;
                    B2.P(str2, "Running work:\n\n");
                    a24.B().P(str2, fg4.a(otf, duf, j8e, h));
                }
                if (!f.isEmpty()) {
                    a24 B3 = a24.B();
                    String str3 = fg4.a;
                    B3.P(str3, "Enqueued work:\n\n");
                    a24.B().P(str3, fg4.a(otf, duf, j8e, f));
                }
                return gh7.b();
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a;
            o.close();
            pec.m();
            throw th;
        }
    }
}
