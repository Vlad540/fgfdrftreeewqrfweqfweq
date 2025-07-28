package defpackage;

/* renamed from: qtf  reason: default package */
public final class qtf extends lz4 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtf(aec aec, int i) {
        super(aec);
        this.o = i;
    }

    public final void A(yz5 yz5, Object obj) {
        switch (this.o) {
            case 0:
                ptf ptf = (ptf) obj;
                String str = ptf.a;
                if (str == null) {
                    yz5.W(1);
                } else {
                    yz5.f(1, str);
                }
                byte[] f = zy3.f(ptf.b);
                if (f == null) {
                    yz5.W(2);
                    return;
                } else {
                    yz5.k(2, f);
                    return;
                }
            case 1:
                ztf ztf = (ztf) obj;
                String str2 = ztf.a;
                if (str2 == null) {
                    yz5.W(1);
                } else {
                    yz5.f(1, str2);
                }
                yz5.j(2, (long) wx3.G(ztf.b));
                String str3 = ztf.c;
                if (str3 == null) {
                    yz5.W(3);
                } else {
                    yz5.f(3, str3);
                }
                String str4 = ztf.d;
                if (str4 == null) {
                    yz5.W(4);
                } else {
                    yz5.f(4, str4);
                }
                byte[] f2 = zy3.f(ztf.e);
                if (f2 == null) {
                    yz5.W(5);
                } else {
                    yz5.k(5, f2);
                }
                byte[] f3 = zy3.f(ztf.f);
                if (f3 == null) {
                    yz5.W(6);
                } else {
                    yz5.k(6, f3);
                }
                yz5.j(7, ztf.g);
                yz5.j(8, ztf.h);
                yz5.j(9, ztf.i);
                yz5.j(10, (long) ztf.k);
                yz5.j(11, (long) wx3.a(ztf.l));
                yz5.j(12, ztf.m);
                yz5.j(13, ztf.n);
                yz5.j(14, ztf.o);
                yz5.j(15, ztf.p);
                yz5.j(16, ztf.q ? 1 : 0);
                yz5.j(17, (long) wx3.A(ztf.r));
                yz5.j(18, (long) ztf.s);
                yz5.j(19, (long) ztf.t);
                if3 if3 = ztf.j;
                if (if3 != null) {
                    yz5.j(20, (long) wx3.x(if3.a));
                    yz5.j(21, if3.b ? 1 : 0);
                    yz5.j(22, if3.c ? 1 : 0);
                    yz5.j(23, if3.d ? 1 : 0);
                    yz5.j(24, if3.e ? 1 : 0);
                    yz5.j(25, if3.f);
                    yz5.j(26, if3.g);
                    yz5.k(27, wx3.D(if3.h));
                    return;
                }
                yz5.W(20);
                yz5.W(21);
                yz5.W(22);
                yz5.W(23);
                yz5.W(24);
                yz5.W(25);
                yz5.W(26);
                yz5.W(27);
                return;
            default:
                cuf cuf = (cuf) obj;
                String str5 = cuf.a;
                if (str5 == null) {
                    yz5.W(1);
                } else {
                    yz5.f(1, str5);
                }
                String str6 = cuf.b;
                if (str6 == null) {
                    yz5.W(2);
                    return;
                } else {
                    yz5.f(2, str6);
                    return;
                }
        }
    }

    public final String g() {
        switch (this.o) {
            case 0:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
