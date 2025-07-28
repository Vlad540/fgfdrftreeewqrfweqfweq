package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: f74  reason: default package */
public final class f74 extends kz4 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f74(aec aec, int i) {
        super(aec);
        this.o = i;
    }

    public final void A(yz5 yz5, Object obj) {
        switch (this.o) {
            case 0:
                hr1.r(obj);
                throw null;
            case 1:
                hr1.r(obj);
                throw null;
            case 2:
                hr1.r(obj);
                throw null;
            case 3:
                joa joa = (joa) obj;
                yz5.j(1, joa.a);
                yz5.j(2, joa.b);
                yz5.j(3, (long) joa.c);
                String str = joa.d;
                if (str == null) {
                    yz5.W(4);
                } else {
                    yz5.f(4, str);
                }
                yz5.j(5, joa.e);
                String str2 = joa.f;
                if (str2 == null) {
                    yz5.W(6);
                } else {
                    yz5.f(6, str2);
                }
                String str3 = joa.g;
                if (str3 == null) {
                    yz5.W(7);
                } else {
                    yz5.f(7, str3);
                }
                String str4 = joa.h;
                if (str4 == null) {
                    yz5.W(8);
                } else {
                    yz5.f(8, str4);
                }
                String str5 = joa.i;
                if (str5 == null) {
                    yz5.W(9);
                } else {
                    yz5.f(9, str5);
                }
                yz5.j(10, (long) hr1.t(joa.j));
                yz5.j(11, joa.a);
                return;
            case 4:
                yz5.j(1, ((c2c) obj).a);
                return;
            case 5:
                hdc hdc = (hdc) obj;
                String str6 = hdc.a;
                if (str6 == null) {
                    yz5.W(1);
                } else {
                    yz5.f(1, str6);
                }
                String str7 = hdc.b;
                if (str7 == null) {
                    yz5.W(2);
                } else {
                    yz5.f(2, str7);
                }
                String str8 = hdc.c;
                if (str8 == null) {
                    yz5.W(3);
                } else {
                    yz5.f(3, str8);
                }
                yz5.j(4, (long) hdc.d);
                yz5.f(5, kjd.s(hdc.e));
                yz5.j(6, hdc.f ? 1 : 0);
                yz5.j(7, hdc.g ? 1 : 0);
                byte[] bArr = null;
                List list = hdc.h;
                byte[] b = list != null ? gp8.b(list) : null;
                if (b == null) {
                    yz5.W(8);
                } else {
                    yz5.k(8, b);
                }
                Long l = hdc.i;
                if (l == null) {
                    yz5.W(9);
                } else {
                    yz5.j(9, l.longValue());
                }
                Map map = hdc.j;
                byte[] byteArray = map != null ? gr8.toByteArray(z3d.o(map)) : null;
                if (byteArray == null) {
                    yz5.W(10);
                } else {
                    yz5.k(10, byteArray);
                }
                List list2 = hdc.k;
                byte[] byteArray2 = list2 != null ? gr8.toByteArray(z3d.q(list2)) : null;
                if (byteArray2 == null) {
                    yz5.W(11);
                } else {
                    yz5.k(11, byteArray2);
                }
                Set set = hdc.l;
                if (set != null) {
                    bArr = gr8.toByteArray(z3d.p(set));
                }
                if (bArr == null) {
                    yz5.W(12);
                } else {
                    yz5.k(12, bArr);
                }
                yz5.j(13, hdc.m ? 1 : 0);
                String str9 = hdc.a;
                if (str9 == null) {
                    yz5.W(14);
                    return;
                } else {
                    yz5.f(14, str9);
                    return;
                }
            case 6:
                ahf ahf = (ahf) obj;
                yz5.j(1, ahf.a);
                yz5.j(2, ahf.b);
                yz5.j(3, ahf.c);
                String str10 = ahf.d;
                if (str10 == null) {
                    yz5.W(4);
                } else {
                    yz5.f(4, str10);
                }
                yz5.j(5, ahf.e ? 1 : 0);
                yz5.j(6, ahf.f ? 1 : 0);
                yz5.j(7, ahf.a);
                return;
            default:
                ztf ztf = (ztf) obj;
                String str11 = ztf.a;
                if (str11 == null) {
                    yz5.W(1);
                } else {
                    yz5.f(1, str11);
                }
                yz5.j(2, (long) wx3.G(ztf.b));
                String str12 = ztf.c;
                if (str12 == null) {
                    yz5.W(3);
                } else {
                    yz5.f(3, str12);
                }
                String str13 = ztf.d;
                if (str13 == null) {
                    yz5.W(4);
                } else {
                    yz5.f(4, str13);
                }
                byte[] f = zy3.f(ztf.e);
                if (f == null) {
                    yz5.W(5);
                } else {
                    yz5.k(5, f);
                }
                byte[] f2 = zy3.f(ztf.f);
                if (f2 == null) {
                    yz5.W(6);
                } else {
                    yz5.k(6, f2);
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
                } else {
                    yz5.W(20);
                    yz5.W(21);
                    yz5.W(22);
                    yz5.W(23);
                    yz5.W(24);
                    yz5.W(25);
                    yz5.W(26);
                    yz5.W(27);
                }
                String str14 = ztf.a;
                if (str14 == null) {
                    yz5.W(28);
                    return;
                } else {
                    yz5.f(28, str14);
                    return;
                }
        }
    }

    public final String g() {
        switch (this.o) {
            case 0:
                return "DELETE FROM `default_emoji` WHERE `emoji` = ?";
            case 1:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`cid` = ?,`time` = ?,`time_local` = ?,`ttl` = ?,`view_time` = ?,`options` = ?,`live_until` = ?,`delivery_status` = ?,`status` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ? WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`view_time` = ? WHERE `id` = ?";
            case 3:
                return "UPDATE OR ABORT `phones` SET `id` = ?,`phonebook_id` = ?,`contact_id` = ?,`phone` = ?,`server_phone` = ?,`email` = ?,`first_name` = ?,`last_name` = ?,`avatar_path` = ?,`type` = ? WHERE `id` = ?";
            case 4:
                return "DELETE FROM `recent` WHERE `id` = ?";
            case 5:
                return "UPDATE OR REPLACE `chat_folder` SET `id` = ?,`title` = ?,`emoji` = ?,`order` = ?,`filters` = ?,`isHiddenForAllFolder` = ?,`hideIfEmpty` = ?,`elements` = ?,`creatorId` = ?,`filterSubjects` = ?,`widgets` = ?,`options` = ?,`isRemoved` = ? WHERE `id` = ?";
            case 6:
                return "UPDATE OR REPLACE `webapp_biometry` SET `id` = ?,`user_id` = ?,`bot_id` = ?,`token` = ?,`access_requested` = ?,`access_granted` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }
}
