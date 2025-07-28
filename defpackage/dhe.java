package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: dhe  reason: default package */
public final class dhe {
    public static final String[] b = {"B", "kB", "MB", "GB", "TB"};
    public static final rt0 c = new rt0(9);
    public static final rt0 d = new rt0(10);
    public final t97 a;

    static {
        Pattern.compile("#u([0-9a-f]{2,16})(#\\d+:\\d+)?s#");
    }

    public dhe(t97 t97) {
        this.a = t97;
    }

    public static CharSequence a(String str, tf3 tf3, w6a w6a, boolean z) {
        String d2 = tf3.d();
        int indexOf = str.indexOf(d2);
        if (indexOf < 0) {
            return str;
        }
        int length = d2.length() + indexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!z) {
            if (w6a.f == -1) {
                r7e r7e = wce.a0;
                w6a.f = fja.E(w6a.a).t;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(w6a.f), indexOf, length, 33);
            spannableStringBuilder.setSpan(new zh3(tf3.n()), indexOf, length, 33);
        }
        w6a.c(spannableStringBuilder, tf3.u(), z, length);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder b(String str, t00 t00, tf3 tf3, w6a w6a, di3 di3, boolean z) {
        int indexOf;
        bs bsVar = new bs(0);
        bsVar.add(Long.valueOf(tf3.n()));
        bsVar.addAll(t00.c);
        bsVar.add(Long.valueOf(t00.b));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (w6a.f == -1) {
            r7e r7e = wce.a0;
            w6a.f = fja.E(w6a.a).t;
        }
        int i = w6a.f;
        ur urVar = new ur(bsVar);
        while (urVar.hasNext()) {
            Long l = (Long) urVar.next();
            tf3 i2 = di3.i(l.longValue(), true);
            String d2 = i2.d();
            if (!r1g.p(d2) && (indexOf = spannableStringBuilder.toString().indexOf(d2)) >= 0) {
                int length = d2.length() + indexOf;
                if (!z) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i), indexOf, length, 33);
                    spannableStringBuilder.setSpan(new zh3(l.longValue()), indexOf, length, 33);
                }
                w6a.c(spannableStringBuilder, i2.u(), z, length);
            }
        }
        return spannableStringBuilder;
    }

    public static String c(Context context, Integer num, boolean z, r3e r3e) {
        String str = "";
        if (num == null) {
            return str;
        }
        if (z) {
            str = wn6.i(" ", context.getString(whc.a), " ");
        }
        if (num.intValue() > 1) {
            str = str + num + " ";
        }
        StringBuilder l = hr1.l(str);
        l.append((String) r3e.get());
        return l.toString();
    }

    public static String d(String str, String str2) {
        return me4.i(str, " ", str2);
    }

    public static String e(String str) {
        if (r1g.p(str)) {
            return str;
        }
        if (str.length() == 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String g(Context context, boolean z, boolean z2) {
        String string = z2 ? context.getString(avb.tt_audio) : "";
        return z ? d("🎤", string) : p0e.I(string);
    }

    public static String h(Context context, vo8 vo8, boolean z, boolean z2, long j) {
        String str;
        o00 d2 = vo8.d();
        if (d2 == null) {
            return "";
        }
        int i = (vo8.Y > j ? 1 : (vo8.Y == j ? 0 : -1));
        boolean z3 = false;
        boolean z4 = i != 0;
        boolean z5 = z4 && (d2.c() || d2.a());
        boolean z6 = d2.d == 4 || (!z4 && d2.a());
        if (d2.c == 2) {
            z3 = true;
        }
        if (z6 && z3) {
            str = z2 ? context.getString(avb.tt_call_outgoing_canceled_video_cap) : context.getString(avb.tt_call_outgoing_canceled_video);
        } else if (z6) {
            str = z2 ? context.getString(avb.tt_call_outgoing_canceled_audio_cap) : context.getString(avb.tt_call_outgoing_canceled_audio);
        } else if (z5 && z3) {
            str = z2 ? context.getString(avb.tt_call_missed_audio_cap) : context.getString(avb.tt_call_missed_audio);
        } else if (z5) {
            str = z2 ? context.getString(avb.tt_call_missed_audio_cap) : context.getString(avb.tt_call_missed_audio);
        } else if (z4 && z3) {
            StringBuilder l = hr1.l(z2 ? context.getString(avb.tt_call_incoming_video_cap) : context.getString(avb.tt_call_incoming_video));
            l.append(i(d2));
            str = l.toString();
        } else if (z4) {
            StringBuilder l2 = hr1.l(z2 ? context.getString(avb.tt_call_incoming_audio_cap) : context.getString(avb.tt_call_incoming_audio));
            l2.append(i(d2));
            str = l2.toString();
        } else if (z3) {
            StringBuilder l3 = hr1.l(z2 ? context.getString(avb.tt_call_outgoing_video_cap) : context.getString(avb.tt_call_outgoing_video));
            l3.append(i(d2));
            str = l3.toString();
        } else {
            StringBuilder l4 = hr1.l(z2 ? context.getString(avb.tt_call_outgoing_audio_cap) : context.getString(avb.tt_call_outgoing_audio));
            l4.append(i(d2));
            str = l4.toString();
        }
        return z ? d("📞", str) : str;
    }

    public static String i(o00 o00) {
        long j = o00.e;
        return j == 0 ? "" : " ".concat(d8.a(j));
    }

    public static String j(Context context, q00 q00, zf3 zf3, boolean z, boolean z2) {
        String str;
        try {
            str = n06.o(zf3.b(q00), q00);
        } catch (Exception unused) {
            str = null;
        }
        if (r1g.p(str)) {
            str = context.getString(avb.tt_contact);
        } else if (!z2) {
            str = context.getString(avb.tt_contact_with_name, new Object[]{str});
        }
        return z ? d("👤", str) : p0e.I(str);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v17, types: [android.text.SpannableStringBuilder] */
    /* JADX WARNING: type inference failed for: r0v32, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v36, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v48, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v58, types: [java.lang.CharSequence] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x029d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence k(android.content.Context r18, w6a r19, defpackage.di3 r20, boolean r21, defpackage.vo8 r22, defpackage.tf3 r23, boolean r24, boolean r25, long r26) {
        /*
            r6 = r18
            r7 = r19
            r8 = r23
            java.lang.String r0 = "»"
            java.lang.String r1 = "«"
            r2 = 1
            java.lang.String r9 = ""
            if (r21 == 0) goto L_0x0075
            t00 r3 = r22.f()
            s00 r4 = r3.a
            int r4 = r4.ordinal()
            if (r4 == r2) goto L_0x006d
            r2 = 5
            if (r4 == r2) goto L_0x0042
            r0 = 6
            if (r4 == r0) goto L_0x002a
            r0 = 7
            if (r4 == r0) goto L_0x0026
            goto L_0x02ec
        L_0x0026:
            java.lang.String r9 = r3.i
            goto L_0x02ec
        L_0x002a:
            java.lang.String r0 = r3.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003a
            int r0 = defpackage.avb.tt_control_change_icon_admin
            java.lang.String r9 = r6.getString(r0)
            goto L_0x02ec
        L_0x003a:
            int r0 = defpackage.avb.tt_control_remove_icon_admin
            java.lang.String r9 = r6.getString(r0)
            goto L_0x02ec
        L_0x0042:
            java.lang.String r2 = r3.d
            boolean r3 = r1g.p(r2)
            if (r3 == 0) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            java.lang.String r9 = defpackage.wn6.i(r1, r2, r0)
        L_0x004f:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0065
            int r0 = defpackage.avb.tt_control_change_title_admin
            java.lang.String r0 = r6.getString(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r9 = java.lang.String.format(r0, r1)
            goto L_0x02ec
        L_0x0065:
            int r0 = defpackage.avb.tt_control_remove_title_admin
            java.lang.String r9 = r6.getString(r0)
            goto L_0x02ec
        L_0x006d:
            int r0 = defpackage.avb.tt_control_create_chat_admin
            java.lang.String r9 = r6.getString(r0)
            goto L_0x02ec
        L_0x0075:
            t00 r10 = r22.f()
            boolean r11 = r8.Y
            long r3 = r10.b
            int r3 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            java.util.ArrayList r4 = r10.c
            r12 = 0
            if (r3 == 0) goto L_0x0091
            java.lang.Long r3 = java.lang.Long.valueOf(r26)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r13 = r12
            goto L_0x0092
        L_0x0091:
            r13 = r2
        L_0x0092:
            java.lang.String r14 = r23.d()
            s00 r3 = r10.a
            int r5 = r3.ordinal()
            switch(r5) {
                case 1: goto L_0x02ab;
                case 2: goto L_0x0191;
                case 3: goto L_0x0191;
                case 4: goto L_0x016d;
                case 5: goto L_0x0110;
                case 6: goto L_0x00d2;
                case 7: goto L_0x00ce;
                case 8: goto L_0x00a9;
                case 9: goto L_0x009f;
                case 10: goto L_0x00a1;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x02ec
        L_0x00a1:
            int r0 = defpackage.avb.tt_bot_control_welcome_message
            java.lang.String r9 = r6.getString(r0)
            goto L_0x02ec
        L_0x00a9:
            int r3 = defpackage.avb.tt_control_join_by_link_you
            int r4 = defpackage.avb.tt_control_join_by_link_m
            int r5 = defpackage.avb.tt_control_join_by_link_f
            int r9 = defpackage.avb.tt_control_join_by_link
            r0 = r18
            r1 = r23
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L_0x00c5
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x00c5:
            if (r24 == 0) goto L_0x00cb
            java.lang.CharSequence r0 = a(r0, r8, r7, r12)
        L_0x00cb:
            r9 = r0
            goto L_0x02ec
        L_0x00ce:
            java.lang.String r9 = r10.i
            goto L_0x02ec
        L_0x00d2:
            java.lang.String r0 = r10.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ed
            int r3 = defpackage.avb.tt_control_change_icon_you
            int r4 = defpackage.avb.tt_control_change_icon_m
            int r5 = defpackage.avb.tt_control_change_icon_f
            int r9 = defpackage.avb.tt_control_change_icon
            r0 = r18
            r1 = r23
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00ff
        L_0x00ed:
            int r3 = defpackage.avb.tt_control_remove_icon_you
            int r4 = defpackage.avb.tt_control_remove_icon_m
            int r5 = defpackage.avb.tt_control_remove_icon_f
            int r9 = defpackage.avb.tt_control_remove_icon
            r0 = r18
            r1 = r23
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
        L_0x00ff:
            if (r11 != 0) goto L_0x0109
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x0109:
            if (r24 == 0) goto L_0x00cb
            java.lang.CharSequence r0 = a(r0, r8, r7, r12)
            goto L_0x00cb
        L_0x0110:
            java.lang.String r2 = r10.d
            boolean r3 = r1g.p(r2)
            if (r3 == 0) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            java.lang.String r9 = defpackage.wn6.i(r1, r2, r0)
        L_0x011d:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0149
            int r3 = defpackage.avb.tt_control_change_title_you
            int r4 = defpackage.avb.tt_control_change_title_m
            int r5 = defpackage.avb.tt_control_change_title_f
            int r10 = defpackage.avb.tt_control_change_title
            r0 = r18
            r1 = r23
            r2 = r11
            r6 = r10
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            if (r11 == 0) goto L_0x0140
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0165
        L_0x0140:
            java.lang.Object[] r1 = new java.lang.Object[]{r14, r9}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0165
        L_0x0149:
            int r3 = defpackage.avb.tt_control_remove_title_you
            int r4 = defpackage.avb.tt_control_remove_title_m
            int r5 = defpackage.avb.tt_control_remove_title_f
            int r9 = defpackage.avb.tt_control_remove_title
            r0 = r18
            r1 = r23
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L_0x0165
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x0165:
            if (r24 == 0) goto L_0x00cb
            java.lang.CharSequence r0 = a(r0, r8, r7, r12)
            goto L_0x00cb
        L_0x016d:
            int r3 = defpackage.avb.tt_control_leave_chat_you
            int r4 = defpackage.avb.tt_control_leave_chat_m
            int r5 = defpackage.avb.tt_control_leave_chat_f
            int r9 = defpackage.avb.tt_control_leave_chat
            r0 = r18
            r1 = r23
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L_0x0189
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x0189:
            if (r24 == 0) goto L_0x00cb
            java.lang.CharSequence r0 = a(r0, r8, r7, r12)
            goto L_0x00cb
        L_0x0191:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x019f
            r14.addAll(r4)
        L_0x019f:
            long r0 = r10.b
            r15 = 0
            int r4 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x01ae
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r14.add(r0)
        L_0x01ae:
            long r0 = r23.n()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r14.remove(r0)
            int r0 = r3.ordinal()
            r5 = 2
            if (r0 == r5) goto L_0x01c5
            r1 = 3
            if (r0 == r1) goto L_0x01c5
            r0 = r9
            goto L_0x01e7
        L_0x01c5:
            if (r13 == 0) goto L_0x01eb
            int r0 = r14.size()
            if (r0 == r2) goto L_0x01cf
            if (r25 == 0) goto L_0x01eb
        L_0x01cf:
            r2 = 1
            r4 = 1
            r0 = r18
            r1 = r23
            r3 = r11
            r5 = r10
            java.lang.String r0 = l(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r23.d()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x01e7:
            r9 = r20
            goto L_0x029b
        L_0x01eb:
            r2 = 0
            r4 = 0
            r0 = r18
            r1 = r23
            r3 = r11
            r17 = r5
            r5 = r10
            java.lang.String r0 = l(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = ", "
            if (r13 == 0) goto L_0x0219
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            int r3 = defpackage.avb.tt_control_you
            java.lang.String r3 = r6.getString(r3)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r9 = r2.toString()
            java.lang.Long r2 = java.lang.Long.valueOf(r26)
            r14.remove(r2)
        L_0x0219:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r20.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r4 = r14.iterator()
        L_0x022d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0260
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r13 = r5.longValue()
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x024c
            long r5 = r5.longValue()
            r9 = r20
            tf3 r5 = r9.i(r5, r12)
            goto L_0x024f
        L_0x024c:
            r9 = r20
            r5 = 0
        L_0x024f:
            if (r5 == 0) goto L_0x022d
            java.lang.String r5 = r5.d()
            java.lang.String r5 = r5.trim()
            r3.append(r5)
            r3.append(r1)
            goto L_0x022d
        L_0x0260:
            r9 = r20
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x0275
            int r1 = r3.length()
            int r1 = r1 + -2
            int r4 = r3.length()
            r3.delete(r1, r4)
        L_0x0275:
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.trim()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r11 == 0) goto L_0x028f
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x029b
        L_0x028f:
            java.lang.String r2 = r23.d()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x029b:
            if (r24 == 0) goto L_0x00cb
            r5 = 0
            r1 = r10
            r2 = r23
            r3 = r19
            r4 = r20
            android.text.SpannableStringBuilder r0 = b(r0, r1, r2, r3, r4, r5)
            goto L_0x00cb
        L_0x02ab:
            if (r11 != 0) goto L_0x02c8
            if (r25 == 0) goto L_0x02c8
            r2 = 1
            r3 = 0
            r4 = 1
            r0 = r18
            r1 = r23
            r5 = r10
            java.lang.String r0 = l(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r23.d()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x02e4
        L_0x02c8:
            int r3 = defpackage.avb.tt_control_create_chat_you
            int r4 = defpackage.avb.tt_control_create_chat_m
            int r5 = defpackage.avb.tt_control_create_chat_f
            int r9 = defpackage.avb.tt_control_create_chat
            r0 = r18
            r1 = r23
            r2 = r11
            r6 = r9
            java.lang.String r0 = p(r0, r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L_0x02e4
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.String r0 = java.lang.String.format(r0, r1)
        L_0x02e4:
            if (r24 == 0) goto L_0x00cb
            java.lang.CharSequence r0 = a(r0, r8, r7, r12)
            goto L_0x00cb
        L_0x02ec:
            boolean r0 = r1g.p(r9)
            if (r0 == 0) goto L_0x02f6
            r0 = r22
            java.lang.String r9 = r0.w0
        L_0x02f6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhe.k(android.content.Context, w6a, di3, boolean, vo8, tf3, boolean, boolean, long):java.lang.CharSequence");
    }

    public static String l(Context context, tf3 tf3, boolean z, boolean z2, boolean z3, t00 t00) {
        s00 s00 = t00.a;
        int ordinal = s00.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            return "";
        }
        s00 s002 = s00.c;
        if (z || z3) {
            if (s00 == s002 || s00 == s00.b) {
                return p(context, tf3, false, 0, avb.tt_control_user_add_you_m, avb.tt_control_user_add_you_f, avb.tt_control_user_add_you);
            }
            int i = avb.tt_control_user_remove_you_m;
            return p(context, tf3, false, 0, i, avb.tt_control_user_remove_you_f, i);
        } else if (s00 == s002) {
            return p(context, tf3, z2, avb.tt_control_you_add_user, avb.tt_control_user_add_m, avb.tt_control_user_add_f, avb.tt_control_user_add);
        } else {
            return p(context, tf3, z2, avb.tt_control_you_remove_user, avb.tt_control_user_remove_m, avb.tt_control_user_remove_f, avb.tt_control_user_remove);
        }
    }

    public static int m(long j) {
        if (j <= 0) {
            return 0;
        }
        int log10 = (int) (Math.log10((double) j) / Math.log10(1024.0d));
        if (log10 > 4) {
            return 4;
        }
        return log10;
    }

    public static String n(String str) {
        if (r1g.p(str)) {
            return str;
        }
        String[] split = str.trim().split("\\s");
        return split.length > 0 ? split[0] : str;
    }

    public static String o(Context context, int i, int i2, int i3, int i4) {
        return i == 2 ? context.getString(i2) : i == 3 ? context.getString(i3) : context.getString(i4);
    }

    public static String p(Context context, tf3 tf3, boolean z, int i, int i2, int i3, int i4) {
        return z ? context.getString(i) : o(context, tf3.a.c.l, i2, i3, i4);
    }

    public static String q(Context context, String str, boolean z, int i, String str2) {
        return z ? String.format(o(context, i, avb.tt_message_sent_dialog_m, avb.tt_message_sent_dialog_f, avb.tt_message_sent_dialog), new Object[]{str}) : String.format(o(context, i, avb.tt_message_sent_chat_m, avb.tt_message_sent_chat_f, avb.tt_message_sent_chat), new Object[]{str, str2});
    }

    public static String r(Context context, boolean z, boolean z2) {
        String string = context.getString(z ? avb.tt_gif : avb.tt_photo);
        return z2 ? d("📷", string) : p0e.I(string);
    }

    public static String s(int i, int i2, Context context) {
        return String.format(context.getResources().getQuantityString(i, i2), new Object[]{Integer.valueOf(i2)});
    }

    public static String t(Context context, boolean z) {
        String string = context.getString(avb.tt_video);
        return z ? d("🎬", string) : p0e.I(string);
    }

    public static void u(HashMap hashMap, ahe ahe) {
        Integer num = (Integer) hashMap.get(ahe);
        hashMap.put(ahe, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
    }

    public static String v(long j, int i, boolean z, Context context) {
        if (j <= 0) {
            return "0";
        }
        double pow = ((double) j) / Math.pow(1024.0d, (double) i);
        return me4.i(((!z || i != 0) && i != 1) ? ((DecimalFormat) d.get()).format(pow) : ((DecimalFormat) c.get()).format(pow), " ", context != null ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? context.getString(avb.tt_file_size_unit_b) : context.getString(avb.tt_file_size_unit_tb) : context.getString(avb.tt_file_size_unit_gb) : context.getString(avb.tt_file_size_unit_mb) : context.getString(avb.tt_file_size_unit_kb) : context.getString(avb.tt_file_size_unit_b) : b[i]);
    }

    public static String w(long j, boolean z, Context context) {
        return j <= 0 ? "0" : v(j, m(j), z, context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: b10} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f(android.content.Context r15, w6a r16, defpackage.vo8 r17, boolean r18, boolean r19, boolean r20, boolean r21, long r22, boolean r24) {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            r2 = r18
            boolean r3 = r17.m()
            r4 = r17
            jj7 r5 = r4.D0
            java.lang.String r6 = ""
            if (r3 != 0) goto L_0x001b
            if (r5 == 0) goto L_0x001a
            java.lang.Object r3 = r5.b
            vw6 r3 = (defpackage.vw6) r3
            if (r3 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            return r6
        L_0x001b:
            boolean r3 = r17.y()
            r7 = 0
            if (r3 != 0) goto L_0x015c
            boolean r3 = r17.C()
            if (r3 == 0) goto L_0x002a
            goto L_0x015c
        L_0x002a:
            boolean r3 = r17.s()
            if (r3 == 0) goto L_0x0037
            r3 = r21
            java.lang.String r0 = g(r15, r2, r3)
            return r0
        L_0x0037:
            boolean r3 = r17.t()
            if (r3 == 0) goto L_0x004a
            r3 = 1
            r0 = r15
            r1 = r17
            r2 = r18
            r4 = r22
            java.lang.String r0 = h(r0, r1, r2, r3, r4)
            return r0
        L_0x004a:
            boolean r3 = r17.B()
            r8 = 0
            if (r3 == 0) goto L_0x009e
            i10 r0 = r17.j()
            int r3 = r0.j
            android.content.Context r3 = r1.a
            int r4 = defpackage.avb.tt_sticker
            java.lang.String r3 = r3.getString(r4)
            if (r24 == 0) goto L_0x0090
            java.util.List r0 = r0.g
            if (r0 == 0) goto L_0x0089
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0089
            java.util.Iterator r0 = r0.iterator()
        L_0x006f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            nu4 r5 = r1.j
            boolean r5 = r5.a(r7, r4)
            if (r5 == 0) goto L_0x006f
            java.lang.String r0 = " "
            java.lang.String r8 = defpackage.me4.i(r4, r0, r3)
        L_0x0089:
            if (r8 == 0) goto L_0x0090
            java.lang.String r0 = p0e.I(r8)
            goto L_0x009d
        L_0x0090:
            if (r2 == 0) goto L_0x0099
            java.lang.String r0 = "🌄"
            java.lang.String r0 = d(r0, r3)
            goto L_0x009d
        L_0x0099:
            java.lang.String r0 = p0e.I(r3)
        L_0x009d:
            return r0
        L_0x009e:
            boolean r1 = r17.A()
            if (r1 == 0) goto L_0x00bd
            if (r19 == 0) goto L_0x00a9
            int r1 = defpackage.avb.tt_link_acs
            goto L_0x00ab
        L_0x00a9:
            int r1 = defpackage.avb.tt_link
        L_0x00ab:
            java.lang.String r0 = r15.getString(r1)
            if (r2 == 0) goto L_0x00b8
            java.lang.String r1 = "🔗"
            java.lang.String r0 = d(r1, r0)
            goto L_0x00bc
        L_0x00b8:
            java.lang.String r0 = p0e.I(r0)
        L_0x00bc:
            return r0
        L_0x00bd:
            boolean r1 = r17.m()
            if (r1 == 0) goto L_0x00da
            j10 r1 = defpackage.j10.x0
            o10 r1 = r5.x(r1)
            if (r1 == 0) goto L_0x00da
            int r1 = defpackage.avb.tt_game
            java.lang.String r0 = r15.getString(r1)
            if (r2 == 0) goto L_0x00d9
            java.lang.String r1 = "🎮"
            java.lang.String r0 = d(r1, r0)
        L_0x00d9:
            return r0
        L_0x00da:
            boolean r1 = r17.w()
            if (r1 == 0) goto L_0x00ef
            v00 r0 = r17.g()
            java.lang.String r0 = r0.c
            if (r2 == 0) goto L_0x00ee
            java.lang.String r1 = "📄"
            java.lang.String r0 = d(r1, r0)
        L_0x00ee:
            return r0
        L_0x00ef:
            boolean r1 = r17.u()
            if (r1 == 0) goto L_0x0107
            q00 r1 = r17.e()
            r3 = r14
            t97 r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            zf3 r3 = (defpackage.zf3) r3
            java.lang.String r0 = j(r15, r1, r3, r2, r7)
            return r0
        L_0x0107:
            boolean r1 = r17.z()
            if (r1 == 0) goto L_0x0132
            boolean r1 = r17.z()
            if (r1 == 0) goto L_0x011b
            j10 r1 = defpackage.j10.A0
            o10 r1 = r5.x(r1)
            b10 r8 = r1.l
        L_0x011b:
            int r1 = r8.e
            r3 = 4
            if (r1 != r3) goto L_0x0123
            int r1 = defpackage.avb.tt_present_accepted
            goto L_0x0125
        L_0x0123:
            int r1 = defpackage.avb.tt_present
        L_0x0125:
            java.lang.String r0 = r15.getString(r1)
            if (r2 == 0) goto L_0x0131
            java.lang.String r1 = "🎁"
            java.lang.String r0 = d(r1, r0)
        L_0x0131:
            return r0
        L_0x0132:
            boolean r1 = r17.x()
            if (r1 == 0) goto L_0x014c
            int r1 = defpackage.avb.tt_location
            java.lang.String r0 = r15.getString(r1)
            if (r2 == 0) goto L_0x0147
            java.lang.String r1 = "📍"
            java.lang.String r0 = d(r1, r0)
            goto L_0x014b
        L_0x0147:
            java.lang.String r0 = p0e.I(r0)
        L_0x014b:
            return r0
        L_0x014c:
            if (r5 == 0) goto L_0x015b
            java.lang.Object r1 = r5.b
            vw6 r1 = (defpackage.vw6) r1
            if (r1 == 0) goto L_0x015b
            int r1 = defpackage.avb.tt_keyboard
            java.lang.String r0 = r15.getString(r1)
            return r0
        L_0x015b:
            return r6
        L_0x015c:
            j10 r1 = defpackage.j10.c
            r3 = 1
            if (r20 == 0) goto L_0x018e
            boolean r2 = r17.y()
            boolean r4 = r17.C()
            if (r2 == 0) goto L_0x017a
            if (r4 == 0) goto L_0x017a
            int r1 = defpackage.avb.tt_photo_and_video
            java.lang.String r0 = r15.getString(r1)
            java.lang.String r1 = "📷"
            java.lang.String r0 = d(r1, r0)
            goto L_0x018d
        L_0x017a:
            if (r2 == 0) goto L_0x0189
            o10 r1 = r5.x(r1)
            a10 r1 = r1.b
            boolean r1 = r1.X
            java.lang.String r0 = r(r15, r1, r3)
            goto L_0x018d
        L_0x0189:
            java.lang.String r0 = t(r15, r3)
        L_0x018d:
            return r0
        L_0x018e:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r8 = r7
        L_0x0194:
            int r9 = r5.v()
            ahe r10 = defpackage.ahe.c
            ahe r11 = defpackage.ahe.a
            ahe r12 = defpackage.ahe.b
            if (r8 >= r9) goto L_0x01bc
            o10 r9 = r5.u(r8)
            j10 r13 = r9.a
            if (r13 != r1) goto L_0x01b6
            a10 r9 = r9.b
            boolean r9 = r9.X
            if (r9 == 0) goto L_0x01b2
            u(r4, r12)
            goto L_0x01b9
        L_0x01b2:
            u(r4, r11)
            goto L_0x01b9
        L_0x01b6:
            u(r4, r10)
        L_0x01b9:
            int r8 = r8 + 1
            goto L_0x0194
        L_0x01bc:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x01c4
            goto L_0x0241
        L_0x01c4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            ahe r5 = defpackage.ahe.o
            java.lang.Object r5 = r4.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            x42 r6 = new x42
            r6.<init>(r15, r2)
            java.lang.String r5 = c(r15, r5, r7, r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r5 = hr1.l(r1)
            java.lang.Object r6 = r4.get(r11)
            java.lang.Integer r6 = (java.lang.Integer) r6
            boolean r1 = r1g.p(r1)
            r1 = r1 ^ r3
            qib r7 = new qib
            r8 = 1
            r7.<init>(r8, r15, r2)
            java.lang.String r1 = c(r15, r6, r1, r7)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.StringBuilder r5 = hr1.l(r1)
            java.lang.Object r6 = r4.get(r12)
            java.lang.Integer r6 = (java.lang.Integer) r6
            boolean r1 = r1g.p(r1)
            r1 = r1 ^ r3
            qib r7 = new qib
            r8 = 2
            r7.<init>(r8, r15, r2)
            java.lang.String r1 = c(r15, r6, r1, r7)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.StringBuilder r5 = hr1.l(r1)
            java.lang.Object r4 = r4.get(r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            boolean r1 = r1g.p(r1)
            r1 = r1 ^ r3
            qib r3 = new qib
            r6 = 3
            r3.<init>(r6, r15, r2)
            java.lang.String r0 = c(r15, r4, r1, r3)
            r5.append(r0)
            java.lang.String r6 = r5.toString()
        L_0x0241:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhe.f(android.content.Context, w6a, vo8, boolean, boolean, boolean, boolean, long, boolean):java.lang.String");
    }
}
