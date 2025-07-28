package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;

/* renamed from: puf  reason: default package */
public final class puf extends lz4 {
    public final /* synthetic */ WorkersQueueDao_Impl X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ puf(WorkersQueueDao_Impl workersQueueDao_Impl, aec aec, int i) {
        super(aec);
        this.o = i;
        this.X = workersQueueDao_Impl;
    }

    public final void A(yz5 yz5, Object obj) {
        switch (this.o) {
            case 0:
                juf juf = (juf) obj;
                String str = juf.a;
                if (str == null) {
                    yz5.W(1);
                } else {
                    yz5.f(1, str);
                }
                String str2 = juf.b;
                if (str2 == null) {
                    yz5.W(2);
                } else {
                    yz5.f(2, str2);
                }
                yz5.f(3, this.X.__ExistingWorkPolicy_enumToString(juf.c));
                yz5.f(4, o23.c0(juf.e, ",", (String) null, (String) null, (u16) null, 62));
                yz5.j(5, juf.f);
                yz5.j(6, (long) juf.g);
                ztf ztf = juf.d;
                String str3 = ztf.a;
                if (str3 == null) {
                    yz5.W(7);
                } else {
                    yz5.f(7, str3);
                }
                yz5.j(8, (long) wx3.G(ztf.b));
                String str4 = ztf.c;
                if (str4 == null) {
                    yz5.W(9);
                } else {
                    yz5.f(9, str4);
                }
                String str5 = ztf.d;
                if (str5 == null) {
                    yz5.W(10);
                } else {
                    yz5.f(10, str5);
                }
                byte[] f = zy3.f(ztf.e);
                if (f == null) {
                    yz5.W(11);
                } else {
                    yz5.k(11, f);
                }
                byte[] f2 = zy3.f(ztf.f);
                if (f2 == null) {
                    yz5.W(12);
                } else {
                    yz5.k(12, f2);
                }
                yz5.j(13, ztf.g);
                yz5.j(14, ztf.h);
                yz5.j(15, ztf.i);
                yz5.j(16, (long) ztf.k);
                yz5.j(17, (long) wx3.a(ztf.l));
                yz5.j(18, ztf.m);
                yz5.j(19, ztf.n);
                yz5.j(20, ztf.o);
                yz5.j(21, ztf.p);
                yz5.j(22, ztf.q ? 1 : 0);
                yz5.j(23, (long) wx3.A(ztf.r));
                yz5.j(24, (long) ztf.s);
                yz5.j(25, (long) ztf.t);
                if3 if3 = ztf.j;
                yz5.j(26, (long) wx3.x(if3.a));
                yz5.j(27, if3.b ? 1 : 0);
                yz5.j(28, if3.c ? 1 : 0);
                yz5.j(29, if3.d ? 1 : 0);
                yz5.j(30, if3.e ? 1 : 0);
                yz5.j(31, if3.f);
                yz5.j(32, if3.g);
                yz5.k(33, wx3.D(if3.h));
                return;
            default:
                juf juf2 = (juf) obj;
                String str6 = juf2.a;
                if (str6 == null) {
                    yz5.W(1);
                } else {
                    yz5.f(1, str6);
                }
                String str7 = juf2.b;
                if (str7 == null) {
                    yz5.W(2);
                } else {
                    yz5.f(2, str7);
                }
                yz5.f(3, this.X.__ExistingWorkPolicy_enumToString(juf2.c));
                yz5.f(4, o23.c0(juf2.e, ",", (String) null, (String) null, (u16) null, 62));
                yz5.j(5, juf2.f);
                yz5.j(6, (long) juf2.g);
                ztf ztf2 = juf2.d;
                String str8 = ztf2.a;
                if (str8 == null) {
                    yz5.W(7);
                } else {
                    yz5.f(7, str8);
                }
                yz5.j(8, (long) wx3.G(ztf2.b));
                String str9 = ztf2.c;
                if (str9 == null) {
                    yz5.W(9);
                } else {
                    yz5.f(9, str9);
                }
                String str10 = ztf2.d;
                if (str10 == null) {
                    yz5.W(10);
                } else {
                    yz5.f(10, str10);
                }
                byte[] f3 = zy3.f(ztf2.e);
                if (f3 == null) {
                    yz5.W(11);
                } else {
                    yz5.k(11, f3);
                }
                byte[] f4 = zy3.f(ztf2.f);
                if (f4 == null) {
                    yz5.W(12);
                } else {
                    yz5.k(12, f4);
                }
                yz5.j(13, ztf2.g);
                yz5.j(14, ztf2.h);
                yz5.j(15, ztf2.i);
                yz5.j(16, (long) ztf2.k);
                yz5.j(17, (long) wx3.a(ztf2.l));
                yz5.j(18, ztf2.m);
                yz5.j(19, ztf2.n);
                yz5.j(20, ztf2.o);
                yz5.j(21, ztf2.p);
                yz5.j(22, ztf2.q ? 1 : 0);
                yz5.j(23, (long) wx3.A(ztf2.r));
                yz5.j(24, (long) ztf2.s);
                yz5.j(25, (long) ztf2.t);
                if3 if32 = ztf2.j;
                yz5.j(26, (long) wx3.x(if32.a));
                yz5.j(27, if32.b ? 1 : 0);
                yz5.j(28, if32.c ? 1 : 0);
                yz5.j(29, if32.d ? 1 : 0);
                yz5.j(30, if32.e ? 1 : 0);
                yz5.j(31, if32.f);
                yz5.j(32, if32.g);
                yz5.k(33, wx3.D(if32.h));
                return;
        }
    }

    public final String g() {
        switch (this.o) {
            case 0:
                return "INSERT OR IGNORE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
