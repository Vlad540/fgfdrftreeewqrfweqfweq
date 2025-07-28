package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class WorkersQueueDao_Impl implements WorkersQueueDao {
    private final aec __db;
    private final lz4 __insertionAdapterOfWorkerQueueItem;
    private final lz4 __insertionAdapterOfWorkerQueueItem_1;

    public WorkersQueueDao_Impl(aec aec) {
        this.__db = aec;
        this.__insertionAdapterOfWorkerQueueItem = new puf(this, aec, 0);
        this.__insertionAdapterOfWorkerQueueItem_1 = new puf(this, aec, 1);
    }

    /* access modifiers changed from: private */
    public String __ExistingWorkPolicy_enumToString(a35 a35) {
        int ordinal = a35.ordinal();
        if (ordinal == 0) {
            return "REPLACE";
        }
        if (ordinal == 1) {
            return "KEEP";
        }
        if (ordinal == 2) {
            return "APPEND";
        }
        if (ordinal == 3) {
            return "APPEND_OR_REPLACE";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + a35);
    }

    private a35 __ExistingWorkPolicy_stringToEnum(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1086924163:
                if (str.equals("APPEND_OR_REPLACE")) {
                    c = 0;
                    break;
                }
                break;
            case 2302853:
                if (str.equals("KEEP")) {
                    c = 1;
                    break;
                }
                break;
            case 1812479636:
                if (str.equals("REPLACE")) {
                    c = 2;
                    break;
                }
                break;
            case 1937228570:
                if (str.equals("APPEND")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return a35.o;
            case 1:
                return a35.b;
            case 2:
                return a35.a;
            case 3:
                return a35.c;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public boolean contains(List<String> list) {
        this.__db.c();
        try {
            boolean contains = super.contains(list);
            this.__db.r();
            return contains;
        } finally {
            this.__db.l();
        }
    }

    public int count(int i) {
        pec a = pec.a(1, "SELECT COUNT(*) FROM WorkerQueueItem WHERE state = ?");
        a.j(1, (long) i);
        this.__db.b();
        Cursor o = this.__db.o(a, (CancellationSignal) null);
        try {
            int i2 = 0;
            if (o.moveToFirst()) {
                i2 = o.getInt(0);
            }
            return i2;
        } finally {
            o.close();
            a.m();
        }
    }

    public void delete(List<String> list) {
        this.__db.b();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM WorkerQueueItem WHERE uuid IN (");
        a06.e(sb, list.size());
        sb.append(")");
        yz5 d = this.__db.d(sb.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                d.W(i);
            } else {
                d.f(i, next);
            }
            i++;
        }
        this.__db.c();
        try {
            d.n();
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public List<juf> getItemsForRunning(int i) {
        this.__db.c();
        try {
            List<juf> itemsForRunning = super.getItemsForRunning(i);
            this.__db.r();
            return itemsForRunning;
        } finally {
            this.__db.l();
        }
    }

    public void insert(juf juf) {
        this.__db.c();
        try {
            super.insert(juf);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public void insertOrIgnore(juf juf) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfWorkerQueueItem.C(juf);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public void insertOrReplace(juf juf) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfWorkerQueueItem_1.C(juf);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public List<juf> select(int i) {
        pec pec;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        byte[] bArr3;
        WorkersQueueDao_Impl workersQueueDao_Impl = this;
        pec a = pec.a(1, "SELECT * FROM WorkerQueueItem ORDER BY time ASC LIMIT ?");
        a.j(1, (long) i);
        workersQueueDao_Impl.__db.b();
        Cursor o = workersQueueDao_Impl.__db.o(a, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, "uuid");
            int o3 = gp0.o(o, "uniqueWorkName");
            int o4 = gp0.o(o, "existingWorkPolicy");
            int o5 = gp0.o(o, "tags");
            int o6 = gp0.o(o, "time");
            int o7 = gp0.o(o, "state");
            int o8 = gp0.o(o, "work_spec_id");
            int o9 = gp0.o(o, "work_spec_state");
            int o10 = gp0.o(o, "work_spec_worker_class_name");
            int o11 = gp0.o(o, "work_spec_input_merger_class_name");
            int o12 = gp0.o(o, "work_spec_input");
            int o13 = gp0.o(o, "work_spec_output");
            int o14 = gp0.o(o, "work_spec_initial_delay");
            pec = a;
            try {
                int o15 = gp0.o(o, "work_spec_interval_duration");
                int o16 = gp0.o(o, "work_spec_flex_duration");
                int o17 = gp0.o(o, "work_spec_run_attempt_count");
                int o18 = gp0.o(o, "work_spec_backoff_policy");
                int o19 = gp0.o(o, "work_spec_backoff_delay_duration");
                int o20 = gp0.o(o, "work_spec_last_enqueue_time");
                int o21 = gp0.o(o, "work_spec_minimum_retention_duration");
                int o22 = gp0.o(o, "work_spec_schedule_requested_at");
                int o23 = gp0.o(o, "work_spec_run_in_foreground");
                int o24 = gp0.o(o, "work_spec_out_of_quota_policy");
                int o25 = gp0.o(o, "work_spec_period_count");
                int o26 = gp0.o(o, "work_spec_generation");
                int o27 = gp0.o(o, "work_spec_required_network_type");
                int o28 = gp0.o(o, "work_spec_requires_charging");
                int o29 = gp0.o(o, "work_spec_requires_device_idle");
                int o30 = gp0.o(o, "work_spec_requires_battery_not_low");
                int o31 = gp0.o(o, "work_spec_requires_storage_not_low");
                int o32 = gp0.o(o, "work_spec_trigger_content_update_delay");
                int o33 = gp0.o(o, "work_spec_trigger_max_content_delay");
                int o34 = gp0.o(o, "work_spec_content_uri_triggers");
                int i7 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    if (o.isNull(o2)) {
                        str = null;
                    } else {
                        str = o.getString(o2);
                    }
                    if (o.isNull(o3)) {
                        str2 = null;
                    } else {
                        str2 = o.getString(o3);
                    }
                    a35 __ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(o.getString(o4));
                    if (o.isNull(o5)) {
                        str3 = null;
                    } else {
                        str3 = o.getString(o5);
                    }
                    HashSet w = kjd.w(str3);
                    long j = o.getLong(o6);
                    int i8 = o.getInt(o7);
                    if (o.isNull(o8)) {
                        str4 = null;
                    } else {
                        str4 = o.getString(o8);
                    }
                    ctf t = wx3.t(o.getInt(o9));
                    if (o.isNull(o10)) {
                        str5 = null;
                    } else {
                        str5 = o.getString(o10);
                    }
                    if (o.isNull(o11)) {
                        str6 = null;
                    } else {
                        str6 = o.getString(o11);
                    }
                    if (o.isNull(o12)) {
                        bArr = null;
                    } else {
                        bArr = o.getBlob(o12);
                    }
                    zy3 a2 = zy3.a(bArr);
                    if (o.isNull(o13)) {
                        bArr2 = null;
                    } else {
                        bArr2 = o.getBlob(o13);
                    }
                    zy3 a3 = zy3.a(bArr2);
                    int i9 = i7;
                    long j2 = o.getLong(i9);
                    int i10 = o15;
                    long j3 = o.getLong(i10);
                    o15 = i10;
                    int i11 = o16;
                    long j4 = o.getLong(i11);
                    o16 = i11;
                    int i12 = o17;
                    int i13 = o.getInt(i12);
                    o17 = i12;
                    int i14 = o18;
                    he0 q = wx3.q(o.getInt(i14));
                    o18 = i14;
                    int i15 = o19;
                    long j5 = o.getLong(i15);
                    o19 = i15;
                    int i16 = o20;
                    long j6 = o.getLong(i16);
                    o20 = i16;
                    int i17 = o21;
                    long j7 = o.getLong(i17);
                    o21 = i17;
                    int i18 = o22;
                    long j8 = o.getLong(i18);
                    o22 = i18;
                    int i19 = o23;
                    if (o.getInt(i19) != 0) {
                        o23 = i19;
                        i2 = o24;
                        z = true;
                    } else {
                        o23 = i19;
                        i2 = o24;
                        z = false;
                    }
                    vga s = wx3.s(o.getInt(i2));
                    o24 = i2;
                    int i20 = o25;
                    int i21 = o.getInt(i20);
                    o25 = i20;
                    int i22 = o26;
                    int i23 = o.getInt(i22);
                    o26 = i22;
                    int i24 = o27;
                    int r = wx3.r(o.getInt(i24));
                    o27 = i24;
                    int i25 = o28;
                    if (o.getInt(i25) != 0) {
                        o28 = i25;
                        i3 = o29;
                        z2 = true;
                    } else {
                        o28 = i25;
                        i3 = o29;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        o29 = i3;
                        i4 = o30;
                        z3 = true;
                    } else {
                        o29 = i3;
                        i4 = o30;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        o30 = i4;
                        i5 = o31;
                        z4 = true;
                    } else {
                        o30 = i4;
                        i5 = o31;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        o31 = i5;
                        i6 = o32;
                        z5 = true;
                    } else {
                        o31 = i5;
                        i6 = o32;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    o32 = i6;
                    int i26 = o33;
                    long j10 = o.getLong(i26);
                    o33 = i26;
                    int i27 = o34;
                    if (o.isNull(i27)) {
                        bArr3 = null;
                    } else {
                        bArr3 = o.getBlob(i27);
                    }
                    o34 = i27;
                    arrayList.add(new juf(str, str2, __ExistingWorkPolicy_stringToEnum, new ztf(str4, t, str5, str6, a2, a3, j2, j3, j4, new if3(r, z2, z3, z4, z5, j9, j10, wx3.b(bArr3)), i13, q, j5, j6, j7, j8, z, s, i21, i23), w, j, i8));
                    workersQueueDao_Impl = this;
                    i7 = i9;
                }
                o.close();
                pec.m();
                return arrayList;
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

    public void updateState(int i, List<String> list) {
        this.__db.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE WorkerQueueItem SET state = ? WHERE uuid IN (");
        a06.e(sb, list.size());
        sb.append(")");
        yz5 d = this.__db.d(sb.toString());
        d.j(1, (long) i);
        int i2 = 2;
        for (String next : list) {
            if (next == null) {
                d.W(i2);
            } else {
                d.f(i2, next);
            }
            i2++;
        }
        this.__db.c();
        try {
            d.n();
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    public List<juf> select(int i, int i2) {
        pec pec;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        byte[] bArr3;
        WorkersQueueDao_Impl workersQueueDao_Impl = this;
        pec a = pec.a(2, "SELECT * FROM WorkerQueueItem WHERE state = ? ORDER BY time ASC LIMIT ?");
        a.j(1, (long) i2);
        a.j(2, (long) i);
        workersQueueDao_Impl.__db.b();
        Cursor o = workersQueueDao_Impl.__db.o(a, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, "uuid");
            int o3 = gp0.o(o, "uniqueWorkName");
            int o4 = gp0.o(o, "existingWorkPolicy");
            int o5 = gp0.o(o, "tags");
            int o6 = gp0.o(o, "time");
            int o7 = gp0.o(o, "state");
            int o8 = gp0.o(o, "work_spec_id");
            int o9 = gp0.o(o, "work_spec_state");
            int o10 = gp0.o(o, "work_spec_worker_class_name");
            int o11 = gp0.o(o, "work_spec_input_merger_class_name");
            int o12 = gp0.o(o, "work_spec_input");
            int o13 = gp0.o(o, "work_spec_output");
            int o14 = gp0.o(o, "work_spec_initial_delay");
            pec = a;
            try {
                int o15 = gp0.o(o, "work_spec_interval_duration");
                int o16 = gp0.o(o, "work_spec_flex_duration");
                int o17 = gp0.o(o, "work_spec_run_attempt_count");
                int o18 = gp0.o(o, "work_spec_backoff_policy");
                int o19 = gp0.o(o, "work_spec_backoff_delay_duration");
                int o20 = gp0.o(o, "work_spec_last_enqueue_time");
                int o21 = gp0.o(o, "work_spec_minimum_retention_duration");
                int o22 = gp0.o(o, "work_spec_schedule_requested_at");
                int o23 = gp0.o(o, "work_spec_run_in_foreground");
                int o24 = gp0.o(o, "work_spec_out_of_quota_policy");
                int o25 = gp0.o(o, "work_spec_period_count");
                int o26 = gp0.o(o, "work_spec_generation");
                int o27 = gp0.o(o, "work_spec_required_network_type");
                int o28 = gp0.o(o, "work_spec_requires_charging");
                int o29 = gp0.o(o, "work_spec_requires_device_idle");
                int o30 = gp0.o(o, "work_spec_requires_battery_not_low");
                int o31 = gp0.o(o, "work_spec_requires_storage_not_low");
                int o32 = gp0.o(o, "work_spec_trigger_content_update_delay");
                int o33 = gp0.o(o, "work_spec_trigger_max_content_delay");
                int o34 = gp0.o(o, "work_spec_content_uri_triggers");
                int i8 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    if (o.isNull(o2)) {
                        str = null;
                    } else {
                        str = o.getString(o2);
                    }
                    if (o.isNull(o3)) {
                        str2 = null;
                    } else {
                        str2 = o.getString(o3);
                    }
                    a35 __ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(o.getString(o4));
                    if (o.isNull(o5)) {
                        str3 = null;
                    } else {
                        str3 = o.getString(o5);
                    }
                    HashSet w = kjd.w(str3);
                    long j = o.getLong(o6);
                    int i9 = o.getInt(o7);
                    if (o.isNull(o8)) {
                        str4 = null;
                    } else {
                        str4 = o.getString(o8);
                    }
                    ctf t = wx3.t(o.getInt(o9));
                    if (o.isNull(o10)) {
                        str5 = null;
                    } else {
                        str5 = o.getString(o10);
                    }
                    if (o.isNull(o11)) {
                        str6 = null;
                    } else {
                        str6 = o.getString(o11);
                    }
                    if (o.isNull(o12)) {
                        bArr = null;
                    } else {
                        bArr = o.getBlob(o12);
                    }
                    zy3 a2 = zy3.a(bArr);
                    if (o.isNull(o13)) {
                        bArr2 = null;
                    } else {
                        bArr2 = o.getBlob(o13);
                    }
                    zy3 a3 = zy3.a(bArr2);
                    int i10 = i8;
                    long j2 = o.getLong(i10);
                    int i11 = o15;
                    long j3 = o.getLong(i11);
                    o15 = i11;
                    int i12 = o16;
                    long j4 = o.getLong(i12);
                    o16 = i12;
                    int i13 = o17;
                    int i14 = o.getInt(i13);
                    o17 = i13;
                    int i15 = o18;
                    he0 q = wx3.q(o.getInt(i15));
                    o18 = i15;
                    int i16 = o19;
                    long j5 = o.getLong(i16);
                    o19 = i16;
                    int i17 = o20;
                    long j6 = o.getLong(i17);
                    o20 = i17;
                    int i18 = o21;
                    long j7 = o.getLong(i18);
                    o21 = i18;
                    int i19 = o22;
                    long j8 = o.getLong(i19);
                    o22 = i19;
                    int i20 = o23;
                    if (o.getInt(i20) != 0) {
                        o23 = i20;
                        i3 = o24;
                        z = true;
                    } else {
                        o23 = i20;
                        i3 = o24;
                        z = false;
                    }
                    vga s = wx3.s(o.getInt(i3));
                    o24 = i3;
                    int i21 = o25;
                    int i22 = o.getInt(i21);
                    o25 = i21;
                    int i23 = o26;
                    int i24 = o.getInt(i23);
                    o26 = i23;
                    int i25 = o27;
                    int r = wx3.r(o.getInt(i25));
                    o27 = i25;
                    int i26 = o28;
                    if (o.getInt(i26) != 0) {
                        o28 = i26;
                        i4 = o29;
                        z2 = true;
                    } else {
                        o28 = i26;
                        i4 = o29;
                        z2 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        o29 = i4;
                        i5 = o30;
                        z3 = true;
                    } else {
                        o29 = i4;
                        i5 = o30;
                        z3 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        o30 = i5;
                        i6 = o31;
                        z4 = true;
                    } else {
                        o30 = i5;
                        i6 = o31;
                        z4 = false;
                    }
                    if (o.getInt(i6) != 0) {
                        o31 = i6;
                        i7 = o32;
                        z5 = true;
                    } else {
                        o31 = i6;
                        i7 = o32;
                        z5 = false;
                    }
                    long j9 = o.getLong(i7);
                    o32 = i7;
                    int i27 = o33;
                    long j10 = o.getLong(i27);
                    o33 = i27;
                    int i28 = o34;
                    if (o.isNull(i28)) {
                        bArr3 = null;
                    } else {
                        bArr3 = o.getBlob(i28);
                    }
                    o34 = i28;
                    arrayList.add(new juf(str, str2, __ExistingWorkPolicy_stringToEnum, new ztf(str4, t, str5, str6, a2, a3, j2, j3, j4, new if3(r, z2, z3, z4, z5, j9, j10, wx3.b(bArr3)), i14, q, j5, j6, j7, j8, z, s, i22, i24), w, j, i9));
                    workersQueueDao_Impl = this;
                    i8 = i10;
                }
                o.close();
                pec.m();
                return arrayList;
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
